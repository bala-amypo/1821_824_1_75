package com.example.demo.util;

public class RiskLevelUtils {

    /**
     * Determines the risk level based on the total score.
     * Boundaries:
     * 0-19   => LOW
     * 20-49  => MEDIUM
     * 50-79  => HIGH
     * 80+    => CRITICAL
     *
     * @param score total risk score
     * @return risk level as String
     */
    public static String determineRiskLevel(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("Score cannot be negative");
        } else if (score < 20) {
            return "LOW";
        } else if (score < 50) {
            return "MEDIUM";
        } else if (score < 80) {
            return "HIGH";
        } else {
            return "CRITICAL";
        }
    }

    /**
     * Ensures a numeric value is non-negative.
     *
     * @param value number to check
     * @return value if >=0, else 0
     */
    public static int ensureNonNegative(int value) {
        return Math.max(0, value);
    }
}
