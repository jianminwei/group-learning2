package grouplearning.springboot.datajpa.repository;

import grouplearning.springboot.datajpa.model.AnimalType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalTypeRepository extends JpaRepository<AnimalType, Long> {
}
