package com.tarbi.app;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

@GetMapping("/")
public String home() {
	return "home";
	
}

@RequestMapping("/login")
public String loginPage() {
	
	return "login";
}

@RequestMapping("/logout-success")
public String logoutPage() {
	return "logout";
}

@RequestMapping("user")
@ResponseBody
public Principal user(Principal principal) {

return principal;

}



}
 