<%@ page language="java" contentType="text/html; charset=UTF-8"
     isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head> 
        <title>Liste des sites</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
        <!-- <link type="text/css" rel="stylesheet" href="<c:url value="/css/listestyle.css"></c:url>" /> -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet' type='text/css'/>
    </head>
    
    <c:import url="/menu.jsp"></c:import>
    <body style="padding-top: 100px;">
    
    <c:if test="${not empty message}">
    <div class="alert alert-success"
    style="margin-right: 382px; margin-left: 382px"> <c:out value="${message }"> </c:out>
    <button aria-hidden="true" data-dismiss="alert" class="close" type="button">×</button></div>
    </c:if>
   
    
    <div class="container">
	<div class="row">
	<spring:url value="/recherchesave" var="saveUrl"/> 
     	
		<div class="col-md-12">
            <div class="input-group" id="adv-search" style=" width: 500px; margin: 0 auto;">
                <input type="text" name="siteName" class="form-control" placeholder="Recherche avancée d'un site" />
                <div class="input-group-btn">
                    <div class="btn-group" role="group" style=" display: flex !important;">
                        <div class="dropdown dropdown-lg" style="position: static !important;">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false" style="border-radius: 0;
                            margin-left: -1px; padding: 14px 12px;" ><span class="caret"></span></button>
                            <div class="dropdown-menu dropdown-menu-right" style="margin-top: -1px; padding: 6px 20px;min-width: 500px;" role="menu">
                              
                                <form:form class="form-horizontal" modelAttribute="siteForm" method="post" action="${saveUrl}">
                                  
                                  <div class="form-group" style=" margin-left: 0; margin-right: 0;">
                                    <label for="contain">Nom</label>
                                    <input class="form-control" name="siteName" style=" border-top-left-radius: 4px; border-bottom-left-radius: 4px;" type="text" />
                                  </div>
                                  <div class="form-group" style=" margin-left: 0; margin-right: 0;">
                                    <label for="contain">Emplacement géographique</label>
                                    <input class="form-control" name="siteEmplacement" style=" border-top-left-radius: 4px; border-bottom-left-radius: 4px;"type="text" required/>
    							  </div>
    							  <div class="form-group" style=" margin-left: 0; margin-right: 0;">
    								<label for="contain">Hauteur minimale</label>
                                    <input class="form-control" name="siteMin" style=" border-top-left-radius: 4px; border-bottom-left-radius: 4px;"type="text" />
    							  </div>
    							  <div class="form-group" style=" margin-left: 0; margin-right: 0;">
    								<label for="contain">Hauteur maximale</label>
                                    <input class="form-control" name="siteMax" style=" border-top-left-radius: 4px; border-bottom-left-radius: 4px;"type="text" />
                                  </div>
                                 
                                  <button type="submit" class="btn btn-primary" style="background-color: #007bff; border-color: #007bff"
 ><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                                </form:form>
                            </div>
                        </div>
                        
                  
                    </div>
                </div>
            </div>
          </div>
         
        </div>
       
	</div>
		<div class="container" style="padding-top: 20px">
    		<div class="row">
    			<div class="col-md-12">
					<div class="panel panel-default panel-table">
              			<div class="panel-heading" style="background-color= white;padding:10px 15px;border-bottom:1px solid transparent;border-top-left-radius:3px;border-top-right-radius:3px">
                			<div class="row">
                  				<div class="col-md-12 text-center">
                    				<h2 class="panel-title" style=" margin-top:0;margin-bottom:0;font-size:20px;color:inherit">LA LISTE DES SITES</h2>
                  				</div>
                  				<div class="row">
                  					<div class=" col-md-11 offset-md-1 text-right"><a href="<c:url value="/add"/>" class="btn btn-sm btn-primary" style="color: #fff;background-color: #007bff;border-color: #007bff; ">Creer un nouveau site</a>
                    				</div>
                    			</div>
                  			</div>
                		</div>
              		</div>
			 		    <br> 
              			<div class="panel-body" style="padding:0;">
               				 <table class="table table-striped table-bordered table-list">
                  					<thead>
                    						<tr >
                       							 <th class="text-center">Action</th>
                       							 <th> Nom </th>
                        						 <th>Emplacement geographique</th>
                       						     <th>Type </th>
												 <th>Hauteur </th>
												
												 
                  							</tr> 
                 				    </thead>
                  					<tbody>
                  						<c:forEach items="${sites}" var="listeSites">
                  						
                         					 <tr>
                            					 <td align="center">
                            					  <a href = "<c:url value = "/view/${listeSites.idsite }"/>" class="btn btn-primary" style="color: #fff;background-color: #007bff;border-color: #007bff;"><em class="fa fa-eye"></em></a>
                            					 <a href = "<c:url value = "/update/${listeSites.idsite }"/>" class="btn btn-primary" style="color: #fff;background-color: #007bff;border-color: #007bff;"><em class="fa fa-pencil"></em></a>
                            				     <a href = "<c:url value = "/delete/${listeSites.idsite }"/>" class="btn btn-primary" style="color: #fff;background-color: #007bff;border-color: #007bff;"><em class="fa fa-trash"></em></a>
                             						
                           						 </td>
                           						 <td ><c:out value="${listeSites.nom }"></c:out></td>
                            				     <td ><c:out value="${listeSites.emplacement}"></c:out></td>
                          					     <td ><c:out value="${listeSites.type}"></c:out></td>
                          					     <td ><c:out value="${listeSites.hauteur}"></c:out></td>
                          					    
                          					    
												 
                          					</tr>
                          				</c:forEach>
                     			    </tbody>
               			 </table>
             	   </div>
            	</div>
			</div>
		</div>
	
<script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script> 
<!--  <script src="js/jquery-2.1.1.min.js"> </script> -->
<!--  <script src="js/bootstrap.min.js"> </script> -->
</body>
</html>