package Books;

public class Paragraph extends Element {
    String text;
    AlignStrategy textAlignment;

    public Paragraph() {
        text = "";
    }

    public Paragraph(String _text) {
        text = _text;
    }

    public Paragraph(Paragraph other) {
        super(other);
        text = other.text;
        textAlignment = other.textAlignment;
    }

    public String GetText() {
        return text;
    }

    public void SetText(String _text) {
        text = _text;
    }

    public void setAlignStrategy(AlignStrategy as) {
        textAlignment = as;
    }

    public void print() {
        if (textAlignment != null)
            textAlignment.render(this);
        else
            System.out.println(text);
    }

    public Paragraph clone() {
        return new Paragraph(this);
    }
}
