package mywebapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
import org.springframework.validation.Errors;
import org.springframework.validation.BindingResult;
import mywebapp.beans.User;

@Controller
@RequestMapping(value="/user")
public class RegisterController {

    @RequestMapping(method = RequestMethod.GET)
    public String displayRegForm(ModelMap model){
		model.addAttribute("user", new User());
        return "regform";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegForm(@Valid User user, Errors errors){
		if(errors.hasErrors())
        	return "regform";
		return "redirect:/";
    }

}
