package praktikum.svzh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import praktikum.svzh.bookstore.entity.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {
}
