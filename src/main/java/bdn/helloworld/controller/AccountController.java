package bdn.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import bdn.helloworld.model.Ticker;
import bdn.helloworld.model.Transaction;

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
	
	
	@RequestMapping(value = "/shares", method = RequestMethod.GET)
	public @ResponseBody List<Transaction> findAllTransactions() {
		List<Transaction> transactions = new ArrayList<Transaction>();
		
		Transaction t1 = new Transaction();
		t1.setShareQty(5);
		transactions.add(t1);
		
		Transaction t2 = new Transaction();
		t2.setShareQty(120);
		transactions.add(t2);
		
		Transaction t3 = new Transaction();
		t3.setShareQty(11);
		transactions.add(t3);
		
		return transactions;
	}
	

}
