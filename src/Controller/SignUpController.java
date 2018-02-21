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
@SessionAttributes("AddNewCustomer")
public class SignUpController {

	@RequestMapping(value="/signUp" , method=RequestMethod.GET)
	public String addNewCustomer(Customer customer,Model model)
	{	
		model.addAttribute("AddNewCustomer", customer);
		return "/signUp";
	}
	
	@RequestMapping(value="/signUp" , method=RequestMethod.POST)
	public String addNewCustomerf(@Valid @ModelAttribute("AddNewCustomer") Customer customer,BindingResult result)
	{	
		if(result.hasErrors())
		{
			System.out.println("yes");
		return "signUp";
		}
		
		if(!Customer.checkIfExist(customer.getEmail(), customer.getPhoneNumber())) 
		{
		customer.addNewCustomer(customer);
		return "redirect:ThankForRegister";
		}
		
		return "signUp";
	}
	
	@RequestMapping(value="/ThankForRegister")
	public String thankForRegister()
	{	
		return "/ThankForRegister";
	}
	
}
