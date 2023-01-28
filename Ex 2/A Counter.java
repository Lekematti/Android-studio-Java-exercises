package com.example.exercis5;

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
        this.count = 0;
        this.min = -100;
        this.max = 100;
        this.start = 0;
        this.step = 1;
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

