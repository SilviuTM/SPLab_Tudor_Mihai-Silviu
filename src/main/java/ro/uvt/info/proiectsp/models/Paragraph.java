package ro.uvt.info.proiectsp.models;

import ro.uvt.info.proiectsp.services.*;

public class Paragraph extends Element implements Visitee {
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

    public AlignStrategy getTextAlignment() { return textAlignment; }

    public void SetText(String _text) {
        text = _text;
    }

    public void setAlignStrategy(AlignStrategy as) {
        textAlignment = as;
    }

    public Paragraph clone() {
        return new Paragraph(this);
    }

    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}
