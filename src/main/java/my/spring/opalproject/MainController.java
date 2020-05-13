package my.spring.opalproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value="/main")
	public String main() {
		
		return  "main";
	}
	
	@RequestMapping(value="/about")
	public String about() {
		
		return  "about";
	}

}
