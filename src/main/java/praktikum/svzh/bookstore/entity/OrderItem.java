package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name="ORDERITEMS")
@Data
public class OrderItem {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Column(nullable = false)
    private Long count;

    @ManyToOne(optional = false)
    private BookCopy bookCopy;

    @Column(nullable = false)
    private Long costAtTime;

    @ManyToOne(optional = false)
    private Order order;
}
