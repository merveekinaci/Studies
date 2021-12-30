package DataBase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Personel İşlemlere Hoşgeldiniz");
        System.out.println("----------------");

        String islemler = "1.Yazılımcı İşlemleri\n"
                +"2.Yönetici İşlemleri\n"
                +"Çıkış İçin x e Basınız";

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println(islemler);
            System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Merve", "Kınacı", "12345", "Java ve Javascript");
                System.out.println("Yazılımcı İşlemleri : ");
                String yazilimci_islemler = "1.Format At\n"
                        +"2.Bilgileri Göster\n"
                        + "Çıkmak İçin x e basınız";

                while(true) {
                    System.out.println(yazilimci_islemler);
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                    String yazilimci_islem = scanner.nextLine();
                    if (yazilimci_islem.equals("1")) {
                        System.out.println("Lütfen Format Atmak İstediğiniz Sistemi Giriniz : ");
                        String is_sistem = scanner.nextLine();
                        yazilimci.formatAt(is_sistem);
                    }
                    else if (yazilimci_islem.equals("2")) {
                        yazilimci.bilgileriGöster();
                    }
                    else if (yazilimci_islem.equals("x")) {
                        System.out.println("Çıkıs Yapılyor...");
                        break;
                    }
                    else {
                        System.out.println("Geçersiz İşlem");
                    }
                }
            }
            else if (islem.equals("2")) {
                Yönetici yönetici = new Yönetici("Zehra", "Çelik", "5648", 500);
                System.out.println("Yönetici İşlemleri : ");
                String yönetici_islemler = "1.Zam Yap\n"
                        +"2.Bilgileri Göster\n"
                        + "Çıkış İçin x e basınız";
                while(true) {
                    System.out.println(yönetici_islemler);
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                    String yönetici_islem = scanner.nextLine();
                    if (yönetici_islem.equals("1")) {
                        System.out.println("Lütfen Zam Miktarını Giriniz : ");
                        int zam_miktar = scanner.nextInt();
                        scanner.nextLine();
                        yönetici.zamYap(zam_miktar);
                    }
                    else if (yönetici_islem.equals("2")) {
                        yönetici.bilgileriGöster();
                    }
                    else if (yönetici_islem.equals("x")) {
                        System.out.println("Çıkış Yapılıyor...");
                        break;
                    }
                    else {
                        System.out.println("Geçersiz İşlem");
                    }
                }
            }
            else if (islem.equals("x")) {
                System.out.println("Programdan Çıkış Yapılıyor");
                break;
            }
            else {
                System.out.println("Geçersiz İşlem");
            }
        }

    }
}