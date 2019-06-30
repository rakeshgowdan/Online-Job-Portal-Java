<!DOCTYPE html>

<!-- Daily UI day 1 -->
<!-- Would potentially make a good modal -->
<!-- TODO: style error message when required info is left off -->

<head>
<meta charset="utf-8">
<title>Company Registration Page</title>
<style>    
body {
	background: url("http://i1308.photobucket.com/albums/s602/lysautumn/Elegant_Background-1_zpsid9u5iuq.jpg");
	background-size: cover;
}
#signup {
	padding-top: 50px;
}
h1, p {
	text-align: center;
	color: #1a1a1a;
}
h1 {
	font-family: 'Titillium Web', sans-serif;
	font-size: 40px;
	line-height: 10px;
}
p {
	font-family:'Open Sans', sans-serif;
}
#container {
	width: 400px;
	height: 400px;
	background-color: #7F7979;
	margin: auto;
	border-radius: 10px;
}
form {
	width: 100%;
	display: inline-block;
	text-align: center;
	padding-top: 50px;
}
input {
	width: 75%;
	padding: 15px;
	margin: 8px 0;
	border-radius: 5px;
}
input[type=submit] {
	width: 50%;
	background-color: #FFE066;
	border: none;
	color: #1a1a1a;
}


</style>
</head>
<body>

<div id="signup">
<h1>Register!</h1>
<p>Welcome!!</p>
<div id="container">
	<form action="RegisterCompany" method="post">
			<input type="email" placeholder="E-mail Id" name="mail"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required><br />
			<input type="text" placeholder="Company Name" name="username" required><br />
			<input type="text" placeholder="Web-Address" name="web" required><br />
			<input type="password" placeholder="Password" name=passwd pattern=".{6,}" required><br />
			<input type="submit" value="submit">
	</form>
</div>
</div>
</body>
</html>