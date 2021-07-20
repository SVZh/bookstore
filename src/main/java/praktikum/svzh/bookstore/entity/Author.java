package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity(name="AUTHORS")
@Data
public class Author {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToOne(optional = false)
    private FIO fio;

    @Column(nullable = false)
    private LocalDateTime dateOfBirth;

    private LocalDateTime dateOfDeath;

    @ManyToMany(mappedBy = "authorSet")
    private Collection<Language> languageSet;
}
