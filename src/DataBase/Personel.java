package DataBase;

public class Personel {

    private String ad;
    private String soyad;
    private String id;

    public Personel(String ad, String soyad, String id) {
        super();
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void bilgileriGöster() {
        System.out.println("Personel Bilgileri : ");
        System.out.println("Ad : " + ad);
        System.out.println("Soy Ad : " + soyad);
        System.out.println("İd : " + id);
    }
}











