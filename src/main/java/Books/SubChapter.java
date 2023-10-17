package Books;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    String name;
    List<Element> contentList;

    public SubChapter() {
        name = "";
        contentList = new ArrayList<>();
    }

    public SubChapter(String _name) {
        name = _name;
        contentList = new ArrayList<>();
    }

    public String GetName() {
        return name;
    }

    public void SetName(String _name) {
        name = _name;
    }

    public void createNewParagraph(String _name) {
        contentList.add(new Paragraph(_name));
    }

    public void createNewImage(String _name) {
        contentList.add(new Image(_name));
    }

    public void createNewTable(String _name) {
        contentList.add(new Table(_name));
    }

    public void print() {
        System.out.println("Subchapter: " + name);

        for (Element e : contentList) {
            e.print();
        }
    }
}
