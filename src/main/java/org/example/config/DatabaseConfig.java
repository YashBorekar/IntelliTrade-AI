package org.example.config;

import org.example.util.ConfigLoader;

import java.sql.*;

public class DatabaseConfig {


        private static final String DB_URL = ConfigLoader.getProperty("db.url");
        private static final String DB_USER = ConfigLoader.getProperty("db.user");
        private static final String DB_PASSWORD = ConfigLoader.getProperty("db.password");
        private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";

        static{
            try {
                Class.forName(DB_DRIVER);
            }catch(ClassNotFoundException e){
            throw new RuntimeException("Failed to load MYSQL Driver ",e);
        }
        }

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        }


        public static boolean testConnection(){
            try(Connection conn = getConnection()){
                return conn != null && !conn.isClosed();
            }catch (SQLException e){
                return false;
            }
        }
}
