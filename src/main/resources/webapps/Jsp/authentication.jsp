<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="by.teachmeskills.entity.*" %>
<!doctype html>
<html>

<head>
    <meta charset="utf-8">
    <meta content="text/html">
    <title>Аутентификация</title>

</head>

<body>
<div class="registration">
<form method="post" action="http://localhost:8080/ShopNikaMotors/controller">
    <label for="username">Логин:</label>
    <input type="text" id="username" name="username" required><br>

    <label for="password">Пароль:</label>
    <input type="password" id="password" name="password" required><br>
    <input type="submit" value="Войти">
</form>
</div>

<br>
<form method="post" action="http://localhost:8080/ShopNikaMotors/controller">
    <div class="container">

      <h1>Register</h1>
        <p>Please fill in this form to create an account.</p>
        <hr>

        <label><b>Login</b></label> <input type="text" placeholder="Enter login" name="login">
        <label><b>Password</b></label>
        <input type="text" placeholder="Enter Password" name="password">
        <label><b>Name</b></label> <input type="text" placeholder="Enter name" name="name">
        <label><b>Surname</b></label>
        <input type="text" placeholder="Enter surname" name="surname">
        <hr>
        <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
        <button type="submit">Register</button>
    </div>


    <div class="container signin">
        <p>Already have an account? <a href="#">Sign in</a>.</p>
    </div>
</form>

</body>

</html>