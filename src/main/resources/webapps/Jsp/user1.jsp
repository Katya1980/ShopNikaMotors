<%@ page import="java.util.*" %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page import="by.teachmeslills.nikamotors.dto.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <html>
  <form method="get"      action="http://localhost:8080/ShopNikaMotors/controller">
<button type="submit">AllUser</button>
  </form>


<table>
 <c:forEach var="user" items="${users}">
 <tr>
 <td>Name: ${user.name}</td>
 </tr>
 <tr>
 <td>Surname: ${user.surname} <br><br></td>
 </tr>
 </c:forEach>
</table>

  </html>