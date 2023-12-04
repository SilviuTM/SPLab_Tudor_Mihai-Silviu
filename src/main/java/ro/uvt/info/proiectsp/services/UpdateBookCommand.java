package ro.uvt.info.proiectsp.services;

import ro.uvt.info.proiectsp.models.Book;
import java.util.List;

public class UpdateBookCommand implements Command<Book> {
    BookService context;
    Long id;
    Book newBook;

    public UpdateBookCommand(BookService _context) {
        context = _context;
    }

    public void SetArgs(Long _id, Book _newBook) {
        id = _id;
        newBook = _newBook;
    }

    public Book execute(){
        context.updateBook(id, newBook);
        return context.getBookById(id);
    }
}
