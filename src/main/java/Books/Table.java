package Books;

public class Table extends Element {
    String title;

    public Table() {
        title = "";
    }

    public Table(String _title) {
        title = _title;
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
}
