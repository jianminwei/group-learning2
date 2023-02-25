package grouplearning.springboot.demo2.repository;

import grouplearning.springboot.demo2.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository <Cat, Long> {
}
