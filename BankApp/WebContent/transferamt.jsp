<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transfer Amount</title>
	<style>
		body{
                background: pink;
            }
            .logo{
            	 background-color: #C71585;
            	 margin:0%;
            	 padding: 0px;
            }
            .input-label{
                margin:10px;
                margin-bottom: 4px;
                margin-top: 12px;
            }
            .input-item{
                width: 20%;
                margin:10px;
            }
            .input-item1{
                width: 20%;
                margin:17px;
            }
            
	</style>
</head>
<body style="margin:0%;">
	<h1 class ="logo">
	<a href="login.jsp">
	<img src="C:\Users\bulbu_g0o3tn2\eclipse-workspace\BankApp\logo.jpg" alt="logo" style="margin:0%;"></a></h1>
	<form action="Transfer">
		<div style="text-align:center;">
			<label class="input-label">To accountnumber</label>
			<input class="input-item" type="text" name="taccntnum"><br>
			<label class="input-item1">Transfer amount</label>
			<input class="input-item" type="text" name="tamt"><br>
			<input type="submit" value="Transfer">
		</div>
	</form>
</body>
</html>