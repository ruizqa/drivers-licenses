package relationships.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import relationships.mvc.models.Person;
import relationships.mvc.services.PersonService;



@Controller
public class PersonController {
	private final PersonService serv;
	 
	 public PersonController(PersonService serv) {
	     this.serv = serv;
	     }

	
	 @RequestMapping("/persons")
	 public String index(Model model) {
		 List <Person> persons = serv.allPeople();
		 model.addAttribute("persons",persons);
	     return "/persons/index.jsp";

	 }
	 
	 
	 @RequestMapping("/persons/new")
	 public String index(@ModelAttribute("person") Person person,Model model) {
	     return "/persons/new.jsp";

	 }
	 
	 @RequestMapping(value="/persons", method=RequestMethod.POST)
	 public String create(@Valid @ModelAttribute("person") Person person, BindingResult result) {
	     if (result.hasErrors()) {
	         return "/persons/new.jsp";
	     } else {
	         serv.createPerson(person);
	         return "redirect:/persons";
	     }
	 }
	 
	 
	 @RequestMapping(value="/persons/{id}")
	 public String display(@PathVariable("id") Long id, Model model) {
	     Person person = new Person();
	     person = serv.findPerson(id);
		 model.addAttribute("person", person);
		 return "/persons/show.jsp";
	 }
	 
	 
	 

	 
}
