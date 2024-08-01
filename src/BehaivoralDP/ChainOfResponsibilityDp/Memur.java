package BehaivoralDP.ChainOfResponsibilityDp;

public class Memur extends Approver{


    public Memur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {//5000

        if (amount<=5000){
            System.out.println("Memur talebi onayladi. ");
            System.out.println("*************************");
            return true;

        }else if(chief!=null){
            System.out.println("Miktar memurun limitini asiyor, talep"+chief+" e yonlendiriliyor.");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
