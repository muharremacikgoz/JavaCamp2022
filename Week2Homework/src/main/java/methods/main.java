/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class main {

    public static void main(String[] args) {
        Scanner entered = new Scanner(System.in);
        int selected;
        message("Devam etmek için işlem seçiniz");
        System.out.println("1. Vize/Final Sınıf Geçme Hesapla");
        System.out.println("2. İki Sayı Toplama");
        System.out.println("3. Üç Sayı Topla");
        selected = entered.nextInt();
        switch (selected) {
            case 1:
                calculationOfClassPassingStatus();
                break;
            case 2:
                message("Sayı giriniz");
                System.out.println(sum(entered.nextInt(), entered.nextInt()));
                break;
            case 3:
                message("Sayı giriniz");
                System.out.println(sum(entered.nextInt(), entered.nextInt(), entered.nextInt()));
                break;
            default:
                message("Hatalı tuşlama yaptınız. Program kapatılıyor.");
                System.exit(0);
        }
    }

    public static void message(String message) {
        System.out.println(message);
    }

    public static void calculationOfClassPassingStatus() {
        int exam1, exam2, result;
        Scanner entered = new Scanner(System.in);
        message("Vize notu girin. (Not:Vize %30 etkilidir)");
        do {
            exam1 = entered.nextInt();
        } while (exam1 < 0 || exam1 > 100);
        message("Final notu girin. (Not:Vize %70 etkilidir)");
        do {
            exam2 = entered.nextInt();
        } while (exam2 < 0 || exam2 > 100);
        result = ((exam1 * 30 / 100) + (exam2 * 70 / 100));
        if (result > 65) {
            message("Tebrikler geçtiniz. Ortalama : " + result);
        } else {
            message("Kaldınız. Ortalama : " + result);
        }

    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int sum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }
}
