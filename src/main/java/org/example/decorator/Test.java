package org.example.decorator;

import org.example.decorator.boissons.Boisson;
import org.example.decorator.boissons.Expresso;
import org.example.decorator.docorateur.Caramel;
import org.example.decorator.docorateur.Chocolat;
import org.example.decorator.docorateur.Noisette;

public class Test {
    public static void main(String[] args) {
        Boisson boisson;
        boisson = new Expresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-------------------------");
        boisson =new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-------------------------");
        boisson = new Noisette(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-------------------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-------------------------");

        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-------------------------");

        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}
