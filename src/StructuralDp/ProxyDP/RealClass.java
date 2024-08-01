package StructuralDp.ProxyDP;

public class RealClass implements ImageGenerator{

    public String fullpath;

    public String name;

    public RealClass(String fullpath) {
        this.fullpath = fullpath;
        this.name= "resim";
        loadImage();//obje olusturuldugunda databaseden image yuklensin
    }



    @Override
    public void showImage() {
        System.out.println(this.name+ " gosteriliyor.... path: " +this.fullpath);

    }



    public void loadImage(){
        System.out.println("resim yukleniyor........");
    }

    //ekstra diger metodlar
    public void changeFormat(){
        //burada bagimli diger objeler kullaniliyor

    }
}
