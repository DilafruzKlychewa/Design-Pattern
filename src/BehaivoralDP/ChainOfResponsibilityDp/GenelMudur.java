package BehaivoralDP.ChainOfResponsibilityDp;

public class GenelMudur extends Approver{

    public GenelMudur() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) { //limit sinirsiz

        System.out.println("Genel Mudur talebi onayladi.......");
        System.out.println("**************************************");

        return false;
    }
}
