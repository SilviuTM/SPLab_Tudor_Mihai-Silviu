package ro.uvt.info.proiectsp.models;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents extends Element implements Visitee {

    List<String> content;

    public TableOfContents() {
        content = new ArrayList<>();
    }

    public TableOfContents(TableOfContents other) {
        content = other.content;
    }

    public List<String> getContent() {
        return content;
    }

    public void add(String text) {
        content.add(text);
    }

    public TableOfContents clone() {
        return new TableOfContents(this);
    }


    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}
