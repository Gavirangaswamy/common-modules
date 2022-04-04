<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Signup Page</title>
    <link rel="stylesheet" href="style.css">
    <script src="https://kit.fontawesome.com/2c135d6bdb.js" crossorigin="anonymous"></script>
</head>
<body>
    <header>
       <h1>GRS</h1>
       <div class="signup"><a href="login.jsp"><img src="login.png" alt=""></a></div>
    </header>
    
    <form class="middle-container" action="save.do" method="post">
        <h1 class="form-heading">Register Here</h1>
        <p id="message"></p>
        <label for="firstname">Firstname :</label><br>
        <input type="text" name="firstname" placeholder="Enter your Firstname" required id="fName">
        <label for="lastname">Lastname :</label><br>
        <input type="text" name="lastname" placeholder="Enter your Lastname" required id="lName">
        <label for="email">Email :</label><br>
        <input type="email" name="email" placeholder="Enter your email" id="email" required>
        <label for="phone">Mobile Number :</label><br>
        <input type="tel" name="phone" placeholder="Enter your Mobile Number" id="phone" required>
        <label for="userid">Username :</label><br>
        <input type="text" name="userid" placeholder="Enter your Username" required id="username">
        <label for="password">Password :</label><br>
        <input type="password" placeholder="Enter your Password" id="pass" name="password" required>
        <p id="pmsg">Password is <span id="strength"></span></p>
        <label for="cnfpassword">Confirm Password :</label>
        <input type="password" placeholder="Enter your Password" id="cnfpassword" required>
        <div class="checkbox" ><input type="checkbox" class="check-box" required><span class="signup-span">I agree terms and conditions.</span></div>
        <input class="reg-btn" type="submit" onclick="regValidation()" value="Register">
        <input class="reg-btn" type="reset"  value="Clear">
    </form>
    <footer>
        <small>© 2022 Gavirangaswamy D G.</small>
    </footer>
    <script type="text/javascript" src="js/main.js"></script>
</body>
</html>