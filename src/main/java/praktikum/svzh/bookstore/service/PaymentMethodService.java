package praktikum.svzh.bookstore.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import praktikum.svzh.bookstore.entity.PaymentMethod;
import praktikum.svzh.bookstore.repository.PaymentMethodRepository;

import javax.annotation.PostConstruct;
import java.util.stream.Stream;

@Service
@Slf4j
public class PaymentMethodService {

    private final PaymentMethodRepository repository;

    @Autowired
    public PaymentMethodService(PaymentMethodRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void init() {
        log.info("Initializing initial data for PaymentMethods...");
        Stream.of("наличными", "чеком", "кредитной картой")
                .forEach(name -> {
                    PaymentMethod paymentMethod = new PaymentMethod();
                    paymentMethod.setName(name);
                    repository.save(paymentMethod);
                });
        log.info("Done.");
    }
}
