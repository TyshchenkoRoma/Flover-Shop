package com.hillel.tyshchenko.model.entity.accessory;

import com.hillel.tyshchenko.model.entity.bouquet.Category;
import com.hillel.tyshchenko.model.entity.herb.LengthOfStalk;

/**
 * Created by roman on 15.06.16.
 */
public class FlowerBacking extends Accessory {
    private LengthOfStalk forLengthOfStalk;
    private boolean isFeet;

    public FlowerBacking(String name, Category category, int quantityInOrder, int price, LengthOfStalk forLengthOfStalk, boolean isFeet) {
        super(name, category, quantityInOrder, price);
        this.forLengthOfStalk = forLengthOfStalk;
        this.isFeet = isFeet;
    }

    public LengthOfStalk getForLengthOfStalk() {
        return forLengthOfStalk;
    }

    public boolean isFeet() {
        return isFeet;
    }

    @Override
    public String toString() {
        return "FlowerBacking{" +
                "forLengthOfStalk=" + forLengthOfStalk +
                ", isFeet=" + isFeet +
                '}';
    }
}
