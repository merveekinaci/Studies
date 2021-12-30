package ArrayList;

import java.util.ArrayList;

public class Futbolcular {

    private ArrayList<String> futbolcu_list = new ArrayList<String>();


    public void futbolculariGetir() {
        for(String s : futbolcu_list) {
            System.out.println(s);
        }
    }

    public void futbolcuEkle(String isim) {
        futbolcu_list.add(isim);
        System.out.println(isim + " isimli futbolcu eklendi.");
    }

    public void futbolcuGüncelle(int pozisyon,String isim) {
        futbolcu_list.set(pozisyon, isim);
        System.out.println(isim+ " isimli futbolcu " + pozisyon + " eklendi");
    }

    public void futbolcuSil(String isim) {
       futbolcu_list.remove(isim);
    }

    public void futbolcuAra(String isim) {
        if (futbolcu_list.contains(isim)) {
            System.out.println("Futbolcu Listede Var");
            int poz = futbolcu_list.indexOf(isim);
            System.out.println("Futbolcu" + poz + " pozisyonda");
        }
        else {
            System.out.println("Futbolcu Listede Bulunmuyor.");
        }
    }
}
