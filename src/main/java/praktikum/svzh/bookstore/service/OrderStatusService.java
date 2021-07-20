package praktikum.svzh.bookstore.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import praktikum.svzh.bookstore.entity.OrderStatus;
import praktikum.svzh.bookstore.repository.OrderStatusRepository;

import javax.annotation.PostConstruct;
import java.util.stream.Stream;

@Service
@Slf4j
public class OrderStatusService {

    private final OrderStatusRepository repository;

    @Autowired
    public OrderStatusService(OrderStatusRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void init() {
        log.info("Initializing initial data for Order Statuses...");
        Stream.of("подлежит отправке", "будет получено лично", "отправлено", "получено", "отказано")
                .forEach(name -> {
                    OrderStatus orderStatus = new OrderStatus();
                    orderStatus.setName(name);
                    repository.save(orderStatus);
                });
        log.info("Done.");
    }
}
