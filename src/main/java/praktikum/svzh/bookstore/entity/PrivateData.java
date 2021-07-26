package praktikum.svzh.bookstore.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity(name = "PRIVATEDATA")
@Getter
public class PrivateData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Column(columnDefinition = "boolean default false")
    private Boolean active;

    private String passportNumber;
}
