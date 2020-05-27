import line.CarLine;
import product.Car;
import product.Product;
import stepline.CreateStepBody;
import stepline.CreateStepChassis;
import stepline.CreateStepEngine;

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
