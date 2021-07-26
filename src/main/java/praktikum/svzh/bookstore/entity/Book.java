package praktikum.svzh.bookstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "BOOKS")
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Pattern(regexp = "^(?:ISBN(?:-1[03])?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$|97[89][0-9]{10}$|(?=(?:[0-9]+[- ]){4})[- 0-9]{17}$)(?:97[89][- ]?)?[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$")
    private String isbn;

    private String annotation;

    @ManyToOne(optional = false)
    private Mark mark;

    @ManyToOne(optional = false)
    private BookStatus bookStatus;

    @Column(nullable = false)
    @Pattern(regexp = "^[A-Za-z0-9]{8}$")
    private String internalId;

    @ManyToMany
    private Set<Author> authorSet = new HashSet<>();

    @Column(nullable = false)
    private Long actualCost;

    @Column(nullable = false)
    private Long recommendedCost;

    @ManyToOne(optional = false)
    private Publisher publisher;

    @Column(nullable = false)
    private LocalDateTime dateOfPublishing;

    @Column(nullable = false)
    private Long editorialNumber;

    @ManyToMany
    private Set<Language> languageSet;
}
