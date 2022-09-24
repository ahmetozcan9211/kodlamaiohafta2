package reCapDemo_Classes;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int toplamSonuc =dortIslem.Topla(2,3);
        int carpimSonuc =dortIslem.Carp(2,3);
        int cikarmaSonuc =dortIslem.Cikar(2,3);
        int bolumSonuc = (dortIslem.Bol(2, 3));
        System.out.println(toplamSonuc);
        System.out.println(cikarmaSonuc);
        System.out.println(carpimSonuc);
        System.out.println(bolumSonuc);



    }
}
