<%@ page import="home.hotel_list_back" %>

<%@ page import="java.sql.ResultSet" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <form action="hotel.jsp" method="post">
   <h1 style="font-size:45px;color:black;margin-left:525px;margin-top:70px;">Hotel Details</h1>
   </form>
   <div class="ho1">
   
   <% 
   if(true){
	  String hotel_name = request.getParameter("hame");
      hotel_list_back hl=new hotel_list_back();
      ResultSet rs=hl.list(hotel_name);
        out.print("<table id='demo' style='background-color:blue;position:relative;top:-50px;left:10%;width:80%;height:auto;'>");
        out.print("<tr><td class='head' style='border-bottom:1px solid black;border-right:1px solid black;padding:10px;padding-left:30px;color:white;'> <h1>"+"Id"+"</h1></td>"+"<td class='head' style='border-bottom:1px solid black;border-right:1px solid black;padding-left:35px;color:white;'> <h1>"+"Hotel Name"+"</h1></td>"+"<td class='head' style='border-bottom:1px solid black;border-right:1px solid black;padding-left:35px;color:white;'> <h1>"+"Phone Number"+"</h1></td>"
				+"<td class='head' style='border-bottom:1px solid black;border-right:1px solid black;padding-left:35px;color:white;'> <h1>"+"Location"+"</h1></td>"+"<td class='head' style='border-bottom:1px solid black;border-right:1px solid black;padding-left:35px;color:white;'><h1>"+"Status"+"</h1></td></tr>");
		while(rs.next()){
			out.print("<tr><td class='foodie' style='border-bottom:1px black;border-right:1px black;padding-left:35px;background-color:white;'><h2>"+rs.getInt(1)+"</h2></td>"+"<td class='foodie' style='border-bottom:1px black;border-right:1px black;padding-left:35px;background-color:white;'> <input name='hotel' style='width:250px;border:none;margin-left:0px;font-size:26px;font-weight:600;background-color:white;outline:none;' value='"+rs.getString(2)+"'readonly></td>"+"<td class='foodie' id='ph' style='border-bottom:1px black;border-right:1px black;padding-left:70px;background-color:white;'> <h2>"+rs.getLong(3)+"</h2></td>"
					+"<td class='foodie' style='border-bottom:1px black;border-right:1px black;padding-left:35px;background-color:white;'> <h2>"+rs.getString(4)+"</h2></td><br>"+
			"<td class='foodie' style='border-bottom:1px black;border-right:1px black;padding-left:35px;height:35px;background-color:white;'> <form action='food.jsp' method='post'><button class='btn' name='bb1' style='background-color:blue;color:white;width:80px;height:35px;border:none;cursor:pointer;font-size:18px;' value="+rs.getString(2)+">Choose</button></form></td>");
		}
		out.print("</table>");
   }
     %>
   
   </div>
</body>
</html>