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
			<div class="col-md-offset-3 col-md-6 col-md-offset-3">
				<div class="panel panel-login" style="border-color: #ccc;-webkit-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);-moz-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);" >
					<div class="panel-heading" style="color: #00415d;background-color: #fff;border-color: #fff;text-align:center;" >
						<div class="col-md-12">
							<h3> LES INFORMATIONS DU SITE </h3>
							
						</div>
						
						
					</div>
					<div class="panel-body">
						<div class="row">
							<div class=" col-lg-8 col-lg-offset-2 col-lg-offset-2">
							
					            	<div class="form-group">
					            	
									<h5>Nom du site </h5>	<label for="nom"  tabindex="1" class="form-control"  style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;" > ${siteForm.nom } </label>
									
					       			</div>
					            
					       			
									<div class="form-group">
									<h5>Emplacement géographique du site</h5>	<label for="emplacement"   tabindex="1" class="form-control"  style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;">${siteForm.emplacement } </label>
					       			</div>
					       			
					       			<div class="form-group">
									<h5>Type du site</h5>	<label for="type"  tabindex="1" class="form-control"  style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;"> ${siteForm.type } </label>
					       			</div>
					       			
					       			<div class="form-group">
									<h5> Hauteur du site</h5>	<label for="hauteur"  tabindex="1" class="form-control"  style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;"> ${siteForm.hauteur}</label>
					       			</div>
					       			
					       			 
					       			
					          
					       </div>
					    </div>
					    <div class=" col-md-12 text-center"><a href="" style="text-align: left; color: #007bff;">Vous avez un avis à partager sur ce site, c'est par ici ...</a></div>
					</div>
					
					
			    </div>
			</div>
			
			<div class="comments-container"  class=" col-md-12">
		<h3>Les commentaires</h3>
		

		
			
				<div class="comment-main-level">
					
					
					
					<div class="comment-box" >
					<c:forEach items="${comments}" var="listeComments">
						<div class="comment-head" style="background: #FCFCFC;
	padding: 10px 12px;
	border-bottom: 1px solid #E5E5E5;
	overflow: hidden;
	-webkit-border-radius: 4px 4px 0 0;
	-moz-border-radius: 4px 4px 0 0;
	border-radius: 4px 4px 0 0;">
	
							<h6 class="comment-name" style="color: #283035;
	font-size: 14px;
	font-weight: 700;
	float: left;
	margin-right: 10px;"><c:out value="${listeComments.nomutilisateur }"></c:out></h6>
	
	
							
							
						
						<span style="float: left;
	color: #999;
	font-size: 13px;
	position: relative;
	top: 1px;">hace 20 minutos</span>
	</div>
	
	<div class="comment-content" style="background: #FFF;
	
	padding: 12px;
	font-size: 15px;
	color: #595959;
	-webkit-border-radius: 0 0 4px 4px;
	-moz-border-radius: 0 0 4px 4px;
	border-radius: 0 0 4px 4px;"> <c:out value="${listeComments.contenu}" ></c:out>
							
						</div>
</c:forEach>
						</div>
						
					</div>
				</div>
				
		
		
	</div>
	    </div>
	  
</body>
</html>
    
    