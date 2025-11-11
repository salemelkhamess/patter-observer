package org.example.obs;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;
    @Override
    public void subscribe(Observer observer) {

        observers.add(observer);
    }

    @Override
    public void unsubscrive(Observer observer) {

        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (Observer observer : observers) {
            observer.update(state);
        }
    }


    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public int getState() {
        return state;
    }
}
