package praktikum.svzh.bookstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "ORDERS")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
