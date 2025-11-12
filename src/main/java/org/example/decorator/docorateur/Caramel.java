package org.example.decorator.docorateur;

import org.example.decorator.boissons.Boisson;

public class Caramel extends  DecorateurBoisson{
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 2.1+ boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + "Au  Caramel";
    }
}
