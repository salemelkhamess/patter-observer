package org.example.obs;

public class ObserverImpl1 implements  Observer {

    @Override
    public void update(Observable observable) {

        if (observable instanceof  ObservableImpl obs) {
            System.out.println("************  Obs Impl 1  ************");
            System.out.println("New state: " +obs.getState());
            System.out.println("************  Obs Impl 1  ************");
        }
        }

}
