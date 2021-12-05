package com.mudr1k;

import com.mudr1k.animal.Cow;
import com.mudr1k.animal.Goat;
import com.mudr1k.animal.Lion;
import com.mudr1k.plant.Grass;

public class LionDinner implements Visitor {
    @Override
    public void eat(Lion lion) {
        throw new NoCannibalsAllowedException("Lion eat Lion");
    }

    @Override
    public void eat(Goat goat) {
        System.out.println("Lion eat Goat");
    }

    @Override
    public void eat(Cow cow) {
        System.out.println("Lion eat Cow");

    }

    @Override
    public void eat(Grass grass) {
        throw new IndigestionException("Lion eat Grass");
    }
}
