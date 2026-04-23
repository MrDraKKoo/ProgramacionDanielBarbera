package tema8;

import java.sql.*;

public class Repaso_SQL {
    public static void main(String[] args) {
        String sentenciaSQL1 ="SELECT nombre, apellido FROM Profesor";
        String sentenciaSQL2 ="SELECT nombre, apellido FROM Estudiante where fecha_nacimiento > '1980-01-01'";
        String sentenciaSQL3 ="SELECT nombre, apellido FROM Estudiante order by fecha_nacimiento ASC";
        String sentenciaSQL4 ="SELECT Casa.nombre_casa, COUNT(id_estudiante) AS numero_estudiantes FROM Estudiante inner join Casa on Casa.id_casa = Estudiante.id_casa GROUP BY Casa.nombre_casa";
        String sentenciaSQL5 ="SELECT AVG(calificacion) as nota_media, max(calificacion) as nota_maxima from Estudiante_Asignatura inner join Asignatura on Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura where Asignatura.nombre_asignatura = 'Pociones'";
        String sentenciaSQL6 ="SELECT DISTINCT anyo_curso FROM Estudiante";
        String sentenciaSQL7 ="SELECT nombre from Estudiante where apellido like 'P%'";
        String sentenciaSQL8 ="SELECT nombre, apellido from Estudiante where anyo_curso in (4, 5)";
        String sentenciaSQL9 ="SELECT nombre, apellido from Estudiante inner join Casa on Casa.id_casa = Estudiante.id_casa where Estudiante.anyo_curso = 5 AND (Casa.nombre_casa = 'Gryffindor' OR Casa.nombre_casa = 'Slytherin')";
        String sentenciaSQL10="SELECT nombre, apellido from Estudiante order by fecha_nacimiento ASC Limit 5";
        String sentenciaSQL11="SELECT Estudiante.nombre FROM Estudiante JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura WHERE Asignatura.nombre_asignatura = 'Vuelo' AND Estudiante_Asignatura.calificacion >= 8;";
        String sentenciaSQL12="INSERT INTO Estudiante (nombre, apellido, id_casa, anyo_curso, fecha_nacimiento) values ('Nymphadora', 'Tonks', 4, 7, '1973-11-25')";
        String sentenciaSQL13="UPDATE Casa SET id_jefe = (SELECT id_profesor FROM Profesor where nombre = 'Pomona' AND apellido = 'Sprout') WHERE nombre_casa = 'Hufflepuff'";
        String sentenciaSQL14="DELETE FROM Estudiante where nombre = 'Tom' AND apellido = 'Riddle'";
        String sentenciaSQL15="SELECT Estudiante.nombre, Estudiante.apellido, Casa.nombre_casa FROM Estudiante inner join Casa ON Casa.id_casa = Estudiante.id_casa";
        String sentenciaSQL16="SELECT Estudiante.nombre, Mascota.nombre_mascota, Asignatura.nombre_asignatura FROM Estudiante left join Mascota on Mascota.id_estudiante = Estudiante.id_estudiante inner join Estudiante_Asignatura on Estudiante_Asignatura.id_estudiante = Estudiante.id_estudiante inner join Asignatura on Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura";
        String sentenciaSQL17="SELECT Estudiante.nombre FROM Estudiante JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura WHERE Asignatura.nombre_asignatura = 'Encantamientos' AND Estudiante_Asignatura.calificacion > (SELECT AVG(Estudiante_Asignatura.calificacion) FROM Estudiante_Asignatura JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura WHERE Asignatura.nombre_asignatura = 'Encantamientos')";
        String sentenciaSQL18="SELECT Casa.nombre_casa FROM Casa JOIN Estudiante ON Casa.id_casa = Estudiante.id_casa JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante GROUP BY Casa.nombre_casa HAVING AVG(Estudiante_Asignatura.calificacion) > 7";
        try(Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
//EJ1
            PreparedStatement sentencia = con.prepareStatement(sentenciaSQL1)){

            ResultSet resultados = sentencia.executeQuery();

            while(resultados.next()){
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("Profesores: " + nombre + ", " + apellido);
            }

//EJ2
            PreparedStatement sentencia2 = con.prepareStatement(sentenciaSQL2);
            ResultSet resultados2 = sentencia2.executeQuery();
            while(resultados2.next()){
                String nombre = resultados2.getString("nombre");
                String apellido = resultados2.getString("apellido");
                System.out.println("Estudiante: " + nombre + ", " + apellido);
            }

//EJ3
            PreparedStatement sentencia3 = con.prepareStatement(sentenciaSQL3);
            ResultSet resultados3 = sentencia3.executeQuery();
            while(resultados3.next()){
                String nombre = resultados3.getString("nombre");
                String apellido = resultados3.getString("apellido");
                System.out.println("Estudiante: " + nombre + ", " + apellido);
            }
//EJ4
            PreparedStatement sentencia4 = con.prepareStatement(sentenciaSQL4);
            ResultSet resultados4 = sentencia4.executeQuery();
            while(resultados4.next()){
                String nombreCasa = resultados4.getString("nombre_casa");
                int num_estudiantes = resultados4.getInt("numero_estudiantes");
                System.out.println("En la casa " + nombreCasa + ", Hay " + num_estudiantes+" estudiantes");
            }
//EJ5
            PreparedStatement sentencia5 = con.prepareStatement(sentenciaSQL5);
            ResultSet resultados5 = sentencia5.executeQuery();
            while(resultados5.next()){
                int media = resultados5.getInt("nota_media");
                int max = resultados5.getInt("nota_maxima");
                System.out.println("Nota media: " + media + ", nota maxima: " + max);
            }
//EJ6
            PreparedStatement sentencia6 = con.prepareStatement(sentenciaSQL6);
            ResultSet resultados6 = sentencia6.executeQuery();
            while(resultados6.next()){
                int anyo_curso = resultados6.getInt("anyo_curso");

                System.out.println("Año del cruso: " + anyo_curso);
            }
//EJ7
            PreparedStatement sentencia7 = con.prepareStatement(sentenciaSQL7);
            ResultSet resultados7 = sentencia7.executeQuery();
            while(resultados7.next()){
                String nombre = resultados7.getString("nombre");
                System.out.println("Alumno: " + nombre );
            }
//EJ8
            PreparedStatement sentencia8 = con.prepareStatement(sentenciaSQL8);
            ResultSet resultados8 = sentencia8.executeQuery();
            while(resultados8.next()){
                String nombre = resultados8.getString("nombre");
                String apellido = resultados8.getString("apellido");
                System.out.println("Estudiante: " + nombre + " " + apellido);
            }

//EJ9
            PreparedStatement sentencia9 = con.prepareStatement(sentenciaSQL9);
            ResultSet resultados9 = sentencia9.executeQuery();
            while(resultados9.next()){
                String nombre = resultados9.getString("nombre");
                String apellido = resultados9.getString("apellido");
                System.out.println("Estudiante: " + nombre + " " + apellido);
            }

//EJ10
            PreparedStatement sentencia10 = con.prepareStatement(sentenciaSQL10);
            ResultSet resultados10 = sentencia10.executeQuery();
            while(resultados10.next()){
                String nombre = resultados10.getString("nombre");
                String apellido = resultados10.getString("apellido");
                System.out.println("Estudiante: " + nombre + " " + apellido);
            }

//EJ11
            PreparedStatement sentencia11 = con.prepareStatement(sentenciaSQL11);
            ResultSet resultados11 = sentencia11.executeQuery();
            while(resultados11.next()){
                String nombre = resultados11.getString("nombre");

                System.out.println("Estudiante: " + nombre);
            }

//EJ12
            PreparedStatement sentencia12 = con.prepareStatement(sentenciaSQL12);
            int resultados12 = sentencia12.executeUpdate();
            if (resultados12 > 0){
                System.out.println("Persona insertada: Nymphadora Tonks");
            }

//EJ13
            PreparedStatement sentencia13 = con.prepareStatement(sentenciaSQL13);
            int resultados13 = sentencia13.executeUpdate();
            if (resultados13 > 0){
                System.out.println("Casa Hufflepuff actualizada correctamente.");
            }
//EJ14
            PreparedStatement sentencia14 = con.prepareStatement(sentenciaSQL14);
            int resultados14 = sentencia14.executeUpdate();
            if (resultados14 > 0){
                System.out.println("Estudiante eliminado: Tom Riddle");
            }

//EJ15
            PreparedStatement sentencia15 = con.prepareStatement(sentenciaSQL15);
            ResultSet resultados15 = sentencia15.executeQuery();
            while(resultados15.next()){
                String nombre = resultados15.getString("nombre");
                String apellido = resultados15.getString("apellido");
                String nombre_casa = resultados15.getString("nombre_casa");
                System.out.println("Estudiante: " + nombre + " " + apellido + "de la casa: "+nombre_casa);
            }

//EJ16
            PreparedStatement sentencia16 = con.prepareStatement(sentenciaSQL16);
            ResultSet resultados16 = sentencia16.executeQuery();
            while(resultados16.next()){
                String nombre = resultados16.getString("nombre");
                String nombre_mascota = resultados16.getString("nombre_mascota");
                String nombre_asignatura = resultados16.getString("nombre_asignatura");
                System.out.println("Estudiante: " + nombre + ", nombre de las mascota: " + nombre_mascota +"Asignatura: "+ nombre_asignatura);
            }

//EJ17
            PreparedStatement sentencia17 = con.prepareStatement(sentenciaSQL17);
            ResultSet resultados17 = sentencia17.executeQuery();
            while(resultados17.next()){
                String nombre = resultados17.getString("nombre");
                System.out.println("Estudiante: " + nombre);
            }

//EJ18
            PreparedStatement sentencia18 = con.prepareStatement(sentenciaSQL18);
            ResultSet resultados18 = sentencia18.executeQuery();
            while(resultados18.next()){
                String nombre_casa = resultados18.getString("nombre_casa");
                System.out.println("Nombre de la casa: " + nombre_casa);
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

