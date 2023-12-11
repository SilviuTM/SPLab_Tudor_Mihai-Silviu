package ro.uvt.info.proiectsp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SynchronousExecutorService {
    public void executeCommand(Command command, CommandContext context) {
        try {
            command.execute(context);
        }
        catch(Exception e) {
            System.out.println("Exception while executing command " + command.toString() + ": " + e);
        }
    }
}
