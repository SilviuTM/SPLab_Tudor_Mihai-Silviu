package ro.uvt.info.proiectsp.services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ro.uvt.info.proiectsp.ACTUALmodels.Book;

import java.util.Map;

@RequiredArgsConstructor
public class AddBookCommand implements Command {
    @Getter
    Book newBook = null;

    private final Map<String, Object> request;

    @Override
    public void execute(CommandContext context) {
        newBook = new Book();
        newBook.setTitle((String) request.get("titlu"));

        context.getBookRepository().save(newBook);
    }
}
