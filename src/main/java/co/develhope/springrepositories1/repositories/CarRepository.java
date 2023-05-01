package co.develhope.springrepositories1.repositories;

import co.develhope.springrepositories1.entities.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Auto, Long> {
}
