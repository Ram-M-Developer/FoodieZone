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
margin-left:480px;
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
#hname{
margin-left:85px;
}
#foodname{
margin-left:150px;
}
#price{
margin-left:150px;
}
button{
width:150px;
height:35px;
margin-left:140px;
margin-top:20px;
background-color:blue;
color:white;
cursor:pointer;
border:none;
font-size:18px;
border-radius:8px;

}
button:hover{
transform:translateY(-3px);
}
</style>
</head>
<body>

 <h1>Insert Food Process</h1>
 <div class="content">
   
   <form action="insert_food" method="post">
   
     <label>Hotel Name</label>
     <input class='ho' type="text" id="hname" name="hotel_name" required><br>
     <label>Food</label>
     <input class="food_name" id="foodname" name="food_name" type="text" required><br>
     <label>Price</label>
     <input class="price" name="price" id="price" required><br>
     <button onclick="insert(event)" type="submit">Insert</button>
   
   </form>
   </div>

<script>
var hotel_name=document.getElementById("hotel_name");
var food_name=document.getElementById("food_name");
var price=document.getElementById("price");

function insert(event){
	
	if(hotel_name.value === "" || food_name.value === "" || price.value === "" || price.value <=0){
		event.preventDefault();
		alert("Invalid input");
	}
	
}
</script>
</body>
</html>