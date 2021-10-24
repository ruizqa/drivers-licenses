package relationships.mvc.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import relationships.mvc.models.License;


@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {
    List<License> findAll();
    Optional<License> findById(Long id);
}
