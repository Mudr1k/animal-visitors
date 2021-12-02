package com.mudr1k;

import com.mudr1k.animal.Cow;
import com.mudr1k.animal.Goat;
import com.mudr1k.animal.Lion;
import com.mudr1k.plant.Grass;

public class Dinner implements Visitor{
    @Override
    public void eat(Lion lion) {
        System.out.println(" eat " + lion.getClass().getSimpleName());
    }

    @Override
    public void eat(Goat goat) {
        System.out.println(" eat " + goat.getClass().getSimpleName());
    }

    @Override
    public void eat(Cow cow) {
        System.out.println(" eat " + cow.getClass().getSimpleName());

    }

    @Override
    public void eat(Grass grass) {
        System.out.println(" eat " + grass.getClass().getSimpleName());
    }
}
