package ro.uvt.info.proiectsp.services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import ro.uvt.info.proiectsp.ACTUALmodels.Author;
import ro.uvt.info.proiectsp.ACTUALmodels.Book;
import ro.uvt.info.proiectsp.Persistence.AuthorRepository;
import ro.uvt.info.proiectsp.Persistence.BookRepository;

@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class CommandContext {

    @Getter
    final private BookRepository bookRepository;

    @Getter
    final private AuthorRepository authorRepository;
}
