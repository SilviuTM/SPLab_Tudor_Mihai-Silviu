package ro.uvt.info.proiectsp.Controllers;

import org.springframework.web.bind.annotation.*;
import ro.uvt.info.proiectsp.models.*;
import ro.uvt.info.proiectsp.services.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    private BookService books = new BookService();

    GetAllBooksCommand getAll;
    GetByIdBookCommand getById;
    AddBookCommand addBook;
    UpdateBookCommand updateBook;
    DeleteBookCommand deleteBook;

    public BooksController() {
        getAll = new GetAllBooksCommand(books);
        getById = new GetByIdBookCommand(books);
        addBook = new AddBookCommand(books);
        updateBook = new UpdateBookCommand(books);
        deleteBook = new DeleteBookCommand(books);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return getAll.execute();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        getById.setArgs(id);
        return getById.execute();
    }

    @PostMapping
    public Book addBook(@RequestBody Book newBook) {
        addBook.SetArgs(newBook);
        return addBook.execute();
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        updateBook.SetArgs(id, updatedBook);
        return updateBook.execute();
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        deleteBook.SetArgs(id);
        deleteBook.execute();
    }
}