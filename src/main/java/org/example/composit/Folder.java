package org.example.composit;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Folder  extends  Component{

    List<Component> comonents = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void print() {

        String t = tab();
        System.out.println(t + "Folder" +name);
        for (Component c : comonents) {
            c.print();
        }
    }

    public Component addChild(Component c) {
        c.label =this.label +1;
        this.comonents.add(c);
        return  c;
    }

    public List<Component> getChildren() {
        return comonents;
    }

    public Component getChild(String name) {
        Optional<Component> first = comonents.stream().filter(c -> c.name.equals(name)).findFirst();

        return first.orElse(null);
       /* for (Component c : comonents) {
            if (c.name == name) {
                return c;
            }
        }
        return null;*/
    }
}
