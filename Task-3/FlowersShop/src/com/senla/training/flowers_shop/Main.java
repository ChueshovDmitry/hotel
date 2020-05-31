package com.senla.training.flowers_shop;

import com.senla.training.flowers_shop.bouquet.Bouquet;
import com.senla.training.flowers_shop.entity.AbstractFlower;
import com.senla.training.flowers_shop.entity.GardenFlower;


/**
 * @author Dmitry Chueshov 26.05.2020 0:29
 * @project task
 */

public class Main {
    public static void main(String[] args) {

        Bouquet bouquet=new Bouquet();
        bouquet.addFlower(new GardenFlower("Rose",12,100));
        bouquet.addFlower(new GardenFlower("Chmomile",9,100));
        bouquet.getAllPrice();


    }
}
