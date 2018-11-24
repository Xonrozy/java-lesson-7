package ru.zhugin.se;

public class Cat {
    public String name;
    public int appetite;
    public boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void printInfo() {
        System.out.println(name + (satiety ? (" сьел " + appetite + " грамм и он сытый") : " хочет есть."));
    }

    public void eat(Plate p){
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            satiety = true;
        }
    };
}
