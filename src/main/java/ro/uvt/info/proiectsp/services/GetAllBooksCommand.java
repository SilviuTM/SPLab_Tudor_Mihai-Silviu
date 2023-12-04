package ro.uvt.info.proiectsp.services;

import org.springframework.stereotype.Component;
import ro.uvt.info.proiectsp.models.Book;

import java.util.List;


public class GetAllBooksCommand implements Command<List<Book>>{
    BookService context;

    public GetAllBooksCommand(BookService _context) {
        context = _context;
    }

    public List<Book> execute() {
        return context.getBooks();
    }
}
