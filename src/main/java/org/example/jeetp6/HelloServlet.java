package org.example.jeetp6;

import java.io.*;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.jeetp6.dao.Studentdao;
import org.example.jeetp6.metier.Studentmet;
import org.example.jeetp6.model.Student;

public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        // Hello
        Studentdao std=new Studentdao();
        List<Student> students=std.getStudent();
        request.setAttribute("students",students);
        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


       String name =request.getParameter("name");
        double age =Double.parseDouble(request.getParameter("age"));
        Student student =new Student();
        student.setName(name);
        student.setAge(age);
        Studentmet stdmet = new Studentmet()  ;
        stdmet.studentappend(student);
    }

    public void destroy() {
    }
}