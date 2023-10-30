package ro.uvt.info.proiectsp;

import Books.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProiectSpApplication {
    public static void main(String[] args) throws Exception {
        //SpringApplication.run(ProiectSpApplication.class, args);

        long startTime = System.currentTimeMillis();

        Section s1 = new Section("Section 1");
        Section s2 = new Section("Section 2");

        ImageProxy i1 = new ImageProxy("image1");
        ImageProxy i2 = new ImageProxy("image2");
        ImageProxy i3 = new ImageProxy("image3");
        ImageProxy i4 = new ImageProxy("image4");

        s1.add(i1);
        s1.add(i3);
        s1.add(i4);

        s2.add(i2);

        Book b = new Book("Book");

        b.add(s1);
        b.add(s2);

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        s1.print();
        endTime = System.currentTimeMillis();

        System.out.println("Print time: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        s1.print();
        endTime = System.currentTimeMillis();

        System.out.println("Reprint time: " + (endTime - startTime) + "ms");
    }
}
