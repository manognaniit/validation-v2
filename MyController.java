package com.niit.shoppingcart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.UserDetailsDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.UserDetails;

@Controller
public class MyController {
	@Autowired
	CategoryDAO categoryDAO;
	@Autowired 
	Category category;
	@Autowired
	UserDetailsDAO userDetailsDAO;
	@Autowired
	UserDetails userDetails;
	@RequestMapping("/")
	@Autowired
	public ModelAndView home(){
	ModelAndView mv=new ModelAndView("/home");
		mv.addObject("message", "Thank you for using this URL");
		List<Category> categoryList=categoryDAO.list();
		mv.addObject("categoryList", categoryList);
		System.out.println("size:"+categoryList.size());
		return mv;
	}
	@RequestMapping("/register")
	public ModelAndView register()
	{

		ModelAndView mv=new ModelAndView("register");
		mv.addObject("user clicked register here","true");
		return mv;
	}
	@RequestMapping("/login")
	public ModelAndView Login()
	{

		ModelAndView mv=new ModelAndView("login");
		mv.addObject("user clicked register here","true");
		return mv;
	}
	}
	


