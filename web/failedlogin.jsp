

<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="navbar.jsp"%>
<div class="container mt-3">
  <div class="row">

  </div>


  <head>
    <title>Title</title>
    <%@include file="head.jsp"%>
  </head>


  <br>


  <div class="alert alert-danger alert-dismissible fade show" role="alert">
    Incorrect email or password.
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
  </div>



  <form action="/login" method="post">
    <div class="d-flex">
      <div class="card flex-child" style="width: 100rem;">
        <div class="card-header">
          <h4 class="text-start">Login Page</h4>
        </div>
        <div class="card-body">
          <%--                <p class="card-text text-center">--%>
          <div class="form-group row">
            <label for="email" class="col-sm-1 col-form-label">Email</label>
            <div class="col-sm-10">
              <input type="email" class="form-control" id="email" name="email" placeholder="Email">
            </div>
          </div>

          <div class="form-group row mt-3">
            <label for="password" class="col-sm-1 col-form-label">Password</label>
            <div class="col-sm-10">
              <input type="password" class="form-control" id="password" name="password" placeholder="Password">
            </div>
          </div>
          <br>
          <div class="form-group row">
            <div class="col-sm-10">
              <button type="submit" class="btn btn-success">Login</button>
            </div>
          </div>
        </div>
      </div>
    </div>

  </form>

