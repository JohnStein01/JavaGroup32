package com.aksu.grup32java.ders3;

public class Ders3 {

    public void ornekMetod(){
        System.out.println("Örnek Metod Çalıştı");

    }

    public void parametreliMethod(int yas){
        int mevcutYil=2018;
        int dogumYılı=mevcutYil-yas;

        System.out.println("Doğum Yiliniz "+dogumYılı);

    }

    public int dogumYiliHesaplama(int yas){
        int mevcutYil=2018;
        int dogumYılı=mevcutYil-yas;

       return dogumYılı;
    }

}
