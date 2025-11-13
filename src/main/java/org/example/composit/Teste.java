package org.example.composit;

public class Teste {
    public static void main(String[] args) {
        Folder root = new Folder("Root");
        root.addChild(new File("pom.xml"));

        Folder src  =(Folder) root.addChild(new Folder("src"));
        Folder main = (Folder) src.addChild(new Folder("main"));
        main.addChild(new File("Teste.java"));
        main.addChild(new File("P.java"));
        root.print();
    }
}
