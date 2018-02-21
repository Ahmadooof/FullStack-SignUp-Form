<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
	<head>
	  <title>Bootstrap Example</title>
	  <meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	  <meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="/w3css/3/w3.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
	  <style>
.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   height:7%;
   background-color: rgb(0,0,0);
   color: white;
   text-align: center;
   }
	body {font-family: Arial;}
	* {box-sizing: border-box}
	
	/* Full-width input fields */
	input[type=text], input[type=password] {
	    width: 100%;
	    padding: 15px;
	    margin: 5px 0 22px 0;
	    display: inline-block;
	    border: none;
	    background: #f1f1f1;
	}
	
	input[type=text]:focus, input[type=password]:focus {
	    background-color: #ddd;
	    outline: none;
	}
	
	hr {
	    border: 1px solid #f1f1f1;
	    margin-bottom: 25px;
	}
	
	/* Set a style for all buttons */
	button {
	    background-color: #4CAF50;
	    color: white;
	    padding: 14px 20px;
	    margin: 8px 0;
	    border: none;
	    cursor: pointer;
	    opacity: 0.9;
	}
	
	button:hover {
	    opacity:1;
	}
	
	/* Extra styles for the cancel button */
	.cancelbtn {
	    padding: 14px 20px;
	    background-color: #f44336;
	}
	
	/* Float cancel and signup buttons and add an equal width */
	.cancelbtn, .signupbtn {
	  float: left;
	  width: 50%;
	}
	
	/* Add padding to container elements */
	.container {
	    padding: 16px;
	}
	
	/* Clear floats */
	.clearfix::after {
	    content: "";
	    clear: both;
	    display: table;
	}
	
	/* Change styles for cancel button and signup button on extra small screens */
	@media screen and (max-width: 300px) {
	    .cancelbtn, .signupbtn {
	       width: 100%;
	    }
	}
		.error{ 
	color: red;
	}
	.fa {
  padding: 15px;
  font-size: 30px;
  width: 50px;
  text-align: center;
  text-decoration: none;
  margin: 5px 2px;
  border-radius: 30%;
}

.fa:hover {
    opacity: 0.7;
}

.fa-facebook {
  background: #3B5998;
  color: white;
}

.fa-twitter {
  background: #55ACEE;
  color: white;
}

.fa-google {
  background: #dd4b39;
  color: white;
}

.fa-linkedin {
  background: #007bb5;
  color: white;
}

.fa-youtube {
  background: #bb0000;
  color: white;
}

.fa-instagram {
  background: #125688;
  color: white;
}

.fa-pinterest {
  background: #cb2027;
  color: white;
}

.fa-snapchat-ghost {
  background: #fffc00;
  color: white;
  text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;
}

.fa-skype {
  background: #00aff0;
  color: white;
}

.fa-android {
  background: #a4c639;
  color: white;
}

.fa-dribbble {
  background: #ea4c89;
  color: white;
}

.fa-vimeo {
  background: #45bbff;
  color: white;
}

.fa-tumblr {
  background: #2c4762;
  color: white;
}

.fa-vine {
  background: #00b489;
  color: white;
}

.fa-foursquare {
  background: #45bbff;
  color: white;
}

.fa-stumbleupon {
  background: #eb4924;
  color: white;
}

.fa-flickr {
  background: #f40083;
  color: white;
}

.fa-yahoo {
  background: #430297;
  color: white;
}

.fa-soundcloud {
  background: #ff5500;
  color: white;
}

.fa-reddit {
  background: #ff5700;
  color: white;
}

.fa-rss {
  background: #ff6600;
  color: white;
}
.login{
	float:left;
	width:20%;
}
.navbar-header{
	float:left;
	width:90%;
}

</style>
</head>
	<body>	
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand">GrandHouse</a>
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="/RestaurantProject/home">Home</a></li>
	      <li><a  href="/RestaurantProject/signUp">SignUp</a></li>
	      <li><a  href="/RestaurantProject/signIn">SignIn</a></li>
	    </ul>
	    <button class="btn btn-danger navbar-btn">OrderNow</button>
	    </div>
	</div>
	</nav>
    