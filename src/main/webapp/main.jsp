<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
font-family: Arial, Helvetica, sans-serif;
margin:0px;
padding:0px;
}
h1{
font-size:37px;
color:black;
margin-left:360px;
margin-top:150px;
}
.cont{
width:250px;
height:250px;
margin-left:530px;
margin-top:70px;
box-shadow:0px 30px 30px black; 
border:1px solid black;
}
button{
width:150px;
height:40px;
border:2px solid blue;
background-color:blue; 
margin-top:50px;
margin-left:50px;
color:white;
font-size:18px;
cursor:pointer;
border-radius:8px;
}
button:hover{
transform:translateY(-3px);
}
</style>
</head>
<body>
<h1>Welcome to Food Delivery Service</h1>
<div class="cont">
<form action="admin_index.jsp" method="post"><button>Admin</button></form><br>
<form action="index.jsp" method="post"><button>User</button></form>
</div>
</body>
</html>