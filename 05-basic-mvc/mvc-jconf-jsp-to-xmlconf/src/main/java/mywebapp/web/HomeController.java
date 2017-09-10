package mywebapp.web;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.*;
import java.util.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value="/", method=GET)
    public String home(Model model) {
	//Map<String, String> model = new HashMap<String, String>();
	//model.put("xyz","this is my message");
	//ModelAndView mv = new ModelAndView("home","xx",model);
	model.addAttribute("xx","XX value");
	model.addAttribute("xyz","XYZ value");
        return "home";
    }
}
