package grouplearning.springboot.datajpa.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zoo_id")
    private Long id;

    @Column(name = "zoo_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region = new Region();

}
