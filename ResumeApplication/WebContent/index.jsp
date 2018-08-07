<%@ page import="com.cg.model.Resume" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<% Resume resume=(Resume)request.getAttribute("Resume"); %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<%= resume.getFirstName()
%>
</div>
</body>
</html>