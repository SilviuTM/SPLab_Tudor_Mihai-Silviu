package ro.uvt.info.proiectsp.services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ro.uvt.info.proiectsp.ACTUALmodels.Book;

@RequiredArgsConstructor
public class UpdateBookCommand implements Command {
    private final Long id;
    private final Book _book;

    @Getter
    Book book;

    @Override
    public void execute(CommandContext context) {
        book = context.getBookRepository().getReferenceById(id);
        book = _book;
        book = context.getBookRepository().save(book);
    }
}
