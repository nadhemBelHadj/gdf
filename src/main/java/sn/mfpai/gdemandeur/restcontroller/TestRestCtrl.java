package sn.mfpai.gdemandeur.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/test")
@CrossOrigin
public class TestRestCtrl {
	
	@RequestMapping(method = RequestMethod.GET)
	public String test() {
		return "hello";
	}
	

}
