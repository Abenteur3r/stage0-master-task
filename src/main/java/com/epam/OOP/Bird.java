package com.epam.OOP;

public class Bird extends Animal {
    public Bird(){
        this("blue",2,false);
    }

    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color,numberOfPaws,hasFur);
    }
    @Override
    public String getDescription(){
        return "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
    }


}