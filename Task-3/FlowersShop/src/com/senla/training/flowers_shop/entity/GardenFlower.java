package com.senla.training.flowers_shop.entity;

/**
 * @author Dmitry Chueshov 26.05.2020 4:19
 * @project task
 *
 */

public class GardenFlower extends AbstractFlower {


    public GardenFlower(String nameFlower, double price, int quantityFlower) {
        super(nameFlower, price, quantityFlower);
    }

    @Override
    public void setTypeFlower(String typeFlower) {
        typeFlower="GardenFlower";
        super.setTypeFlower(typeFlower);
    }
}
