package org.max;

import java.util.ArrayList;
import java.util.List;

public class Linker implements Component{
    private List<Component> components = new ArrayList<>();
    private int executedOperationsCount;

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void operation() {
        System.out.println("Perfoming an operation in Linker");
        executedOperationsCount = 3;
        for (Component component : components) {
            component.operation();
        }
    }

    public int getExecutedOperationsCount() {
        return executedOperationsCount;
    }
}
