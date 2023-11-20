package ro.uvt.info.proiectsp.models;

public class Section extends Element {
    String title;

    public Section() {
        super();
        title = "";
    }

    public Section(String _title) {
        super();
        title = _title;
    }

    public Section(Section other) {
        super(other);
        title = other.title;
    }

    public String GetTitle() {
        return title;
    }

    public void SetTitle(String _title) {
        title = _title;
    }

    public void print() {
        System.out.println(title);
        for (Element e : elements) {
            e.print();
        }
    }

    public void add(Element e) {
        elements.add(e.clone());
    }
    public void remove(Element e) {
        elements.remove(e);
    }
    public Element get(int i) {
        return elements.get(i);
    }

    public Section clone() {
        return new Section(this);
    }
}
