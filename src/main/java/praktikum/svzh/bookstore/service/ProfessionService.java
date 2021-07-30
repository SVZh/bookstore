package praktikum.svzh.bookstore.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import praktikum.svzh.bookstore.entity.Profession;
import praktikum.svzh.bookstore.repository.ProfessionRepository;

import javax.annotation.PostConstruct;
import java.util.stream.Stream;

@Service
@Slf4j
public class ProfessionService {

    private final ProfessionRepository repository;

    @Autowired
    public ProfessionService(ProfessionRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void init() {
        log.info("Initializing initial data for Professions...");
        Stream.of("автор", "переводчик", "корректор", "иллюстратор")
                .forEach(name -> {
                    Profession profession = new Profession();
                    profession.setName(name);
                    repository.save(profession);
                });
        log.info("Done.");
    }
}
