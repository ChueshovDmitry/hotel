package stepline;

import product_part.Body;
import product_part.ProductPart;

/**
 * @author Dmitry Chueshov 26.05.2020 22:29
 * @project assembly_line
 */

public class CreateStepBody implements LineStep {


    @Override
    public ProductPart bildProductPart() {
        System.out.println("кузов сделан");
        return new Body();
    }
}
