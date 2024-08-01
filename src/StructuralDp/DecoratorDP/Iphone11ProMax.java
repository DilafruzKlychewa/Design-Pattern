package StructuralDp.DecoratorDP;

public class Iphone11ProMax extends Iphone11Pro{
    public Iphone11ProMax(Iphone basicPhone) {
        super(basicPhone);
    }
    //Iphone11Pro in getModel islevini degistirebiliriz


    @Override
    public String getModel() {
        return super.getModel()+ "Max";
    }

    //Iphone11Pro nun islevlerine arti olarak yeni bir islev ekleyelim

    public String addColor(){
        return "GOLD";
    }
}
