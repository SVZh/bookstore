package praktikum.svzh.bookstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "PROFESSIONS")
@Getter
@Setter
public class Profession {
    @Id
    private Long id;

    private String name;

    private String comment;
}
