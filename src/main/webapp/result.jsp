<%@ page import="org.example.jeetp6.model.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="static jdk.internal.org.jline.utils.Colors.s" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>third_page</title>
</head>
<body>
<%
    String  students = (String) request.getAttribute("students");

        out.println(students) ;

%>
</body>
</html>
