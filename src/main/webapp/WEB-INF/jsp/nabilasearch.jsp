<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"   isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Création du secteur</title>
	
	
	<link rel="stylesheet"
        href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
	
	
	
</head>
<body >
<div class="search">
    <h1>Les sites d'escalade</h1>
    <div class="container page-section">
        <div class="row">
        <spring:url value="/nabilasave" var="saveUrl"/> 
     		<form:form modelAttribute="siteForm" method="post" action="${saveUrl}"> 
           
                <div class="row">
                    <input type="text" placeholder="Rechercher un site" class="search-input col-xs-10" name="siteName" id="search-input" required/>
                    <button type="submit" class="search-button col-xs-2" id="search_button1"><i class="glyphicon glyphicon-search"></i></button>
                </div>
               
                    <div class="row">
                        <div class="col-xs-offset-5 col-xs-2">
                            <input type="submit" value="Rechercher" class="btn-cliffhangout " id="search_button2"/>
                        </div>
                    </div>
                
            </form:form>
        </div>
        
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
</body>
</html>

