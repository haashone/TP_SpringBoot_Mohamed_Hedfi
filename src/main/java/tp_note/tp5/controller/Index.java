package tp_note.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Index {

	@GetMapping("/")
	public String DefaultIndex(Model model) {
		
		//model.addAttribute("nomTemplate");
		return "index";
	}
	
	@GetMapping("/index")
	public String index(Model model) {
		
		//model.addAttribute("nomTemplate");
		return "index";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		
		//model.addAttribute("nomTemplate");
		return "index";
	}

}
