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
import Entity.CustomerSignIn;
import Entity.Product;

@Controller
@SessionAttributes("checklogin")
public class SignInController {

	@RequestMapping(value="/signIn" , method=RequestMethod.GET)
	public String signin(CustomerSignIn customer,Model model)
	{	
		model.addAttribute("checklogin", customer);
		return "/signIn";
	}
	
	@RequestMapping(value="/signIn" , method=RequestMethod.POST)
	public String checksignin(@Valid @ModelAttribute("checklogin") CustomerSignIn customerSignIn,BindingResult result,Model model,Product product)
	{	
		model.addAttribute("addProduct",product);
		if(result.hasErrors())
		{
//			IRepository<Customer> repo = new Repository<>(Customer.class);
		return "signIn";
		}
		
		if(customerSignIn.getEmailSignIn().equals("admin") && customerSignIn.getPasswordSignIn().equals("12345"))
		{
			return "forward:adminPage";
		}
		
		
		if(Customer.checkForLogin(customerSignIn.getEmailSignIn(),customerSignIn.getPasswordSignIn())) 
		{
			return "redirect:customerPage";
		}
		else return "signIn";
	}
	
	@RequestMapping(value="/customerPage")
	public String customerPage(Customer test,Model model,CustomerSignIn customerSignIn) {
		model.addAttribute("customer",test.getNameFromDB(customerSignIn.getEmailSignIn())); 
		return "customerPage";
	}
	
	@RequestMapping(value="/adminPage")
	public String adminPage(@ModelAttribute("addProduct") Product product)
	{
		System.out.println("hello");
		return "adminPage";
	}
}
