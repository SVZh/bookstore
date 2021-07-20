package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity(name="EMPLOYEES")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToOne(optional = false)
    private FIO fio;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private LocalDateTime dateOfBirth;

    @Column(nullable = false)
    private LocalDateTime dateOfEmployment;

    @ManyToOne(optional = false)
    private Position position;

    @OneToOne(cascade = CascadeType.ALL)
    private PrivateData privateData;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private Set<Order> orderSet = new HashSet<>();

    private Boolean active;

    @OneToMany
    private Set<Contact> contactSet = new HashSet<>();
}
