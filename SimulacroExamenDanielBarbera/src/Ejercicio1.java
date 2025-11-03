import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //menu
        Scanner in = new Scanner(System.in);
        System.out.println("Selecciona una opción:");
        System.out.println("(a). Aprobados y suspendidos");
        System.out.println("(b). Billetes a Madrid");
        System.out.println("(c). Salir");
        char opcion = in.next().charAt(0);
        switch(opcion){
            case 'a':
                System.out.println("Introduce la nota del alumno: (si introduces una nota negativa se dentendra el programa)");
                double nota = in.nextInt();
                int aprpobados = 0;
                int suspendidos = 0;
                while (nota > 10){
                    //comprobar que el usuario introduce una nota valida
                    System.out.println("Has introducido una nota no valida, porfavor vuelve a introducir una nota");
                    nota = in.nextDouble();
                }
                while (nota >= 0){
                    if (nota >= 5){
                        //aprobados
                        System.out.println("Este alumno a aprobado");
                        aprpobados++;
                    }else {
                        //suspendidos
                        System.out.println("Este alumno a suspendido");
                        suspendidos++;
                    }
                    System.out.println("Introduce la nota de otro alumno, en caso de querer salir introduce una nota negativa");
                    nota = in.nextInt();
                }
                //comprobar que hay mas
               if (aprpobados > suspendidos){
                   System.out.println("hay mas aprobados que suspendidos");
               }else if (suspendidos > aprpobados){
                   System.out.println("hay mas suspendidos que aprobados");
               }else if (aprpobados == suspendidos) {
                   System.out.println("hay la misma cantidad de alumnos aprobados que suspendidos");
               }
               break;
            case 'b':
                System.out.println("Prfavor introduce el numero de personas que son para el viaje en tren:");
                int personas = in.nextInt();
                int contador = 0;
                int edad = 0;
                int contador_edad1 =0;
                int contador_edad2 =0;
                int contador_edad3=0;
                double descuento = 0;
                double tarifa = 32;
                double total = 0;
                double tarifa1 =0;
                double tarifa2 =0;
                double tarifa3 =0;
                double tarifa4= 0;

                while (contador < personas){
                    // bucle que se repite para el numero de personas que hay
                    System.out.println("Introduce la edad");
                    edad = in.nextInt();
                    if (edad >= 65){
                        //descuento personas mayor 65 años
                        descuento = tarifa * 0.1;
                        tarifa1 = tarifa - descuento;
                        if (contador_edad1 >= 1){
                            tarifa1 = tarifa1 + tarifa1;
                        }
                        contador_edad1++;
                    } else if (edad <= 15 && edad >=12) {
                        //descuento entre 15 y 12 años
                        descuento = tarifa * 0.08;
                        tarifa2 = tarifa - descuento;
                        if (contador_edad2 >=1){
                            tarifa2= tarifa2 + tarifa2;
                        }
                        contador_edad2++;
                    } else if (edad <= 11 && edad >= 4) {
                        //tarifa gratis par las edades entre 11 y 4
                        tarifa3 = 0;
                    } else if (edad >= 16 || edad <=64) {
                        //tarifa normal para el resto de edades
                        tarifa4 = tarifa;
                        if (contador_edad3 >=1){
                            tarifa4= tarifa4 + tarifa4;
                        }
                        contador_edad3++;
                    }
                    total = tarifa1 + tarifa2 + tarifa3 + tarifa4;
                    contador++;
                }
                System.out.println("El precio total es "+total);
            case 'c':
                break;
        }
    }
}
