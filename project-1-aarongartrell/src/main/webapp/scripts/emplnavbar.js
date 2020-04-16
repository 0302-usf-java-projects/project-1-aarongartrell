function addNavBar(xhr) {
	let navBarDiv = document.getElementById("EmployeeNavBar");
	navBarDiv.innerHTML = 
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		  <a class="navbar-brand" href="C:\Users\cgapr\Documents\VSCode\html\ersproject\ersemployeehome.html">ERS</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		  <div class="collapse navbar-collapse" id="navbarNav">
		    <ul class="navbar-nav">
		      <li class="nav-item active">
		        <a class="nav-link" href="ersproject\ers.html">Home</a>
		      </li>
		     
		      <li class="nav-item">
		        <a class="nav-link" href="ersproject\ersemployeehome.html">Submit a Request</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="ersproject\requests.html">View Requests</a>
			  </li>
			  <li class="nav-item">
		        <a class="nav-link" href="ersproject\ers.html">Logout</a>
		      </li>
		    </ul>
		  </div>
		</nav>;
}
