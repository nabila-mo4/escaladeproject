<%@ page language="java" contentType="text/html; charset=UTF-8"
     isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head> 
        <title>Liste des secteurs</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
        <!-- <link type="text/css" rel="stylesheet" href="<c:url value="/css/listestyle.css"></c:url>" /> -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet' type='text/css'/>
    </head>
    
    <c:import url="/menu.jsp"></c:import>
    <body style="padding-top: 100px;">
		<div class="container">
    		<div class="row">
    			<div class="col-md-12">
					<div class="panel panel-default panel-table">
              			<div class="panel-heading" style="background-color= white;padding:10px 15px;border-bottom:1px solid transparent;border-top-left-radius:3px;border-top-right-radius:3px">
                			<div class="row">
                  				<div class="col-md-12 text-center">
                    				<h2 class="panel-title" style=" margin-top:0;margin-bottom:0;font-size:20px;color:inherit">LA LISTE DES SECTEURS</h2>
                  				</div>
                  				<div class="row">
                  					<div class=" col-md-11 offset-md-1 text-right"><a href="<c:url value="/addsecteur"/>" class="btn btn-sm btn-primary" style="color: #fff;background-color: #007bff;border-color: #007bff; ">Creer un nouveau secteur</a>
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
                       							 <th>Site </th>
                       							 <th> Nom </th>
                        						
												 <th>Hauteur </th>
                  							</tr> 
                 				    </thead>
                  					<tbody>
                  						<c:forEach items="${secteurs}" var="listeSecteurs">
                  						
                         					 <tr>
                            					 <td align="center">
                            					 <a href = "<c:url value = "/updatesecteur/${listeSecteurs.idsecteur }"/>" class="btn btn-primary" style="color: #fff;background-color: #007bff;border-color: #007bff;"><em class="fa fa-pencil"></em></a>
                            				     <a href = "<c:url value = "/deletesecteur/${listeSecteurs.idsecteur }"/>" class="btn btn-primary" style="color: #fff;background-color: #007bff;border-color: #007bff;"><em class="fa fa-trash"></em></a>
                             						
                           						 </td>
                           						 <td ><c:out value="${listeSecteurs.site.idsite }"></c:out></td>
                           						 
                           						 <td ><c:out value="${listeSecteurs.nom }"></c:out></td>
                            				     
                          					     <td ><c:out value="${listeSecteurs.hauteur}"></c:out></td>
												 
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