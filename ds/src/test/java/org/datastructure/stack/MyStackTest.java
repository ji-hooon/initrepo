package org.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStackTest {
    @Test
    public void basic() {
        IStack<Integer> given = new MyStack<>();
        for (int i = 0; i < 50; i++) {
            given.push(i);
            assertEquals(given.peek(), i);
            assertEquals(given.size(), i + 1);
        }
        for (int i = 49; i > -1; i--) {
            assertEquals(given.pop(), i);
            assertEquals(given.size(), i);
        }
    }
}
