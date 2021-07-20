package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name="POSITIONS")
@Data
public class Position {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Column(nullable = false)
    private String name;
}
