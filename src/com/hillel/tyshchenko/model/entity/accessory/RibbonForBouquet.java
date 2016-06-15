package com.hillel.tyshchenko.model.entity.accessory;

import com.hillel.tyshchenko.model.entity.bouquet.Category;
import com.hillel.tyshchenko.model.entity.bouquet.SizeOfBouquet;

/**
 * Created by roman on 15.06.16.
 */
public class RibbonForBouquet extends Accessory {
    private SizeOfBouquet sizeOfBouquet;

    public RibbonForBouquet(String name, Category category, int quantityInOrder, int price, SizeOfBouquet sizeOfBouquet) {
        super(name, category, quantityInOrder, price);
        this.sizeOfBouquet = sizeOfBouquet;
    }

    public SizeOfBouquet getSizeOfBouquet() {
        return sizeOfBouquet;
    }

    @Override
    public String toString() {
        return "RibbonForBouquet{" +
                "sizeOfBouquet=" + sizeOfBouquet +
                '}';
    }
}
