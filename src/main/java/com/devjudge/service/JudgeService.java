package com.devjudge.service;

import com.devjudge.dto.JudgeRequest;
import com.devjudge.dto.JudgeResponse;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class JudgeService {

    public JudgeResponse run(JudgeRequest request) {
        JudgeResponse response = new JudgeResponse();

        try {
            Path tempDir = Files.createTempDirectory("judge");
            File sourceFile = new File(tempDir.toFile(), "Main.java");

            Files.writeString(sourceFile.toPath(), request.getCode());

            // 1. Compile
            Process compileProcess = new ProcessBuilder(
                    "javac",
                    sourceFile.getAbsolutePath()
            ).redirectErrorStream(true).start();

            String compileOutput = read(compileProcess.getInputStream());
            int compileExit = compileProcess.waitFor();

            if (compileExit != 0) {
                response.setSuccess(false);
                response.setError(compileOutput);
                return response;
            }

            // 2. Run
            Process runProcess = new ProcessBuilder(
                    "java",
                    "-cp",
                    tempDir.toString(),
                    "Main"
            ).redirectErrorStream(true).start();

            if (request.getInput() != null && !request.getInput().isEmpty()) {
                try (BufferedWriter writer =
                             new BufferedWriter(new OutputStreamWriter(runProcess.getOutputStream()))) {
                    writer.write(request.getInput());
                }
            }

            String runOutput = read(runProcess.getInputStream());
            int runExit = runProcess.waitFor();

            if (runExit != 0) {
                response.setSuccess(false);
                response.setError(runOutput);
                return response;
            }

            response.setSuccess(true);
            response.setOutput(runOutput);

        } catch (Exception e) {
            response.setSuccess(false);
            response.setError(e.getMessage());
        }

        return response;
    }

    private String read(InputStream is) throws IOException {
        return new String(is.readAllBytes());
    }
}
