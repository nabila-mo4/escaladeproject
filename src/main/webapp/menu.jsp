<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<nav class="navbar navbar-inverse navbar-fixed-top" style="min-height:70px;">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false" style="margin-top:18px;">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      
    </div>
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse " id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="#" style="color:#BBB; padding-top:25px; padding-bottom:25px; font-size:16px;" >ACCUEIL </a></li>
        
		<li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color:#BBB; padding-top:25px; padding-bottom:25px; font-size:16px;">SITE <span class="caret"></span></a>
          <ul class="dropdown-menu" style="background-color:#333; border-top:3px solid #007bff; min-width:200px;">
            <li><a href="<c:url value="/add"/>" style="color:#007bff; padding:6px 20px; -webkit-transition:padding 0.5s ease; -moz-transition:padding 0.5s ease; -o-transition:padding 0.5s ease; transition:padding 0.5s ease;">Ajouter le site</a></li>
            
            <li><a href="<c:url value="/list"/>" style="color:#007bff; padding:6px 20px; -webkit-transition:padding 0.5s ease; -moz-transition:padding 0.5s ease; -o-transition:padding 0.5s ease; transition:padding 0.5s ease;">Lister les sites</a></li>
			
            
          </ul>
        </li>
		
		
		<li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color:#BBB; padding-top:25px; padding-bottom:25px; font-size:16px;">SECTEUR <span class="caret"></span></a>
          <ul class="dropdown-menu" style="background-color:#333; border-top:3px solid #007bff; min-width:200px;">
            <li><a href="<c:url value="/addsecteur"/>" style=" color: #007bff; padding:6px 20px; -webkit-transition:padding 0.5s ease; -moz-transition:padding 0.5s ease; -o-transition:padding 0.5s ease; transition:padding 0.5s ease;">Ajouter le secteur</a></li>
           
            <li><a href="<c:url value="/listsecteur"/>" style="color:#007bff; padding:6px 20px; -webkit-transition:padding 0.5s ease; -moz-transition:padding 0.5s ease; -o-transition:padding 0.5s ease; transition:padding 0.5s ease;">Lister les secteurs</a></li>
			
            
          </ul>
        </li>
		
		
		<li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color:#BBB; padding-top:25px; padding-bottom:25px; font-size:16px;">VOIE <span class="caret"></span></a>
          <ul class="dropdown-menu" style="background-color:#333; border-top:3px solid #007bff; min-width:200px;">
            <li><a href="<c:url value="/addvoie"/>" style="color:#007bff; padding:6px 20px; -webkit-transition:padding 0.5s ease; -moz-transition:padding 0.5s ease; -o-transition:padding 0.5s ease; transition:padding 0.5s ease;">Ajouter la voie</a></li>
            
            <li><a href="<c:url value="/listvoie"/>" style="color:#007bff; padding:6px 20px; -webkit-transition:padding 0.5s ease; -moz-transition:padding 0.5s ease; -o-transition:padding 0.5s ease; transition:padding 0.5s ease;">Lister les voies</a></li>
			
            
          </ul>
        </li>
		
		
		<li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color:#BBB; padding-top:25px; padding-bottom:25px; font-size:16px;">LONGUEUR <span class="caret"></span></a>
          <ul class="dropdown-menu" style="background-color:#333; border-top:3px solid #007bff; min-width:200px;">
            <li><a href="<c:url value="/addlongueur"/>" style="color:#007bff; padding:6px 20px; -webkit-transition:padding 0.5s ease; -moz-transition:padding 0.5s ease; -o-transition:padding 0.5s ease; transition:padding 0.5s ease;">Ajouter la longueur</a></li>
           
            <li><a href="<c:url value="/listlongueur"/>" style="color:#007bff; padding:6px 20px; -webkit-transition:padding 0.5s ease; -moz-transition:padding 0.5s ease; -o-transition:padding 0.5s ease; transition:padding 0.5s ease;">Lister les longueurs</a></li>
			
            
          </ul>
        </li>
		
		
		<li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color:#BBB; padding-top:25px; padding-bottom:25px; font-size:16px;">TOPO<span class="caret"></span></a>
          <ul class="dropdown-menu" style="background-color:#333; border-top:3px solid #007bff; min-width:200px;">
            <li><a href="<c:url value="/addtopo"/>" style="color:#007bff; padding:6px 20px; -webkit-transition:padding 0.5s ease; -moz-transition:padding 0.5s ease; -o-transition:padding 0.5s ease; transition:padding 0.5s ease;">Ajouter le topo</a></li>
           
            <li><a href="<c:url value="/listtopo"/>" style="color:#007bff; padding:6px 20px; -webkit-transition:padding 0.5s ease; -moz-transition:padding 0.5s ease; -o-transition:padding 0.5s ease; transition:padding 0.5s ease;">Lister les topos</a></li>
			
  
          </ul>
        </li>
		
		
		 
			
              
       
		
      </ul>
      
      
    </div>
  </div>
  


</nav>
