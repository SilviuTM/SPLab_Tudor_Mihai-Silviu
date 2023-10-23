package Books;

public class Author {
    String name;

    public Author() {
        name = "";
    }

    public Author(String _name) {
        name = _name;
    }

    public String GetName() {
        return name;
    }

    public void SetName(String _name) {
        name = _name;
    }

    public void print() {
        System.out.println("Author: " + name);
    }
}
