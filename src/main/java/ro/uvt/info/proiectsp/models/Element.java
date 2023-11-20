package ro.uvt.info.proiectsp.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Element {
    protected List<Element> elements;

    public Element() {
        elements = new ArrayList<>();
    }

    public Element(Element other) {
        elements = new ArrayList<>(other.elements);
    }

    public abstract void print();
    public void add(Element e) { }
    public void remove(Element e) { }
    public Element get(int i) { return null; }

    public abstract Element clone();
}
