package com.senla.training.flowers_shop.entity;


import com.senla.training.flowers_shop.plant.PlantService;

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

    /**quantity Flower in your bouquet */
    private int quantityFlower;
    /**
     * @param nameFlower name flower in nature
     * @param price price for one flower
     *
     * */
    public AbstractFlower(String nameFlower, double price,int quantityFlower) {
        this.nameFlower = nameFlower;
        this.price = price;
        this.quantityFlower=quantityFlower;
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

    public int getQuantityFlower() {
        return quantityFlower;
    }

    public void setQuantityFlower(int quantityFlower) {
        this.quantityFlower = quantityFlower;
    }

    @Override
    public String toString() {
        return "AbstractFlower{" +
                "typeFlower='" + typeFlower + '\'' +
                ", price=" + price +
                ", nameFlower='" + nameFlower + '\'' +
                ", quantityFlower=" + quantityFlower +
                '}';
    }
}

