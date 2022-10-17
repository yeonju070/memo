package com.memo.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {

	@RequestMapping("/sign_up")
	public String signUp() {

		return "memo/signUp";
	}

	@RequestMapping("/sign_in")
	public String signIn() {
		
		return "memo/signIn";
	}
}
