<%-- 
    Document   : index
    Created on : 28-Nov-2021, 17:21:37
    Author     : Sugaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator Page</title>
    </head>
    <body>
        <h1>Calculator</h1>
    <s:form action="submit">
        <s:textfield label="First Number" key="n1" required="required"/>
        <s:textfield label="Second Number" key="n2" required="required"/>
        <s:select label="Operator" list="# {'0' : 'Select' , '1' : ' + ', '2' : ' - ', '3' : ' * ', '4' : ' / '}" key="op" />
        <s:submit value="Calculate" />
        <s:reset value="Reset" />
        
    </s:form>
    </body>
</html>
