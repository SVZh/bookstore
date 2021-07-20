package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name="DELIVERYMETHODS")
@Data
public class DeliveryMethod {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "deliveryMethod", cascade = CascadeType.ALL)
    private Set<Order> orderSet = new HashSet<>();
}
