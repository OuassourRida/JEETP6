package org.example.jeetp6.dao;

import org.example.jeetp6.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Studentdao {
Dbconnection db =new Dbconnection();
Connection conn =db.getConnection();
public void studentspush(String name,double age){
    PreparedStatement stmt= null;
    try {
        stmt = conn.prepareStatement("INSERT INTO client VALUES (?,?)");
        stmt.setString(1,name);
        stmt.setDouble(2,age);
        stmt.executeUpdate();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

}

}
