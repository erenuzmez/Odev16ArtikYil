package BKosulluIfadeler;
import java.util.Scanner;
public class Odev16ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.println("Yıl giriniz:");
        yil = input.nextInt();
       if (yil%400==0){
           System.out.println(yil+" bir artık yıldır!");
       }else{
           if (yil%100!=0 && yil%4==0){
               System.out.println(yil+" bir artık yıldır!");
           }else{
               System.out.println(yil+" bir artık yıl değildir!");
           }
       }
    }
}
