package praktikum.svzh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import praktikum.svzh.bookstore.entity.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {
}
