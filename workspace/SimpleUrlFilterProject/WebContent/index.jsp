<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>URL filter Demo</title>
</head>
<body>
    <form action="UrlFilterServlet" method="get">
        Enter Url (do not include "http://"): <input type="text" size="100" name="Url" />
        &nbsp;&nbsp;
        <input type="submit" value="Navigate using get" />
    </form>
   
    <br/><br/>
     
    <form action="UrlFilterServlet" method="post">
        Enter Url (do not include "http://"): <input type="text" size="100" name="Url"/>
        &nbsp;&nbsp;
        <input type="submit" value="Navigate using post" />
    </form>
</body>
</html>