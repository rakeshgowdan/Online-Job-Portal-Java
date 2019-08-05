<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Applicant Page</title>
<link rel="shortcut icon"
	href="http://www.iconarchive.com/download/i47277/avosoft/warm-toolbar/user.ico">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}

/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
.row.content {
	height: 450px
}

/* Set gray background color and 100% height */
.sidenav {
	padding-top: 20px;
	background-color: #f1f1f1;
	height: 100%;
}

/* Set black background color, white text and some padding */
footer {
	background-color: #555;
	color: white;
	padding: 15px;
}

/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
		padding: 15px;
	}
	.row.content {
		height: auto;
	}
}

.avatar {
	vertical-align: middle;
	width: 150px;
	height: 150px;
	border-radius: 50%;
}
/* Style the Image Used to Trigger the Modal */
#myImg {
	border-radius: 5px;
	cursor: pointer;
	transition: 0.3s;
}

#myImg:hover {
	opacity: 0.7;
}

/* The Modal (background) */
.modal {
	display: none; /* Hidden by default */
	position: fixed; /* Stay in place */
	z-index: 1; /* Sit on top */
	padding-top: 100px; /* Location of the box */
	left: 0;
	top: 0;
	width: 100%; /* Full width */
	height: 100%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: rgb(0, 0, 0); /* Fallback color */
	background-color: rgba(0, 0, 0, 0.9); /* Black w/ opacity */
}

/* Modal Content (Image) */
.modal-content {
	margin: auto;
	display: block;
	width: 80%;
	max-width: 700px;
}

/* Caption of Modal Image (Image Text) - Same Width as the Image */
#caption {
	margin: auto;
	display: block;
	width: 80%;
	max-width: 700px;
	text-align: center;
	color: #ccc;
	padding: 10px 0;
	height: 150px;
}

/* Add Animation - Zoom in the Modal */
.modal-content, #caption {
	animation-name: zoom;
	animation-duration: 0.6s;
}

@
keyframes zoom {
	from {transform: scale(0)
}

to {
	transform: scale(1)
}

}

/* The Close Button */
.close {
	position: absolute;
	top: 15px;
	right: 35px;
	color: #f1f1f1;
	font-size: 40px;
	font-weight: bold;
	transition: 0.3s;
}

.close:hover, .close:focus {
	color: #bbb;
	text-decoration: none;
	cursor: pointer;
}

/* 100% Image Width on Smaller Screens */
@media only screen and (max-width: 700px) {
	.modal-content {
		width: 100%;
	}
}

.upload-btn-wrapper {
  position: relative;
  overflow: hidden;
  display: inline-block;
}

.btn {
  border: 2px solid gray;
  color: gray;
  background-color: white;
  padding: 8px 20px;
  border-radius: 8px;
  font-size: 20px;
  font-weight: bold;
}

.upload-btn-wrapper input[type=file] {
  font-size: 100px;
  position: absolute;
  left: 0;
  top: 0;
  opacity: 0;
}

a.two:link {color:#ff0000;}
a.two:visited {color:#0000ff;}
a.two:hover {font-size:150%;}

</style>

</head>
<body>
	<script>
		//Get the modal
		var modal = document.getElementById('myModal');

		// Get the image and insert it inside the modal - use its "alt" text as a caption
		var img = document.getElementById('myImg');
		var modalImg = document.getElementById("img01");
		var captionText = document.getElementById("caption");
		img.onclick = function() {
			modal.style.display = "block";
			modalImg.src = this.src;
			captionText.innerHTML = this.alt;
		}

		// Get the <span> element that closes the modal
		var span = document.getElementsByClassName("close")[0];

		// When the user clicks on <span> (x), close the modal
		span.onclick = function() {
			modal.style.display = "none";
		}
	</script>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">JobPortal</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#">About</a></li>
					<li><a href="#">Jobs</a></li>
					<li><a href="#">Contact</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="LogOut"><span
							class="glyphicon glyphicon-log-in"></span> Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-2 sidenav">
				<img
					src="data:image/png;base64,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"
					alt="Avatar" class="avatar">
				<p>
				<form action="UpdateUser" method="post">
					<a class="two" href='UpdateUser'>Update Profile</a>
				</form>
				</p>
				<p>
				<form action="Jobs" method="post">
					<a class="two" href="Jobs">Job Search</a>
				</form>
				</p>
				<p>
				<a class="two" href='uploadResume.jsp'>Upload Resume</a>
				</p>
			</div>
			<div class="col-sm-8 text-left">
				<h1>Welcome</h1>
				<p>Dashboard</p>
				<hr>
				<h3>8 Top Technology Trends for 2019 and the Jobs They'll
					Create</h3>
				<p>
				
				<ol>
				<li>Artificial Intelligence (AI)</li>
				<li>Machine Learning</li>
				<li>Robotic Process Automation or RPA</li>
				<li>Blockchain</li>
				<li>Edge Computing</li>
				<li>Virtual Reality and Augmented Reality</li>
				<li>Cyber Security</li>
				<li>Internet of Things</li>
				</ol>
				</p>
			</div>
			<div class="col-sm-2 sidenav">
				<%
					response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); //http1.1
					response.setHeader("pragma", "no-cache");//http 1.0
					response.setHeader("Expires", "0");//proxy
                    System.out.println("session"+session.getAttribute("username"));
				if(session != null ) {
						response.sendRedirect("HomePage.html");
					}
				%>
				<p>
					<strong>The Do's and Dont's of an Impactful Resume</strong>
				</p>
				<!-- Trigger the Modal -->
				<img id="myImg"
					src="https://www.simplilearn.com/ice9/free_resources_article_thumb/the-dos-and-donts-of-an-impactful-resume.jpg"
					alt="Snow" style="width: 100%; max-width: 300px">

				<!-- The Modal -->
				<div id="myModal" class="modal">

					<!-- The Close Button -->
					<span class="close">&times;</span>

					<!-- Modal Content (The Image) -->
					<img class="modal-content" id="img01">

					<!-- Modal Caption (Image Text) -->
					<div id="caption"></div>
				</div>
				
			</div>
		</div>
	</div>



</body>
</html>
