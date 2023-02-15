package grouplearning.springboot.datajpa.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity

public class Animal {

    @Id
    @Column(name = "animal_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "animal_name")
    private String animalName;

    private int age;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "animal_type_id")
    private AnimalType animalType = new AnimalType();

    @ManyToOne
    @JoinColumn(name = "zoo_id")
    private Zoo zoo = new Zoo();
}
