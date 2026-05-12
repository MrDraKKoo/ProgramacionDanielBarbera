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

    public void añadirPiloto (int driverid, String code, String forename, String surname, String dob, String nationally, String url) throws SQLException {
        String sentenciaSQL1 = "INSERT INTO drivers (driverid, code, forename, surname, dob, nationally, url) VALUES ('" + driverid + "','" + code + "', '" +forename+"'.'"+surname+"','"+dob+"','"+nationally+"', '"+url+"')";
        try (Connection con = DriverManager.getConnection(url, usuario, contrasenya);
        PreparedStatement sentencia = con.prepareStatement(sentenciaSQL1)){
            int resultados = sentencia.executeUpdate();
            if (resultados > 0) {
                System.out.println("Piloto insertado exitosamente");
            }else  {
                System.out.println("Piloto insertado no exitosamente");
            }
        }
    }

    public void readPilot (int driverid) {
        String sentenciaSQL1 = "SELECT forename, surname,  FROM drivers WHERE driverid='" + driverid + "'";
        try (Connection con = DriverManager.getConnection(url, usuario, contrasenya);
             PreparedStatement sentencia = con.prepareStatement(sentenciaSQL1)) {
            ResultSet resultados = sentencia.executeQuery();
            while (resultados.next()) {
                String forename = resultados.getString("forename");
                String surname = resultados.getString("surname");
                System.out.println("Nombre del piloto: " + forename + " " + surname);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
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
    public void updatePilot (int driverid, String forename) {
        String sentenciaSQL1 = "UPDATE drivers SET forename='"+forename+"' WHERE driverid='"+driverid+"'";
        try (Connection con = DriverManager.getConnection(url, usuario, contrasenya);
             PreparedStatement sentencia = con.prepareStatement(sentenciaSQL1)) {
            int resultados = sentencia.executeUpdate();
            if (resultados > 0) {
                System.out.println("Piloto actualizado exitosamente");
            }else   {
                System.out.println("Piloto actualizado no exitosamente");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void deletePilot (int driverid){
        String sentenciaSQL1 = "DELETE FROM drivers WHERE driverid='" + driverid + "'";
        try (Connection con = DriverManager.getConnection(url, usuario, contrasenya);
             PreparedStatement sentencia = con.prepareStatement(sentenciaSQL1)) {
            int resultados = sentencia.executeUpdate();
            if (resultados > 0) {
                System.out.println("Piloto eliminado exitosamente");
            }else   {
                System.out.println("Piloto eliminado no exitosamente");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void showPilotClassification() {
        String sentenciaSQL1 = "SELECT drivers.forename, drivers.surname, SUM(results.points) AS puntos from drivers inner join results on results.driverid = drivers.deriverid order by putnos DESC)";
        try (Connection con = DriverManager.getConnection(url, usuario, contrasenya);
             PreparedStatement sentencia = con.prepareStatement(sentenciaSQL1)) {
            ResultSet resultados = sentencia.executeQuery();
            while (resultados.next()) {
                String forename = resultados.getString("forename.drivers");
                String surname = resultados.getString("surname.drivers");
                int puntos = resultados.getInt("puntos");
                System.out.println("Driver: " + forename + " " + surname + ": puntos: " + puntos);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void showBuildersClassification () {
        String sentenciaSQL1 = "SELECT construtors.name, SUM(results.points) AS puntos FROM results inner join drivers on drivers.driverid = results.driverid inner join constructors on constructors.constructorid = drivers.construcotrid group by constructor.name order by puntos DESC";
        try (Connection con = DriverManager.getConnection(url, usuario, contrasenya);
             PreparedStatement sentencia = con.prepareStatement(sentenciaSQL1)) {
            ResultSet resultados = sentencia.executeQuery();
            while (resultados.next()) {
                String forename = resultados.getString("forename.drivers");
                String surname = resultados.getString("surname.drivers");
                int puntos = resultados.getInt("puntos");
                System.out.println("Driver: " + forename + " " + surname + ": puntos: " + puntos);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
