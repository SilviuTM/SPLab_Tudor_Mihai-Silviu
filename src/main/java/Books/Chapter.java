package Books;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    String name;
    List<SubChapter> subChapterList;

    public Chapter() {
        name = "";
        subChapterList = new ArrayList<>();
    }

    public Chapter(String _name) {
        name = _name;
        subChapterList = new ArrayList<>();
    }

    public Chapter(String _name, List<SubChapter> _subChapterList) {
        name = _name;
        subChapterList = _subChapterList;
    }

    public String GetName() {
        return name;
    }

    public void SetName(String _name) {
        name = _name;
    }

    public List<SubChapter> GetSubChapterList() {
        return  subChapterList;
    }

    public void SetSubChapterList(List<SubChapter> _subChapterList) {
        subChapterList = _subChapterList;
    }

    public int createSubChapter(String _name) {
        subChapterList.add(new SubChapter(_name));
        return subChapterList.size() - 1;
    }

    public SubChapter getSubChapter(int index) {
        return subChapterList.get(index);
    }

    public void print() {

    }
}
