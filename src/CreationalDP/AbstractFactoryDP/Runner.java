package CreationalDP.AbstractFactoryDP;

public class Runner {
    public static void main(String[] args) {

        AbstractFactory<Shape> shapeFactory= FactoryProducer.getFactory("sekil");
        Shape kare =shapeFactory.getObject("kare");
        kare.draw();

        AbstractFactory<Color> colorFactory= FactoryProducer.getFactory("renk");
        Color mavi = (Color) colorFactory.getObject("mavi");
        mavi.fill();


        System.out.println("--------------------------------------------");


        Shape ucgen = (Shape) FactoryProducer.getFactory("sekil").getObject("ucgen");
        ucgen.draw();

        Color red = (Color)FactoryProducer.getFactory("renk").getObject("kirmizi");
        red.fill();



    }
}
