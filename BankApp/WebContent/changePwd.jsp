<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Password Change</title>
	<style>
		body{
                background: pink;
            }
            .input-label{
                margin:2px;
                margin-bottom: 4px;
                margin-top: 12px;
            }
            .input-item{
                width: 20%;
                margin:10px;
            }
            .input-item1{
                width: 20%;
                margin:30px;
            }
            .logo{
            	 background-color: #C71585;
            	 margin:0%;
            	 padding: 0px;
            }
	</style>
</head>
<body style="margin:0%;">
<form action="ChangePwd">
	<h1 class ="logo">
	<a href="home.jsp">
	<img src="C:\Users\bulbu_g0o3tn2\eclipse-workspace\BankApp\logo.jpg" alt="logo" style="margin:0%;"></a></h1>
	<div style="text-align:center;">
		<h3>Enter new password below</h3>
		<label class="input-item1">New password</label>
		<input type="password" name="npwd" class="input-item"><br>
		<label class="input-label">Confirm new password</label>
		<input type="text" name="cnpwd" class="input-item"><br>
		<input type="submit" value="Enter">
	</div>
</form>
</body>
</html>