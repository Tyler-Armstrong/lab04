<%-- 
    Document   : editnote
    Created on : Oct 9, 2021, 1:55:04 AM
    Author     : Tyler
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        
        <form method="POST" action="note">
            <label>Title: </label>
            <input type="text" name="the_title" value="${overallNote.title}">
            <br>
            <label>Content: </label>
            <input type="text" name="the_content" value="${overallNote.content}">
            <br>
            <input type="submit" value="Save">  
        </form>
        
        
        
    </body>
</html>
