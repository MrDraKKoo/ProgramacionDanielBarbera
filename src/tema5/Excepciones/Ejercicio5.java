package tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int p = 0;
        int n = 0;
        boolean repetir;
        do{
            try {
                repetir = false;
                System.out.println("Introduce el numero de p: ");
                p = in.nextInt();
                imprimePositivo(p);
                System.out.println("Introduce el numero de n: ");
                n = in.nextInt();
                imprimeNegativo(n);
            } catch (InputMismatchException ex){
                System.err.println("Error: "+ex.getMessage());
                in.nextLine();
                repetir = true;
            } catch(Exception ex){
                System.err.println("Error: "+ex.getMessage());
                in.nextLine();
                repetir = true;
            }

        }while (repetir==true);
        System.out.println("Programa finalizado con exito");
    }
    public static void imprimePositivo(int p) throws Exception{
        if(p < 0){
            throw new Exception("No se permite a 'p' tener un valor negativo");
        }
    }
    public static void imprimeNegativo(int n) throws Exception{
        if(n >= 0){
            throw new Exception("No se permite a 'n' tener un valor positivo o igual a 0");
        }
    }
}