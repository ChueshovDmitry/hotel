package line;

import product.Product;
import product_part.ProductPart;
import stepline.CreateStepBody;
import stepline.CreateStepChassis;
import stepline.CreateStepEngine;

/**
 * @author Dmitry Chueshov 26.05.2020 22:39
 * @project assembly_line
 */

public class CarLine implements AssemblyLine {

    ProductPart[] products =new ProductPart[3];

    public CarLine(CreateStepBody stepBody, CreateStepChassis stepChassis, CreateStepEngine stepEngine){
        products[0]=stepBody.bildProductPart();
        products[1]=stepChassis.bildProductPart();
        products[2]=stepEngine.bildProductPart();
    }


    @Override
    public Product assembleProduct(Product product) {
        System.out.println(" начало сборки машины");
            product.installFirstPart(products[0]);
            product.installSecondPart(products[1]);
            product.installThirdPart(products[2]);
        System.out.println("машина собрана");

        return product;
    }
}
