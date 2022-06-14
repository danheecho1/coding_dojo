<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
    <!-- container -->
    <div id="container" >
        <!-- heading -->
        <h1>Fruit Store</h1>
        <!-- table -->
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Price</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="fruit" items="${fruits}">
                	<tr>
                    	<td><c:out value="${fruit.getName()}"></c:out></td>
                    	<td><c:out value="${fruit.getPrice()}"></c:out></td>
	                </tr>
               	</c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>