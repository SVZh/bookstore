package praktikum.svzh.bookstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name="PUBLISHERS")
@Getter
@Setter
public class Publisher {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Column(nullable = false)
    private String name;

    @OneToMany
    private Set<Contact> contactSet = new HashSet<>();
}
