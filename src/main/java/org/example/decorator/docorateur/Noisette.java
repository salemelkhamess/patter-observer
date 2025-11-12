package org.example.decorator.docorateur;

import org.example.decorator.boissons.Boisson;

public class Noisette  extends  DecorateurBoisson{
    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.9 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + "Au Noisette";
    }
}
