<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<center>
	<body>
		<fieldset>
			<h3>Get your train details</h3>
			<form action="show1" method="post">
				<input type="number" name="trainno" placeholder="enter train number"
					required="true"> <input type="submit" value="search"
					placeholder="enter train number here">
			</form>
			<h3>Your journey our safety,Book your tickets here</h3>
			<button>
				<a href="https://www.irctc.co.in/nget/">IRCTC</a>
			</button>
			<br>
			<br>

			<form action="details" method="post">
				<h3>Please choose your source and destination</h3>
				Source:<select name="source">
					<option value="">-Select-</option>
					<option value="manmad junction">Manmad Junction</option>
					<option value="vijayawada">vijayawada</option>
					<option value="Khammam">Khammam</option>
					<option value="vishkapatnam">Visakhapatnam</option>
					<option value="Nizamabad Junction">Nizamabad Junction</option>
					<option value="Secunderabad">Secunderabad</option>
					<option value="Chennai">Chennai</option>
				</select><br> <br> Destination:<select name="destination">
					<option value="">-Select-</option>
					<option value="manmad junction">Manmad Junction</option>
					<option value="vijayawada">vijayawada</option>
					<option value="Khammam">Khammam</option>
					<option value="vishkapatnam">Visakhapatnam</option>
					<option value="Nizamabad Junction">Nizamabad Junction</option>
					<option value="Secunderabad">Secunderabad</option>
					<option value="Chennai">Chennai</option>
				</select><br> <br> <input type="submit" value="Get Train Details" /><br><br>
			</form>
			<form action="logout" method="post">
				<input type="submit" value="Logout">
			</form>
		</fieldset>
	</body>
</center>
</html>