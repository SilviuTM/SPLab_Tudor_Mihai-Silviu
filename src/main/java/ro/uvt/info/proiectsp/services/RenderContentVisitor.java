package ro.uvt.info.proiectsp.services;

import ro.uvt.info.proiectsp.models.*;

public class RenderContentVisitor implements Visitor {

    public void visitBook(Book b) {
        System.out.println("Book:" + b.GetTitle());
        System.out.println();
        System.out.println("Authors: ");

        for (Author a : b.GetList()) a.print();
        System.out.println();

        for (Element e : b.getElements()) e.accept(this);
    }

    public void visitSection(Section s) {
        System.out.println(s.GetTitle());
        for (Element e : s.getElements()) {
            e.accept(this);
        }
    }

    public void visitTableOfContents(TableOfContents toc) {
        System.out.println("TableOfContent");
        for (String row : toc.getContent()) {
            System.out.println(row);
        }
    }

    public void visitParagraph(Paragraph p) {
        if (p.getTextAlignment() != null)
            p.getTextAlignment().render(p);
        else
            System.out.println(p.GetText());
    }

    public void visitImage(Image i) {
        System.out.println("Image: " + i.getImageName());
    }

    public void visitImageProxy(ImageProxy ip) {
        ip.loadContent().accept(this);
    }

    public void visitTable(Table t) {
        System.out.println("Table: " + t.GetTitle());
    }
}
