<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Learning Exceptions</title>
    </head>
    <body>
        <h1> Learning Exceptions - throwing UserDefinedException  </h1>
        <ul> 
            <h2>Creating  Instance of  CheckingUserDefinedException</h2>
            <jsp:useBean id="fb" class="com.rpise.CheckingUserDefinedExceptions"/>
            <li>
                <h3> flag1 => false  and flag2 => false </h3>
                <jsp:setProperty name="fb" property="c" value="false,false"/>
                 <jsp:getProperty name="fb" property="output" />
            </li>     
             <li>
                <h3> flag1 => false  and flag2 => true </h3>
                  <jsp:setProperty name="fb" property="c" value="false,true"/>
                 <jsp:getProperty name="fb" property="output" />
            </li>     
             <li>
                <h3> flag1 => true  and flag2 => false </h3>
                 <jsp:setProperty name="fb" property="c" value="true,false"/>
                 <jsp:getProperty name="fb" property="output" />
            </li>     
             <li>
                <h3> flag1 => true  and flag2 => true </h3>
                 <jsp:setProperty name="fb" property="c" value="true,true"/>
                 <jsp:getProperty name="fb" property="output" />
            </li>     
        </ul>
        <h3> Good bye </h3>
    </body>
</html>