package ro.uvt.info.proiectsp.services;

public class DeleteBookCommand implements Command<Void> {

    BookService context;
    Long id;

    public DeleteBookCommand(BookService _context) {
        context = _context;
    }

    public Void execute() {
        context.deleteBook(id);
        return null;
    }

    public void SetArgs(Long _id) {
        id = _id;
    }
}