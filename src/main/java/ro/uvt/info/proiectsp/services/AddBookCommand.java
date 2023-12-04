package ro.uvt.info.proiectsp.services;

import ro.uvt.info.proiectsp.models.Book;

public class AddBookCommand implements Command<Book> {
    BookService context;
    Book newBook;

    public AddBookCommand(BookService _context) {
        context = _context;
    }

    public Book execute() {
        return context.createBook(newBook);
    }

    public void SetArgs(Book _newBook) {
        newBook = _newBook;
    }
}
