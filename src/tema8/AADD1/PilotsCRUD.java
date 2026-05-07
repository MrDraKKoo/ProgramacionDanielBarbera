package tema8.AADD1;

import java.sql.*;
import java.util.ArrayList;

public class PilotsCRUD {
    String endpoint = "ad-postgres.cbt3zbtbmxet.us-east-1.rds.amazonaws.com";
    String puerto = "5432";
    String bd = "hogwarts";
    String usuario = "postgres";
    String contrasenya = "12345678";
    String url = "jdbc:postgresql://" + endpoint + ":" + puerto + "/" + bd;

    String sentenciaSQL1 = "SELECT id_asignatura, aula, nombre_asignatura, obligatoria FROM Asignatura";

    //
    public ArrayList<Pilot> readPilots (){
        ArrayList<Pilot> lista_pilot = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(url, usuario, contrasenya);
            PreparedStatement sentencia = con.prepareStatement(sentenciaSQL1)){
            ResultSet resultados = sentencia.executeQuery();
             while (resultados.next()){
                 Pilot pilot = new Pilot();
                 pilot.setDriverid(resultados.getInt("driverid"));
                 pilot.setCode(resultados.getString("code"));
                 pilot.setForename(resultados.getString("forename"));
                 pilot.setSurname(resultados.getString("surname"));
                 pilot.setDob(resultados.getString("dob"));
                 pilot.setNationally(resultados.getString("nationally"));
                 pilot.setUrl(resultados.getString("url"));
                 lista_pilot.add(pilot);
             }

        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista_pilot;
    }
}
