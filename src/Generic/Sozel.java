package Generic;

public class Sozel extends Aday {

    public Sozel(int matematik, int turkce, int fizik, int edebiyat,String isim) {
        super(matematik,turkce, fizik, edebiyat,isim);
    }

    @Override
    public int puanHesapla() {
        return getEdebiyat()*5+getTurkce()*4+getMatematik()*3+getFizik()*2;
    }
}