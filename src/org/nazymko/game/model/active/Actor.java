package org.nazymko.game.model.active;

import org.nazymko.game.model.passive.Wearable;
import org.nazymko.game.model.stats.Stat;

import java.util.HashMap;

/**
 * Created by nazymko.patronus@gmail.com
 */
public abstract class Actor {



    public abstract HashMap<String, Stat> stats();

    public abstract HashMap<String, Wearable> wear();

}
