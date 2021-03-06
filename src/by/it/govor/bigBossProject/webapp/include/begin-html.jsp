<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!doctype html>
<html lang="en">
<head>
    <title>My Project</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
          integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href=".">Home</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="do?command=CreateAd">CreateAd</a>
                </li>
                <li class="nav-item">
                     <a class="nav-link" href="do?command=EditUsers">Users</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" target="_blank" href="http://localhost:2080/phpmyadmin/">PHP MyAdmin</a>
                </li>
            </ul>
            <ul class="navbar-nav navbar-right">
             <c:choose>

              <c:when test="${user==null}">
                <li class="nav-item">
                    <a class="nav-link" href="do?command=SignUp">Signup</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="do?command=Login">Login</a>
                </li>
                </c:when>
                <c:otherwise>
                <li class="nav-item">
                    <a class="nav-link" href="do?command=Logout">Profile</a>
                </li>
              </c:otherwise>
              </c:choose>
            </ul>
        </div>
    </nav>





