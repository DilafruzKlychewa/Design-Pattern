package CreationalDP.AbstractFactoryDP;



public class ShapeFactory implements AbstractFactory<Shape> {

    @Override
    public Shape getObject(String objectType) {
        return getShape(objectType);
    }


    public static Shape getShape(String type ){

        if(type.equalsIgnoreCase("ucgen")){
            return new Triangle("ucgen", 60, 3);

        }else if (type.equalsIgnoreCase("kare")){
            return new Square("Kare",90,4 );

        }else if (type.equalsIgnoreCase("besgen")){
            return new Pentagon("Besgen", 108,5);
        }
        return null;

    }


}
