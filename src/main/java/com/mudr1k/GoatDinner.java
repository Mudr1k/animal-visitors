package com.mudr1k;

import com.mudr1k.animal.Cow;
import com.mudr1k.animal.Goat;
import com.mudr1k.animal.Lion;
import com.mudr1k.plant.Grass;

public class GoatDinner implements Visitor {
    @Override
    public void eat(Lion lion) {
        throw new IndigestionException("Goat eat Lion");
    }

    @Override
    public void eat(Goat goat) {
        throw new NoCannibalsAllowedException("Goat eat Goat");
    }

    @Override
    public void eat(Cow cow) {
        throw new IndigestionException("Goat eat Cow");
    }

    @Override
    public void eat(Grass grass) {
        System.out.println("Goat eat Grass");
    }
}
