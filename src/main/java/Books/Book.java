package Books;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    TableOfContents tableOfContents;
    List<Author> authorList;
    List<Chapter> chapterList;

    public Book() {
        title = "";
        tableOfContents = new TableOfContents();
        authorList = new ArrayList<>();
        chapterList = new ArrayList<>();
    }

    public Book(String _title) {
        title = _title;
        tableOfContents = new TableOfContents();
        authorList = new ArrayList<>();
        chapterList = new ArrayList<>();
    }

    public Book(String _title, TableOfContents toc, List<Author> _authorList, List<Chapter> _chapterList) {
        title = _title;
        tableOfContents = toc;
        authorList = _authorList;
        chapterList = _chapterList;
    }

    public String GetTitle() {
        return title;
    }

    public void SetTitle(String newTitle) {
        title = newTitle;
    }

    public List<Author> GetList() {
        return authorList;
    }

    public void SetList(List<Author> _authorList) {
        authorList = _authorList;
    }

    public void addAuthor(Author newAuth) {
        authorList.add(newAuth);
    }

    public int createChapter(String _name) {
        chapterList.add(new Chapter(_name));
        return chapterList.size() - 1;
    }

    public Chapter getChapter(int index) {
        return chapterList.get(index);
    }

    public void print() {

    }
}
