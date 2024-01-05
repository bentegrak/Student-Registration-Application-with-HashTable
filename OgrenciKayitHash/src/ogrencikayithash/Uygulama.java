
package ogrencikayithash;

import java.util.Scanner;


public class Uygulama {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numara = 0,ort = 0;
        String ad;
        
        Hash ht = new Hash(5);
        
        int secim=menu();
        
        while(secim!=0){
            switch(secim){
                case 1:
                    System.out.println("Eklenecek Ogrencinin Numarasi:");
                    numara=scanner.nextInt();
                    System.out.println("Adi:");
                    ad=scanner.next();
                    System.out.println("Ortalamasi:");
                    numara=scanner.nextInt();
                    ht.ekle(numara,ad, ort);
                    break;
                case 2:
                    System.out.println("Silinecek Ogrencinin Numarasi:");
                    scanner.nextInt();
                    ht.sil(numara);
                    break;
                case 3:
                    ht.yazdir();
                    break;
                case 4:
                    System.out.println("Aradiginiz Ogrencinin Numarasi:");
                    numara=scanner.nextInt();
                    ht.ara(numara);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatali Secim Yaptiniz!");
                    break;
            }
        }
        
    }
    
    private static int menu(){
        Scanner scanner = new Scanner(System.in);
        
        int secim;
        System.out.println("\n1-Ogrenci Ekle");
        System.out.println("2-Ogrenci Sil");
        System.out.println("3-Ogrencileri Yazdir");
        System.out.println("4-Ogrenci Ara");
        System.out.println("0-Programi Kapat");
        System.out.println("Seciminiz:"); secim=scanner.nextInt();
        
        return secim;
    }
    
}
