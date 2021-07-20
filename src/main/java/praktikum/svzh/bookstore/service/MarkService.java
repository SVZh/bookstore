package praktikum.svzh.bookstore.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import praktikum.svzh.bookstore.entity.Mark;
import praktikum.svzh.bookstore.repository.MarkRepository;

import javax.annotation.PostConstruct;
import java.util.stream.Stream;

@Service
@Slf4j
public class MarkService {

    private final MarkRepository repository;

    @Autowired
    public MarkService(MarkRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void init() {
        log.info("Initializing initial data for Marks...");
        Stream.of("превосходное", "отличное", "хорошее", "неплохое", "плохое", "книга повреждена")
                .forEach(name -> {
                    Mark mark = new Mark();
                    mark.setName(name);
                    repository.save(mark);
                });
        log.info("Done.");
    }
}
