package Generic;

public class Sayisal extends Aday {

    public Sayisal(int matematik, int turkce, int fizik, int edebiyat,String isim) {
        super(matematik, turkce, fizik, edebiyat,isim);
    }

    @Override
    public int puanHesapla() {
        return getMatematik()*6+getFizik()*4+getTurkce()*3+getEdebiyat()*2;
    }
}