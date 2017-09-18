package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.Spitter;
import spittr.data.SpittleRepository;
import spittr.data.SpitterRepository;
import javax.validation.Valid;
import org.springframework.validation.Errors;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
/**/
	private SpitterRepository spitterRepo;
	
	@Autowired
	public SpitterController(SpitterRepository repo){
		spitterRepo = repo;
	}
	
	@RequestMapping(value="/{username}", method=GET)
	public String showSpitterProfile(@PathVariable String username, Model model){
		Spitter spitter = spitterRepo.findByUsername(username);
		model.addAttribute(spitter);
		return "profile";
	}

	@RequestMapping(value="/register", method=POST)
	public String processRegistration(@Valid Spitter spitter, Errors errors){
		if (errors.hasErrors())
			return "registerForm";
		spitterRepo.save(spitter);
		return "redirect:/spitter/" + spitter.getUsername();
	}
	
	@RequestMapping(value="/register", method=GET)
	public String showRegistrationForm() {
		return "registerForm";
	}

}
