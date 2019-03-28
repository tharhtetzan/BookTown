<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login_Signup</title>
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans:400,300'>
<link rel='stylesheet' href='https://fonts.googleapis.com/icon?family=Material+Icons'>
<link rel="stylesheet" href="style.css">
<style>
	.button1{
		opacity : 0;
	}
</style>
</head>
<body>
<div class="cotn_principal">
<div class="cont_centrar">
<div class="cont_login">
<div class="cont_info_log_sign_up">
<div class="col_md_login">
<div class="cont_ba_opcitiy">
        
        <h2>LOGIN</h2>  
  <p>login now </p> 
  <button class="btn_login" onclick="cambiar_login()">LOGIN</button>
  </div>
  </div>
<div class="col_md_sign_up">
<div class="cont_ba_opcitiy">
  <h2>SIGN UP</h2>

  
  <p>Sign up here</p>	

  <button class="btn_sign_up" onclick="cambiar_sign_up()">SIGN UP</button>
</div>
  </div>
       </div>

    
    <div class="cont_back_info">
       <div class="cont_img_back_grey">
       <img src="https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d" alt="" />
       </div>
       
    </div>
<div class="cont_forms" >
    <div class="cont_img_back_">
       <img src="https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d" alt="" />
       </div>
 <div class="cont_form_login">
 
 
<h2>LOGIN</h2>
<s:form action="loginCheck">
<s:textfield name="name"  label="User Name"/>
<s:password name="password"   label="Password"/>
<s:hidden value="%{}" name="username" />
<s:submit value="Confirm"></s:submit>
</s:form>
</div> 


<div class="cont_form_sign_up">


<h2>SIGN UP</h2>
<s:form action="SignUp">
<s:textfield name="name"  label="User Name"/>
<s:hidden value="%{name}" name="username" />
<s:textfield name="email"   label="Email"/>
<s:textfield name="address"   label="Address"/>
<s:textfield name="phnumber"   label="Phone Number"/>
<s:password name="password"   label="Password"/>
<s:password name="cpassword"   label="Confirm Password"/>
<s:submit value="Confirm"></s:submit>
</s:form>
</div>
    </div>
    
  </div>
 </div>
 <br>
 <a href="InformationPage.jsp" ><button class="button1">back</button></a>
</div>
<script  src="index.js"></script>
</body>
</html>