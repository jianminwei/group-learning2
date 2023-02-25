package grouplearning.springboot.demo2.controller;

import grouplearning.springboot.demo2.exception.ResourceNotFoundException;
import grouplearning.springboot.demo2.model.Cat;
import grouplearning.springboot.demo2.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class CatController {

    @Autowired
    private CatRepository catRepository;

    // get all regions
    @GetMapping("/cats")
    public List<Cat> getAllCats(){
        return catRepository.findAll();
    }

    // create region rest api
    @PostMapping("/cats")
    public Cat createCat(@RequestBody Cat cat) {
        return catRepository.save(cat);
    }

    // get region by id rest api
    @GetMapping("/cats/{id}")
    public ResponseEntity<Cat> getCatById(@PathVariable Long id) {
        Cat cat = catRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cat not exist with id :" + id));
        return ResponseEntity.ok(cat);
    }

    // update cat rest api
    @PutMapping("/cats/{id}")
    public ResponseEntity<Cat> updateRegion(@PathVariable Long id, @RequestBody Cat CatDetails){
        Cat cat = catRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cat not exist with id :" + id));

        cat.setName(CatDetails.getName());
        cat.setAge(CatDetails.getAge());
        Cat updatedCat = catRepository.save(cat);
        return ResponseEntity.ok(updatedCat);
    }

    // delete region rest api
    @DeleteMapping("/cats/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteCat(@PathVariable Long id){
        Cat cat = catRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cat not exist with id :" + id));

        catRepository.delete(cat);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }


}
