package praktikum.svzh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import praktikum.svzh.bookstore.entity.Profession;

public interface ProfessionRepository extends JpaRepository<Profession, Long> {
}
