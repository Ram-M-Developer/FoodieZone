<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
  .body{

margin:0px;

padding:0px;

}

.cont_pay{

width:500px;

height:auto;

position:relative;

border:1px solid grey;

top:80px;

left:35%;

border-radius: 20px;

box-shadow:0 10px 30px black;

}

.cont_pay h1{

margin-left:56px;

margin-bottom:50px;

}

.ptv{

margin-right:0px;

margin-bottom:30px;

margin-top:50px;

width:150px;

height:30px;

color:white;

background-color:blue;

border:none;

border-radius:5px;

font-size:16px;

cursor:pointer;
margin-left:15px;

}

button:hover{

transform: translateY(-3px);

}

label{

margin-left:80px;

font-size:20px;

font-weight:600;

}

input{

width:150px;

height:30px;

margin-bottom:20px;

border-radius:5px;

font-size:18px;

padding-left:20px;

border:1px solid gray;
margin-left:20px;

}

.fn{

margin-left: 23px;

}

.qn{

margin-left: 45px;
}

.hn{

margin-left:19px;

}

.tot{

margin-left:3px;

}

.pr{

margin-left:75px;
}

input:focus {

outline:none;

}

.gst{

position:relative;

top:-65px;

left:125px;

font-size:16px;

}

.cod{

margin-left:90px;

position:relative;

top:-60px;

width:150px;

height: 30px;

color:white;

background-color:blue;

border:none;

border-radius:5px;

font-size:16px;

cursor:pointer;
}

</style>
<body>

   <div class="cont_pay">

    <h1>Select your Payment Process</h1>

    <form action="bookings.jsp" method="post">
    
    
    <label>Food Name</label>
    <input type="text" class="fn" name="food_name" value="${food_name}" readonly><br>
    
    <label>Quantity</label>
    <input type="number" class="qn" name="quantity" value="${quantity}" readonly><br>
    
    <label>Hotel Name</label>
    <input type="text" class="hn" name="hotel_name" value="${hotel_name}" readonly><br>
    
    <label>Price</label>
    <input type="number" class="pr" name="price" value="${price}" readonly><br>
    
    <label>Total Amount</label>
    <input type="number" class="tot" name="total" value="${total}" readonly>
    
    <label class="gst">Including GST(Rs.30)</label>
    
    <button class="ptv" type="submit">Pay through Vault</button>
    
    </form>

    <form action="cash_on_delivery.jsp" method="post">
    
    <input type="hidden" name="food_name" value="${food_name}">
    <input type="hidden" name="hotel_name" value="${hotel_name}">
    <input type="hidden" name="total" value="${total}">
    
    <button class="cod" type="submit">Cash on delivery</button>
    
    </form>

</div>
</body>
</html>