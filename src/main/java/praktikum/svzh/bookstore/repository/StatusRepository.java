package praktikum.svzh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import praktikum.svzh.bookstore.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
