<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Balance</title>
<style>
			body{
                background: pink;
            }
            .logo{
            	 background-color: #C71585;
            	 margin:0%;
            	 padding: 0px;
            }
            .allign{
            	padding-left: 500px;
            }
</style>
</head>
<body>
<h1 class ="logo">
	<a href="home.jsp">
	<img src="C:\Users\bulbu_g0o3tn2\eclipse-workspace\BankApp\logo.jpg" alt="logo" style="margin:0%;"></a></h1>
	<br><label class="allign">Your Balance is: Rs.</label>
	<%
	out.println(session.getAttribute("balance"));
	%>
</body>
</html>