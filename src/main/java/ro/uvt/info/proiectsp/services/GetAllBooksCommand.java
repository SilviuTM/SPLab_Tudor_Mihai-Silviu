package ro.uvt.info.proiectsp.services;

import lombok.RequiredArgsConstructor;
import ro.uvt.info.proiectsp.ACTUALmodels.Book;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
public class GetAllBooksCommand implements Command {
    List<Book> result;

    @Override
    public void execute(CommandContext context) {
        result = context.getBookRepository().findAll();
    }

    public List<Book> getResults() {
        return result;
    }
}
