package org.auto_racing;

public class Condition {
    Condition() {
    }

    public boolean canMove() {
        final int threshold = 4;
        final int rangeMax = 9;

        return threshold <= (int) (Math.random() * rangeMax);
    }
}