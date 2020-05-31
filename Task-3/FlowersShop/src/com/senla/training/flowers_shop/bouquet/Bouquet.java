package com.senla.training.flowers_shop.bouquet;

import com.senla.training.flowers_shop.entity.AbstractFlower;

/**
 * @author Dmitry Chueshov 26.05.2020 1:17
 * @project task
 */

public class Bouquet {

    int count=0;

    private AbstractFlower [] flower = new AbstractFlower[1000];


    /**price for all flowers of a certain type */
    private double subAllPrice;


    public void addFlower(AbstractFlower abstractFlower){
         count++;
         this.flower[this.count]=abstractFlower;
    }

    public void getAllPrice(){
       for (AbstractFlower flower : flower) {
           if (flower != null) {
               this.subAllPrice+=flower.getPrice()*flower.getQuantityFlower();
           }
       }
        System.out.println(getSubAllPrice());
    }

    public double getSubAllPrice() {
        return subAllPrice;
    }
}
