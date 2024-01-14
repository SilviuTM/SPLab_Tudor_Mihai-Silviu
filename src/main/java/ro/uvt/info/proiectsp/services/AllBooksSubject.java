package ro.uvt.info.proiectsp.services;

import org.springframework.stereotype.Component;
import ro.uvt.info.proiectsp.ACTUALmodels.Book;

import java.util.ArrayList;
import java.util.List;

@Component
public class AllBooksSubject {
    private final List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Book book) {
        observers.forEach(observer -> observer.update(book));
    }
}
