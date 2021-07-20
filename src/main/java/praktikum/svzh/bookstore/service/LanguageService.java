package praktikum.svzh.bookstore.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import praktikum.svzh.bookstore.entity.Language;
import praktikum.svzh.bookstore.repository.LanguageRepository;

import javax.annotation.PostConstruct;
import java.util.stream.Stream;

@Service
@Slf4j
public class LanguageService {

    private final LanguageRepository repository;

    @Autowired
    public LanguageService(LanguageRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void init() {
        log.info("Initializing initial data for Languages...");
        Stream.of(
                new LanguagePair("русский", "RU"),
                new LanguagePair("английский", "EN")
        )
                .forEach(pair -> {
                    Language language = new Language();
                    language.setName(pair.getName());
                    language.setCode(pair.getCode());
                    repository.save(language);
                });
        log.info("Done.");
    }
}

@Data
@AllArgsConstructor
class LanguagePair {
    private String name;
    private String code;
}