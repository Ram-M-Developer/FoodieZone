<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  body{
   margin:0px;
   padding:0px;
   font-family: Arial,Helvitica, sans-sarif;
  }
  
  .content{
    width:38%;
    height:auto;
    border:none;
    box-shadow:0px 20px 40px black;
    border-radius:20px;
    position:relative;
    top:120px;
    left:32%;
  }
  .content h1{
    padding-top:20px;
    color:red;
    text-align:center;
  }
  .content label{
    font-size:26px;
    margin-left:15px;
  }
  .content input{
    margin-left:30px;
    margin-bottom:20px;
    width:200px;
    height:40px;
    border:1px solid gray;
    border-radius:5px;
    font-size:19px;
  }
  .content input:focus{
    outline:none;
  }
  .content input::placeholder{
    font-size:19px;
  }
  .content .vi{
    margin-left:85px;
    margin-top:5px;
  }
  .content .pass{
    margin-left:100px;
    margin-top:5px;
  }
  .content .amt{
    margin-left:95px;
    margin-top:5px;
  }
  .content button{
    margin-left:35%;
    marginn-bottom:45px;
    cursor:pointer;
    width:160px;
    height:40px;
    background-color:red;
    color:white;
    border:none;
    font-size:20px;
    border-radius:5px;
  }

</style>
</head>
<body>
   <div class="content">
   <h1>Vault Amount Process</h1>
   
   
   <form action="add_amount" method="post">
     <label>Enter your Vault Id</label>
     <input class='vi' type="text" name="vault_id" placeholder="vault Id"required><br>
     <label>Enter your Vault Password</label>
     <input type="number" class="pass" name="vault_pass" placeholder="Vault Password"required><br>
     <label>Enter the Amount</label>
     <input class="amt" type="number" name="amount" required><br>
     <button type="submit">Add
     
     </button>
   
   
   
   
   
   
   </form>
   
   
   
   
   
   
   
   
   
   
   </div>
</body>
</html>