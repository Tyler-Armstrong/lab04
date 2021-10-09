<%-- 
    Document   : viewnote
    Created on : Oct 9, 2021, 1:54:47 AM
    Author     : Tyler
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <p>Title: ${overallNote.title}</p>
        
        <p>Contents: ${overallNote.content}</p>
        
        
        <a href="note?edit">Edit</a> 
        
    </body>
</html>
