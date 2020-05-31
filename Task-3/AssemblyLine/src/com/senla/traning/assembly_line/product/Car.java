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

    public void setBody(ProductPart body) {
        setBody(body);
    }

    public void setChassis(ProductPart chassis) {
        setBody(chassis);
    }

    public void setEngine(ProductPart engine) {
        setEngine(engine);
    }

    @Override
    public void installFirstPart(ProductPart firstProduct) {

    }

    @Override
    public void installSecondPart(ProductPart secondProduct) {

    }

    @Override
    public void installThirdPart(ProductPart thirdProduct) {
        this.engine=thirdProduct;
    }
}
