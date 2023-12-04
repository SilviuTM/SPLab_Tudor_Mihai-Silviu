package ro.uvt.info.proiectsp.services;

import org.springframework.stereotype.Service;
import ro.uvt.info.proiectsp.models.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService {

    private final Map<Long, Book> books = new HashMap<>();
    private long nextId = 1;

    public Book createBook(Book bookData) {
        long bookId = getNextId();
        books.put(bookId, bookData);
        return books.get(bookId);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books.values());
    }

    public Book getBookById(Long bookId) {
        return books.get(bookId);
    }

    public void updateBook(Long bookId, Book updatedBookData) {
        if (books.containsKey(bookId)) {
            books.put(bookId, updatedBookData);
        }
    }

    public void deleteBook(Long bookId) {
        books.remove(bookId);
    }

    private synchronized long getNextId() {
        return nextId++;
    }
}