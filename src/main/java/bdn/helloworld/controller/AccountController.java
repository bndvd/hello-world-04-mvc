package bdn.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import bdn.helloworld.model.Ticker;

@Controller
public class AccountController {

	// return string is used by View Resolver
	@RequestMapping(value = "/ticker")
	public String addSecurityTicker(@ModelAttribute("tickerModel") Ticker ticker) {

		System.out.println("ticker: " + ticker.getTickerChars());
		

		// this is the name of the jsp page it needs to load for the greeting request
		// used by View Resolver
		// can do redirect: for getting a brand new request or forward: for forwarding current request
		// and model to tickerPageMore
		// NOTE: need to add .html since we're not going through the View Resolver triggered by web browser
		// and initiating the page load internally
		return "forward:tickerMore.html";
		//return "redirect:tickerMore.html";
	}

	@RequestMapping(value = "/tickerMore")
	public String addSecurityTickerMore(@ModelAttribute("tickerModel") Ticker ticker) {

		System.out.println("tickerMore: " + ticker.getTickerChars());
		

		// this is the name of the jsp page it needs to load for the greeting request
		// used by View Resolver
		return "tickerPage";
	}

}
