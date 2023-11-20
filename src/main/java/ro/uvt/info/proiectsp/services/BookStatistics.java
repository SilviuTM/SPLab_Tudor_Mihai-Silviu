package ro.uvt.info.proiectsp.services;

import ro.uvt.info.proiectsp.models.*;

public class BookStatistics implements Visitor {
    int images, paragraphs, tables;

    public void visitBook(Book b) {
        for (Element e : b.getElements()) e.accept(this);
    }

    public void visitSection(Section s) {
        for (Element e : s.getElements()) e.accept(this);
    }

    public void visitTableOfContents(TableOfContents toc) {
    }

    public void visitParagraph(Paragraph p) {
        paragraphs++;
    }

    public void visitImage(Image i) {
        images++;
    }

    public void visitImageProxy(ImageProxy ip) {
        images++;
    }

    public void visitTable(Table t) {
        tables++;
    }

    public void printStatistics() {
        System.out.println("Book statistics: ");
        System.out.println("*** Number of images: " + images);
        System.out.println("*** Number of tables: " + tables);
        System.out.println("*** Number of paragraphs: " + paragraphs);
    }
}
