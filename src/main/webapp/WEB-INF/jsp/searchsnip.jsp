<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
<title>Insert title here</title>
</head>
<body style="padding-top: 50px;">

<div class="container">
	<div class="row">
		<div class="col-md-12">
            <div class="input-group" id="adv-search" style=" width: 500px;
        margin: 0 auto;">
                <input type="text" class="form-control" placeholder="Search for snippets" />
                <div class="input-group-btn">
                    <div class="btn-group" role="group" style=" display: flex !important;">
                        <div class="dropdown dropdown-lg" style="position: static !important;">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false"
                           style="border-radius: 0;
    margin-left: -1px; padding: 14px 12px;" ><span class="caret"></span></button>
                            <div class="dropdown-menu dropdown-menu-right" style="margin-top: -1px;
    padding: 6px 20px;min-width: 500px;" role="menu">
                                <form class="form-horizontal" role="form">
                                  
                                  <div class="form-group" style=" margin-left: 0;
    margin-right: 0;">
                                    <label for="contain">Author</label>
                                    <input class="form-control" style=" border-top-left-radius: 4px;
    border-bottom-left-radius: 4px;" type="text" />
                                  </div>
                                  <div class="form-group" style=" margin-left: 0;
    margin-right: 0;">
                                    <label for="contain">Contains the words</label>
                                    <input class="form-control" style=" border-top-left-radius: 4px;
    border-bottom-left-radius: 4px;"type="text" />
                                  </div>
                                  <button type="submit" class="btn btn-primary" 
 ><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                                </form>
                            </div>
                        </div>
                        <button type="button" class="btn btn-primary" style="border-radius: 0px"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                    </div>
                </div>
            </div>
          </div>
        </div>
	</div>
</div>
<script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script> 
</body>
</html>