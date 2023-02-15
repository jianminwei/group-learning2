package grouplearning.springboot.datajpa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import grouplearning.springboot.datajpa.exception.ResourceNotFoundException;
import grouplearning.springboot.datajpa.model.Zoo;
import grouplearning.springboot.datajpa.repository.ZooRepository;
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
public class ZooController {

    @Autowired
    private ZooRepository zooRepository;

    // get all zoos
    @GetMapping("/zoos")
    public List<Zoo> getAllZoos(){
        return zooRepository.findAll();
    }

    // create zoo rest api
    @PostMapping("/zoos")
    public Zoo createZoo(@RequestBody Zoo zoo) {
        return zooRepository.save(zoo);
    }

    // get zoo by id rest api
    @GetMapping("/zoos/{id}")
    public ResponseEntity<Zoo> getZooById(@PathVariable Long id) {
        Zoo zoo = zooRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Zoo not exist with id :" + id));
        return ResponseEntity.ok(zoo);
    }

    // update zoo rest api
    @PutMapping("/zoos/{id}")
    public ResponseEntity<Zoo> updateZoo(@PathVariable Long id, @RequestBody Zoo zooDetails){
        Zoo zoo = zooRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Zoo not exist with id :" + id));

        zoo.setName(zooDetails.getName());
        zoo.setRegion(zooDetails.getRegion());
        Zoo updatedZoo = zooRepository.save(zoo);
        return ResponseEntity.ok(updatedZoo);
    }

    // delete zoo rest api
    @DeleteMapping("/zoos/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteZoo(@PathVariable Long id){
        Zoo zoo = zooRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Zoo not exist with id :" + id));

        zooRepository.delete(zoo);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}