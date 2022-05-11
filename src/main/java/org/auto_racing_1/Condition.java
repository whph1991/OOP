package org.auto_racing_1;

public class Condition {
    int threshold;
    int range_min;
    int range_max;

    Condition(int threshold, int range_min, int range_max)
    {
        this.threshold = threshold;
        this.range_min = range_min;
        this.range_max = range_max;
    }

    boolean move()
    {
        return this.threshold <= (int)(Math.random()*9);
    }
}
