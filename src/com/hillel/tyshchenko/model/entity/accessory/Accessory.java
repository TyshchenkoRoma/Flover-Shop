package com.hillel.tyshchenko.model.entity.accessory;

import com.hillel.tyshchenko.model.entity.bouquet.Category;

/**
 * Created by roman on 15.06.16.
 */
abstract class Accessory {
    private String name;
    private int price;
    private int quantityInOrder;
    private Category category;

    public Accessory(String name, Category category, int quantityInOrder, int price) {
        this.name = name;
        this.category = category;
        this.quantityInOrder = quantityInOrder;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public int getQuantityInOrder() {
        return quantityInOrder;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantityInOrder=" + quantityInOrder +
                ", category=" + category +
                '}';
    }
}
