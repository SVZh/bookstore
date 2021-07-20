package praktikum.svzh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import praktikum.svzh.bookstore.entity.BookStatus;

public interface BookStatusRepository extends JpaRepository<BookStatus, Long> {
}
