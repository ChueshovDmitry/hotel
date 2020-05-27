package com.senla.training.entity;

/**
 * @author Dmitry Chueshov 26.05.2020 4:19
 * @project task
 */

public class WildFlower extends AbstractFlower {

    public WildFlower(String nameFlower, double price) {
        super(nameFlower, price);
    }

    @Override
    public void setTypeFlower(String typeFlower) {
        typeFlower="WildFlower";
        super.setTypeFlower(typeFlower);
    }
}
