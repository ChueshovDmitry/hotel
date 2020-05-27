package com.senla.traning.assembly_line;

import com.senla.traning.assembly_line.line.CarLine;
import com.senla.traning.assembly_line.product.Car;
import com.senla.traning.assembly_line.product.Product;
import com.senla.traning.assembly_line.stepline.CreateStepBody;
import com.senla.traning.assembly_line.stepline.CreateStepChassis;
import com.senla.traning.assembly_line.stepline.CreateStepEngine;


/**
 * @author Dmitry Chueshov 26.05.2020 23:19
 * @project assembly_line
 */

public class Main {
    public static void main(String[] args) {

        CarLine carLine = new CarLine(new CreateStepBody(),new CreateStepChassis(),new CreateStepEngine());
        Product car = carLine.assembleProduct(new Car());

    }
}
