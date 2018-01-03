<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Création du site</title>
	
	
	<link rel="stylesheet"
        href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
	
	<link type="text/css" rel="stylesheet" href="<c:url value="../resources/ajoutstyle.css"></c:url>" />
	
</head>
<body style="padding-top: 110px;">

     <div class="container">
    	<div class="row">
			<div class="col-md-12 ">
				<div class="panel panel-login" style="border-color: #ccc;-webkit-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);-moz-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);">
					<div class="panel-heading" style="color: #00415d;background-color: #fff;border-color: #fff;text-align:center;">
						<div class="col-md-12">
							<h3> AJOUTER UN NOUVEAU SITE </h3>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
     	
					     		<form method="post" action="<c:url value="/save"/>"
					     		enctype="multipart/form-data"
					            role="form" style="display: block;">
					            
					            	<div class="form-group">
										<input type="text" name="nomSite" id="nomSite" value="" tabindex="1" class="form-control" placeholder="Nom du site" style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;"/>
					       			</div>
					            
					       			
									<div class="form-group">
										<input type="text" name="emplacementSite" id="emplacementSite" value="" tabindex="1" class="form-control" placeholder="Emplacement géographique du site" style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;"/>
					       			</div>
					       			
					       			<div class="form-group">
										<input type="text" name="typeSite" id="typeSite" value="" tabindex="1" class="form-control" placeholder="Type du site" style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;"/>
					       			</div>
					       			
					       			<div class="form-group">
										<input type="text" name="hauteurSite" id="hauteurSite" value="" tabindex="1" class="form-control" placeholder="Hauteur du site" style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;"/>
					       			</div>
					       			<div class="form-group">
										<div class="row">
											<div class="col-md-12">
												<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="VALIDER" style="background-color: #59B2E0;" style="background-color: #59B2E0; outline: none;color: #fff;font-size: 14px;height: auto;font-weight: normal;padding: 14px 0;text-transform: uppercase;border-color: #59B2E6;"/>
											</div>
										</div>
								    </div>
					            </form>
					       </div>
					    </div>
					</div>
			    </div>
			</div>
	    </div>
	  </div>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
		<script src="<c:url value="../resources/bootstrap.min.js"> </c:url>"> </script>
    </body>
</html>

