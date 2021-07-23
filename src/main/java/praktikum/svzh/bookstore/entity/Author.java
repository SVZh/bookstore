package praktikum.svzh.bookstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity(name="AUTHORS")
@Getter
@Setter
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

    @ManyToMany
    private Collection<Language> languageSet;
}
