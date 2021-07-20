package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name="STATUSES")
@Data
public class Status {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String description;

    private String name;

    @OneToMany(mappedBy = "status", cascade = CascadeType.ALL)
    private Set<Order> orderSet = new HashSet<>();
}
