package com.aksu.grup32java.ders3;

import javax.sound.midi.Soundbank;

public class ForDongusu {
    public void forDongusu() {
        for(int i=0;i<10;i++) {
            System.out.println("Indis " + i);
        }
    }

    public void TekMiCiftMi() {
        for(int i=0;i<100;i++) {
            if(i%2==0)
            System.out.println("ÇiftIndis " + i);
        }
    }

    public void UcBes() {
        for(int i=0;i<100;i++) {
            if((i%3==0)||(i%5==0))
                System.out.println("UcVeyaBesinkatı " + i);
        }
    }

    public void TamKareKök(int sayi) {
        int result=1;
        for (int i = 1; i < sayi; i++){

            if ((i * i) > sayi) {
                result=i-1;
                break;
            }
    }
        System.out.println(result);
    }
}


