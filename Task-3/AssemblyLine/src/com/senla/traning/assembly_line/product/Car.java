package com.senla.traning.assembly_line.product;
import com.senla.traning.assembly_line.product_part.Body;
import com.senla.traning.assembly_line.product_part.Chassis;
import com.senla.traning.assembly_line.product_part.Engine;
import com.senla.traning.assembly_line.product_part.ProductPart;
import product_part.Body;
import product_part.Chassis;
import product_part.Engine;
import product_part.ProductPart;

/**
 * @author Dmitry Chueshov 26.05.2020 22:33
 * @project assembly_line
 */

public class Car implements Product {


    @Override
    public void installFirstPart(ProductPart firstProduct) {
        if(firstProduct instanceof Body) {
            System.out.println("кузов установлен");
        }else System.out.println("кузов не установлен");
    }

    @Override
    public void installSecondPart(ProductPart secondProduct) {
        if(secondProduct instanceof Chassis) {
            System.out.println("шасси установлено");
        }else System.out.println("шасси не установлен");
    }

    @Override
    public void installThirdPart(ProductPart thirdProduct) {
        if(thirdProduct instanceof Engine) {
            System.out.println("двигатель установлен");
        }else System.out.println("двигатель не установлен");
    }
}
