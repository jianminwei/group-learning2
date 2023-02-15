package grouplearning.springboot.datajpa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import grouplearning.springboot.datajpa.exception.ResourceNotFoundException;
import grouplearning.springboot.datajpa.model.AnimalType;
import grouplearning.springboot.datajpa.repository.AnimalTypeRepository;
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
public class AnimalTypeController {

    @Autowired
    private AnimalTypeRepository animalTypeRepository;

    // get all animalTypes
    @GetMapping("/animalTypes")
    public List<AnimalType> getAllAnimalTypes(){
        return animalTypeRepository.findAll();
    }

    // create animalType rest api
    @PostMapping("/animalTypes")
    public AnimalType createAnimalType(@RequestBody AnimalType animalType) {
        return animalTypeRepository.save(animalType);
    }

    // get animalTypes by id rest api
    @GetMapping("/animalTypes/{id}")
    public ResponseEntity<AnimalType> getAnimalTypeById(@PathVariable Long id) {
        AnimalType animalType = animalTypeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("AnimalType not exist with id :" + id));
        return ResponseEntity.ok(animalType);
    }

    // update animalType rest api
    @PutMapping("/animalTypes/{id}")
    public ResponseEntity<AnimalType> updateAnimalType(@PathVariable Long id, @RequestBody AnimalType animalTypeDetails){
        AnimalType animalType = animalTypeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Region not exist with id :" + id));

        animalType.setName(animalTypeDetails.getName());
        AnimalType updatedAnimalTyp = animalTypeRepository.save(animalType);
        return ResponseEntity.ok(updatedAnimalTyp);
    }

    // delete animalType rest api
    @DeleteMapping("/animalTypes/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteAnimalType(@PathVariable Long id){
        AnimalType animalType = animalTypeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("AnimalType not exist with id :" + id));

        animalTypeRepository.delete(animalType);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}