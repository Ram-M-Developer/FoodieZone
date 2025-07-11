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
margin-left:520px;
margin-top:50px;
}
.content{
width:500px;
height:auto;
color:black;
border:none;
padding:20px;
margin-left:400px;
margin-top:80px;
box-shadow:0 20px 30px black;
border:none;
border-radius:8px;
}
label{
font-size:23px;
}
input{
width:250px;
height:40px;
border:1px solid black;
background:transparent;
color:black;
font-size:18px;
border-radius:5px;
margin-bottom:15px;
margin-left:60px;
}
#food{
margin-left:62px;
}
#price{
margin-left:75px;
}
button{
width:150px;
height:35px;
margin-left:150px;
margin-top:20px;
background-color:blue;
color:white;
cursor:pointer;
font-size:18px;
border:none;
border-radius:8px;
}
button:hover{
transform:translateY(-3px);
}
</style>
</head>
<body>
<h1>Update Process</h1>
<div class="content">
<form action="update" method="post">
<label>Enter Hotel Name</label>
<input class="hotel_name" name="hotel_name" type="text" id="hotel_name" placeholder="Hotel Name" required><br>
<label>Enter Food Name</label>
<input class="food_name" name="food_name" type="text" id="food_name" placeholder="Food Name" required><br>
<label>Enter New Price</label>
<input class="new_price" name="new_price" type="text" id="price" placeholder="new_price" required><br>
<button type="submit" onclick="change(event)">Submit</button>
</form>
</div>

<script>
var hotel_name=document.getElementById("hotel_name");
var food_name=document.getElementById("food_name");
var price=document.getElementById("price");

function change(event){
	if(hotel_name.value === "" || food_name.value === "" || price.value === "" || price.value <= 0){
			event.preventDefault();
			alert("Invalid input");
	}
	else{
		alert("Updated Successfully..")
	}
}
</script>
</body>
</html>