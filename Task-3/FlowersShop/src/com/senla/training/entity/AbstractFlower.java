package com.senla.training.entity;


import com.senla.training.plant.PlantService;

/**
 * @author Dmitry Chueshov 26.05.2020 0:59
 * @project task
 */

public abstract class AbstractFlower implements PlantService {

    /** type flower in nature */
    private String typeFlower;

    /** price for one flower */
    private double price;

    /** name flower in shop */
    private String nameFlower;

    /**
     * @param nameFlower name flower in nature
     * @param price price for one flower
     *
     * */
    public AbstractFlower(String nameFlower, double price) {
        this.nameFlower = nameFlower;
        this.price = price;
    }

    /**
     * @see PlantService this is type flowet in nature
     *
     * */
    @Override
    public void typePlant(String type) {
        this.typeFlower=type;
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public String getTypeFlower() {
        return typeFlower;
    }

    public void setTypeFlower(String typeFlower) {
        this.typeFlower = typeFlower;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "nameFlower='" + nameFlower + '\'' +
                ", typeFlower='" + typeFlower + '\'' +
                ", price=" + price +
                '}';
    }
}
