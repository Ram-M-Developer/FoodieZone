var name=document.getElementById("name")
var email=document.getElementById("email")
var usrname=document.getElementById("uname")
var pasword=document.getElementById("pass")


function validatesignform(event){
	if(name.value === "" || email.value === "" || usrname.value === "" || pass.value === ""){
		event.preventDefault();
		alert("Please Fill the empty fields!!")
	}
	else{
		alert("Signup Successfully!!!");
	}
	
}