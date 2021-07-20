package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name="BOOKCOPIES")
@Data
public class BookCopy {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToOne(optional = false)
    private Book book;

    @ManyToOne(optional = false)
    private Mark mark;

    @OneToMany(mappedBy = "bookCopy", cascade = CascadeType.ALL)
    private Set<OrderItem> orderItemSet = new HashSet<>();
}
