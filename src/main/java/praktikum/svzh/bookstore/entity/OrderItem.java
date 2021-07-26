package praktikum.svzh.bookstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "ORDERITEMS")
@Getter
@Setter
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Column(nullable = false)
    private Long count;

    @ManyToOne(optional = false)
    private Book book;

    @Column(nullable = false)
    private Long costAtTime;

    @ManyToOne(optional = false)
    private Order order;
}
