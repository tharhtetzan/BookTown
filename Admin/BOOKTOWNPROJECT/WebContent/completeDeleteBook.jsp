<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Complete Delete Book</title>
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
.button:hover{
	opacity:0.8;
	 box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
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
    padding: 10px;
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
			<h2>Deletation Completed!!!</h2>
			<h4>Your data is successfully deleted!</h4>
</body>
</html>