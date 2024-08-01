package StructuralDp.ProxyDP;

public class Runner {

    public static void main(String[] args) {

        RealClass realObject =new RealClass("C:\\image1.jpeg");//resim yuklendi
        System.out.println(realObject.name);
        realObject.changeFormat();


        System.out.println("-------------------Proxy--------------------");

        //otherMethod(ImageGenerator object);
        //bu metoda dogrudan realObject verirsek henuz objenin kendisine ihtiyacimiz olmadigi
        //halde gereksiz yere zaman, performans, bellek vs kullanmis oluruz. image yuklenmis olur
        //bunun yerine proxyobj kullanarak imagenin yuklenmesini/ gercek objenin uretilmesini
        // geciktirerek performansi arttirabiliriz

        ProxyClass proxyObject = new ProxyClass("C:\\image1.jpeg");// resim yuklenmedi, orijinal obje degil
        //proxyObject.name? --> gercek obje henuz olusturulmadi

        //baska islemler...

        proxyObject.showImage(); //gercek objenin metodu cagrildiginda artik real object olustu.
        //proxyObject.changeFormat --> diger metodlara erisim yok, yani orijinal
        //objenin yonetimini saglamis olduk

    }
}
