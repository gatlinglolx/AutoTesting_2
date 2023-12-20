package org.max;

public class Main {
    public static void main(String[] args) {
        Linker linker1 = new Linker();

        linker1.addComponent(new Leaf());
        linker1.addComponent(new Leaf());

        Linker linker2 = new Linker();

        linker2.addComponent(new Leaf());

        linker1.addComponent(linker2);

        linker1.operation();
    }
}
