package Guia3Objcts.Ej2;

import java.util.ArrayList;

public abstract class Persona {
     protected String nombre;
     protected String apellido;
     protected String DNI;
     protected String email;
     protected String direccion;

     public Persona(){}
     public Persona(String nombre, String apellido, String DNI, String email, String direccion){
         this.nombre=nombre;
         this.apellido=apellido;
         this.DNI=DNI;
         this.email=email;
         this.direccion=direccion;
     }



     @Override
     public String toString() {
         return "Persona{" +
                 "nombre='" + nombre + '\'' +
                 ", apellido='" + apellido + '\'' +
                 ", DNI='" + DNI + '\'' +
                 ", email='" + email + '\'' +
                 ", direccion='" + direccion + '\'' +
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

     public String getDNI() {
         return DNI;
     }

     public void setDNI(String DNI) {
         this.DNI = DNI;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public String getDireccion() {
         return direccion;
     }

     public void setDireccion(String direccion) {
         this.direccion = direccion;
     }
 }
