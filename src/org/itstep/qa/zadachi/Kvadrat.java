package org.itstep.qa.zadachi;

public class Kvadrat {
    private double l;

    public Kvadrat(double l) {
        this.l = l;
    }

    public Kvadrat() {
        this.l = 0;
    }

    public double getValueOfL() {
        return l;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getAreaOfKvadrat(){
        return l*l;
    }

    public void increaseArea(int number){
        l = Math.sqrt(number);
    }
}

