package com.example.exercise2_2;
public class Counter {
    private int count, min, max, start, step;

    public Counter(int count, int min, int max, int start, int step) {
        this.count = start;
        this.min = min;
        this.max = max;
        this.start = start;
        this.step = step;
    }
    public Counter() {
        this.count = 1;
        this.min = -15;
        this.max = 22;
        this.start = 1;
        this.step = 7;
    }
    public void minus(){
        if(count - step >= min)
            count = count - step;
    }
    public void plus(){
        if(count + step <= max)
            count = count + step;
    }
    public void reset(){
        count = start;
    }
    public int getValue(){
        return count; }
}
