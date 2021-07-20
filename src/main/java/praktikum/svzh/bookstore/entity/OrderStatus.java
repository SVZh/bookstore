package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name="ORDERSTATUSES")
@Data
public class OrderStatus {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String description;

    private String name;

    @Column(columnDefinition = "boolean default false")
    private Boolean active;
}
