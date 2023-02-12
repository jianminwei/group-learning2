package grouplearning.springboot.datajpa.repository;

import grouplearning.springboot.datajpa.model.Zoo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZooRepository extends JpaRepository<Zoo, Long> {
}
