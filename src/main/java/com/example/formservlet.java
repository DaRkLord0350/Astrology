package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Registered")
public class formservlet extends HttpServlet {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/contact_db";
    private static final String DB_USER = "mainak"; // Replace with your DB username
    private static final String DB_PASSWORD = "Mainak@180800"; // Replace with your DB password

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the form data
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String phone = request.getParameter("phone");
        String whatsapp = request.getParameter("whatsapp");
        String message = request.getParameter("message");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");

        System.out.println(name);
        System.out.println(address);
        System.out.println(city);
        System.out.println(phone);
        System.out.println(whatsapp);
        System.out.println(message);
        System.out.println(gender);
        System.out.println(country);

        if(CreateTable.enter(name, address, city, phone, whatsapp, message, gender, country)){
            System.out.println("Redirecting to index page");

            request.getRequestDispatcher("/courseform.html").forward(request, response);
        };

        // Database connection and insertion
//        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
//            String sql = "INSERT INTO contacts (name, address, city, phone, whatsapp, message, gender, country) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
//            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
//                stmt.setString(1, name);
//                stmt.setString(2, address);
//                stmt.setString(3, city);
//                stmt.setString(4, phone);
//                stmt.setString(5, whatsapp);
//                stmt.setString(6, message);
//                stmt.setString(7, gender);
//                stmt.setString(8, country);
//                stmt.executeUpdate();
//            }

            // Handle errors, e.g., show an error message

        // Redirect back to the index.html page

    }


}
