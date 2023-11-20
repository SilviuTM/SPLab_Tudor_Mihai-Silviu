package ro.uvt.info.proiectsp.models;

public interface Visitor {
    void visitBook(Book b);
    void visitSection(Section s);
    void visitTableOfContents(TableOfContents toc);
    void visitParagraph(Paragraph p);
    void visitImage(Image i);
    void visitImageProxy(ImageProxy ip);
    void visitTable(Table t);
}
