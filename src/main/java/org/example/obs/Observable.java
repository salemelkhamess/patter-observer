package org.example.obs;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscrive(Observer observer);
    void notifyObservers();
}
