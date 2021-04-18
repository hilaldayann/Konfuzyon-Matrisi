/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication73;

import java.util.Scanner;

/**
 *
 * @author Hilal
 */
public class JavaApplication73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner deger = new Scanner(System.in);
        int [][] dizi = new int[2][2];
        
        System.out.println("Lütfen Sizden İstenilen Değerleri Giriniz ! ");
        System.out.print("True Positive [0][0] : ");
        dizi [0][0] = deger.nextInt();
        System.out.print("False Negative [0][1] : ");
        dizi [0][1] = deger.nextInt();
        System.out.print("False Positive [1][0] : ");
        dizi [1][0] = deger.nextInt();
        System.out.print("True Negative [1][1] : ");
        dizi [1][1] = deger.nextInt();
        
        System.out.println("Konfüzyon Matrisi");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("PERFORMANS ÖLÇÜTLERİ"); 
        
        performansHesapla(dizi [0][0], dizi [0][1],  dizi [1][0] , dizi [1][1]);
        
    }
     public static double performansHesapla(double True_Positive, double False_Negative, double False_Positive,double True_Negative){
        double dogruluk;
        dogruluk = (True_Positive + True_Negative ) / (True_Positive + True_Negative + False_Negative + False_Positive);
        System.out.println("1.Doğruluk : " + dogruluk);
        
        double kesinlik;
        kesinlik = True_Positive / (True_Positive + False_Positive);
        System.out.println("2.Kesinlik : " + kesinlik);
        
        double hassasiyet;
        hassasiyet = True_Positive / (True_Positive + False_Negative);
        System.out.println("3.Hassasiyet : " + hassasiyet);
        
        double f_skor;
        f_skor = (2 * kesinlik * hassasiyet) / (kesinlik + hassasiyet);
        System.out.println("4.F-Skor : " + f_skor);
        
        return 0;
     }
}
