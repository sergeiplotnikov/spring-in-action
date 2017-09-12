package mywebapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
import org.springframework.validation.Errors;
import org.springframework.validation.BindingResult;
import mywebapp.beans.User;

@Controller
@RequestMapping("/user")
public class RegisterController {

    @RequestMapping(method = RequestMethod.GET)
    public String displayRegistrationForm(Model model){
        model.addAttribute("user", new User());
        return "regform";
    }
/*
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(Model model, @Valid User user, BindingResult errors){
		if (errors.hasErrors()){
			model.addAttribute("regFormModel", user);
			return "regform";
		}
        return "redirect:/";
    }
*/
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(@Valid User user, BindingResult errors){
		if (errors.hasErrors()){
			//model.addAttribute("regFormModel", user);
			return "regform";
		}
        return "redirect:/";
    }

}
