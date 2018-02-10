package com.aksu.grup32java.ders3;

import com.aksu.grup32java.ders3.Ders3;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {

        Ders3 ders3 = new Ders3();
        ders3.ornekMetod();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz");
        int yas = scanner.nextInt();
        ders3.parametreliMethod(yas);

        int geriDonenDeger=ders3.dogumYiliHesaplama(yas);
        System.out.println(geriDonenDeger);

    }
}
