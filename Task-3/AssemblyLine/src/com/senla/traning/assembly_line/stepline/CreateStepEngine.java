package com.senla.traning.assembly_line.stepline;

import com.senla.traning.assembly_line.product_part.Engine;
import com.senla.traning.assembly_line.product_part.ProductPart;

/**
 * @author Dmitry Chueshov 27.05.2020 16:56
 * @project assembly_line
 */

public class CreateStepEngine implements LineStep{
    @Override
    public ProductPart bildProductPart() {
        System.out.println("двигатель сделан");
        return new Engine();
    }
}
