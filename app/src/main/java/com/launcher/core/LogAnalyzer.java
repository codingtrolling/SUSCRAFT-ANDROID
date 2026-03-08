package com.launcher.core;

import java.io.File;
import java.util.Scanner;

public class LogAnalyzer {
    public static String analyze(File logFile) {
        try (Scanner scanner = new Scanner(logFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains("OutOfMemoryError")) return "Allocation failed: Try increasing RAM in settings.";
                if (line.contains("GLFW error 65542")) return "OpenGL error: Your device driver may not support this version.";
                if (line.contains("Mixing client and server")) return "Mod conflict detected: Check your fabric/forge mods.";
            }
        } catch (Exception e) { return "Unknown crash."; }
        return "No specific error found in logs.";
    }
}
