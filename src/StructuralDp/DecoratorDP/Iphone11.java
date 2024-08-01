package StructuralDp.DecoratorDP;

public class Iphone11 extends PhoneDecorator {
    public Iphone11(Iphone basicPhone) {
        super(basicPhone);
    }

    //Iphone11 ilkel Iphonenin tum islevlerine sahip
    //artik Iphone11 e yeni islev ekleyelim

    public String getModel(){
        return "11";
    }


}
