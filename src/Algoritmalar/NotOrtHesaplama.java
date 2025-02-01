package Algoritmalar;

import java.util.Scanner;

public class NotOrtHesaplama {
    public static void main(String[] args) {
        System.out.println("Ortalama Hesaplama");
        Scanner input = new Scanner(System.in);
        double turkce, matematik, fizik, kimya, biyoloji, tarih;
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextDouble();
        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextDouble();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextDouble();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextDouble();
        System.out.print("Biyoloji notunuzu giriniz: ");
        biyoloji = input.nextDouble();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextDouble();

        double toplam = turkce + matematik + fizik + kimya + biyoloji + tarih;
        double ortalama = toplam / 6;
        String sonuc = (ortalama < 60) ? "Geçemedin!" : "Geçtin!";
        System.out.println("Ortalama notunuz: " + ortalama);
        System.out.println("Geçme notu 60.");
        System.out.println(sonuc);
    }
}
