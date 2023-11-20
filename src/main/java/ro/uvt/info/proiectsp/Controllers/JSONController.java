package ro.uvt.info.proiectsp.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.uvt.info.proiectsp.models.*;
import ro.uvt.info.proiectsp.services.BookSaveVisitor;
import ro.uvt.info.proiectsp.services.BookStatistics;

@RestController
@RequestMapping("/books")
public class JSONController {
    @GetMapping("/data.json")
    public ResponseEntity<?> getJson() {
        Book b = new Book("The book");
        b.addAuthor(new Author("Iulian Banica"));
        b.addAuthor(new Author("Adriana Fologea"));

        Section cap1 = new Section("Chapter 1");
        Section cap11 = new Section("Subchapter 1.1");
        Section cap2 = new Section("Chapter 2");

        cap1.add(new Paragraph("Paragraph 1"));
        cap1.add(new Paragraph("Paragraph 2"));

        cap11.add(new ImageProxy("ImageOne"));
        cap11.add(new Image("ImageTwo"));

        cap2.add(new Paragraph("Paragraph 3"));

        cap1.add(cap11);
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));

        b.add(cap1);
        b.add(cap2);


        BookSaveVisitor bsv = new BookSaveVisitor();
        b.accept(bsv);
        System.out.println(bsv.returnJSON());
        return new ResponseEntity<>("<body><p>" + bsv.returnJSON() + "</p></body>", HttpStatus.OK);
    }
}
