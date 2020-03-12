<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
	<style>
		body{
                background: pink;
            }
            .logo{
            	 background-color: #C71585;
            	 margin:0%;
            	 padding: 0px;
            }
            .links{
            	text-align: 300px;
            	
            }
	</style>
</head>
<body style="margin:0%;">
	<h1 class ="logo">
	<a href="home.jsp">
	<img src="C:\Users\bulbu_g0o3tn2\eclipse-workspace\BankApp\logo.jpg" alt="logo" style="margin:0%;"></a></h1>
	
	<h2>Login Successful!</h2><hr>
		<h2 class="links"><a href="Balance" >Check balance</a></h2>
		<h2 class="links"><a href="changePwd.jsp" >Change Password</a></h2>
		<h2 class="links"><a href="transferamt.jsp" class="links">Transfer Amount</a></h2>
		<h2 class="links"><a href="GetStatement">Get Statement</a></h2>
</body>
</html>