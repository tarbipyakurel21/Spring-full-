package com.tarbi.springmvcboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tarbi.springmvcboot.model.Alien;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	
@Autowired
AlienRepo repo;
 
@ModelAttribute
public void modelData(ModelMap m) {
	
	m.addAttribute("name","Aliens");
}
	
	
	
	
@RequestMapping("/")
public String home() {

	System.out.println("homepage requested");
	return "index";
}

@GetMapping("getAliens")
public String getAliens(ModelMap m) {
	m.addAttribute("result", repo.findAll());
	
	return "showAliens";
}

@GetMapping("getAlien")
public String getAlien(@RequestParam int aid, ModelMap m) {
	m.addAttribute("result", repo.getOne(aid));
	return "showAliens";
}

@RequestMapping("addAlien")
public String addAlien(@ModelAttribute("alien") Alien a, ModelMap m) {
	
	repo.save(a);
	return "result" ;
}

@GetMapping("getAlienByName")
public String getAlienByName(@RequestParam String aname, ModelMap m) {
	
	m.addAttribute("result",repo.findByAname(aname));
	
	return "showAliens";
}
}
	

