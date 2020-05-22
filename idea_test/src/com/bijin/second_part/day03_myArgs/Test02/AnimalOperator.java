package com.bijin.second_part.day03_myArgs.Test02;

public class AnimalOperator {
    public void useAnimal(Animal a){ //Animal a = new Cat()
        a.eat();
    }

    public Animal getAnimal(){
        Animal a = new Cat();
        return a;
    }


}
