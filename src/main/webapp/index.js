
var usrname=document.getElementById("uname")
var pasword=document.getElementById("pass")


function validateform(event){
	if(usrname.value === "" || pass.value === ""){
		event.preventDefault();
		alert("Please Fill the empty fields!!");
	}
}