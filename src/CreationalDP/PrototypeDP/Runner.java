package CreationalDP.PrototypeDP;

public class Runner {
    public static void main(String[] args) {
         Soldier soldierAvailable = new Soldier(100,20,60,"Kilic",true);
         Soldier soldierNotAvailable=new Soldier(100,20,60,"Kilic",false);
         Soldier soldierWeapon=new Soldier(100,20,60,"OK",true);

         //bir tane askeri prototip olarak alsak ve klonlasak , sadece farkli olan ozelliklerini set etsek
        //soldierAvailable objemiz prototip olsun

        Soldier soldier4=soldierAvailable.clone();


        System.out.println("-----------prototip----------------");
        soldierAvailable.printInfo();
        System.out.println("--------clonesoldier--------------");
        soldier4.printInfo();
        System.out.println("-------------clone soldierNotAvalilable---------------");
        Soldier soldier5=soldierAvailable.clone();
        soldier5.setAvailable(false);
        soldier5.printInfo();









    }
}
