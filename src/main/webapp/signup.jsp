<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="singnup.css">
</head>
<body>
<div class="cont">
 <h1 style="color: white;">Sign Up Here</h1>
 <form action="signup" method="post">
 <label for="" style="color: white;">Name</label>
        <br>
        <br>
        <input id="name" type="text" placeholder="username" name="name">
        <br>
        <br>
        <label for="" style="color: white;">Password for Vault</label>
        <br>
        <br>
        <input id="vpass" type="password" placeholder="password for vault" name="vpass">
        <br>
        <br>
        <label for="" style="color: white;">Email Id</label>
        <br>
        <br>
        <input id="email" type="email" placeholder="email" name="email">
        <br>
        <br>
        <label for="" style="color: white;">Phone Number</label>
        <br>
        <br>
        <input id="phone" type="tel" placeholder="phone number" name="phone">
        <br>
        <br>
        <label for="" style="color: white;">Username</label>
        <br>
        <br>
        <input id="uname" type="text" placeholder="username" name="uname">
        <br>
        <br>
        <label for="" style="color: white;">Password</label>
        <br>
        <br>
        <input id="pass" type="password" placeholder="password" name="pass">
        <br>
        <br>
        <button name="sign" onclick="validatesignform(event)">Sign Up</button>
        </form>

</div>
<script src="signup.js"></script>
</body>
</html>