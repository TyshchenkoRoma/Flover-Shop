package com.hillel.tyshchenko.model.entity.herb;

/**
 * Created by roman on 15.06.16.
 */
public class Flower extends Herb {
    private RoleInBouquet roleInBouquet;

    private boolean isNeedBacking;

    public Flower(String name, int price, int quantityInOrder, LengthOfStalk lengthOfStalk, HerbFreshness herbFreshness, RoleInBouquet roleInBouquet, boolean isNeedFeet, boolean isNeedBacking) {
        super(name, price, quantityInOrder, lengthOfStalk, herbFreshness, isNeedFeet);
        this.roleInBouquet = roleInBouquet;
        this.isNeedBacking = isNeedBacking;
    }

    public RoleInBouquet getRoleInBouquet() {
        return roleInBouquet;
    }



    public boolean isNeedBacking() {
        return isNeedBacking;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "roleInBouquet=" + roleInBouquet +
                ", isNeedBacking=" + isNeedBacking +
                '}';
    }
}
