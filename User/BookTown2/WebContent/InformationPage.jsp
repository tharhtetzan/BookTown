<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>InformationPage</title>
<style type="text/css">
.button {
    background-color: #999999; /* Green */
    border: none;
    color:black;
    padding: 13px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 15px;
    margin: 3px 1px;
    cursor: pointer;
    border-radius: 50%;
}
div.footer{
	background: #333;
	text-align: center;
	color:white;
	float: bottom;
	height: 80px;
}
#navbar{
    background-color: #333;
    overflow: hidden;
}
#navbar a {
    float: left;
    color: #f2f2f2;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-size: 17px;
}
#navbar a:hover {
    background-color: #ddd;
    color: black;
}
* {
    box-sizing: border-box;
}
.column {
    float: left;
    width: 33.33%;
    padding: 10px;
    height: 400px; /* Should be removed. Only for demonstration */
}
.row:after {
    content: "";
    display: table;
    clear: both;
}
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color:#333;
    color: white;
}
</style>
<script>
var prevScrollpos = window.pageYOffset;
window.onscroll = function() {
var currentScrollPos = window.pageYOffset;
  if (prevScrollpos > currentScrollPos) {
    document.getElementById("navbar").style.top = "0";
  } else {
    document.getElementById("navbar").style.top = "-50px";
  }
  prevScrollpos = currentScrollPos;
}
</script>
</head>
<body background="image/back.jpg">
<div id="navbar">
  <a href="#home">Book Maniac</a>
</div>
<h2>Top 3 Books</h2>
<div class="row">
  <div class="column" style="background-color:#aaa;" align="center">
    <h2>Harry Potter</h2>
    <h3>and the philosopher stone</h3>
    <img src="image/harryone.jpg" alt="Book 1" width="200" height="200">
  </div>
  <div class="column" style="background-color:#bbb;" align="center">
    <h2>Harry Potter</h2>
    <h3>and the chamber of secrets</h3>
    <img src="image/harrytwo.jpg" alt="Book 2" width="200" height="200">
  </div>
  <div class="column" style="background-color:#ccc;" align="center">
    <h2>Harry Potter</h2>
    <h3>and the prisoner of azkabam</h3>
    <img src="image/harrythree.jpg" alt="Book 3" width="200" height="200">
  </div>
</br></br> 
  <h2>Top 10 Books</h2>
<table>
  <tr>
  	<th></th>
    <th>Book Name</th>
    <th>Book Author</th>
    <th>Price(mmk)</th>
    <th></th>
  </tr>
  <tr>
  	<td>1</td>
    <td>Harry Potter and the Philosopher's Stone</td>
    <td>JKRowling</td>
    <td>10000</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>2</td>
    <td>Harry Potter and the Chamber of Secrets</td>
    <td>JKRowling</td>
    <td>15000</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>3</td>
    <td>Harry Potter and the Prisoner of Azkaban</td>
    <td>JKRowling</td>
    <td>15000</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>4</td>
    <td>Harry Potter and the Globlet of fire</td>
    <td>JKRowling</td>
    <td>25000</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>5</td>
    <td>Harry Potter and the Order of phoenix</td>
    <td>JKRowling</td>
    <td>25000</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>6</td>
    <td>Tha Nge Chin Lo Be Set Yae Kor Mye Khine</td>
    <td>University Phone Naing</td>
    <td>5000</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>7</td>
    <td>Nway Gan Dr Oo</td>
    <td>University Phone Naing</td>
    <td>3000</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr><tr>
  	<td>8</td>
    <td>Harry Potter and the Half_blood Prince>
    <td>JK Rowling</td>
    <td>25000</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>9</td>
    <td>Harry Potter and the Deadly Hollows</td>
    <td>JK Rowling</td>
    <td>20000</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>10</td>
    <td>Myor 1 lint lint</td>
    <td>Shwe U Daung</td>
    <td>15000</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
</table>
<br><br>
</div>
	<div class="footer"> 
			</br>
            <span>Read More &#169; BookTown &nbsp&nbsp</span><a href="Login_Signup.jsp" ><button class="button button5">Go</button></a>       
    
</body>
</html>