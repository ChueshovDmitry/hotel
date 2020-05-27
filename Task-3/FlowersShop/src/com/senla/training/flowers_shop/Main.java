package com.senla.training.flowers_shop;

import com.senla.training.flowers_shop.bouquet.SubBouquet;
import com.senla.training.flowers_shop.entity.GardenFlower;
import com.senla.training.flowers_shop.entity.WildFlower;


/**
 * @author Dmitry Chueshov 26.05.2020 0:29
 * @project task
 */

public class Main {
    public static void main(String[] args) {

        double count = 0;

        SubBouquet[] subBouquets = new SubBouquet[1000];
        subBouquets[0] = new SubBouquet(new WildFlower("Сhamomile", 200), 2);
        subBouquets[1] = new SubBouquet(new GardenFlower("Rose",100),3);

        for (SubBouquet s:subBouquets) {
            if(s!=null){
                count += s.getSuballprice();
            } else break;
        }


        System.out.println("price over all flowers in your purchase: " +  count);
    }
}
