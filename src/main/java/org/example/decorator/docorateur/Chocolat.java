package org.example.decorator.docorateur;

import org.example.decorator.boissons.Boisson;

public class Chocolat extends  DecorateurBoisson{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.5+ boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + "Au  chocolat";
    }
}
