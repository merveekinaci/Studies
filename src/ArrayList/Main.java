package ArrayList;

public class Main {
    public static void main(String[] args) {

        Futbolcular futbolcular = new Futbolcular();
        futbolcular.futbolcuEkle("Serdar");
        futbolcular.futbolcuEkle("Mustafa");
        futbolcular.futbolcuEkle("Resul");
        futbolcular.futbolcuEkle("Ahmet");


        System.out.println("-----------------");
        futbolcular.futbolculariGetir();
        System.out.println("--------------------");
        futbolcular.futbolcuEkle("Emre");
        futbolcular.futbolcuEkle("Kaan");
        System.out.println("---------------------");
        futbolcular.futbolculariGetir();
        System.out.println("----------------------");
        futbolcular.futbolcuAra("Resul");
        System.out.println("-------------------------");
        futbolcular.futbolcuGüncelle(3, "Deniz");
        System.out.println("---------------------------");
        futbolcular.futbolculariGetir();
        System.out.println("-------------------------------");
        futbolcular.futbolcuSil("Ahmet");
        System.out.println("--------------------------");
        futbolcular.futbolculariGetir();
        System.out.println("------------------------------");
    }

}
