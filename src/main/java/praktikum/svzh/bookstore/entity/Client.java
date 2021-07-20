package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name="CLIENTS")
@Data
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToOne(optional = false)
    private FIO fio;

    private String phone;

    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    private PrivateData privateData;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private Set<Order> orderSet = new HashSet<>();

    @OneToMany
    private Set<Contact> contactSet = new HashSet<>();
}
