package Books;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    String name;
    List<Image> imageList;
    List<Paragraph> paragraphList;
    List<Table> tableList;

    public SubChapter() {
        name = "";
        imageList = new ArrayList<>();
        paragraphList = new ArrayList<>();
        tableList = new ArrayList<>();
    }

    public SubChapter(String _name) {
        name = _name;
        imageList = new ArrayList<>();
        paragraphList = new ArrayList<>();
        tableList = new ArrayList<>();
    }

    public String GetName() {
        return name;
    }

    public void SetName(String _name) {
        name = _name;
    }

    public void createNewParagraph(String _name) {
        paragraphList.add(new Paragraph(_name));
    }

    public void createNewImage(String _name) {
        imageList.add(new Image(_name));
    }

    public void createNewTable(String _name) {
        tableList.add(new Table(_name));
    }

    public void print() {
        System.out.println("Subchapter: " + name);

        for (Paragraph p : paragraphList) {
            p.print();
        }

        for (Image i : imageList) {
            i.print();
        }

        for (Table t : tableList) {
            t.print();
        }
    }
}
