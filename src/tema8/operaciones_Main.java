package tema8;

import java.util.ArrayList;
import java.util.Scanner;

public class operaciones_Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean finalizar = false;
        while (!finalizar){
            menu();
            int opcion = in.nextInt();
            in.nextLine();
            switch (opcion){
                case 0:
                    listarAsignaturas();
                    break;
                case 1:
                    estudiantePorCasa();
                    break;
                case 2:
                    mascoteEstudiante();
                    break;
                case 3:
                    numeroEstudiantePorCasa();
                    break;
                case 4:
                    nuevaAsignatura();
                    break;
                case 5:
                    modificarAula();
                    break;
                case 6:
                    eliminarAsignatura();
                    break;
            }
        }
    }
    public static void menu(){
        System.out.println("\n0. Listar todas las Asignaturas");
        System.out.println("1. Consulta de estudiantes por casa");
        System.out.println("2. Obtener la mascota de un estudiante específico");
        System.out.println("3. Número de estudiantes por casa");
        System.out.println("4. Insertar una nueva asignatura");
        System.out.println("5. Modificar el aula de una asignatura");
        System.out.println("6. Eliminar una asignatura");
        System.out.println("Que quieres ver:");

    }
    public static void listarAsignaturas() {
        Operaciones operaciones = new Operaciones();
        ArrayList<Asignatura> listaAsignatura = operaciones.listado();

        System.out.println("Listado de asignaturas:");
        for (Asignatura a : listaAsignatura) {
            System.out.println("ID: " + a.getId() + " , Nombre: " + a.getNombre_asignatura());
        }
    }
    public static void estudiantePorCasa (){
        Scanner in = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();

        System.out.print("¿De qué casa quieres ver los estudiantes? (ej: Gryffindor): ");
        String casa = in.nextLine();

        ArrayList<String> listaAlumnos = operaciones.EstudiantesPorCasa(casa);

        System.out.println("Estudiantes de " + casa);

        if (listaAlumnos.isEmpty()) {
            System.out.println("No se han encontrado alumnos en esa casa. (Revisa si la escribiste bien)");
        } else {
            for (String nombreCompleto : listaAlumnos) {
                System.out.println(nombreCompleto);
            }
        }
    }
    public static void mascoteEstudiante (){
        Scanner in = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        System.out.println("Introduce el nombre:");
        String nombre = in.nextLine();
        System.out.println("introduce el apellido:");
        String apellido = in.nextLine();
        operaciones.mascotaEstudiante(nombre, apellido);
    }
    public static void numeroEstudiantePorCasa (){
        Operaciones operaciones = new Operaciones();
        operaciones.numEstudiantesPorCasa();
    }
    public static void nuevaAsignatura (){
        Scanner in = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();

        System.out.println("Introduce la id para la nueva Asignatura:");
        int id = in.nextInt();
        in.nextLine();
        System.out.println("Introduce el nombre de la Asignatura");
        String nombre = in.nextLine();
        System.out.println("Introuce el aula");
        String aula = in.nextLine();
        System.out.println("Introdue true en caso de que sea obligatorio, en caso de no serlo introduce false");
        boolean obligatoria = in.nextBoolean();
        operaciones.nuevaAsignatura(id,nombre, aula, obligatoria);
    }
    public static void modificarAula (){

    }
    public static void eliminarAsignatura (){

    }
}

