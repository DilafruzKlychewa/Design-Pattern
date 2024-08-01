package StructuralDp.CompositeDP;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        //tum calisanlari listele

        Finance finance =new Finance();
        Sales sales =new Sales();
        //Yeni bir department olusturduk
        Arge arge = new Arge();

        List<String> allEmployees=new ArrayList<>();

        finance.getEmployees().forEach(t->allEmployees.add(t));
        sales.getEmployees().forEach(t->allEmployees.add(t));
        //yeni bir departman olusturduk
        arge.getEmployees().forEach(t->allEmployees.add(t));

        System.out.println(allEmployees);//yukardaki sistem genelde tercih edilmiyor.


        System.out.println("------------------Composite DP-------------------------");

        //tum calisanlari listele (amacim bu)
        HeadDepartment head =new HeadDepartment();
        head.addDepartment(finance);
        head.addDepartment(sales);
        //Yeni bir department olusturduk
        head.addDepartment(arge);

        System.out.println("Tum departmanlar : "+head.getName());
        System.out.println("Tum calisanlar : "+head.getEmployees());

    }
}
