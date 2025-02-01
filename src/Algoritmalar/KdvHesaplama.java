package Algoritmalar;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //0 ila 1000 tl arasında ise kdv %18, 1000 tl üzerinde ise kdv %8 olarak hesaplanacak.
        System.out.print("Ürünün kdv siz fiyatını girin: ");
        double fiyat = input.nextDouble();
        double kdv;
        if (fiyat <= 1000) {
            kdv = (fiyat / 100) * 18;
            System.out.println("KDV tutarı: " + kdv);
            System.out.println("KDV'li ürün fiyatı: " + (fiyat + kdv));
        }else {
            kdv = (fiyat / 100) * 8;
            System.out.println("KDV tutarı: " + kdv);
            System.out.println("KDV'li ürün fiyatı: " + (fiyat + kdv));
        }
    }
}
