package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class FIO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Column(nullable = false, length = 20)
    private String firstName;

    @Column(nullable = false, length = 40)
    private String lastName;

    private String middleName;
}
