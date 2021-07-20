package praktikum.svzh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import praktikum.svzh.bookstore.entity.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
