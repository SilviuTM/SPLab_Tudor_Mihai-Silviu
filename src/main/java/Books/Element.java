package Books;

import java.util.ArrayList;
import java.util.List;

public abstract class Element {
    protected List<Element> elements;

    public Element() {
        elements = new ArrayList<>();
    }

    public abstract void print();
    public void add(Element e) { }
    public void remove(Element e) { }
    public Element get(int i) { return null; }
}
