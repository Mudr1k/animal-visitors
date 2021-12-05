package com.mudr1k;

import com.mudr1k.animal.Cow;
import com.mudr1k.animal.Goat;
import com.mudr1k.animal.Lion;
import com.mudr1k.plant.Grass;

public interface Visitor {
    void eat(Lion lion);

    void eat(Goat goat);

    void eat(Cow cow);

    void eat(Grass grass);
}
