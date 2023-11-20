package ro.uvt.info.proiectsp;

import ro.uvt.info.proiectsp.models.*;
import ro.uvt.info.proiectsp.services.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProiectSpApplication {
    public static void main(String[] args) throws Exception {
        //SpringApplication.run(ProiectSpApplication.class, args);

        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);

        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);

        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);

        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);

        System.out.println("Printing without alignment:");
        System.out.println();
        cap1.print();

        Section cap2 = new Section("Capitolul 2");
        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());
        // no alignment for p4

        cap2.add(p1);
        cap2.add(p2);
        cap2.add(p3);
        cap2.add(p4);

        System.out.println("\n---------------------------\n");
        System.out.println("Printing with alignment:");
        System.out.println();
        cap2.print();
    }
}
