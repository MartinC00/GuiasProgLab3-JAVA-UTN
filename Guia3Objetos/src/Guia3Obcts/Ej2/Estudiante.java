package Guia3Obcts.Ej2;

public class Estudiante extends Persona{

    private String añoIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(){
    }
    public Estudiante(String nombre, String apellido, String DNI, String direccion, String email, String añoIngreso, double cuotaMensual, String carrera){
        super(nombre, apellido, DNI, email, direccion);
        this.añoIngreso=añoIngreso;
        this.carrera=carrera;
        this.cuotaMensual=cuotaMensual;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", carrera='" + carrera + '\'' +
                "añoIngreso='" + añoIngreso + '\'' +
                ", cuotaMensual=" + cuotaMensual +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    //G&S
    public String getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(String añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
