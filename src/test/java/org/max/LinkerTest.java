package org.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LinkerTest {

    @Test
    void testLeafOperation() {
        Leaf leaf = new Leaf();
        leaf.operation();
        int expectedState = 30;
        int actualState = leaf.getState();
        Assertions.assertEquals(expectedState, actualState);
    }

    @Test
    void LinkerOperation() {
        Linker linker = new Linker();
        linker.addComponent(new Leaf());
        linker.addComponent(new Leaf());
        linker.addComponent(new Leaf());

        linker.operation();

        int expectedValue = 3;
        int actualValue = linker.getExecutedOperationsCount();

        Assertions.assertEquals(expectedValue, actualValue);
    }



}
