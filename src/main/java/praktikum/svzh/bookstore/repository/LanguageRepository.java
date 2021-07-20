package praktikum.svzh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import praktikum.svzh.bookstore.entity.Language;

public interface LanguageRepository extends JpaRepository<Language, Long> {
}
