package org.example;

import org.example.config.DatabaseConfig;

public class Main {
    public static void main() {
        if(!DatabaseConfig.testConnection()){
            System.err.println("Database connection failed. Please check your configuration.");
        }

        System.out.println("Welcome to IntelliTrade-AI");
    }
}
