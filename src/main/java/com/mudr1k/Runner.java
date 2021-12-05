package com.mudr1k;

import com.mudr1k.animal.Cow;
import com.mudr1k.animal.Goat;
import com.mudr1k.animal.Lion;
import com.mudr1k.plant.Grass;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Food> foods = List.of(new Lion(), new Goat(), new Cow(), new Grass());
        List<Visitor> visitors = List.of(new LionDinner(), new GoatDinner(), new CowDinner());

        for (Visitor visitor : visitors) {
            for (Food food : foods) {
                try {
                    food.accept(visitor);
                } catch (NoCannibalsAllowedException e) {
                    System.err.println(e.getMessage() + " - No cannibals allowed");
                } catch (IndigestionException e) {
                    System.err.println(e.getMessage() + " - Indigestion");
                }
            }
        }
    }
}
