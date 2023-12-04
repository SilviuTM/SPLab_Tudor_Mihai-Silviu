package ro.uvt.info.proiectsp.services;

public interface Command<T> {
    T execute();
}
