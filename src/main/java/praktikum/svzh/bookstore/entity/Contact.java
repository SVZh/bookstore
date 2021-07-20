package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name="CONTACTS")
@Data
public class Contact {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;

    private String phone;

    private String email;

    private String address;

    @Column(nullable = false)
    private String contactPersonName;

    @ManyToOne
    private Publisher publisher;
}
