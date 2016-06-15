package com.hillel.tyshchenko.model;

import com.hillel.tyshchenko.model.entity.bouquet.Bouquet;

/**
 * Created by roman on 15.06.16.
 */
public class Director {
    private BouquetBuilder builder;
    public void setBuilder(BouquetBuilder b){builder = b;}

    public Bouquet BuildBouquet(){
        builder.createBouquet();
        builder.buildNameBouquet();
        builder.buildPriceBouquet();
        builder.buildCategoryBouquet();
        builder.buildSizeOfBouquet();
        builder.buildBouquetType();
        builder.buildFlowers();
        builder.buildBasketOfFlowers();
        builder.buildCoverOfBouquet();
        builder.buildRibbonForBouquet();

        return builder.getBouquet();
    }
}
