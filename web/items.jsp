<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
    <%@include file="head.jsp"%>
  </head>
  <body>
  <%@include file="navbar.jsp"%>
    <div class="container mt-3">
      <div class="row">
        <h2 class="text-center">
          Welcome to <%=siteName%>
        </h2>
        <span class="text-muted text-center">
          Electronic devices with high quality and service
        </span>
      </div>

      <%@include file="card.jsp"%>

  </body>
</html>
