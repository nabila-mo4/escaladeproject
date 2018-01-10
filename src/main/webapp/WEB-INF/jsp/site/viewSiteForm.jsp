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
	
	
	<link rel="stylesheet"
        href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
	
	
	
</head>
<body >
<c:import url="/menu.jsp"></c:import>
    
    <div class="container" style="padding-top:100px">
    	<div class="row">
			<div class="col-md-12 ">
				<div class="panel panel-login" style="border-color: #ccc;-webkit-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);-moz-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);" >
					<div class="panel-heading" style="color: #00415d;background-color: #fff;border-color: #fff;text-align:center;" >
						<div class="col-md-12">
							<h3> LES INFORMATIONS DU SITE </h3>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
							
					            	<div class="form-group">
										<label for="nom"  tabindex="1" class="form-control"  style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;" > ${siteForm.nom } </label>
					       			</div>
					            
					       			
									<div class="form-group">
										<label for="emplacement"   tabindex="1" class="form-control"  style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;">${siteForm.emplacement } </label>
					       			</div>
					       			
					       			<div class="form-group">
										<label for="type"  tabindex="1" class="form-control"  style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;"> ${siteForm.type } </label>
					       			</div>
					       			
					       			<div class="form-group">
										<label for="hauteur"  tabindex="1" class="form-control"  style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;"> $ {siteForm.hauteur}</label>
					       			</div>
					       			
					       			 
					       			
					          
					       </div>
					    </div>
					</div>
					
					
			    </div>
			</div>
	    </div>
	  </div>
</body>
</html>
    
    