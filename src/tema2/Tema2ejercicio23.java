package tema2;

import java.util.Scanner;

public class Tema2ejercicio23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double media = 0;
        int cont = 0;
        int sumnum = 0;
        System.out.println("Dame un numero");
        int num = in.nextInt();
        while (num >=0){
          sumnum = sumnum + num;
          cont++;
          media =(double) sumnum / cont;
            System.out.println("dame otro numero");
            num = in.nextInt();
      }
        System.out.println("La media de todos los número "+ media);
    }
}
