package ro.uvt.info.proiectsp.services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ro.uvt.info.proiectsp.models.Book;
import java.util.List;

@RequiredArgsConstructor
public class UpdateBookCommand implements Command {
    private final Long id;
    private final Book _book;

    @Getter
    Book book;

    @Override
    public void execute(CommandContext context) {
        book = context.getBookRepository().createBook(_book);
    }
}
