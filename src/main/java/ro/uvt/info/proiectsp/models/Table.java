package ro.uvt.info.proiectsp.models;

public class Table extends Element {
    String title;

    public Table() {
        title = "";
    }

    public Table(String _title) {
        title = _title;
    }

    public Table(Table other) {
        super();
        title = other.title;
    }

    public String GetTitle() {
        return title;
    }

    public void SetTitle(String _title) {
        title = _title;
    }

    public void print() {
        System.out.println("Table: " + title);
    }

    public Table clone() {
        return new Table(this);
    }
}
