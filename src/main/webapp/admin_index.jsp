<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
background-color:white;
margin:0px;
padding:0px;
}
h1{
color:black;
font-size:45px;
margin-left:500px;
margin-top:50px;
}
.cont{
width:200px;
height:auto;
color:blue;
border:none;
padding:20px;
margin-left:520px;
margin-top:80px;
box-shadow:0 20px 30px black;
border-radius:8px;
}
button{
width:150px;
height:40px;
background-color:blue;
margin-left:25px;
color:white;
font-size:18px;
border:none;
cursor:pointer;
border-radius:8px;
}
button:hover{
transform:translateY(-3px);
}
</style>
</head>
<body>
<h1>Admin Process</h1>
<div class="cont">
<form action="add_hotel.jsp" method="post"><button>Add Hotel</button></form><br>
<form action="insert_food.jsp" method="post"><button>Insert Food</button></form><br>
<form action="hotel_details.jsp" method="post"><button>Hotel Details</button></form><br>
<form action="food_details.jsp" method="post"><button>Food Details</button></form><br>
<form action="update.jsp" method="post"><button>Update</button></form><br>
<form action="order_details.jsp" method="post"><button>Order Details</button></form>
</div>
</body>
</html>