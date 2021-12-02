package com.mudr1k;

import com.mudr1k.animal.Cow;
import com.mudr1k.animal.Goat;
import com.mudr1k.animal.Lion;
import com.mudr1k.plant.Grass;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Animal> list = List.of(new Lion(), new Goat(), new Cow(), new Grass());

        Dinner dinner = new Dinner();

        for (Animal animal : list) {
            System.out.println(animal.getClass().getSimpleName() + " : ");
            animal.accept(dinner);
        }
    }
}
