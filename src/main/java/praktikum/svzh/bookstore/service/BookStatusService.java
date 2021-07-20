package praktikum.svzh.bookstore.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import praktikum.svzh.bookstore.entity.BookStatus;
import praktikum.svzh.bookstore.repository.BookStatusRepository;

import javax.annotation.PostConstruct;
import java.util.stream.Stream;

@Service
@Slf4j
public class BookStatusService {

    private final BookStatusRepository repository;

    @Autowired
    public BookStatusService(BookStatusRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void init() {
        log.info("Initializing initial data for Book Statuses...");
        Stream.of("в продаже", "зарезервирована", "продана")
                .forEach(name -> {
                    BookStatus bookStatus = new BookStatus();
                    bookStatus.setName(name);
                    repository.save(bookStatus);
                });
        log.info("Done.");
    }
}
