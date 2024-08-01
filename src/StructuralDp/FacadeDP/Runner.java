package StructuralDp.FacadeDP;

public class Runner {
    public static void main(String[] args) {

        String text = "Design Pattern";

        AES_Enc aesEnc= new AES_Enc();
        aesEnc.encrypt((text));

        SHA_Enc shaEnc = new SHA_Enc();
        shaEnc.encrypt(text, "techpro");

        MD5_Enc md5Enc=new MD5_Enc();
        md5Enc.encrypt(text, "techpro", true);

        //yukardaki karmasiki yapidir bunu cok kullanmiyoruz.

        //------------------------------------------------------------
        //bir arayuz olsa sadece kullanmak istedigimiz algoritmayi secerek
        //bu algoritmanin encrypt metodunun datayi veya gereklilikleri ile ilgilenmeden
        //sifreleme yapabilsek daha guzel olur.


        System.out.println("---------------------FacadeDP--------------------");

        EncryptorFacade encryptor=new EncryptorFacade();
        encryptor.encrypt(text, EncryptorType.AES);
        encryptor.encrypt(text, EncryptorType.SHA);
        encryptor.encrypt(text, EncryptorType.MD5);



    }
}
