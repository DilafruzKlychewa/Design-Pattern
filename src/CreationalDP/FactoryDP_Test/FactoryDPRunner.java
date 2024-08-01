package CreationalDP.FactoryDP_Test;

import CreationalDP.FactoryDP.Shape;
import CreationalDP.FactoryDP.ShapeFactory;
import CreationalDP.FactoryDP.ShapeType;

public class FactoryDPRunner {
    public static void main(String[] args) {

        //Square square= new Square();

        Shape kare= ShapeFactory.getShape(ShapeType.KARE);
        kare.draw();

    }
}
