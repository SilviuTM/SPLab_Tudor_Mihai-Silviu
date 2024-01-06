package ro.uvt.info.proiectsp.services;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeleteBookCommand implements Command {
    private final Long id;

    public void execute(CommandContext context) {
        context.getBookCrudRepositoryAdapter().deleteById(id);
    }
}