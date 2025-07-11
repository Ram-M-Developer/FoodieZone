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
border:1px solid black;
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
#loct{
margin-left:115px;
}
button{
width:150px;
height:35px;
margin-left:170px;
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
   <h1>Add Hotel Process</h1>
 <div class="content">
   
   <form action="add_hotel" method="post">
     <label>Hotel Name</label>
     <input class='ho' type="text" id="hname" name="hotel_name" required><br>
     <label>Phone Number</label>
     <input class="phone" name="phone" id="phone" type="number" required><br>
     <label>Location</label>
     <input class="loc" name="loc" id="loct" required><br>
     <button type="submit" onclick=" next(event)">Add Hotel</button>
   
  
   </form>
   </div>
  <script>
  var hname=document.getElementById("hname");
  var phone=document.getElementById("phone");
  var loct=document.getElementById("loct");
  
  function next(event){
	  if(hname.value === "" || phone.value === "" || loct.value === ""){
		  event.preventDefault();
		  alert("Please fill empty input fields");
	  }
  }
  </script>
</body>
</html>