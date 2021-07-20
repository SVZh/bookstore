package praktikum.svzh.bookstore.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import praktikum.svzh.bookstore.entity.Status;
import praktikum.svzh.bookstore.repository.StatusRepository;

import javax.annotation.PostConstruct;
import java.util.stream.Stream;

@Service
@Slf4j
public class StatusService {

    private final StatusRepository repository;

    @Autowired
    public StatusService(StatusRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void init() {
        log.info("Initializing initial data for Statuses...");
        Stream.of("подлежит отправке", "будет получено лично", "отправлено", "получено")
                .forEach(name -> {
                    Status status = new Status();
                    status.setName(name);
                    repository.save(status);
                });
        log.info("Done.");
    }
}
