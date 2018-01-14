<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Création du site</title>
	
	
<!-- 	<link rel="stylesheet"
        href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />-->
    <link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"></c:url>" />
    <link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/ajoutstyle.css"></c:url>" />

</head>

<body >
<c:import url="/menu.jsp"></c:import>

<div class="container">
    	<div class="row">
			<div class="col-md-12 ">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="col-md-12">
							<h3> AJOUTER UN NOUVEAU SITE </h3>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
							<spring:url value="/save" var="saveUrl"/> 
     							<form:form modelAttribute="siteForm" method="post" action="${saveUrl}"> 
					     		
					            <form:hidden path="idsite"/>
					            
					            	<div class="form-group">
										<form:input path="nom" type="text" tabindex="1" class="form-control" placeholder="Nom du site"  />
					       			</div>
					            
					       			
									<div class="form-group">
										<form:input path="emplacement" type="text"  tabindex="1" class="form-control" placeholder="Emplacement géographique du site" />
					       			</div>
					       			
					       			<div class="form-group">
										<form:input path="type" type="text" tabindex="1" class="form-control" placeholder="Type du site" />
					       			</div>
					       			
					       			<div class="form-group">
										<form:input path="hauteur" type="text" tabindex="1" class="form-control" placeholder="Hauteur du site" />
					       			</div>
					       			
					       			 
					       			<div class="form-group">
										<div class="row">
											<div class="col-md-12">
												<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="VALIDER"  />
											</div>
										</div>
								    </div>
					          </form:form>  
					       </div>
					    </div>
					</div>
			    </div>
			</div>
	    </div>
	  </div>
		
		<script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
		
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script> 
		<script src="<c:url value="../resources/js/bootstrap.min.js"> </c:url>"> </script>
    </body>
</html>

