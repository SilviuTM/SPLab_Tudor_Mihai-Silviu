package ro.uvt.info.proiectsp.services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ro.uvt.info.proiectsp.models.Book;

@RequiredArgsConstructor
public class DeleteBookCommand implements Command {
    private final Long id;

    public void execute(CommandContext context) {
        context.getBookRepository().deleteBook(id);
    }
}