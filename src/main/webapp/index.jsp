<!DOCTYPE html>
<html lang="en">
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Poppins">
<style>
body, h1, h2, h3, h4, h5 {
	font-family: "Poppins", sans-serif
}

body {
	font-size: 16px;
}

.w3-half img {
	margin-bottom: -6px;
	margin-top: 16px;
	opacity: 0.8;
	cursor: pointer
}

.w3-half img:hover {
	opacity: 1
}
</style>
<body>

	<!-- Sidebar/menu -->
	<nav class="w3-sidebar w3-red w3-collapse w3-top w3-large w3-padding"
		style="z-index: 3; width: 300px; font-weight: bold;" id="mySidebar">
		<br> <a href="javascript:void(0)" onclick="w3_close()"
			class="w3-button w3-hide-large w3-display-topleft"
			style="width: 100%; font-size: 22px">Close Menu</a>
		<div class="w3-container">
			<h3 class="w3-padding-64">
				<b>SHELL INDIA MARKETS LTD.</b>
			</h3>
		</div>
		<div class="w3-bar-block">
				<a href="#" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">Home</a> 
				<a href="#showcase" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">Feedback</a>
				<a href="#services" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">Shell Website</a> 
				<a href="#contact" onclick="w3_close()"  class="w3-bar-item w3-button w3-hover-white">Contact</a>
				<a href="#designers" onclick="w3_close()"class="w3-bar-item w3-button w3-hover-white">Logout</a>
		</div>
	</nav>

	<!-- Top menu on small screens -->
	<header
		class="w3-container w3-top w3-hide-large w3-red w3-xlarge w3-padding">
		<a href="javascript:void(0)" class="w3-button w3-red w3-margin-right"
			onclick="w3_open()">☰</a> <span>SHELL INDIA MARKETS LTD.</span>
	</header>

	<!-- Overlay effect when opening sidebar on small screens -->
	<div class="w3-overlay w3-hide-large" onclick="w3_close()"
		style="cursor: pointer" title="close side menu" id="myOverlay"></div>

	<!-- !PAGE CONTENT! -->
	<div class="w3-main" style="margin-left: 340px; margin-right: 40px">

		<!-- Header -->
		<div class="w3-container" style="margin-top: 80px" id="showcase" onload="moveNext()">
			<h1 class="w3-jumbo">
				<b><span id="question"></span></b>
			</h1>
		</div>

		<!-- Photo grid (modal) -->
		<!-- <div class="w3-row-padding">
			<div class="w3-half">
				<img src="/w3images/kitchenconcrete.jpg" style="width: 100%"
					onclick="onClick(this)" alt="Concrete meets bricks"> <img
					src="/w3images/livingroom.jpg" style="width: 100%"
					onclick="onClick(this)"
					alt="Light, white and tight scandinavian design"> <img
					src="/w3images/diningroom.jpg" style="width: 100%"
					onclick="onClick(this)" alt="White walls with designer chairs">
			</div>

			<div class="w3-half">
				<img src="/w3images/atrium.jpg" style="width: 100%"
					onclick="onClick(this)" alt="Windows for the atrium"> <img
					src="/w3images/bedroom.jpg" style="width: 100%"
					onclick="onClick(this)" alt="Bedroom and office in one space">
				<img src="/w3images/livingroom2.jpg" style="width: 100%"
					onclick="onClick(this)" alt="Scandinavian design">
			</div>
		</div> -->

		<!-- Modal for full size images on click-->
		<!-- <div id="modal01" class="w3-modal w3-black" style="padding-top: 0"
			onclick="this.style.display='none'">
			<span class="w3-button w3-black w3-xxlarge w3-display-topright">×</span>
			<div
				class="w3-modal-content w3-animate-zoom w3-center w3-transparent w3-padding-64">
				<img id="img01" class="w3-image">
				<p id="caption"></p>
			</div>
		</div> -->

		<!-- The Team -->
		<!-- <div class="w3-row-padding w3-grayscale">
			<div class="w3-col m4 w3-margin-bottom">
				<div class="w3-light-grey">
					<img src="/w3images/team2.jpg" alt="John" style="width: 100%">
					<div class="w3-container">
						<h3>John Doe</h3>
						<p class="w3-opacity">CEO & Founder</p>
						<p>Phasellus eget enim eu lectus faucibus vestibulum.
							Suspendisse sodales pellentesque elementum.</p>
					</div>
				</div>
			</div>
			<div class="w3-col m4 w3-margin-bottom">
				<div class="w3-light-grey">
					<img src="/w3images/team1.jpg" alt="Jane" style="width: 100%">
					<div class="w3-container">
						<h3>Jane Doe</h3>
						<p class="w3-opacity">Designer</p>
						<p>Phasellus eget enim eu lectus faucibus vestibulum.
							Suspendisse sodales pellentesque elementum.</p>
					</div>
				</div>
			</div>
			<div class="w3-col m4 w3-margin-bottom">
				<div class="w3-light-grey">
					<img src="/w3images/team3.jpg" alt="Mike" style="width: 100%">
					<div class="w3-container">
						<h3>Mike Ross</h3>
						<p class="w3-opacity">Architect</p>
						<p>Phasellus eget enim eu lectus faucibus vestibulum.
							Suspendisse sodales pellentesque elementum.</p>
					</div>
				</div>
			</div>
		</div> -->

		<!-- Options -->
		<div class="w3-container" id="options" style="margin-top: 75px">
			<h1 class="w3-xxxlarge w3-text-red">
				<b>Options</b>
			</h1>
			<hr style="width: 50px; border: 5px solid red" class="w3-round">
			<!-- <p>Do you want us to style your home? Fill out the form and fill
				me in with the details :) We love meeting new people!</p> -->
			<form action="#" target="#">
				<div class="w3-row-padding w3-grayscale" style="margin-top: 40px;">
					<div class="w3-col m6 w3-margin-bottom">
						<div class="w3-light-grey">
							<label><input type="radio" name="optradio" >100 Years</label>
						</div>
					</div>
					<div class="w3-col m6 w3-margin-bottom">
						<div class="w3-light-grey">
							<label><input type="radio" name="optradio" >200 Years</label>
						</div>
					</div>
					<div class="w3-col m6 w3-margin-bottom">
						<div class="w3-light-grey">
							<label><input type="radio" name="optradio" >50 Years</label>
						</div>
					</div>
					<div class="w3-col m6 w3-margin-bottom">
						<div class="w3-light-grey" >
							<label><input type="radio" name="optradio" >10 Years</label>
						</div>
					</div>
				</div>
				<div class="w3-container w3-padding-32" style="margin-top: 70px;">
					<button type="button" class="w3-button w3-col m2 w3-padding-large w3-red w3-margin-bottom w3-margin-top">Back</button>
					<span class=" w3-col m8 w3-padding-large w3-margin-bottom w3-margin-top"></span>
					<button type="button" class="w3-button w3-col m2 w3-padding-large w3-red w3-margin-bottom w3-margin-top" onclick="moveNext();">Next</button>
				</div>
				
			</form>
		</div>

		<!-- End page content -->
	</div>

	<!-- W3.CSS Container -->
	<div class="w3-light-grey w3-container w3-padding-32"
		style="margin-top: 20px; padding-right: 58px">
		<p class="w3-right">
			Powered by <a href="https://www.w3schools.com/w3css/default.asp"
				title="W3.CSS" target="_blank" class="w3-hover-opacity">MICOE - Analytics1</a>
		</p>
	</div>

	<script>
		// Script to open and close sidebar
		function w3_open() {
			document.getElementById("mySidebar").style.display = "block";
			document.getElementById("myOverlay").style.display = "block";
		}

		function w3_close() {
			document.getElementById("mySidebar").style.display = "none";
			document.getElementById("myOverlay").style.display = "none";
		}

		// Modal Image Gallery
		function onClick(element) {
			document.getElementById("img01").src = element.src;
			document.getElementById("modal01").style.display = "block";
			var captionText = document.getElementById("caption");
			captionText.innerHTML = element.alt;
		}
		
		var questions = ["How old is shell ?","Who is the CEO of Shell"];
		function moveNext(){
			alert("Hello");
			document.getElementById("question").innerHTML = questions[0];
		}
	</script>

</body>
</html>
