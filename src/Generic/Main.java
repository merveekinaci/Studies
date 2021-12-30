package Generic;

public class Main {

    public static void main(String[] args) {

        Sayisal s1 = new Sayisal(10, 20, 30, 40, "Cansu");
        Sayisal s2 = new Sayisal(15, 25, 35, 45, "Kübra");
        Sayisal s3 = new Sayisal(20, 30, 40, 50, "Zeynep");
        Sayisal saybir = birinci(s1, s2, s3);
        System.out.println("Sayısal Birincisi : " + saybir.getIsim()+ " dir. Puanı : " + saybir.puanHesapla());

        Sozel so1 = new Sozel(5, 10, 15, 20, "Serdar");
        Sozel so2 = new Sozel(3, 5, 7, 9, "Emre");
        Sozel so3 = new Sozel(45, 26, 14, 27, "Ahmet");
        Sozel sozbir = birinci(so1, so2, so3);
        System.out.println("Sözel Birincisi : " + sozbir.getIsim() + " dir. Puanı : " + sozbir.puanHesapla());

    }
    public static <A extends Aday> A birinci(A a1,A a2,A a3) {
        if (a1.puanHesapla()>a2.puanHesapla() && a1.puanHesapla()>a3.puanHesapla()) {
            return a1;
        }
        else if (a2.puanHesapla()>a1.puanHesapla() && a2.puanHesapla()>a3.puanHesapla()) {
            return a2;
        }
        else {
            return a3;
        }
    }
}
