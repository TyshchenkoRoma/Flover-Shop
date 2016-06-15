package com.hillel.tyshchenko.model.entity.herb;

/**
 * Created by roman on 15.06.16.
 */
public abstract class Herb {
    private String name;
    private int price;
    private int quantityInOrder;
    private LengthOfStalk lengthOfStalk;
    private HerbFreshness herbFreshness;
    private boolean isNeedFeet;

    Herb(String name, int price, int quantityInOrder, LengthOfStalk lengthOfStalk,
         HerbFreshness herbFreshness,boolean isNeedFeet ) {
        this.name = name;
        this.price = price;
        this.quantityInOrder = quantityInOrder;
        this.lengthOfStalk = lengthOfStalk;
        this.herbFreshness = herbFreshness;
        this.isNeedFeet = isNeedFeet;
    }

    public boolean isNeedFeet() {
        return isNeedFeet;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantityInOrder() {
        return quantityInOrder;
    }
    public LengthOfStalk getLengthOfStalk() {
        return lengthOfStalk;
    }
    public HerbFreshness getHerbFreshness() {
        return herbFreshness;
    }

    @Override
    public String toString() {
        return "Herb{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantityInOrder=" + quantityInOrder +
                ", lengthOfStalk=" + lengthOfStalk +
                ", herbFreshness=" + herbFreshness +
                ", isNeedFeet=" + isNeedFeet +
                '}';
    }
}
