package Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import Entity.Customer;

@Controller
public class HomeController {
	
		@RequestMapping(value="/home", method=RequestMethod.GET)
		public String goHome(Model model,Customer customer){
			return "/home";
		}

}
