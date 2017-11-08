package com.mycompany.controllers;

import com.mycompany.dao.UserDao;
import com.mycompany.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap model){
    
    	User a = userDao.getUser(1L);
    	model.addAttribute("user1", a.getUsername() + " / " + a.getPassword() + " / " + a.getEmail());
    	model.addAttribute("user2", a.getUsername() + " / " + a.getPassword() + " / " + a.getEmail());
    	
    	//UNCOMMENT bloc below if 'dataSource' bean is the embedded H2 db.
    	/**/
    	User b = new User("user_2","password_2","email_2@gmail.com");
    	userDao.addUser(b);
    	b = userDao.getUser(2L);
    	model.addAttribute("user2", b.getUsername() + " / " + b.getPassword() + " / " + b.getEmail());
    	
   
        return "home";
    }

}
