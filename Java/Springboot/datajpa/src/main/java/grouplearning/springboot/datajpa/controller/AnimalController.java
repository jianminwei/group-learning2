package grouplearning.springboot.datajpa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import grouplearning.springboot.datajpa.exception.ResourceNotFoundException;
import grouplearning.springboot.datajpa.model.Animal;
import grouplearning.springboot.datajpa.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    // get all animals
    @GetMapping("/animals")
    public List<Animal> getAllAnimals(){
        return animalRepository.findAll();
    }

    // create animal rest api
    @PostMapping("/animals")
    public Animal createAnimal(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    // get animal by id rest api
    @GetMapping("/animals/{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable Long id) {
        Animal animal = animalRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Animal not exist with id :" + id));
        return ResponseEntity.ok(animal);
    }

    // update animal rest api
    @PutMapping("/animals/{id}")
    public ResponseEntity<Animal> updateAnimal(@PathVariable Long id, @RequestBody Animal animalDetails){
        Animal animal = animalRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Animal not exist with id :" + id));

        animal.setAnimalName(animalDetails.getAnimalName());
        animal.setAge(animalDetails.getAge());
        animal.setDescription(animalDetails.getDescription());
        animal.setAnimalType(animalDetails.getAnimalType());
        animal.setZoo(animalDetails.getZoo());

        Animal updatedAnimal = animalRepository.save(animal);
        return ResponseEntity.ok(updatedAnimal);
    }

    // delete animal rest api
    @DeleteMapping("/animals/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteAnimal(@PathVariable Long id){
        Animal animal = animalRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Animal not exist with id :" + id));

        animalRepository.delete(animal);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}