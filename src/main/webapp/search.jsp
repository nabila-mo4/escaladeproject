<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

  <div class="row">
        <spring:url value="/nabilasave" var="saveUrl"/> 
     		<form:form modelAttribute="siteForm" method="post" action="${saveUrl}"> 
           
                 <div class="row">
                    <input type="text" placeholder="Rechercher un site" class="search-input col-xs-10" name="siteName" id="search-input" required/>
                    <button type="submit" class="search-button col-xs-2" id="search_button1"><i class="glyphicon glyphicon-search"></i></button>
                </div> 
                
                <div class="row">
                    <input type="text" placeholder="emplacement" class="search-input col-xs-10" name="siteEmplacement" id="search-input" required/>
                    <button type="submit" class="search-button col-xs-2" id="search_button1"><i class="glyphicon glyphicon-search"></i></button>
                </div> 
               
                    <div class="row">
                        <div class="col-xs-offset-5 col-xs-2">
                            <input type="submit" value="Rechercher" class="btn-cliffhangout " id="search_button2"/>
                        </div>
                    </div>
                
            </form:form>
        </div>