package com.hillel.tyshchenko.model.entity.accessory;

import com.hillel.tyshchenko.model.entity.bouquet.Category;
import com.hillel.tyshchenko.model.entity.bouquet.SizeOfBouquet;
import com.hillel.tyshchenko.model.entity.herb.LengthOfStalk;

/**
 * Created by roman on 15.06.16.
 */
public class CoverOfBouquet extends Accessory {
    private SizeOfBouquet sizeOfBouquet;
    private LengthOfStalk forLengthOfStalk;

    public CoverOfBouquet(String name, Category category, int quantityInOrder, int price, SizeOfBouquet sizeOfBouquet, LengthOfStalk forLengthOfStalk) {
        super(name, category, quantityInOrder, price);
        this.sizeOfBouquet = sizeOfBouquet;
        this.forLengthOfStalk = forLengthOfStalk;
    }

    public LengthOfStalk getForLengthOfStalk() {
        return forLengthOfStalk;
    }

    public SizeOfBouquet getSizeOfBouquet() {
        return sizeOfBouquet;
    }

    @Override
    public String toString() {
        return "CoverOfBouquet{" +
                "sizeOfBouquet=" + sizeOfBouquet +
                ", forLengthOfStalk=" + forLengthOfStalk +
                '}';
    }
}
