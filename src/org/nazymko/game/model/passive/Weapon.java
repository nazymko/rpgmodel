package org.nazymko.game.model.passive;

import org.nazymko.game.model.stats.Stat;

/**
 * Created by nazymko.patronus@gmail.com
 */
public class Weapon extends Wearable {

    private Stat[] stats;

    public Weapon(String title, Stat[] stats) {
        super(title);
        this.stats = stats;
    }

    @Override
    public Stat[] stats() {
        return this.stats;
    }
}
