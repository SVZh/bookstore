package praktikum.svzh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import praktikum.svzh.bookstore.entity.DeliveryMethod;

public interface DeliveryMethodRepository extends JpaRepository<DeliveryMethod, Long> {
}
