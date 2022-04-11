package util;

public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Autor(){};

    public Autor(String nombre, String apellido, String email, char genero){
        this.nombre = nombre;
        this.apellido=apellido;
        this.email=email;
        this.genero=genero;
    }



    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", genero=" + genero +
                '}';
    }

    //G&S
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

}
