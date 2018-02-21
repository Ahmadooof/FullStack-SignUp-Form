<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<jsp:include page="home.jsp" />
<html>
	<head>
	</head>
		<body>
	  	<div class="imgcontainer">
		</div>
		<form:form modelAttribute="AddNewCustomer">
	  	<div class="container">
	    <label><b>Username</b></label>
	   	<form:input type="text" path="name"  placeholder="Enter username"/>
	   	<form:errors  path="name" cssClass="error" />
	   	<br>	
	    <label><b><br>Password</b></label>
	    <form:input type="text" path="password" placeholder="Enter password"/>
	     <form:errors  path="password" cssClass="error" />
	    <br>
		<label><b><br>Email</b></label>
    	<form:input type="text" path="email" placeholder="Enter email"/>
    	 <form:errors  path="email" cssClass="error" />
    	<br>
    	<label><b><br>Address</b></label>
    	<form:input type="text" path="address"  placeholder="Enter address"/>
    	 <form:errors  path="address" cssClass="error" />
    	<br>
    	<label><b><br>Phone number</b></label>
    	<form:input type="text" path="phoneNumber"  placeholder="Enter phoneNumber"/>
    	 <form:errors  path="phoneNumber" cssClass="error" />
	    <br>
	    <br>
	    <input type="submit" class="btn btn-primary" value="SignUp" />
	  	</div>
	  	</form:form>
	  </body>
</html>	  	