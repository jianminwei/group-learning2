package grouplearning.springboot.datajpa.repository;

import grouplearning.springboot.datajpa.model.Animal;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class AnimalRepositoryTest {

    @Autowired
    AnimalRepository animalRepo;

    @Test
    void findAll() {
        List<Animal> animals = animalRepo.findAll();

        animals.forEach(c -> log.info(c.toString()));
    }

    @Test
    void findByName() {

        Animal c = animalRepo.findByName("Cat8");

        log.info(c.toString());
    }

    @Test
    void findByNameContain() {
        List<Animal> animals = animalRepo.findByNameContaining("Cat1");

        animals.forEach(c -> log.info(c.toString()));
    }


}