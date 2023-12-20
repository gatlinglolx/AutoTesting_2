package org.max;

public class Leaf implements Component{

    private int state;
    @Override
    public void operation() {
        System.out.println("Perfoming an operation in Leaf");
        state = 30;
    }

    public int getState() {
        return state;
    }
}
