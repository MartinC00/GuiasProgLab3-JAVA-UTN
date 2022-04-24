package Guia3Objcts.Ej2;

import java.util.ArrayList;

public class Staff extends Persona{

    private double salario;
    private String turno;

    public Staff(){}
    public Staff(String nombre, String apellido, String DNI, String email, String direccion, double salario, String turno){
        super(nombre, apellido, DNI, email, direccion);
        this.salario=salario;
        this.turno=turno;
    }

    public double salarioAnual(){
        return salario*12;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", salario=" + salario +
                ", turno='" + turno + '\'' +
                '}';
    }

    //G&S
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
