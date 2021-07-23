package praktikum.svzh.bookstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity(name="EMPLOYEES")
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToOne(optional = false)
    private FIO fio;

    @Column(nullable = false)
    private LocalDateTime dateOfBirth;

    @Column(nullable = false)
    private LocalDateTime dateOfEmployment;

    @ManyToOne(optional = false)
    private Position position;

    @OneToOne(cascade = CascadeType.ALL)
    private PrivateData privateData;

    @Column(columnDefinition = "boolean default false")
    private Boolean active;

    @OneToMany
    private Set<Contact> contactSet = new HashSet<>();
}
