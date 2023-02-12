package grouplearning.springboot.datajpa.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id")
    private Long id;

    @Column(name = "region_name")
    private String name;
}
