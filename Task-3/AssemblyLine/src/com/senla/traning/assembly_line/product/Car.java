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
        if(body instanceof Body) {
            System.out.println("кузов установлен");
        }else System.out.println("кузов не установлен");
    }

    @Override
    public void installSecondPart(ProductPart secondProduct) {
        this.chassis=secondProduct;
        if(chassis instanceof Chassis) {
            System.out.println("шасси установлено");
        }else System.out.println("шасси не установлен");
    }

    @Override
    public void installThirdPart(ProductPart thirdProduct) {
        this.engine=thirdProduct;
        if(engine instanceof Engine) {
            System.out.println("двигатель установлен");
        }else System.out.println("двигатель не установлен");
    }
}
