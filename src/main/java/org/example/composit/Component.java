package org.example.composit;

public abstract class Component {

    protected String name;
    protected int label =0;

    public Component(String name) {
        this.name = name;
    }

    public  abstract void   print();


    public String tab() {
        String tab = "";
        for (int i = 0; i < label; i++) {
            tab  = tab + "\t";
        }
        return tab;
    }
}
