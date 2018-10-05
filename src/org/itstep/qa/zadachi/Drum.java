package org.itstep.qa.zadachi;
//Создать класс, которые реализует модель барабана из Поля Чудес
//Класс хранит диапазон из 10 значений (100, 500, 750 и т.д.) которые инициализируются в момент создания экземпляра барабана
//Класс имеет два метода:
//1. Метод выводящий список всех значений "барабана"
//2. Метод, возвращающий случайно значений из диапазона значений барабана
//Создать управляющий класс Runner, который создает экземпляр барабана, три раза "крутит барабан" и выводит выпавшее значение в консоль
import java.util.Random;
public class Drum {
    private int[] values;

    public Drum(int[] values) {      //все значентя барабана
        this.values = values;
    }

    public void getDrumValues(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " ");
        }
    }

    public int getRandomValues(int[] values){ //не знаю как вывести случайное значение и 3 раза крутить барабан
        int result;
        Random random = new Random();
        result = random.nextInt();
        return result;
    }
}
