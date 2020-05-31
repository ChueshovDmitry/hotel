package com.senla.training.flowers_shop.entity;

/**
 * @author Dmitry Chueshov 26.05.2020 4:19
 * @project task
 */

public class HomeFlower extends AbstractFlower {

    public HomeFlower(String nameFlower, double price, int quantityFlower) {
        super(nameFlower, price, quantityFlower);
    }

    @Override
    public void setTypeFlower(String typeFlower) {
        typeFlower="HomeFlower";
        super.setTypeFlower(typeFlower);
    }
}
