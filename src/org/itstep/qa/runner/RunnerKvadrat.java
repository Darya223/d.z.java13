package org.itstep.qa.runner;

import org.itstep.qa.zadachi.Kvadrat;

public class RunnerKvadrat {
    public static void main(String[] args) {
        Kvadrat kvadratOne = new Kvadrat(10);
        Kvadrat kvadratTwo = new Kvadrat();
        System.out.println("сторона квадрата:" + kvadratOne.getValueOfL());
        System.out.println("площадь квадрата:" + kvadratOne.getAreaOfKvadrat());
        kvadratOne.increaseArea(4);
    }
}
