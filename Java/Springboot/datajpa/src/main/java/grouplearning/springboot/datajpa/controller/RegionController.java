package grouplearning.springboot.datajpa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import grouplearning.springboot.datajpa.exception.ResourceNotFoundException;
import grouplearning.springboot.datajpa.model.Region;
import grouplearning.springboot.datajpa.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/")
public class RegionController {

    @Autowired
    private RegionRepository regionRepository;

    // get all regions
    @GetMapping("/regions")
    public List<Region> getAllRegions(){
        return regionRepository.findAll();
    }

    // create region rest api
    @PostMapping("/regions")
    public Region createRegion(@RequestBody Region region) {
        return regionRepository.save(region);
    }

    // get region by id rest api
    @GetMapping("/regions/{id}")
    public ResponseEntity<Region> getRegionById(@PathVariable Long id) {
        Region region = regionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Region not exist with id :" + id));
        return ResponseEntity.ok(region);
    }

    // update region rest api
    @PutMapping("/regions/{id}")
    public ResponseEntity<Region> updateRegion(@PathVariable Long id, @RequestBody Region regionDetails){
        Region region = regionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Region not exist with id :" + id));

        region.setName(regionDetails.getName());
        Region updatedRegion = regionRepository.save(region);
        return ResponseEntity.ok(updatedRegion);
    }

    // delete region rest api
    @DeleteMapping("/regions/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteRegion(@PathVariable Long id){
        Region region = regionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Region not exist with id :" + id));

        regionRepository.delete(region);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}