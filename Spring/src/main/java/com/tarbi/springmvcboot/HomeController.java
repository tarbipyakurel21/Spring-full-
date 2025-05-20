package com.tarbi.springmvcboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tarbi.springmvcboot.dao.AlienDao;
import com.tarbi.springmvcboot.model.Alien;




@Controller
public class HomeController {

@Autowired
AlienDao dao;
	
@ModelAttribute
public void modelData(ModelMap m) {
	
	m.addAttribute("name","Aliens");
}
	
	
	
	
@RequestMapping("/")
public String home() {

	System.out.println("homepage requested");
	return "result";
}


@PostMapping("add")
public String add(@RequestParam("num1")int i,@RequestParam("num2")int j,ModelMap m) {
	

	int num3=i+j;
	m.addAttribute("num3",num3);
	
	return "result";
}

@GetMapping("getAliens")
public String getAliens(@RequestParam int aid, ModelMap m) {
	m.addAttribute("result",dao.getAlien(aid));
	return null;
}
@RequestMapping("addAlien")
public String addAlien(@ModelAttribute("result") Alien a) {
	
	dao.addAlien(a);
	return "result" ;
}


}
	

