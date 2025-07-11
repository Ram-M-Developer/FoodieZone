<%@ page import="home.food_list_back" %>
<%@ page import="java.sql.ResultSet" %> 
<%@ page import="home.total"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h1{
margin-left:550px;
margin-top:0px;
font-size:45px;
}

</style>
</head>
<body>
<h1>Food Details</h1>
<div class="foodie">

<% 
   if(true){
	   String hotel_name= request.getParameter("bb1");
       food_list_back rr=new food_list_back();
       ResultSet rs = rr.list(hotel_name);
       
       
       out.print("<div id='tab' style='height:580px; border:1px solid black;position:relative; top:60px; overflow-y:scroll;'>");
            
      
       
		while(rs.next()){
			
			String foodName=rs.getString(2);
	
			
			 out.print("<div class='foods' style=' border:1px solid black; display:inline-block; margin-top:70px;margin-left:80px;margin-bottom:30px;width:350px; height:auto;border:none; border-radius:10px; box-shadow:0 20px 30px black;'>");
		       out.print("<form action='food_total' method='post'>");
		       out.print("<input type='text' name='hotel_name'style='background:transparent;position:absolute;left:45%;width:500px;height:50px;font-size:30px;font-weight:600;border:none;outline:none;top:0px;z-index:3;'value='"+hotel_name+"'readonly>");
			
			
	
			
			out.print("<input type='text' style='font-size:30px; margin-top:50px;margin-left:25px; width:320px; outline:none; font-weight:600;border:none;' name='food_name' value='" + foodName + "' readonly>"+"<h2 style='margin-left:50px;margin-bottom:30px;'>Price: "+rs.getInt(3)+"</h2>"+"<h2 style='margin-left:50px;margin-bottom:30px;'>Quantity</h2>"+
			         "<h1 style='margin-left:50px;'><input type='number' name='quantity' id='quantity' style='width:50px;height:30px; font-size:18px;position:relative;top:-75px; left:105px;border-radius:5px;border:2px solid gray;' ></h1>"+
			"<button onclick='order(event,this)' style='margin-top:-75px;margin-left:30px; width:130px; height:40px;font-size:18px; float:right; margin-right:50px; border:none;border-radius:8px; background-color:blue;color:white; cursor:pointer;' id='btn' name='price' value='"+rs.getInt(3)+"'>Order</button> " );
			out.print("</form>");
			out.print("</div>");
			
		}
		out.print("</div>");
   }
     %>

</div>
<script>
 function order(event,btn){
	 const form=btn.closest("form");//Get the form of the clicked button
	 const quantity=form.querySelector("input[name='quantity']"); //Get the input inside the same form
	 
	 if(quantity.value <=0 || quantity.value>20){
		 event.preventDefault();
		 alert("Please enter quantity greater than 0 and less than or equal to 20");
	 }
	 console.log(quantity.value);
 }

</script>
</body>
</html>