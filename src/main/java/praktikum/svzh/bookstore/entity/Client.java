package praktikum.svzh.bookstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name="CLIENTS")
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToOne(optional = false)
    private FIO fio;

    private String address;

    @OneToMany
    private Set<Contact> contactSet = new HashSet<>();
}
