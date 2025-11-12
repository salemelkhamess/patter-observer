package org.example.decorator.docorateur;

import org.example.decorator.boissons.Boisson;

public abstract class DecorateurBoisson extends Boisson {
    protected Boisson boisson;
    public DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public abstract String getDescription() ;
}
