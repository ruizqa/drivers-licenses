package relationships.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import relationships.mvc.models.License;
import relationships.mvc.models.Person;
import relationships.mvc.repositories.PersonRepository;
import relationships.mvc.services.LicenseService;
import relationships.mvc.services.PersonService;

@Controller
public class LicenseController {
	private final LicenseService serv;
	private final PersonService persServ;

	
	
	 public LicenseController(LicenseService serv, PersonService persServ) {
	     this.serv = serv;
	     this.persServ = persServ;
	 }
	 
	 @RequestMapping("/licenses/new")
	 public String index(@ModelAttribute("license") License license,Model model) {
		 List<Person> persons = persServ.allPeople();
		 model.addAttribute("persons",persons);
	     return "/licenses/new.jsp";
	 }
	 
	 @RequestMapping(value="/licenses", method=RequestMethod.POST)
	 public String create(@Valid @ModelAttribute("license") License license, BindingResult result) {
	     if (result.hasErrors()) {
	         return "/licenses/new.jsp";
	     } else {
	    	 
	    	 license.setNumber(String.format("%06d", license.getPerson().getId())); 
	         serv.createLicense(license);
	         return "redirect:/persons";
	     }
	 }
}
