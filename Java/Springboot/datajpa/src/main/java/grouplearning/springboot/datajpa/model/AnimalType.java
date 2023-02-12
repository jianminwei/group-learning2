package grouplearning.springboot.datajpa.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "animal_type")
public class AnimalType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animal_type_id")
    Long id;

    @Column(name = "animal_type_name")
    String name;

}
