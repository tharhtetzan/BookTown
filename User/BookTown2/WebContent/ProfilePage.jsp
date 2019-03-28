<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
<style type="text/css">
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
img {
  border-radius: 50%;
}
table {
    border-collapse: collapse;
    width: 35%;
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
</style>
</head>
<body background="image/back.jpg">
<ul>
  <li><h3 align="center" >BookTown</h3></li>	
  <li><s:form action="bookList"><s:submit value="Home"></s:submit></s:form></li>
  <li><s:form action="profilepageshow"><s:submit value="Profile"></s:submit></s:form></li>
  <li><s:form action="history"><s:submit value="History"></s:submit></s:form></li>
  <li><a href="BookSell.jsp"><button>sell</button></a></li>
  <li><a href="Login_Signup.jsp"><button>Log Out</button></a></li>
</ul>
<div align="center" style="margin-left:10%;padding:1px 16px;height:1000px;">
<br>
<br>
<img src="image/profile.jpg" alt="Avatar" style="height:100px;width:100px"><br><br>
<table>
  <tr>
  	<th></th>
    <th></th>
  </tr>
  <s:iterator value="userList" >
  <tr>
  	<td>User name</td><td><s:property value="name"  /></td>
  </tr>
  <tr>
  	<td>User code</td>
    <td><s:property value="code"  /></td>
  </tr>
  <tr>
  	<td>Created Date</td>
    <td><s:property value="createdate"  /></td>
  </tr>
  <tr>
  	<td>Books Bought</td>
    <td><s:property value="bookbought"  /></td>
  </tr>
  <tr>
  	<td>Books Sold</td>
    <td><s:property value="booksold"  /></td>
  </tr>
  <tr>
  	<td>Email</td>
    <td><s:property value="email"  /></td>
  </tr>
  <tr>
  	<td>Phone Number</td>
    <td><s:property value="phnumber"  /></td>
  </tr>
  <tr>
  	<td>TownShip</td>
    <td><s:property value="address"  /></td>
  </tr>
  </s:iterator>
</table>
</div>
<div class="footer">
  <p>Copyright by BookTown</p>
</div>
</body>
</html>