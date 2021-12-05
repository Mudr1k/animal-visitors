package com.mudr1k;

import com.mudr1k.animal.Cow;
import com.mudr1k.animal.Goat;
import com.mudr1k.animal.Lion;
import com.mudr1k.plant.Grass;

public class CowDinner implements Visitor {
    @Override
    public void eat(Lion lion) {
        throw new IndigestionException("Cow eat Lion");
    }

    @Override
    public void eat(Goat goat) {
        throw new IndigestionException("Cow eat Goat");
    }

    @Override
    public void eat(Cow cow) {
        throw new NoCannibalsAllowedException("Cow eat Cow");
    }

    @Override
    public void eat(Grass grass) {
        System.out.println("Cow eat Grass");
    }
}
