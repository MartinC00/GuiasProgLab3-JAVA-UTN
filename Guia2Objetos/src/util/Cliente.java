package util;
import org.apache.commons.lang3.RandomStringUtils;

public class Cliente {
    private String nombre;
    private String email;
    private int descuento;
    private String id = RandomStringUtils.randomAlphanumeric(10);

    public Cliente(){};

    public Cliente(String nombre, String email, int descuento){
        this.nombre=nombre;
        this.email=email;
        this.descuento=descuento;
    }

// Get & Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", descuento=" + descuento +
                ", id='" + id + '\'' +
                '}';
    }
}
