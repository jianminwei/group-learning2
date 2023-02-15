package grouplearning.springboot.datajpa.repository;

import grouplearning.springboot.datajpa.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepository extends JpaRepository <Animal, Long>{

    public Animal findByAnimalName(String name);
    public Animal findFirstByAnimalName(String name);
    public List<Animal> findByAnimalNameContaining(String name);
}
