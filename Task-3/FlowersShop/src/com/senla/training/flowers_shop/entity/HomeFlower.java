package com.senla.training.flowers_shop.entity;

/**
 * @author Dmitry Chueshov 26.05.2020 4:19
 * @project task
 */

public class HomeFlower extends AbstractFlower {

    public HomeFlower(String nameFlower, double price) {
        super(nameFlower, price);
    }

    @Override
    public void setTypeFlower(String typeFlower) {
        typeFlower="HomeFlower";
        super.setTypeFlower(typeFlower);
    }
}
