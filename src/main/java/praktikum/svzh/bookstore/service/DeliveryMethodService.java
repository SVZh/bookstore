package praktikum.svzh.bookstore.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import praktikum.svzh.bookstore.entity.DeliveryMethod;
import praktikum.svzh.bookstore.repository.DeliveryMethodRepository;

import javax.annotation.PostConstruct;
import java.util.stream.Stream;

@Service
@Slf4j
public class DeliveryMethodService {

    private final DeliveryMethodRepository repository;

    @Autowired
    public DeliveryMethodService(DeliveryMethodRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void init() {
        log.info("Initializing initial data for DeliveryMethods...");
        Stream.of("в магазине", "доставка")
                .forEach(name -> {
                    DeliveryMethod deliveryMethod = new DeliveryMethod();
                    deliveryMethod.setName(name);
                    repository.save(deliveryMethod);
                });
        log.info("Done.");
    }
}
