package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.controller.dao.UserDAO;
import com.niit.controller.dao.UserDAO;
import com.niit.controller.daoimpl.UserDAOImpl;
import com.niit.controller.daoimpl.UserDAOImpl;
@Controller
public class HomeController 
{
	@RequestMapping ("/sample")
	public String ShowSample()
	{
		return "sample";
	}
	@RequestMapping("/login")
	public String Showlogin()
	{
		return "login";
	}
	@RequestMapping("/register")
	public String ShowRegister()
	{
		return "register";
	
	}
	
	@RequestMapping("/validate")
	public ModelAndView validate(@RequestParam("id") String id,@RequestParam("password") String password){
			System.out.println("In validate method");
			System.out.println(id+":id");
			System.out.println(password+":pwd");
			UserDAO userdao=new UserDAOImpl();
			
			
if(userdao.isValidCredentials(id,password))
{
	ModelAndView model=new ModelAndView("success");
return model;
}
else
{
	ModelAndView model=new ModelAndView("invalid");
	return model;
	}
			}
	
	
	
	

}




