package praktikum.svzh.bookstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity(name = "JOBSHISTORIES")
public class JobsHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToOne(optional = false)
    private Position position;

    @ManyToOne(optional = false)
    private Employee employee;

    private LocalDateTime startDate;

    private LocalDateTime finishDate;

    private String reasonOfFinish;

}
