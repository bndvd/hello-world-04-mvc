package bdn.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import bdn.helloworld.model.Benchmark;

@Controller
@SessionAttributes("benchmarkAttrib")
public class BenchmarkController {

	@RequestMapping(value = "addBenchmark", method = RequestMethod.GET)
	public String addBenchmarkIndex(Model model) {
		Benchmark _bm = new Benchmark();
		_bm.setBenchmarkIndex("SP500");
		model.addAttribute("benchmarkAttrib", _bm);
		
		return "addBenchmarkPage";
	}
	
	@RequestMapping(value = "addBenchmark", method = RequestMethod.POST)
	public String updateBenchmarkIndex(@ModelAttribute("benchmarkAttrib") Benchmark benchmark) {
		
		System.out.println("Benchmark updated: " + benchmark.getBenchmarkIndex());
		
		return "redirect:ticker.html";
	}

}
