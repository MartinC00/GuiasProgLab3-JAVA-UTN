package Objects.Ejercicio3;

public class ClienteCuenta {

    private String nombre;
    private String ID;
    private char genero;

    public ClienteCuenta(){};
    public ClienteCuenta(String nombre, String ID, char genero){
        this.nombre=nombre;
        this.ID=ID;
        this.genero=genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "ClienteCuenta{" +
                "nombre='" + nombre + '\'' +
                ", ID='" + ID + '\'' +
                ", genero=" + genero +
                '}';
    }
}
