package methods;

public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();

        sayiBulmaca();

        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();


    }

    public static void sayiBulmaca() {
        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int aranacaksayi = 7;
        boolean varmi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacaksayi) {
                varmi = true;
                break;

            }
        }
        if (varmi) {
            mesajVer(aranacaksayi);

        } else {
            System.out.println("bulunamadı");
        }
    }

    public static void mesajVer(int aranacak){

        System.out.println(aranacak + " sayisi mevcut");

    }
}
