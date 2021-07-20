package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name="POSITIONS")
@Data
public class Position {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL)
    private Set<Employee> employeeSet = new HashSet<>();
}
