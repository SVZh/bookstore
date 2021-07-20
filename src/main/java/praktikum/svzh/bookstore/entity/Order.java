package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="ORDERS")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToOne(optional = false)
    private PaymentMethod paymentMethod;

    @ManyToOne(optional = false)
    private DeliveryMethod deliveryMethod;

    @ManyToOne(optional = false)
    private Employee employee;

    @ManyToOne(optional = false)
    private Client client;

    @ManyToOne(optional = false)
    private OrderStatus orderStatus;

    @Column(nullable = false)
    private LocalDateTime dateOfOrder;
}
