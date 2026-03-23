package tema7.Ejercicios_B_Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pi = "";
        System.out.println("Que numero quieres buscar en el millon de PI ?");
        String numeroBusca = in.nextLine();
        int tamanyo = numeroBusca.length();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/danbartor/Documents/ejBficheros/pi-million.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                pi = pi + linea;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        boolean encontrado = false;
        int i = 0;
        while (i <= pi.length() - tamanyo && !encontrado) {

            String trozo = pi.substring(i, i + tamanyo);

            if (trozo.equals(numeroBusca)) {
                encontrado = true;
                System.out.println("Tu numero ha sido encontrado en la posición " + i);
            } else {
                i++;
            }
        }
    }
}
