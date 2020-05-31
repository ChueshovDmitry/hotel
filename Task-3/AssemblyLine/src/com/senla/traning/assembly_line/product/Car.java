package com.senla.traning.assembly_line.product;
import com.senla.traning.assembly_line.product_part.Body;
import com.senla.traning.assembly_line.product_part.Chassis;
import com.senla.traning.assembly_line.product_part.Engine;
import com.senla.traning.assembly_line.product_part.ProductPart;


/**
 * @author Dmitry Chueshov 26.05.2020 22:33
 * @project assembly_line
 */

public class Car implements Product {

    ProductPart body;
    ProductPart chassis;
    ProductPart engine;

    @Override
    public void installFirstPart(ProductPart firstProduct) {
        this.body=firstProduct;
        System.out.println("кузов установлен");
    }

    @Override
    public void installSecondPart(ProductPart secondProduct) {
        this.chassis=secondProduct;
        System.out.println("шасси установлено");
    }

    @Override
    public void installThirdPart(ProductPart thirdProduct) {
        this.chassis=engine;
        System.out.println("жвигатель установлен");
    }
}
