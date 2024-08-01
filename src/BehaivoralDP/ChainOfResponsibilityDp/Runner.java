package BehaivoralDP.ChainOfResponsibilityDp;

public class Runner {
    public static void main(String[] args) {


        Approver genelMudur=new GenelMudur();
        Approver mudur=new Mudur(genelMudur);
        Approver memur=new Memur(mudur);

        System.out.println("Kredi onaylama limitleri: ");
        System.out.println("Memur max. : 5000");
        System.out.println("Mudur max. : 100000");
        System.out.println("Genel mudur : limit yok");

        System.out.println("-------------------------");
        System.out.println("Musterinin memurdan talep ettigi miktar : 1000");
        memur.approveLoan(1000);

        System.out.println("-------------------------");
        System.out.println("Musterinin memurdan talep ettigi miktar : 1000");
        memur.approveLoan(7000);

        System.out.println("-------------------------");
        System.out.println("Musterinin memurdan talep ettigi miktar : 1000");
        memur.approveLoan(17000);


        //DP kullanmamis olsaydik tek tek objelerimize talepte bulunmak zorunda kalacaktik..
       // memur.approveLoan(17000); //memurun limitini asar
        //mudur.approveLoan(17000); //mudurun limitini asar
         //genelMudur.approveLoan(17000); //onayladi

    }
}
