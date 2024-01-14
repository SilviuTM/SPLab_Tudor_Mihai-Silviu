package ro.uvt.info.proiectsp.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import ro.uvt.info.proiectsp.services.AllBooksSubject;
import ro.uvt.info.proiectsp.services.SseObserver;

@RestController
@RequiredArgsConstructor
public class BookSseController {
    private final AllBooksSubject allBooksSubject;

    @RequestMapping("/books-sse")
    public ResponseBodyEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L);
        allBooksSubject.attach(new SseObserver(emitter));
        return emitter;
    }
}
