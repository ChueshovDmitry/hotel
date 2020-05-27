package com.senla.training.entity;

/**
 * @author Dmitry Chueshov 26.05.2020 4:19
 * @project task
 *
 */

public class GardenFlower extends AbstractFlower {


    public GardenFlower(String nameFlower, double price) {
        super(nameFlower, price);
    }

    @Override
    public void setTypeFlower(String typeFlower) {
        typeFlower="GardenFlower";
        super.setTypeFlower(typeFlower);
    }
}
