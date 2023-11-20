package ro.uvt.info.proiectsp.services;

import ro.uvt.info.proiectsp.models.*;

import java.util.List;

public class BookSaveVisitor implements Visitor {
    int indent;
    String json;

    public BookSaveVisitor() {
        indent = 1;
    }

    public BookSaveVisitor(int indentation) {
        indent = indentation;
    }

    String getAuthorString(List<Author> authorList) {
        String rez = "\t".repeat(indent) + "\"Authors\": [";
        if (authorList != null) {
            rez += "\n\r";
            for (int i = 0; i < authorList.size(); i++) {
                rez += ("\t".repeat(indent + 1) + "\"" + authorList.get(i).GetName() + "\"");

                if (i != authorList.size() - 1)
                    rez += ",\n\r";
            }

            rez += "\n\r";
            rez += "\t".repeat(indent);
        }

        rez += "]";
        return rez;
    }
    public void visitBook(Book b) {
        json = "{\n\r";
        json = json + "\t\"Book\": {\n\r";
        json = json + "\t\t\"title\": \"" + b.GetTitle() + "\",\n\r";
        json = json + new BookSaveVisitor(indent + 1).getAuthorString(b.GetList());

        for (Element e : b.getElements()) {
            BookSaveVisitor bsv = new BookSaveVisitor(indent + 1);
            e.accept(bsv);
            json += ",\n\r";
            json += bsv.returnJSON();
        }

        json = json + "\n\r\t}";
        json = json + "\n\r}";
    }

    public void visitSection(Section s) {
        json = "\t".repeat(indent) + "\"Section\": {\n\r";
        json = json + "\t".repeat(indent + 1) + "\"title\": \"" + s.GetTitle() + "\"";

        for (Element e : s.getElements()) {
            BookSaveVisitor bsv = new BookSaveVisitor(indent + 1);
            e.accept(bsv);
            json += ",\n\r";
            json += bsv.returnJSON();
        }

        json = json + "\n\r" + "\t".repeat(indent) + "}";
    }

    public void visitTableOfContents(TableOfContents toc) {
        json = "";
    }

    public void visitParagraph(Paragraph p) {
        json = "\t".repeat(indent) + "\"Paragraph\": {\n\r";
        json = json + "\t".repeat(indent + 1) + "\"text\": \"" + p.GetText() + "\"\n\r";
        json = json + "\t".repeat(indent) + "}";
    }

    public void visitImage(Image i) {
        json = "\t".repeat(indent) + "\"Image\": {\n\r";
        json = json + "\t".repeat(indent + 1) + "\"name\": \"" + i.getImageName() + "\"\n\r";
        json = json + "\t".repeat(indent) + "}";
    }

    public void visitImageProxy(ImageProxy ip) {
        ip.loadContent().accept(this);
    }

    public void visitTable(Table t) {
        json = "\t".repeat(indent) + "\"Table\": {\n\r";
        json = json + "\t".repeat(indent + 1) + "\"title\": \"" + t.GetTitle() + "\"\n\r";
        json = json + "\t".repeat(indent) + "}";
    }

    public String returnJSON(){
        return json;
    }
}
