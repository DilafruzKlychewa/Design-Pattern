package BehaivoralDP.MediatorDP;

public class Runner {
    public static void main(String[] args) {

        //oncelikli arabulucu objemizi olusturalim
        MessageMediator mediator=new MessageMediator();

        //katilimcilari olusturalim
        Actor actor1 = new Professor("Prof. Math",mediator);
        Actor actor2 =new Professor("Prof.Chem", mediator);
        Actor actor3 =new Professor("Prof. IT", mediator);

        //katilimcilar uzman olduklari konu ile kayit olmali
        mediator.register("Math",actor1);
        mediator.register("Chem",actor2);
        mediator.register("IT",actor3);

        //katilimcilar sorularini iletsin
        System.out.println("Prof.Math sorularini soruyor........");
        actor1.sendMessage("Chem", "Kimya nedir?");
        actor1.sendMessage("IT", "Yazilimci olmak keyifli mi??");

        System.out.println();

        System.out.println("Prof.IT sorularini soruyor........");
        actor3.sendMessage("Math", "Matematik gercek hayatta ne isimize yarar");
    }
}
