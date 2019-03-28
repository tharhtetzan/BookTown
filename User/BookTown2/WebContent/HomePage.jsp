<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
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
<body background="image/back.jpg">
<ul>
  <li><h3 align="center" >BookTown</h3></li>	
  <li><s:form action="bookList"><s:submit value="Home"></s:submit></s:form></li>
  <li><s:form action="profilepageshow"><s:submit value="Profile"></s:submit></s:form></li>
  <li><s:form action="history"><s:submit value="History"></s:submit></s:form></li>
  <li><a href="BookSell.jsp"><button>sell</button></a></li>
  <li><a href="Login_Signup.jsp"><button>Log Out</button></a></li>
</ul>
<div style="margin-left:15%;padding:1px 16px;height:1000px;">
<s:form action="ToSearch">
<h2><u>Search Books - </u></h2><s:textfield name="book_name"/><br><s:submit value="Search"></s:submit>
</s:form>
<hr>
  <h2><u>Top 3 Books</u></h2>
<div class="row">
  <div class="column" style="background-color:#aaa;" align="center">
    <img src="image/harryone.jpg" alt="Book 1" width="200" height="200"><br><br>
    <i>Harrypotter and the philosopherstone</i>
  </div>
  <div class="column" style="background-color:#bbb;" align="center">
    <img src="image/harrytwo.jpg" alt="Book 1" width="200" height="200"><br><br>
    <i>Harrypotter and the chamber of secrets</i>
  </div>
  <div class="column" style="background-color:#ccc;" align="center">
    <img src="image/harrythree.jpg" alt="Book 1" width="200" height="200"><br><br>
    <i>Harrypotter and the prisoner of Azkabun</i>
   </div>
</div>
<hr>
<h2><u>Top 10 Books</u></h2>
<table border="1" cellpadding="0" cellspacing="0">
<tr>
  	<th>No</th>
    <th>Book Name</th>
    <th>Book Author</th>
    <th>Description</th>
    <th>Price</th>
    <th></th>
  </tr>
<s:iterator value="bookList" >
<tr>
<td>&nbsp;<s:property value="id"  />&nbsp;</td>
<td>&nbsp;<s:property value="book_name" />&nbsp;</td>
<td>&nbsp;<s:property value="author"  />&nbsp;</td>
<td>&nbsp;<s:property value="description"  />&nbsp;</td>
<td>&nbsp;<s:property value="price"  />&nbsp;</td>
<td>&nbsp;<s:form action="BookBuy">
<s:hidden value="%{book_name}" name="hbook_name" />
<s:hidden value="%{price}" name="hprice" />
<s:submit value="Buy Now" />
</s:form>
&nbsp;</td>

</tr>
</s:iterator>
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