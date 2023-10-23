package Books;

public class Paragraph extends Element {
    String text;

    public Paragraph() {
        text = "";
    }

    public Paragraph(String _text) {
        text = _text;
    }

    public Paragraph(Paragraph other) {
        super(other);
        text = other.text;
    }

    public String GetText() {
        return text;
    }

    public void SetText(String _text) {
        text = _text;
    }

    public void print() {
        System.out.println("Paragraph: " + text);
    }

    public Paragraph clone() {
        return new Paragraph(this);
    }
}
