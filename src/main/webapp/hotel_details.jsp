<%@ page import="admin.hotel_details_back" %>

<%@ page import="java.sql.ResultSet" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
a{
   position:relative;
   top:-70px;
   left:30px;
}
.back{
    width:100px;
	height:40px;
	border:none;
	border-radius:5px;
	background-color:blue;
	color:white;
	font-size:18px;
	cursor:pointer;
	margin-top:-50px;
}
</style>
</head>
<body>
<center><h1 class:"rr" style="font-size:50px;color:black;">Hotel Details</h1></center>
<a href='admin_index.jsp'><button class='back'>back</button></a>
   
     <% 
      if(true){

      ResultSet rs=hotel_details_back.hotelDetails();
      
      
      out.print("<table id='demo' style='position:relative;top:-70px;left:10%;width:80%;height:auto;'>");
      
      out.print("<tr><td class='head' style='padding:10px;padding-left:20px;color:white;background-color:blue;'> <h1>"+"Id"+"</h1></td>"+"<td class='head' style='padding-left:35px;color:white;background-color:blue;'> <h1>"+"Hotel Name"+"</h1></td>"+"<td class='head' style='border-bottom:1px solid black;border-right:1px solid black;padding-left:35px;color:white;background-color:blue;'> <h1>"+"Phone Number"+"</h1></td>"
				+"<td class='head' style='border-bottom:1px solid black;border-right:1px solid black;padding-left:35px;color:white;background-color:blue;'> <h1>"+"Location"+"</h1></td>"+"<td class='head' style='border-bottom:1px solid black;border-right:1px solid black;padding-left:20px;color:white;background-color:blue;'><h1>"+"Status"+"</h1></td></tr>");
		while(rs.next()){
			out.print("<tr><td class='foodie' style='border-bottom:1px solid black;border-right:1px solid black;padding-left:35px;color:black;background-color:white;'><h2>"+rs.getInt(1)+"</h2></td>"+"<td class='foodie' style='border-bottom:1px solid black;border-right:1px solid black;background-color:white;padding-left:35px;color:black;'> <input name='hotel' style='width:250px;border:none;margin-left:0px;font-size:26px;font-weight:600;outline:none;color:black;' value='"+rs.getString(2)+"'readonly></td>"+"<td class='foodie' id='ph' style='border-bottom:1px solid black;border-right:1px solid black;background-color:white;color:black;padding-left:70px;'> <h2>"+rs.getLong(3)+"</h2></td>"
					+"<td class='foodie' style='border-bottom:1px solid black;border-right:1px solid black;background-color:white;color:black;padding-left:35px;'> <h2>"+rs.getString(4)+"</h2></td><br>"+
			"<td class='foodie' style='border-bottom:1px solid black;border-right:1px solid black;background-color:white;color:black;padding-left:35px;height:35px;'> <form action='hotel_details' method='post'><button class='delete_hotel' name='delete_hotel' style='background-color:blue;color:white;width:80px;height:35px;border:none;cursor:pointer;font-size:18px;border-radius:5px;' value="+rs.getString(2)+">Delete</button></form></td>");
		}
		out.print("</table>");
   }
     %>
   
   
</body>
</html>