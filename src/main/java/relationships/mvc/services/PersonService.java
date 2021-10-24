package relationships.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import relationships.mvc.models.License;
import relationships.mvc.models.Person;
import relationships.mvc.repositories.PersonRepository;




@Service
public class PersonService {
    private final PersonRepository repo;
    
    public PersonService(PersonRepository repo) {
        this.repo = repo;
    }
 
    public List<Person> allPeople() {
        return repo.findAll();
    }
    
    public Person createPerson(Person p) {
        return repo.save(p);
    }
    
    public Person findPerson(Long id) {
        Optional<Person> opPerson = repo.findById(id);
        if(opPerson.isPresent()) {
            return opPerson.get();
        } else {
            return null;
        }
    }
    
    public Person updatePerson(Long id, String firstName, String lastName, License lic) {    	
    	Person p = new Person (id, firstName, lastName);
        return repo.save(p);
    }
    
 
    public Person updateLanguage(Person p) {
        return repo.save(p);
    }
    
 
    public void deletePerson(Long id) {
        Optional<Person> optionalPerson = repo.findById(id);
        if(optionalPerson.isPresent()) {
            repo.deleteById(id);
        } 
    }
    
    
    
}
