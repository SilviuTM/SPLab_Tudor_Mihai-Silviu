package ro.uvt.info.proiectsp.services;

public interface CommandProcessor {

    void executeCommand(Command command, CommandContext context);
}
