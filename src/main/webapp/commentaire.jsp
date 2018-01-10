<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<div class="container" style="padding-top:100px">
    	<div class="row">
			<div class="col-md-12 ">
				<div class="panel panel-login" style="border-color: #ccc;-webkit-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);-moz-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);" >
					<div class="panel-heading" style="color: #00415d;background-color: #fff;border-color: #fff;text-align:center;" >
						<div class="col-md-12">
							<h3> AJOUTER UN NOUVEAU COMMENTAIRE </h3>
						</div>
						<hr>
					</div>
					
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
							<spring:url value="/savecommentaire" var="saveUrl"/> 
     							<form:form modelAttribute="commentaireForm" method="post" action="${saveUrl}"> 
					     		
					     		
								  <h4> Le commentaire en question appartient au site:</h4>
								  <form:select path="site.idsite" tabindex="1" class="form-control" style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;" >
   									 
   									 <form:options items="${sites}" itemValue="idsite" itemLabel="nom"  />
									
								  </form:select>
								  <br>
   
								  				            					          
					            
					             <form:hidden path="idcommentaire"/>
					            
					            	<div class="form-group">
										<form:input path="nomutilisateur" type="text" tabindex="1" class="form-control" placeholder="Saisissez votre nom" style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;" />
					       			</div>
					            
					       			
									
					       			
					       			<div class="form-group">
										<form:input path="contenu" type="text" tabindex="1" class="form-control" placeholder="Saisissez votre avis" style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;"/>
					       			</div>
					       			
					       			 
					       			<div class="form-group">
										<div class="row">
											<div class="col-md-12">
												<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="VALIDER" style="background-color: #007bff; outline: none;color: #fff;font-size: 14px;height: auto;font-weight: normal;padding: 14px 0;text-transform: uppercase;border-color: #007bff ;" />
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