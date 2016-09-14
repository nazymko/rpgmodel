package org.nazymko.game.model.passive;

import org.nazymko.game.model.stats.Stat;

/**
 * Created by nazymko.patronus@gmail.com
 */
public abstract class Wearable extends Item {

    public Wearable(String title) {
        super(title);
    }

    public abstract Stat[] stats();

}
