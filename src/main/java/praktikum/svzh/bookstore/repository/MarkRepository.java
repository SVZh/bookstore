package praktikum.svzh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import praktikum.svzh.bookstore.entity.Mark;

public interface MarkRepository extends JpaRepository<Mark, Long> {
}
