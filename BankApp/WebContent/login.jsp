<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log in</title>
<style>
			body{
                background: pink;
            }
            .input-item{
                width: 20%;
                margin:10px;
            }
            .input-item1{
                width: 20%;
                margin:17px;
            }
            .input-label{
                margin:10px;
                margin-bottom: 4px;
                margin-top: 12px;
            }
            .logo{
            	 background-color: #C71585;
            	 margin:0%;
            	 padding: 0px;
            }
            .footer{
            	background-color: #DB7093;
            	text-align: center;
            	padding: 10px;
            }
</style>
</head>
<body style="margin:0%;">
	<h1 class ="logo">
	<a href="login.jsp">
	<img src="C:\Users\bulbu_g0o3tn2\eclipse-workspace\BankApp\logo.jpg" alt="logo" style="margin:0%;"></a>
	<label style="padding:16px; color: honeydew">Welcome to Axis Bank</label></h1>
	<form action="Login">
		<div style="text-align:center;">
			<h3>Enter your credentials to login</h3>
			<label class="input-label">CustomerId</label> 
			<input class="input-item" type="text" name="custid"><br>
			<label class="input-item1">Password</label>
			<input class="input-item" type="password" name="pwd"><br>
			<input type="submit" value="Login" style="margin: 10px;">
		</div>
	</form>
		<footer class="footer">
			<label><b>Contact Support: <i>bank@supportaxis.com</i></b></label><br>
			<label><b>Complaints: +00617181628, +73836387389</b></label><br>
			
		</footer>
	
</body>
</html>