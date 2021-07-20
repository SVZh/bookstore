package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity(name="MARKS")
@Data
public class Mark {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "mark", cascade = CascadeType.ALL)
    private Set<BookCopy> bookCopySet;
}
