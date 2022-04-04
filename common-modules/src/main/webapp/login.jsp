<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="style.css">
    <script src="https://kit.fontawesome.com/2c135d6bdb.js" crossorigin="anonymous"></script>
</head>
<body>
    <header>
       <h1>GRS</h1>
       <div class="login"><a href="register.jsp"><i class="fas fa-user-plus"></i></a></div>
    </header>
   <div class="middle-container">
    <form>
        <h1 class="form-heading">Login Here</h1>
        <p id="login"></p>
        <label for="username">Username :</label>
        <input type="text" name="userid" placeholder="Enter your Username" required id="username">
        <label for="password">Password :</label><br>
        <input type="password" name="password" placeholder="Enter your Password" required id="password">
        <div class="checkbox"><input type="checkbox" class="check-box"><span>Remember Password</span></div>
        <div class="fpassword"><a href="#">Forgot Password</a></div>
        <input class="btn" type="button" value="Register">
    </form>
    </div>
    <footer>
        <small>© 2022 Gavirangaswamy D G.</small>
    </footer>
    <script src="js/main.js"></script>
</body>
</html>