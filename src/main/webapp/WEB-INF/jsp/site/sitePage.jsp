<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8" />
        <title>Liste des sites</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
        <link type="text/css" rel="stylesheet" href="<c:url value="/css/listestyle.css"></c:url>" />
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet' type='text/css'/>
    </head>
    <body style="padding-top: 110px;">
   
   
    
    
		<div class="container">
    		<div class="row">
    			<div class="col-md-12">
					<div class="panel panel-default panel-table">
              			<div class="panel-heading">
                			<div class="row">
                  				<div class="col-md-12 text-center">
                    				<h3 class="panel-title">LA LISTE DES SITES</h3>
                  				</div>
                  				<div class="col col-xs-6 text-right">
                  					<a href="<c:url value="/add"/>" class="btn btn-sm btn-primary btn-create">Creer un nouveau site</a>
                    				
                  				</div>
                			</div>
              			</div>
			 		    <br> 
              			<div class="panel-body" style="padding:0;">
               				 <table class="table table-striped table-bordered table-list">
                  					<thead>
                  				
                    						<tr >
                       							 <th>Action</th>
                       							 <th> Nom </th>
                        						 <th>Emplacement geographique</th>
                       						     <th>Type </th>
												 <th>Hauteur </th>
                  							</tr> 
                 				    </thead>
                  					<tbody>
                  						<c:forEach items="${sites}" var="listeSites">
                  						
                         					 <tr>
                            					 <td>
                            					 	  
                            						  <a href="/update/${listeSites.idsite }" class="btn btn-primary"><em class="fa fa-pencil"></em></a>
                             						  <a href="/delete/${listeSites.idsite }" class="btn btn-primary"><em class="fa fa-trash"></em></a>
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
	</div>

<script src="js/jquery-2.1.1.min.js"> </script>
<script src="js/bootstrap.min.js"> </script>
</body>
</html>