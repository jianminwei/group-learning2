package grouplearning.springboot.datajpa.repository;

import grouplearning.springboot.datajpa.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {
    public Region findByName(String name);
}
