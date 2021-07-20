package praktikum.svzh.bookstore.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import praktikum.svzh.bookstore.entity.Position;
import praktikum.svzh.bookstore.repository.PositionRepository;

import javax.annotation.PostConstruct;
import java.util.stream.Stream;

@Service
@Slf4j
public class PositionService {

    private final PositionRepository repository;

    @Autowired
    public PositionService(PositionRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void init() {
        log.info("Initializing initial data for Positions...");
        Stream.of("управляющий", "помощник управляющего", "продавец на полный день", "продавец на неполный день")
                .forEach(name -> {
                    Position position = new Position();
                    position.setName(name);
                    repository.save(position);
                });
        log.info("Done.");
    }
}
