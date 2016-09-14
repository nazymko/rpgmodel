package org.nazymko.game.model.active;

import org.nazymko.game.model.stats.Stat;

import java.util.HashMap;

/**
 * Created by nazymko.patronus@gmail.com
 */
public class Hero extends Actor {

    HashMap<String, Stat> stats;

    @Override
    public HashMap<String, Stat> stats() {
        return stats;
    }
}
