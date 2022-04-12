package Objects.Ejercicio2;

public class Empleado {

    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(){};
    public Empleado(String nombre, String apellido, int dni, double salario) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.salario=salario;
    }

    //Methods
    public double salarioAnual(){
        return this.salario*12;
    }

    public void aumentaSalario(int porcentaje){ this.salario += this.salario*porcentaje/100; }

    @Override
    public String toString() {
        return "Empleado[" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                ']';
    }

    //G&S

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
