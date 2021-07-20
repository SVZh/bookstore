package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name="MARKS")
@Data
public class Mark {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Column(nullable = false)
    private String name;
}
