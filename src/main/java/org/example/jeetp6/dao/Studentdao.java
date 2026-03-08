package org.example.jeetp6.dao;

import org.example.jeetp6.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
public List<Student> getStudent(){
    try {
        List<Student> students =new ArrayList<>();
        Statement stm=conn.createStatement();
        ResultSet rs=stm.executeQuery("SELECT * FROM client ");
        while(rs.next()){
            Student student=new Student();
            student.setName(rs.getString(1));
            student.setAge(rs.getDouble(2));
            students.add(student);

        }
        return students;
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    }
}


