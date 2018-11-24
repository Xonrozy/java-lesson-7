package ru.zhugin.se;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }
    int getFood() {
        return food;
    }
    public void decreaseFood(int n){
        if (food >= 0) food -= n; else {System.out.println("В тарелке не хватет еды");};
    }
    public void info(){
        if (food > 0){System.out.println("В тарелке: " + food + " грамм еды.");} else { System.out.println("В тарелке не осталось еды :(");};
    }
    public void addingFood(int amount){
        food += amount;
    }
}
