package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity(name="LANGUAGES")
@Data
public class Language {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String code;

    @ManyToMany
    private Collection<Author> authorSet;

    @ManyToMany
    private Collection<Book> bookSet;
}
