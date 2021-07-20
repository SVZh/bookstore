package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

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

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private Set<Book> bookSet = new HashSet<>();

    @ManyToMany(mappedBy = "authorSet")
    private Collection<Language> languageSet;
}
