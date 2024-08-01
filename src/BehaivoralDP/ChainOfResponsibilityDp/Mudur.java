package BehaivoralDP.ChainOfResponsibilityDp;

public class Mudur extends Approver{

    public Mudur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {

        if (amount<=10000){
            System.out.println("Mudur talebi onayladi...");
            System.out.println("**************************");
        }else if(chief!=null){

            System.out.println("Miktar mudurun onay limitini asiyor, talep " +chief+"e yonlendiriliyorsunuz");
        }
        return false;
    }
}
