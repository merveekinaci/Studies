package Generic;

public abstract class Aday {
    private int matematik;
    private int turkce;
    private int fizik;
    private int edebiyat;
    private String isim;

    public Aday(int matematik, int turkce, int fizik, int edebiyat,String isim) {
        this.matematik = matematik;
        this.turkce = turkce;
        this.fizik = fizik;
        this.edebiyat = edebiyat;
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public int getMatematik() {
        return matematik;
    }
    public int getTurkce() {
        return turkce;
    }
    public int getFizik() {
        return fizik;
    }
    public int getEdebiyat() {
        return edebiyat;
    }

    public abstract int puanHesapla();

}

