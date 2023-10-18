<html>
<title>railway registration form</title>
<body>
	<fieldset style="background-color: aquamarine">
		<center>
			<legend>
				<h1>Welcome to IRCTC</h1>
			</legend>
			<center>
				<h2>Please,Register here</h2>
				<img alt=""
					src="https://www.apkonline.net/imagescropped/traininquiredetailpnrnumberstatusicon128.jpg.webp"
					width="300" height="180"><br>
				<br>
				<form action="register" method="post">
					<label for="">First-Name</label> <input type="text"
						placeholder="firstname" name="firstname" required="true"><br>
					<br> <label for="">Last-Name</label> <input type="text"
						placeholder="lastname" name="lastname" required="true"><br>
					<br> <label for="">Phone no</label> <input type="tel"
						placeholder="123-45-678" name="phoneno" required="true"><br>
					<br> <label for="">Age</label> <input type="number"
						placeholder="enter your age" name="age" required="true"><br>
					<br> Gender <input type="radio" value="male" name="gender"
						required="true">Male <input type="radio" value="female"
						name="gender" required="true">female <input type="radio"
						value="others" name="gender" required="true">others <br>
					<label for="">Email</label> <input type="email"
						placeholder="enter your email" name="email" required="true"><br>
					<br> <label for="">Password</label> <input type="password"
						placeholder="enter your password" name="password" required="true"><br>
					<br> <input type="reset"> <input type="submit">
				</form>
				<form action="login1" method="post">
					Already existing user?click here to <input type="submit"
						value="login">
				</form>
	</fieldset>
</body>
</html>
