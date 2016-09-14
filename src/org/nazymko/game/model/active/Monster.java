package org.nazymko.game.model.active;

import org.nazymko.game.model.stats.Stat;

import java.util.HashMap;

/**
 * Created by nazymko.patronus@gmail.com
 */
public class Monster extends Actor {
    HashMap<String, Stat> stats;

    public Monster(HashMap<String, Stat> stats) {
        this.stats = stats;
    }



    @Override
    public HashMap<String, Stat> stats() {
        return stats;
    }
}
