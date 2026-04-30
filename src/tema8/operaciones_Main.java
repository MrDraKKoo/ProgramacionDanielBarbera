package tema8;

import java.util.ArrayList;
import java.util.Scanner;

public class operaciones_Main {
    static Scanner in = new Scanner(System.in);
    static Operaciones operaciones = new Operaciones();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean finalizar = false;
        while (!finalizar){
            menu();
            int opcion = in.nextInt();
            in.nextLine();
            switch (opcion){
                case 1:
                    listarAsignaturas();
                    break;
                case 2:
                    estudiantePorCasa();
                    break;
                case 3:
                    mascoteEstudiante();
                    break;
                case 4:
                    numeroEstudiantePorCasa();
                    break;
                case 5:
                    nuevaAsignatura();
                    break;
                case 6:
                    modificarAula();
                    break;
                case 7:
                    eliminarAsignatura();
                    break;
            }
        }
    }
    public static void menu(){
        System.out.println("\n1. Listar todas las Asignaturas");
        System.out.println("2. Consulta de estudiantes por casa");
        System.out.println("3. Obtener la mascota de un estudiante específico");
        System.out.println("4. Número de estudiantes por casa");
        System.out.println("5. Insertar una nueva asignatura");
        System.out.println("6. Modificar el aula de una asignatura");
        System.out.println("7. Eliminar una asignatura");
        System.out.println("Que función quieres realizar?");

    }
    public static void listarAsignaturas() {
        ArrayList<Asignatura> listaAsignatura = operaciones.listado();

        System.out.println("Listado de asignaturas:");
        for (Asignatura a : listaAsignatura) {
            System.out.println("ID: " + a.getId() + " , Nombre: " + a.getNombre_asignatura());
        }
    }
    public static void estudiantePorCasa (){
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
        System.out.println("Introduce el nombre:");
        String nombre = in.nextLine();
        System.out.println("introduce el apellido:");
        String apellido = in.nextLine();
        operaciones.mascotaEstudiante(nombre, apellido);
    }
    public static void numeroEstudiantePorCasa (){
        operaciones.numEstudiantesPorCasa();
    }
    public static void nuevaAsignatura (){
        operaciones.nuevaAsignatura();
    }
    public static void modificarAula (){
        System.out.println("Introduce el id para actualizar su aula:");
        int id = in.nextInt();
        in.nextLine();
        System.out.println("Introduce el nombre para la nueva aula:");
        String nueva_aula = in.nextLine();
        operaciones.modificarAula(id,nueva_aula);
    }
    public static void eliminarAsignatura (){
        operaciones.eliminarAsignatura();
    }
}

