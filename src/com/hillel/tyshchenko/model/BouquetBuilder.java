package com.hillel.tyshchenko.model;

import com.hillel.tyshchenko.model.entity.bouquet.Bouquet;

/**
 * Created by roman on 15.06.16.
 */
abstract class BouquetBuilder {
    Bouquet bouquet;

    void createBouquet(){bouquet = new Bouquet();}

    abstract void buildNameBouquet();
    abstract void buildPriceBouquet();
    abstract void buildCategoryBouquet();
    abstract void buildSizeOfBouquet();
    abstract void buildBouquetType();
    abstract void buildFlowers();
    abstract void buildBasketOfFlowers();
    abstract void buildCoverOfBouquet();
    abstract void buildRibbonForBouquet();

    Bouquet getBouquet(){return bouquet;}
}
