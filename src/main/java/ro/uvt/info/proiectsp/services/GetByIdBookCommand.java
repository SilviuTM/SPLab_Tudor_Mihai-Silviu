package ro.uvt.info.proiectsp.services;

import lombok.RequiredArgsConstructor;
import ro.uvt.info.proiectsp.models.Book;

import java.util.List;

@RequiredArgsConstructor
public class GetByIdBookCommand implements Command {
    private final Long id;

    Book result = null;

    public void execute(CommandContext context) {
        result = context.getBookRepository().getBookById(id);
    }

    public Book getResultBook() {
        return result;
    }
}
