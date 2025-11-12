package org.example.decorator;

import org.example.decorator.boissons.Boisson;
import org.example.decorator.boissons.Deca;
import org.example.decorator.boissons.Expresso;
import org.example.decorator.docorateur.Caramel;
import org.example.decorator.docorateur.Chocolat;
import org.example.decorator.docorateur.Noisette;

public class Test {
    public static void main(String[] args) {
        Boisson boisson = new Chocolat(new Noisette(new Caramel( new Chocolat(new Caramel(new Deca())))));
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

    }
}
