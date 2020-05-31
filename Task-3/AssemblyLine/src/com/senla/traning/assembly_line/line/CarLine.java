package com.senla.traning.assembly_line.line;
import com.senla.traning.assembly_line.product.Product;
import com.senla.traning.assembly_line.product_part.ProductPart;
import com.senla.traning.assembly_line.stepline.CreateStepBody;
import com.senla.traning.assembly_line.stepline.CreateStepChassis;
import com.senla.traning.assembly_line.stepline.CreateStepEngine;


/**
 * @author Dmitry Chueshov 26.05.2020 22:39
 * @project assembly_line
 */

public class CarLine implements AssemblyLine {

    CreateStepBody stepBody;

    CreateStepChassis stepChassis;

    CreateStepEngine stepEngine;


    public CarLine(CreateStepBody stepBody, CreateStepChassis stepChassis, CreateStepEngine stepEngine){
            this.stepBody=stepBody;
            this.stepChassis=stepChassis;
            this.stepEngine=stepEngine;
    }


    @Override
    public Product assembleProduct(Product product) {
        System.out.println(" начало сборки машины");
            product.installFirstPart(this.stepBody.bildProductPart());
            product.installSecondPart(this.stepChassis.bildProductPart());
            product.installThirdPart(this.stepEngine.bildProductPart());
        System.out.println("машина собрана");

        return product;
    }
}
