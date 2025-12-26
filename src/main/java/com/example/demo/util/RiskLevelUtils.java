package com.example.demo.util;

public class RiskLevelUtils {

    private RiskLevelUtils() {
        // private constructor to prevent instantiation
    }

    /**
     * Determines the risk level based on the numeric score.
     *
     * @param score the total numeric risk score
     * @return a String representing the risk level: LOW, MEDIUM, HIGH, CRITICAL
     */
    public static String determineRiskLevel(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("Score must be non-negative");
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
