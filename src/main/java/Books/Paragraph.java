package Books;

public class Paragraph {
    String text;

    public Paragraph() {
        text = "";
    }

    public Paragraph(String _text) {
        text = _text;
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
}
