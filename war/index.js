function validateForm() {
    var a = document.forms["myForm"]["name"].value;
    var b = document.forms["myForm"]["email"].value;
    var c = document.forms["myForm"]["password1"].value;
    var d = document.forms["myForm"]["password2"].value;
    var e = document.forms["myForm"]["phone"].value;

    if (a == null || a == "") {
        document.getElementById("demo1").innerHTML = "Enter Username";
        document.getElementById("name").focus();
        return false;
    }else{
    	document.getElementById("demo1").innerHTML = "";
    }
    if (b == null || b == "") {
        document.getElementById("demo2").innerHTML = "Enter Email";
        document.getElementById("email").focus();
        return false;
    }else{
    	document.getElementById("demo2").innerHTML = "";
    }
    if (e == null || e == "") {
        document.getElementById("demo3").innerHTML = "Enter phone";
        document.getElementById("phone").focus();
        return false;
    }else{
    	document.getElementById("demo3").innerHTML = "";
    }

	 if (c == null || c == "" ) {
        document.getElementById("demo4").innerHTML = "Enter password";
        document.getElementById("pass1").focus();
        return false;
    }else{
    	document.getElementById("demo4").innerHTML = "";
    }
 	if (d != c || d == null || d == "") {
        document.getElementById("demo5").innerHTML = "Password Should Match";
        document.getElementById("pass2").focus();
        return false;
    }

}