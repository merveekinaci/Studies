package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> kitaplar = new LinkedList<String>();
        kitaplar.add("Savaş ve Barış");
        kitaplar.add("Suç ve Ceza");
        kitaplar.add("1984");
        kitaplar.add("Bülbülü Öldürmek");
        kitaplar.add("Amok koşucusu");
        listeyiGoster(kitaplar);

        for(String s : kitaplar) {
            System.out.println(s);
        }
    }
    public static void listeyiGoster(LinkedList<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

