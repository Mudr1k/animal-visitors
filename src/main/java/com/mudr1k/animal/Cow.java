package com.mudr1k.animal;

import com.mudr1k.Animal;
import com.mudr1k.Visitor;

public class Cow implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.eat(this);
    }
}
