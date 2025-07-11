<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	body{
	 font-family: Arial, Helvetica, sans-serif;
	 margin:0px;
	 padding:0px;
}
.content{
	width:40%;
	height:auto;
	border:none;
	box-shadow:inset 0px 1px 20px 10px gray;
	border-radius:20px;
	position:relative;
	top:150px;
	left:30%;
	}
	.content h1{
	padding-top:40px;
	color:gray;
	text-align:center;
	}
	.content button{
	width:130px;
	height:40px;
	border:none;
	border-radius:5px;
	font-size:20px;
	background-color:blue;
	color:white;
	cursor:pointer;
	font-size:20px;
	margin-left:210px;
	margin-bottom:20px;
	}
	.content button:hover{
	transform:translateY(-3px);
	}
</style>
<body>

	<div class="content">
	<form action="insert_food.jsp" method="post">
		<h1>" Hotel Added Successfully "</h1>
		<button>Insert food</button>
	</form>
	</div>

</body>
</html>