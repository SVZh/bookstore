package praktikum.svzh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import praktikum.svzh.bookstore.entity.BookStatus;

@Repository
public interface BookStatusRepository extends JpaRepository<BookStatus, Long> {
}
