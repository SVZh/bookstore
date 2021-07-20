package praktikum.svzh.bookstore.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name="PRIVATEDATA")
@Data
public class PrivateData {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String description;

    private Boolean active;

    private String passportNumber;
}
