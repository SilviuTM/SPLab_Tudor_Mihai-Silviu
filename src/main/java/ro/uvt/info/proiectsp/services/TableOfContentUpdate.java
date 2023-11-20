package ro.uvt.info.proiectsp.services;

import ro.uvt.info.proiectsp.models.*;

import java.util.ArrayList;
import java.util.List;

public class TableOfContentUpdate implements Visitor {
    List<String> content = new ArrayList<>();;
    int pages = 1;

    public void visitBook(Book b) {
        for (Element e : b.getElements()) e.accept(this);
    }

    public void visitSection(Section s) {
        content.add(s.GetTitle() + "  " + ".".repeat(30 - s.GetTitle().length()) + "  " + pages);

        for (Element e : s.getElements()) e.accept(this);
    }

    public void visitTableOfContents(TableOfContents toc) {
    }

    public void visitParagraph(Paragraph p) {
        pages++;
    }

    public void visitImage(Image i) {
        pages++;
    }

    public void visitImageProxy(ImageProxy ip) {
        pages++;
    }

    public void visitTable(Table t) {
        pages++;
    }

    public TableOfContents getToC() {
        TableOfContents toc = new TableOfContents();
        for (String row : content) {
            toc.add(row);
        }

        return toc;
    }
}
