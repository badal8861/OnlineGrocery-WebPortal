package com.onlinegrocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlinegrocery.entity.LoginEntity;
import com.onlinegrocery.service.LoginService;


@RestController
	public class LoginController {
	@Autowired
	LoginService loginService;
	@PostMapping("/userLogin")
	public String userLogin(@RequestBody LoginEntity loginEntity) throws Exception
	{
		 Boolean loginSuccessfull = false;
		 loginSuccessfull = loginService.userLogin(loginEntity);
		 if(loginSuccessfull) {
			 return "Welcome virtusa online grocery !";
		 }
		 else {
			 return "Your login credentials are incorrect ! PLEASE TRY AGAIN !!!!! ";
		 }	 
	}

}
