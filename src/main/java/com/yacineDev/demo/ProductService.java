package com.yacineDev.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@Service
public class ProductService {
    @Autowired
    private DataSource dataSource;

    public void insertProduct(String name, double price) throws SQLException {
        // Obtain a connection to the database
        Connection connection = dataSource.getConnection();

        // Create a Prepared Statement
        String sql = "INSERT INTO products (name, price) VALUES ('basket',399)";
        PreparedStatement statement = connection.prepareStatement(sql);

        // Set the values for the insert statement
       // statement.setString(1, name);
        //statement.setDouble(2, price);

        // Execute the insert statement
        int rowsAffected = statement.executeUpdate();

        // Close the Prepared Statement and Connection objects
        statement.close();
        connection.close();
    }
}
