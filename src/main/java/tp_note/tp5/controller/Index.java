package tp_note.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Index {

	@GetMapping("/")
	public String greeting(Model model) {
		
		//model.addAttribute("nomTemplate");
		return "index";
	}

}
