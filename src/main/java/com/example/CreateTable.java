package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {


        public static boolean enter(String name, String address,String city,String phone,String whatsapp,String message,String gender, String country) {
            String url = "jdbc:mysql://localhost:3306/contact_db";
            String user = "root";
            String password = "21139@Mainak180800";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, user, password);
                System.out.println("Connected to MySQL database!");
                // Perform database operations here
                String sql="INSERT INTO contacts (name, address, city, phone, whatsapp, message, gender, country) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setString(1, name);
                    stmt.setString(2, address);
                    stmt.setString(3, city);
                    stmt.setString(4, phone);
                    stmt.setString(5, whatsapp);
                    stmt.setString(6, message);
                    stmt.setString(7, gender);
                    stmt.setString(8, country);
                    stmt.executeUpdate();
                }

                conn.close();
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            return false;
        }

}
