package praktikum.svzh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import praktikum.svzh.bookstore.entity.Mark;

@Repository
public interface MarkRepository extends JpaRepository<Mark, Long> {
}
