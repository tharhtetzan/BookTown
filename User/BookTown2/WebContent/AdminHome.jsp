<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdminPage</title>
<style>
body {
    margin: 0;
}
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
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    width: 10%;
    background-color: #333;
    position: fixed;
    height: 100%;
    overflow: auto;
}

li a {
    display: block;
    color: #000;
    padding: 8px 16px;
    text-decoration: none;
}

li a.active {
    background-color: #555;
    color: white;
}

li a:hover:not(.active) {
    background-color: #555;
    color: white;
}
h3 {
    text-shadow: 1px 1px white;
}
.column {
    float: left;
    width:30%;
    padding: 10px;
    height: 250px; /* Should be removed. Only for demonstration */
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

input[type=text] {
    width: 200px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    font-size: 16px;
    background-color: white;
    background-image: url('searchicon.png');
    background-position: 10px 10px; 
    background-repeat: no-repeat;
    padding: 12px 20px 12px 40px;
    -webkit-transition: width 0.4s ease-in-out;
    transition: width 0.4s ease-in-out;
}

input[type=text]:focus {
    width: 85%;
}
.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   height: 40px;
   background-color:#333;
   color: white;
   text-align: center;
}
</style>
</head>
<body>
	<ul>
  <li><h3 align="center" >AdminPanal</h3></li>	
  <li><a class="active" href="User/Home.jsp">Home</a></li>
  <li><div align="center"><form method="get" action="User.ProfileServlet"><input type="submit" value="Profile"></form></div></li>
  <li><a href="User/Sell.jsp">Sell</a></li>
  <li><a href="#about">About us</a></li>
  <li><a href="#contact">Report</a></li>
  <li><a href="Login_Signup.jsp">Log Out</a></li>
</ul>
<div style="margin-left:15%;padding:1px 16px;height:1000px;">
<h2><u>Ongoing Book Sale</u></h2>
<table>
  <tr>
  	<th></th>
    <th>Book Name</th>
    <th>Book Author</th>
    <th>Price</th>
    <th></th>
  </tr>
  <tr>
  	<td>1</td>
    <td>Peter</td>
    <td>Griffin</td>
    <td>$100</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>2</td>
    <td>Lois</td>
    <td>Griffin</td>
    <td>$150</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>3</td>
    <td>Joe</td>
    <td>Swanson</td>
    <td>$300</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>4</td>
    <td>Cleveland</td>
    <td>Brown</td>
    <td>$250</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>5</td>
    <td>Peter</td>
    <td>Griffin</td>
    <td>$100</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>6</td>
    <td>Lois</td>
    <td>Griffin</td>
    <td>$150</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>7</td>
    <td>Joe</td>
    <td>Swanson</td>
    <td>$300</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr><tr>
  	<td>8</td>
    <td>Peter</td>
    <td>Griffin</td>
    <td>$100</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>9</td>
    <td>Lois</td>
    <td>Griffin</td>
    <td>$150</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>10</td>
    <td>Joe</td>
    <td>Swanson</td>
    <td>$300</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
</table>
<hr>
<h2><u>Books Sell request</u></h2>
<table>
  <tr>
  	<th></th>
    <th>Book Name</th>
    <th>Book Author</th>
    <th>Price</th>
    <th></th>
  </tr>
  <tr>
  	<td>1</td>
    <td>Peter</td>
    <td>Griffin</td>
    <td>$100</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>2</td>
    <td>Lois</td>
    <td>Griffin</td>
    <td>$150</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>3</td>
    <td>Joe</td>
    <td>Swanson</td>
    <td>$300</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>4</td>
    <td>Cleveland</td>
    <td>Brown</td>
    <td>$250</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>5</td>
    <td>Peter</td>
    <td>Griffin</td>
    <td>$100</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>6</td>
    <td>Lois</td>
    <td>Griffin</td>
    <td>$150</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>7</td>
    <td>Joe</td>
    <td>Swanson</td>
    <td>$300</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr><tr>
  	<td>8</td>
    <td>Peter</td>
    <td>Griffin</td>
    <td>$100</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>9</td>
    <td>Lois</td>
    <td>Griffin</td>
    <td>$150</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
  <tr>
  	<td>10</td>
    <td>Joe</td>
    <td>Swanson</td>
    <td>$300</td>
    <td><a href="#" ><button class="button button5">Buy</button></a></td>
  </tr>
</table>
<br><br>
<div align="right"><a href="#" >View more</a></div>
<br><br><br><br>
</div>
<div class="footer">
  <p>Copyright by BookTown</p>
</div>
</body>
</html>