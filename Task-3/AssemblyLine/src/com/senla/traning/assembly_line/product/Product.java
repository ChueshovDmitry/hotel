package com.senla.traning.assembly_line.product;

import com.senla.traning.assembly_line.product_part.ProductPart;


/**
 * @author Dmitry Chueshov 26.05.2020 17:19
 * @project assembly_line
 */

public interface Product {
    //установка
    void installFirstPart(ProductPart firstProduct);
    void installSecondPart(ProductPart secondProduct);
    void installThirdPart(ProductPart thirdProduct);

}
