package org.itstep.qa.runner;

import org.itstep.qa.zadachi.House;

public class RunnerHouse {
    public static void main(String[] args) {
        House houseOne = new House(45,50, "cottage");
        House houseTwo = new House(30,65, "small house");
        House houseThree = new House(20,73, "big house");

        System.out.println("Обновлённые данные:");
        houseOne.move(3,4);
        houseOne.getInfo();

        houseTwo.move(2,1);
        houseTwo.getInfo();

        houseThree.move(5,6);
        houseThree.getInfo();
    }
}
