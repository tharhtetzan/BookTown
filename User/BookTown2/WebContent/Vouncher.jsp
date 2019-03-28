<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirmation</title>
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

* {
    box-sizing: border-box;
}

/* Add padding to containers */
.container {
    padding: 16px;
    background-color: white;
}

/* Full-width input fields */
input[type=text] {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
}

input[type=text]:focus, {
    background-color: #808080;
    outline: none;
}

/* Overwrite default styles of hr */
hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 17px;
}

/* Set a style for the submit button */
.registerbtn {
    background-color:#808080;
    color: white;
    padding: 16px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
}

.registerbtn:hover {
    opacity: 1;
}

/* Add a blue text color to links */
a {
    color: blue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
    background-color: #808080;
    text-align: center;
}

legend {
    background-color: #000;
    color: #fff;
    padding: 3px 6px;
}

.output {
    font: 1rem 'Fira Sans', sans-serif;
}

input {
    margin: .4rem;
}

label {
    display: inline-block;
    text-align: left;
    width: 20%;
}
</style>
</head>
<body>
<ul>
  <li><h3 align="center" >BookTown</h3></li>	
  <li><s:form action="bookList"><s:submit value="Home"></s:submit></s:form></li>
  <li><s:form action="profilepageshow"><s:submit value="Profile"></s:submit></s:form></li>
  <li><s:form action="history"><s:submit value="History"></s:submit></s:form></li>
  <li><a href="BookSell.jsp"><button>sell</button></a></li>
  <li><a href="Login_Signup.jsp"><button>Log Out</button></a></li>
</ul>
<div style="margin-left:15%;padding:1px 16px;height:1000px;">
<div class="container">
	<s:form action="Vouncher"><s:submit value="Click Here to get Vouncher"></s:submit></s:form>
    <hr>
	<h2><u>Books Sold</u></h2>
<table border="1" cellpadding="0" cellspacing="0">
<s:iterator value="vouncherlist" >
<tr>
<td>&nbsp;Book Name - &nbsp;</td><td>&nbsp;<s:property value="bookname" />&nbsp;</td>
</tr><tr>
<td>&nbsp;Price -  &nbsp;</td><td>&nbsp;<s:property value="price"  />&nbsp;</td>
</tr><tr>
<td>&nbsp;Amount -  &nbsp;</td><td>&nbsp;<s:property value="amount"  />&nbsp;</td>
</tr><tr>
<td>&nbsp;Total Amount -  &nbsp;</td><td>&nbsp;<s:property value="totalamount"  />&nbsp;</td>
</tr><tr>
<td>&nbsp;Date -  &nbsp;</td><td>&nbsp;<s:property value="date"  />&nbsp;</td>
</tr>
</s:iterator>
</table>
 </div>

</div>
<div class="footer">
  <p>Copyright by BookTown</p>
</div>
</body>
</html>