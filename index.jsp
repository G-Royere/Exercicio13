<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import= "Classes.Livro"%>
<%@ page import="java.util.List" %>

<h1>Lista de livros importadas de uma servlet</h1>

<%
List<Livro> livros = (List<Livro>) request.getAttribute("livros");
if(livros != null){

    for(Livro livro : livros){

        out.print(livro+"<br><br>");
    }
}
%>
</body>
</html>
