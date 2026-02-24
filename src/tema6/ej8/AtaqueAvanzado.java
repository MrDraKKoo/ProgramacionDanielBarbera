package tema6.ej8;
enum tipo{
    FISICO, MAGICO
}
public interface AtaqueAvanzado {
    void lanzar();
    double coste();
    double danyoInflingido();
}
