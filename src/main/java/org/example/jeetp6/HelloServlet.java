package org.example.jeetp6;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.jeetp6.metier.Studentmet;
import org.example.jeetp6.model.Student;

public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
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