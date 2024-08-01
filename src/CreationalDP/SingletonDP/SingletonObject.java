package CreationalDP.SingletonDP;

public class SingletonObject {

    public String message = "Merhaba";

    private static SingletonObject instance;

    SingletonObject(){

    }
    public static SingletonObject getInstance() {
        if (instance == null) { //metod ilk kez cagrilidiginda yeni bir obje uretilir, sonrasinda ise ayni obje dondurulur
            instance = new SingletonObject();

        }
        return instance;
    }

    public void changeMessage(){
            this.message+=" Design Pattern:)";

    }
}
