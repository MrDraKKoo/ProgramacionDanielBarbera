package Ejercicio2;

import Ejercicio1.Libro;

import javax.naming.PartialResultException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Tragaperras {
    public static void main(String[] args) {
        List<Cartera> carteras = new ArrayList<>();

        Billete billete1 = new Billete(5);
        //carteras.add(billete1.getValor());

        Billete billete2 = new Billete(10);
        //carteras.add(billete2.getValor());


        Billete billete3 = new Billete(20);
        //carteras.add(billete3.getValor());

        Tarjeta tarjeta1 = new Tarjeta("1234", 100, 50);
        //carteras.add(tarjeta1.valor());

        Tarjeta tarjeta2 = new Tarjeta("6789", 250, 15);
        //carteras.add(tarjeta2.valor());
    }
}
