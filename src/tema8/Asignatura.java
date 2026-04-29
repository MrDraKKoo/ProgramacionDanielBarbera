package tema8;

public class Asignatura {
    private int id_asignatura;
    private String nombre_asignatura;
    private String aula;
    private boolean obligatoria;

    private final int DEFAULT_ID = 1;
    private final String DEFAUL_NOMBREASIGNATURA = "Pociones";
    private final String DEFAULT_AULA= "Mazmorras";
    private final boolean DEFAULT_OBLIGATORIA = true;

    public Asignatura (int id_asignatura, String nombre_asignatura, String aula, boolean obligatoria){
        this.id_asignatura = id_asignatura;
        this.nombre_asignatura = nombre_asignatura;
        this.aula = aula;
        this.obligatoria = obligatoria;
    }
    public Asignatura (){
        this.id_asignatura = DEFAULT_ID;
        this.nombre_asignatura = DEFAUL_NOMBREASIGNATURA;
        this.aula = DEFAULT_AULA;
        this.obligatoria = DEFAULT_OBLIGATORIA;
    }

    public int getId() {
        return id_asignatura;
    }

    public void setId(int id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public String getNombre_asignatura() {
        return nombre_asignatura;
    }

    public void setNombre_asignatura(String nombre_asignatura) {
        this.nombre_asignatura = nombre_asignatura;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public boolean isObligatoria() {
        return obligatoria;
    }

    public void setObligatoria(boolean obligatoria) {
        this.obligatoria = obligatoria;
    }

}
