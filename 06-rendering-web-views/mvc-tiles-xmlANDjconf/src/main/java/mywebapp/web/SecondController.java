package mywebapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class SecondController {

    @RequestMapping(value = "/secondpage", method = RequestMethod.GET)
    public String index(ModelMap model){
        return "secondpage";
    }

}
