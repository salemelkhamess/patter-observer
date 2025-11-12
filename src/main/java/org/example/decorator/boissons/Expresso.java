package org.example.decorator.boissons;

public class Expresso extends Boisson{
    public Expresso() {
        description = "Expresso";
    }
    @Override
    public double cout() {
        return 12;
    }
}
