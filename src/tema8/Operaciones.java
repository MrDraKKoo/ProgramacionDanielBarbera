package tema8;

import java.sql.*;
import java.util.ArrayList;

public class Operaciones {
    String endpoint = "ad-postgres.cbt3zbtbmxet.us-east-1.rds.amazonaws.com";
    String puerto = "5432";
    String bd = "hogwarts";
    String usuario = "postgres";
    String contrasenya = "12345678";
    String url = "jdbc:postgresql://" + endpoint + ":" + puerto + "/" + bd;

    String sentenciaSQL1 = "SELECT id_asignatura, aula, nombre_asignatura, obligatoria FROM Asignatura";

    public ArrayList<Asignatura> listado() {
        ArrayList<Asignatura> listado2 = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(url, usuario, contrasenya);
             PreparedStatement sentencia = con.prepareStatement(sentenciaSQL1)){

            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                Asignatura asig = new Asignatura();
                asig.setId(resultados.getInt("id_asignatura"));
                asig.setAula(resultados.getString("aula"));
                asig.setNombre_asignatura(resultados.getString("nombre_asignatura"));
                asig.setObligatoria(resultados.getBoolean("obligatoria"));
                listado2.add(asig);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();        }
        return listado2;
    }

    public ArrayList<String> EstudiantesPorCasa(String casa) {
        ArrayList<String> lista = new ArrayList<>();
        String sentenciaSQL = "SELECT nombre, apellido FROM Estudiante inner join Casa on Casa.id_casa = Estudiante.id_casa WHERE Casa.nombre_casa = '" + casa + "'";

        try (Connection con = DriverManager.getConnection(url, usuario, contrasenya);
             PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){

            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                lista.add(resultados.getString("nombre") + " " + resultados.getString("apellido"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    public void mascotaEstudiante(String nombre, String apellido){
        String sentenciaSQL = "SELECT nombre_mascota FROM Mascota inner join Estudiante on Estudiante.id_estudiante = Mascota.id_estudiante WHERE Estudiante.nombre = '" + nombre + "' AND Estudiante.apellido = '"+apellido+"'";

        try (Connection con = DriverManager.getConnection(url, usuario, contrasenya);
             PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){

            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre_mascota = resultados.getString("nombre_mascota");
                System.out.println("Nombre de la mascota: "+nombre_mascota);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void numEstudiantesPorCasa(){
        String sentenciaSQL = "SELECT Casa.nombre_casa, count(id_estudiante) as numeroEstudiante FROM Estudiante inner join Casa on Casa.id_casa = Estudiante.id_casa GROUP BY Casa.id_casa";

        try (Connection con = DriverManager.getConnection(url, usuario, contrasenya);
             PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){

            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre_casa = resultados.getString("nombre_casa");
                int numero_estudiantes = resultados.getInt("numeroEstudiante");
                System.out.println(nombre_casa +": "+numero_estudiantes+" estudiantes");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void nuevaAsignatura (int id_asignatura, String nombre_asignatura, String aula, boolean obligatoria){
        String sentenciaSQL = "INSERT INTO Asignatura (id_asignatura, nombre_asignatura, aula, obligatoria) VALUES ("+id_asignatura + ", '" + nombre_asignatura + "', '" + aula + "', " + obligatoria + ")";        try (Connection con = DriverManager.getConnection(url, usuario, contrasenya);
             PreparedStatement sentenciaSQL1 = con.prepareStatement(sentenciaSQL)){
        int resultados = sentenciaSQL1.executeUpdate();
            if (resultados > 0){
                System.out.println("Asignatura insterada con éxito");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void modificarAula(){

    }
    public void eliminarAsignatura(){

    }
}
