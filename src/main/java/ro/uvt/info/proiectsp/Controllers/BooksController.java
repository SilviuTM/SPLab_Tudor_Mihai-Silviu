package ro.uvt.info.proiectsp.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.proiectsp.models.*;
import ro.uvt.info.proiectsp.services.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class BooksController {
    private final CommandContext context;

    private final AsynchronousExecutorService asynchronousExecutorService;

    private final SynchronousExecutorService synchronousExecutorService;

    @GetMapping
    public ResponseEntity<?> getAllBooks() {
        GetAllBooksCommand cmd = new GetAllBooksCommand();
        synchronousExecutorService.executeCommand(cmd, context);
        return new ResponseEntity<>(cmd.getResults(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable Long id) {
        GetByIdBookCommand cmd = new GetByIdBookCommand(id);
        synchronousExecutorService.executeCommand(cmd, context);
        return new ResponseEntity<>(cmd.getResultBook(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addBook(@RequestBody Map<String, Object> request) {
        AddBookCommand cmd = new AddBookCommand(request);
        asynchronousExecutorService.executeCommand(cmd, context);
        return new ResponseEntity<>(cmd.getNewBook(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        UpdateBookCommand cmd = new UpdateBookCommand(id, updatedBook);
        asynchronousExecutorService.executeCommand(cmd, context);
        return new ResponseEntity<>(cmd.getBook(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable Long id) {
        DeleteBookCommand cmd = new DeleteBookCommand(id);
        asynchronousExecutorService.executeCommand(cmd, context);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}