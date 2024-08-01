package BehaivoralDP.ChainOfResponsibilityDp;

public abstract class Approver {

    public Approver chief;

    public Approver(Approver chief) {
        this.chief = chief;
    }

    //onaylanabilecek kredi limitine gore
    //kredi onaylarsa true aksi false donduren metod

    abstract boolean approveLoan(int amount);

}
