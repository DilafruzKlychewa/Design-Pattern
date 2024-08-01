package StructuralDp.ProxyDP;

public class ProxyClass implements ImageGenerator{

    private RealClass realClass;
    public String fullpath;

    public ProxyClass(String fullpath) {
        this.fullpath = fullpath;
    }

    @Override
    public void showImage() {

        if(realClass==null){//burada yetkilendirme de yapilabilir
            this.realClass=new RealClass(fullpath);
        }

        realClass.showImage();


    }
}
