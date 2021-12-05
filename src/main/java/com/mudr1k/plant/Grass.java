package com.mudr1k.plant;

import com.mudr1k.Plant;
import com.mudr1k.Visitor;

public class Grass implements Plant {
    @Override
    public void accept(Visitor visitor) {
        visitor.eat(this);
    }
}
