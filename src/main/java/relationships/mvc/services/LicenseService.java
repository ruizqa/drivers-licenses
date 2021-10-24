package relationships.mvc.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import relationships.mvc.models.License;
import relationships.mvc.models.Person;
import relationships.mvc.repositories.LicenseRepository;

@Service 
public class LicenseService {
private final LicenseRepository repo;

    public LicenseService(LicenseRepository repo) {
        this.repo = repo;
    }
 
    public List<License> allLicenses() {
        return repo.findAll();
    }
    
    public License createLicense(License l) {
        return repo.save(l);
    }
    
    public License findLicense(Long id) {
        Optional<License> opLicense = repo.findById(id);
        if(opLicense.isPresent()) {
            return opLicense.get();
        } else {
            return null;
        }
    }
    
    public License updateLicense(Long id, String number, Person person, String state, Date expiration) {    	
    	License l = new License (id,number, expiration, state, person);
        return repo.save(l);
    }
    
 
    public License updateLicense(License l) {
        return repo.save(l);
    }
    
 
    public void deleteLicense(Long id) {
        Optional<License> optionalLicense = repo.findById(id);
        if(optionalLicense.isPresent()) {
            repo.deleteById(id);
        } 
    }
    
    
}
