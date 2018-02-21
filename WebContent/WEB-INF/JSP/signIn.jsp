<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<jsp:include page="home.jsp" />
<html>
	<head>
	</head>
		<body>
	  	<div class="imgcontainer">
		</div>
		<form:form modelAttribute="checklogin">
	  	<div class="container">
		<label><b><br>Email</b></label>
    	<form:input type="text" path="emailSignIn"  placeholder="Enter email"/>
    	 <form:errors  path="emailSignIn" cssClass="error" />
    	<br>
    	<label><b><br>Password</b></label>
	    <form:input type="text" path="passwordSignIn"  placeholder="Enter password"/>
	     <form:errors  path="passwordSignIn" cssClass="error" />
	    <br>
	    <input type="submit" class="btn btn-primary" value="SignIn" />
	  	</div>
	  	</form:form>
	  </body>
</html>	  	