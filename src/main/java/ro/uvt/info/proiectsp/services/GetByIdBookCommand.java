package ro.uvt.info.proiectsp.services;

import ro.uvt.info.proiectsp.models.Book;

import java.util.List;

public class GetByIdBookCommand implements Command<Book>{
    BookService context;
    Long id;

    public GetByIdBookCommand(BookService _context) {
        context = _context;
    }

    public Book execute() {
        return context.getBookById(id);
    }

    public void setArgs(Long _id) {
        id = _id;
    }
}
