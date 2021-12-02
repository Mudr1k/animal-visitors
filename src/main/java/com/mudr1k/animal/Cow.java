package com.mudr1k.animal;

import com.mudr1k.Animal;
import com.mudr1k.Visitor;
import com.mudr1k.plant.Grass;

public class Cow implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.eat(new Grass());
    }
}
