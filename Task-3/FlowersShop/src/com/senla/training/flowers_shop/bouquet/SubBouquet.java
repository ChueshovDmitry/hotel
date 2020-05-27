package com.senla.training.bouquet;

import com.senla.training.entity.AbstractFlower;

/**
 * @author Dmitry Chueshov 26.05.2020 1:17
 * @project task
 */

public class SubBouquet {

    private AbstractFlower flower;

    /**quantity Flower in your bouquet */
    private int quantityFlower;


    /**price for all flowers of a certain type */
    private double subAllPrice;

    public SubBouquet(AbstractFlower flower, int quantityFlower) {
        this.flower = flower;
        this.quantityFlower = quantityFlower;
        this.subAllPrice=flower.getPrice()*quantityFlower;
    }

    public double getSuballprice() {
        return subAllPrice;
    }

    public int getQuantityFlower() {
        return quantityFlower;
    }

    public void setQuantityFlower(int quantityFlower) {
        this.quantityFlower = quantityFlower;
    }
}
