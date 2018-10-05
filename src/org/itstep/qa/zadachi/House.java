package org.itstep.qa.zadachi;

public class House {
    private double widthHouse;             //широта
    private double longitudeHouse;         //долгота
    private String nameHouse;         //название

    public House(double widthHouse, double longitudeHouse, String nameHouse) {
        this.widthHouse = widthHouse;
        this.longitudeHouse = longitudeHouse;
        this.nameHouse = nameHouse;
    }

    public double getWidthHouse() {
        return widthHouse;
    }

    public void setWidthHouse(double widthHouse) {
        this.widthHouse = widthHouse;
    }

    public double getLongitudeHouse() {
        return longitudeHouse;
    }

    public void setLongitudeHouse(double longitudeHouse) {
        this.longitudeHouse = longitudeHouse;
    }

    public String getNameHouse() {
        return nameHouse;
    }

    public void setNameHouse(String nameHouse) {
        this.nameHouse = nameHouse;
    }

    public void move(int dx, int dy) {     //перемещаем дома
        this.widthHouse = widthHouse + dx;
        this.longitudeHouse = longitudeHouse + dy;
    }

    public void getInfo(){
        System.out.println(widthHouse);
        System.out.println(longitudeHouse);
        System.out.println(nameHouse);

}
}

