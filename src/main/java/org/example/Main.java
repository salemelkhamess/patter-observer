package org.example;

import org.example.obs.*;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer O1 = new ObserverImpl1();
        Observer O2 = new ObserverImpl2();
        observable.subscribe(O1);
        observable.subscribe(O2);
        observable.subscribe(newState -> {
            System.out.println("************  Obs Impl 3  ************");
            System.out.println("Res: " + newState * Math.cos(newState));
            System.out.println("************  Obs Impl 3  ************");
        });
        observable.setState(60);
        observable.setState(100);
        observable.unsubscrive(O2);
        observable.setState(80);

    }
}