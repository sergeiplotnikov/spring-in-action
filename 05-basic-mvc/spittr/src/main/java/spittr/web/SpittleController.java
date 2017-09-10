package spittr.web;

import java.util.Map;
import org.springframework.ui.Model;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import spittr.Spittle;
import spittr.data.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

	private SpittleRepository spittleRepo;
	private static final String MAX_LONG_AS_STRING = "9223372036854775807";

 	@Autowired
	public SpittleController(SpittleRepository repo){
		spittleRepo = repo;
	}

	/*
	@RequestMapping(method=RequestMethod.GET)
	public String spittles (Model model) {
		//model.addAttribute("spittleList", spittleRepo.findSpittles(Long.MAX_VALUE, 20));
		model.addAttribute(spittleRepo.findSpittles(Long.MAX_VALUE, 20));
		//if model key is not passed explicitly it will be inferred from the valu
		// List<Spittle> => spittleList
		return "spittles";
	}

        @RequestMapping(method=RequestMethod.GET)
        public String spittles (Map model) {
            model.put("spittleList", spittleRepo.findSpittles(Long.MAX_VALUE, 20));
            return "spittles";
        }

        @RequestMapping(method=RequestMethod.GET)
        public List<Spittle> spittles(){
            return spittleRepo.findSpittles(Long.MAX_VALUE, 20);
        }
        // Spring in Action, 4th ed:
        // 	When a handler method returns an object or a collection like this,
        // the value returned is put into the model, and the model key is inferred
        // from its type (spittleList).
        // 	As for the logical view name, its inferred from the request path.
        // Because this method handles GET requestst for /spittles, the view name is spittles.

    */
	// Adding the ability for the user to pass data with request
	@RequestMapping(method=RequestMethod.GET)
	public List<Spittle> spittles(
		@RequestParam(value="max", defaultValue=SpittleController.MAX_LONG_AS_STRING) long max,
		@RequestParam(value="count", defaultValue="20") int count) {
			
			return spittleRepo.findSpittles(max, count);
	}


	@RequestMapping(value="/{spittleId}", method=RequestMethod.GET)
	public String spittle(@PathVariable("spittleId") long spittleId, Model model){
		model.addAttribute(spittleRepo.findOne(spittleId));
		return "spittle";
	}
}
