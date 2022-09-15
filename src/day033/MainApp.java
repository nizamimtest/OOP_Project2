package day033;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
     /*   Kare kare1=new Kare(5);
        kare1.bilgiGoster();
        kare1.ciz();
        System.out.println();
        Dikdortgen dikdortgen1=new Dikdortgen(5,3);
dikdortgen1.ciz();*/

        //Bir ata sinif kendisinden turetilimis alt siniflara referans ola bilir
        Scanner input=new Scanner(System.in);
        System.out.println("Geometrik Sekiller");
        System.out.println("1.Kare");
        System.out.println("2.Dikdortgen");
        System.out.println("3.Daire");
        System.out.println("Secim : ");
        int secim= input.nextInt();
        Sekil sekil=null;
        switch (secim){
            case 1:
                System.out.print("Kenar: ");
                sekil=new Kare(input.nextDouble());
                break;
            case 2:
                System.out.print("Genislik: ");
                double genislik= input.nextDouble();
                System.out.print("Yukseklik: ");
                double yukseklik= input.nextDouble();
                sekil=new Dikdortgen(genislik,yukseklik);
                break;
            case  3:
                System.out.println("Yaricap: ");
                sekil=new Daire();
                break;
            default:
                break;
        }
        sekil.bilgiGoster();
        sekil.ciz();
        System.out.println(sekil);
        System.out.println(sekil.toString());
    }
}
