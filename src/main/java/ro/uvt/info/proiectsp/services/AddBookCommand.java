package ro.uvt.info.proiectsp.services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ro.uvt.info.proiectsp.models.Book;

import java.util.Map;

@RequiredArgsConstructor
public class AddBookCommand implements Command {
    @Getter
    Book newBook = null;

    private final Map<String, Object> request;

    @Override
    public void execute(CommandContext context) {
        newBook = context.getBookRepository().createBook(newBook);
    }
}
