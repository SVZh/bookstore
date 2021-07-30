package praktikum.svzh.bookstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity(name = "LINKS")
@Getter
@Setter
@IdClass(LinkKey.class)
public class Link {
    @Id
    @ManyToOne
    private Book book;

    @Id
    @ManyToOne
    private Author person;

    @Id
    @ManyToOne
    private Profession type;
}

@Getter
@Setter
class LinkKey implements Serializable {
    private Book book;
    private Author person;
    private Profession type;
}
