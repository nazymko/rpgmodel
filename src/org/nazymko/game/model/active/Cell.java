package org.nazymko.game.model.active;

import org.nazymko.game.model.passive.Item;

/**
 * Created by nazymko.patronus@gmail.com
 */
public class Cell {
    private int x;
    private int y;
    private int z;

    private Item item;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    private Item getItem() {

        return item;
    }

    public void swap(Cell cell) {
        Item tmp = item;

        setItem(cell.getItem());
        cell.setItem(tmp);
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Cell(int x, int y, int z, Item item) {

        this.x = x;
        this.y = y;
        this.z = z;
        this.item = item;
    }
}
