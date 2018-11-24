package ru.zhugin.se;

/**
 * Выполнение задания к Лекции №7, Java.Уровень 1.
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Cat[] cats = {
                new Cat("Мурзик",15),
                new Cat("Барсик",10),
                new Cat("Веня",30)
        };

        Plate plate = new Plate(50);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.printInfo();
            plate.info();
        }
    }
}
