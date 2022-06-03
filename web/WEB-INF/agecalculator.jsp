
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Age Calculator </title>
    </head>
    <body>
        <h1> Age Calculator </h1>
         <form method="post" action="age">
            <label> Enter your age: </label>
            <input type="number" name="age" value=" ">
            <br> <br>
            <input type="submit" value="Age next birthday">
        </form>

        <p> ${age} </p>
        <p> ${message} </p>
            <p> <a href="calculate"> Arithmetic </a> </p>
             
    </body>
</html>
