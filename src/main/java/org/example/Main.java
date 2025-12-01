package org.example;

import org.example.config.DatabaseConfig;

public class Main {
    public static void main() {
        if(!DatabaseConfig.testConnection()){
            System.err.println("Database connection failed. Please check your configuration.");
        }
        System.out.println("Welcome to IntelliTrade-AI");
    }

    private static void displayMenu(){
        System.out.println("Main Menu:");
        System.out.println("--------------------------------------------");
        System.out.println("1. Dashboard");
        System.out.println("2. Stock Insights");
        System.out.println("3. Trade");
        System.out.println("4. Export Data");
        System.out.println("5. Exit");
        System.out.println("--------------------------------------------");
    }
}
