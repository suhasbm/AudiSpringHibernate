package com.itc.controllers;


import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itc.beans.Audi;
import com.itc.dao.AudiDAO;
import com.itc.dao.UserDAO;


@Controller
public class AudiController {
	
	@Autowired
	AudiDAO dao;
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("name") String name,@RequestParam("password") String password){
		System.out.println(name);
		if(UserDAO.validate(name, password))
		{
			return new ModelAndView("home");
		}
	
		return new ModelAndView("index","errmsg","Username/password incorrect!");
	}
	
	
	@RequestMapping("/logout")
	public ModelAndView logout(){
		
		
		return new ModelAndView("index","errmsg","successfully logged out");
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/viewemp")
	public ModelAndView viewemp(){
		
		List<Audi> list=dao.getAllEvents();
		return new ModelAndView("viewAll","list",list);	
	}
	
	@RequestMapping("/viewEventByCat")
	public ModelAndView viewbyname(@RequestParam("category") String category){
		System.out.println(category);
		
		List<Audi> list=dao.getEventsByName(category);
		return new ModelAndView("viewAll","list",list);	
	}
	
	
	
	
	@RequestMapping("/buy/{eventid}")
	public ModelAndView buy(@PathVariable int eventid, HttpSession session){
		String signInTime=LocalTime.now().toString();
		session.setAttribute("signInTime", signInTime);
		Audi audi=dao.getEventBean(eventid);
		return new ModelAndView("buyForm","command",audi);
	}
	
	@RequestMapping(value="/buySave",method = RequestMethod.GET)
	public String editsave(@ModelAttribute("audi") Audi audi,@RequestParam("quant") int qty,Model model,HttpSession session){
		System.out.println(qty);
		
		String signInTime=(String)session.getAttribute("signInTime");
		String signOutTime=LocalTime.now().toString();
		
		 try {
			    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
			    Date date1 = format.parse(signInTime);
			    Date date2 = format.parse(signOutTime);
			    long difference = date2.getTime() - date1.getTime();
			    if(difference<15000)//given for 15sec change to 9hrs when needed
			    {
			    	
			    	model.addAttribute("audi", audi);
					model.addAttribute("qty",qty);
					if(dao.update(audi,qty))
					{
						return "confirm";
					}
					return "failure";
			    	
			    }
			  }
		 catch (Exception e) {
			
		}
		
		 return "sessionTimeOut";
	}
}
