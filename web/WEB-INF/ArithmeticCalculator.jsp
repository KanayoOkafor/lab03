

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Arithmetic calculator </title>
    </head>
    <body>
        <h1> Arithmetic calculator </h1>
          <form method="post" action="calculate">
            <label> First: </label>
            <input type="text" name="calca" value="">
            <br><br>
            <label> Second: </label>
            <input type="text" name="calcb" value="">
            <br>
           <!--<input type="submit" value="Age next birthday">-->
            <br>
             <div>
             <input type="submit" name="arith" value="+" >
             <input type="submit" name="arith" value="-" >
             <input type="submit" name="arith" value="*" >
             <input type="submit" name="arith" value="%" >
             <p> Result: ${message} </p>
          </div>
          
        </form>
          <p> <a href="age"> Age Calculator </a> </p>
    </body>
</html>
