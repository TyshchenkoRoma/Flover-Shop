package com.hillel.tyshchenko.model.entity.accessory;

import com.hillel.tyshchenko.model.entity.bouquet.Category;
import com.hillel.tyshchenko.model.entity.bouquet.SizeOfBouquet;
import com.hillel.tyshchenko.model.entity.herb.LengthOfStalk;

/**
 * Created by roman on 15.06.16.
 */
public class BasketOfFlowers extends Accessory {
    private SizeOfBouquet sizeOfBasket;
    private LengthOfStalk forLengthOfStalk;

    public BasketOfFlowers(String name, Category category, int quantityInOrder, int price, SizeOfBouquet sizeOfBasket, LengthOfStalk forLengthOfStalk) {
        super(name, category, quantityInOrder, price);
        this.sizeOfBasket = sizeOfBasket;
        this.forLengthOfStalk = forLengthOfStalk;
    }

    public SizeOfBouquet getSizeOfBasket() {
        return sizeOfBasket;
    }

    public LengthOfStalk getForLengthOfStalk() {
        return forLengthOfStalk;
    }

    @Override
    public String toString() {
        return "BasketOfFlowers{" +
                "sizeOfBasket=" + sizeOfBasket +
                ", forLengthOfStalk=" + forLengthOfStalk +
                '}';
    }
}
