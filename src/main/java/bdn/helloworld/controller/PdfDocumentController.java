package bdn.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PdfDocumentController {

	@RequestMapping(value = "/loadpdf")
	public String loadPdf() {

		return "pdfPage";
	}

}
