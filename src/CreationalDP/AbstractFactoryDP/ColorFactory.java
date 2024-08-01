package CreationalDP.AbstractFactoryDP;

public class ColorFactory implements AbstractFactory<Color>{


    @Override
    public Shape getObject(String objectType) {
        return (Shape) getColor(objectType);
    }

    public Color getColor(String color){
        if(color.equalsIgnoreCase("Kirmizi")){
            return new Red();

        }else if (color.equalsIgnoreCase("mavi")){
            return new Blue();

        }else if (color.equalsIgnoreCase("yesil")){
            return new Green();
        }
        return null;

    }


}
