<!DOCTYPE html>
<html>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 50%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 20%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}
</style>
<body>

<form action="RegisterUser" METHOD="post" style="border:1px solid #ccc">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required>

    
    <label for="email"><b>First name</b></label>
    <input type="text" placeholder="Enter First Name" name="firstName" required>
    
    <label for="email"><b>Last name:</b></label>
    <input type="text" placeholder="Enter Last Name" name="lastName" required>
    
    <label for="email"><b>Desired UserName:</b></label>
    <input type="text" placeholder="Enter UserName" name="userName"   required>
    
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="passwd"  pattern=".{6,}" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" pattern=".{6,}" required>
    
    <label for="Gender"><b>Gender</b> </label>
    <input name="gender" type="radio" value="m" onFocus="hintEvent('GENDER1');" onBlur="hintEvent('GENDER1', 'HIDE');">Male&nbsp;&nbsp;&nbsp; 
    <input name="gender" type="radio" value="f" onFocus="hintEvent('GENDER1');" onBlur="hintEvent('GENDER1', 'HIDE');"> Female
   
    </br></br>
    <label><b>Total experience</b></label>
    <select name="exp_in_years">
										<option value="">- Select -</option>
										<option value="0">0</option>
										<option value="1">1</option>

										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
										<option value="6">6</option>
										<option value="7">7</option>

										<option value="8">8</option>
										<option value="9">9</option>
										<option value="10">10</option>
										<option value="11">11</option>
										<option value="12">12</option>
										<option value="13">13</option>

										<option value="14">14</option>
										<option value="15">15</option>
										<option value="16">16</option>
										<option value="17">17</option>
										<option value="18">18</option>
										<option value="19">19</option>

										<option value="20">20</option>
										<option value="21">21</option>
										<option value="22">22</option>
										<option value="23">23</option>
										<option value="24">24</option>
										<option value="25">25</option>

										<option value="26">26</option>
										<option value="27">27</option>
										<option value="28">28</option>
										<option value="29">29</option>
										<option value="30">30</option>
										<option value="31">31</option>

										<option value="32">32</option>
										<option value="33">33</option>
										<option value="34">34</option>
										<option value="35">35</option>
										<option value="36">36</option>
										<option value="37">37</option>

										<option value="38">38</option>
										<option value="39">39</option>
										<option value="40">40</option>
										<option value="41">41</option>
										<option value="42">42</option>
										<option value="43">43</option>

										<option value="44">44</option>
										<option value="45">45</option>
										<option value="46">46</option>
										<option value="47">47</option>
										<option value="48">48</option>
										<option value="49">49</option>

										<option value="50">50</option>
								</select>&nbsp;Years <select name="exp_in_months" class="Form_fields"
									onFocus="hintEvent('WORK_EXP');"
									onBlur="hintEvent('WORK_EXP', 'HIDE');">
										<option value="">- Select -</option>
										<option value="00">0</option>
										<option value="01">1</option>
										<option value="02">2</option>

										<option value="03">3</option>
										<option value="04">4</option>
										<option value="05">5</option>
										<option value="06">6</option>
										<option value="07">7</option>
										<option value="08">8</option>

										<option value="09">9</option>
										<option value="10">10</option>
										<option value="11">11</option>
								</select>&nbsp;Months
    <br><br>
    
    
    <label><b>Current / Preferred industry:</b> </label><div class="custom-select" style="width:200px;">
      <select name="industry" size="8" id="industry"  multiple="multiple"><option
											value=''>- Select -</option>
										<option value='65'>Any</option>
										<option value='8'>Devops</option>
										<option value='16'>Trainer</option>
										<option value='17'>Developer</option>
										<option value='27'>Software Testing</option>
										<option value='30'>UI/Ux Designer</option>
										<option value='31'>FullStack Developer</option>
										<option value='32'>DB Admin</option>
										<option value='34'>Animator.</option>
										<option value='55'>Other</option></select></div><br><br>
										
										
		<label for="skill"><b>KeySkills</b></label>
    <input type="text" placeholder="Enter Key Skills" name="keySkills" required>
   
    
    <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

    <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>

</body>
</html>
