package org.itstep.qa.zadachi;

public class Hare {
    private int x1;   //начальные координаты
    private int y1;         //начальные координаты
    private int x2;       //текущие координаты
    private int y2;         //текущие координаты
    private int dx;         //изменение координат
    private int dy;         //изменение коордимнат
    private int countJump;   //кол-во прыжков

    public Hare(int x1, int y1, int x2, int y2, int dx, int dy, int countJump) {
        this.x1 =x1 ;
        this.y1 =y1 ;
        this.x2 =x2 ;
        this.y2 = y2;
        this.dx = dx;
        this.dy = dy;
        this.countJump = countJump;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getCountJump() {
        return countJump;
    }

    public void setCountJump(int countJump) {
        this.countJump = countJump;
    }

    public void getJump() {     //прыжок зайца
        this.x2 = x1 + dx;
        this.y2 = y1 + dy;
    }

    public void scare() {               //метод пугающий зайца
      this.x2 = x2 * countJump;
      this.y2 = y2* countJump;
    }

    public void returnHome() {           //метод возвращающий зайца домой
        this.x2 = x1;
        this.y2 = y1;
    }

    public void teleport(int x3, int y3){             //метод телепортирующий зайца в новое место
        this.x1 = x3;
        this.y1 =y3;
    }
}
