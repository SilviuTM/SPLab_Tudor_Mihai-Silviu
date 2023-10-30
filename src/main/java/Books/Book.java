package Books;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    List<Author> authorList;

    public Book() {
        super();
        authorList = new ArrayList<>();
    }

    public Book(String _title) {
        super(_title);
        authorList = new ArrayList<>();
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

    public void print() {
        System.out.println("Book:" + title);
        System.out.println();
        System.out.println("Authors: ");

        for (Author a : authorList) a.print();
        System.out.println();

        for (Element e : elements) e.print();
    }
}