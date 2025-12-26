package com.example.demo.util;

public final class RiskLevelUtils {

    // Prevent instantiation
    private RiskLevelUtils() {
    }

    /**
     * Determines risk level based on total score.
     *
     * Score mapping:
     * 0  - 19  -> LOW
     * 20 - 49  -> MEDIUM
     * 50 - 79  -> HIGH
     * 80+      -> CRITICAL
     */
    public static String determineRiskLevel(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("score must be non-negative");
        }

        if (score <= 19) {
            return "LOW";
        } else if (score <= 49) {
            return "MEDIUM";
        } else if (score <= 79) {
            return "HIGH";
        } else {
            return "CRITICAL";
        }
    }
}
