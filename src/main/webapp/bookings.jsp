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
.content{
  width:70%;;
  height: auto;
  font-size:20px;
  position:absolute;
  padding-right:5px;
  left:38%;
  top: 40px;
  box-shadow:0 10px 30px black;
  border-radius: 20px;
}
.content h2{
  text-align:center;
}
.content input{
  margin-top:10px;
  margin-bottom: 20px;
  margin-left:15px;
  width:230px;
  height:40px;
  border:1px solid gray;
  border-radius:5px;
  background:transparent;
  font-size:17px;
  }
.content label{
  padding-right:15px;
  padding-left:15px;
}
.content input:focus{
  outline:none;
}
.content form{
  margin-left:70px;
}
.content .next{
  width:150px;
  height:40px;
  border:none;
  font-size:18px;
  margin-top:30px;
  border-radius:5px;
  cursor:pointer;
  margin-bottom:30px;
  background-color:blue;
  color:white;
}
.next:hover{
  transform:translateY(-3px);
}
.details{
  width:400px;
  height:auto;
  border:1px solid black;
}
</style>
</head>
<body>

    <div class="content" style="width:80%; top:70px; left:10%;">
    <h2>Bookings</h2>
    
    <form action="user" method="post">
    
    <%
       
       String food_name=request.getParameter("food_name");
       String hotel_name=request.getParameter("hotel_name");
       String total=request.getParameter("total");
       
       System.out.println(food_name+hotel_name+total);
       
       out.print("<div class='line' style='width:0px;height:400px;position:absolute;left:50%;top:16%;border:1px solid black;background-color:black;'></div>");
       out.print("<div class='details' style='height:auto;position:absolute;top:150px;left:55%;width:400px;border:none;'>");
       out.print("<label style='font-weight:600;margin-left:15px;font-size:22px;'>Food</label>");
       out.print("<input style='margin-left:51px; margin-top:20px;width:240px;height:40px;font-size:20px;border:1px solid gray;border-radius:5px;' type='text' name='food_name' value='"+food_name+"' readonly><br>");
       out.print("<label style='font-weight:600;margin-left:15px;font-size:22px;'>Hotel</label>");
       out.print("<input style='margin-left:50px;margin-bottom:30px;width:240px;height:40px;margin-top:0px;font-size:20px;border:1px solid gray;border-radius:5px;' type='text' name='hotel_name' value='"+hotel_name+"' readonly><br>");
       out.print("<label style='font-weight:600;margin-left:15px;font-size:22px;'>Total Price</label>");
       out.print("<input style='font-weight:600;position:relative;top:-44px;margin-left:150px;width:240px;height:40px;font-size:20px;border:1px solid gray;border-radius:5px;' type='number' name='total' value='"+total+"' readonly><br>");
    
       out.print("</div>");
    
    
    %>
    
    
<label>Name</label>

<input style="margin-left:92px;" id="name" type="text" name="name" placeholder="Name"><br>

<label>Email</label>

<input style="margin-left:95px;" id="email" type="email" name="email" placeholder="email"><br>

<label>Phone number</label>

<input id="phone" type="tel" name="phone" placeholder="Number"><br>

<label>Address</label>

<input style="margin-left:73px;" id="address" type="text" name="address" placeholder="Address"><br>

<label>Vault ID</label>

<input style="margin-left:75px;" id="vault_id" type="text" name="vault_id" placeholder="VaultId"><br>

<label>Vault Password</label>

<input style="margin-left:7px;" id="vault_pass" type="password" name="vault_pass" placeholder="password"><br>

<button style="margin-left:79%; margin-top:-30px;" class="next" onclick = "next(event)">Order</button>
    

    </form>

</div> 
<script type="text/javascript" src="bookings.js"></script>
</body>
</html>