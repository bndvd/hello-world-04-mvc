package bdn.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	// the annotation is telling what URL to tie it to; method name can be anything
	// the Model object is edited and returned as part of request-response lifecycle
	@RequestMapping(value="/greeting")
	public String sayHello(Model model) {
		
		model.addAttribute("greeting", "Hello World");
		
		// this is the name of the jsp page it needs to load for the greeting request
		// used by View resolver
		return "hello";
	}
	
}
