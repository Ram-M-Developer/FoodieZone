<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="index.css">
</head>
<body>

<div class="pg1">
    <div class="cont2"></div>
    <div class="cont3"></div>
    <div class="cont">
        <h1 style="color: white;">Login Here</h1>
        
        <form action="login" method="post">
        <label for="" style="color: white;">Username</label>
        <br>
        <br>
        <input id=uname type="text" placeholder="username" name="uname">
        <br>
        <br>
        <label for="" style="color: white;">Password</label>
        <br>
        <br>
        <input id="pass" type="password" placeholder="password" name="pass">
        <!-- <i class="fa-solid fa-lock fa-2xl" style="color: #e7ecf3;" id="lock" onclick="lock()"></i> -->
        <br>
        <br>
        <br>
        <button class="log" onclick="validateform(event)">Log In</button>
        <br>
        <br>
        <br>
        <a href="signup.jsp" class=sign>Click here to Sign Up</a>
        </form>
    </div>
    </div>
<script src="index.js"></script>
</body>
</html>