  var uname=document.getElementById("vname");
  var uemail=document.getElementById("vemail");
  var uphone=document.getElementById("vphone");
  var uaddress=document.getElementById("vaddress");
  
  function next(event){
	  if(uname.value === "" || uemail.value === "" || uphone.value === "" || uaddress.value === ""){
		  event.preventDefault();
		  alert("Please fill empty input fields");
	  }
	  
  }
