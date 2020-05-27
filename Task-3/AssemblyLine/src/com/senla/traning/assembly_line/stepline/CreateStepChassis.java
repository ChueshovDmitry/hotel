package com.senla.traning.assembly_line.stepline;

import com.senla.traning.assembly_line.product_part.Chassis;
import com.senla.traning.assembly_line.product_part.ProductPart;


/**
 * @author Dmitry Chueshov 26.05.2020 22:29
 * @project assembly_line
 */

public class CreateStepChassis implements LineStep {


    @Override
    public ProductPart bildProductPart() {
        System.out.println("шасси сделано");
        return new Chassis();
    }
}
