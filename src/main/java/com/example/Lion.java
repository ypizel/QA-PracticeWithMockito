package com.example;
import java.util.List;

public class Lion {

    private final boolean hasMane;
    private Feline feline;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public Lion(String sex, Feline feline) throws Exception {
        this(sex);
        this.feline = feline;
    }

    // called from feline
    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }
    // called from feline

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }

}
