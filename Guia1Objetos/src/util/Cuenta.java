package util;

public class Cuenta {

    private int id;
    private String nombre;
    private double balance;

    public Cuenta(){};
    public Cuenta(int id, String nombre, double balance){
        this.id=id;
        this.nombre=nombre;
        this.balance=balance;
    }

    //Methods
    public double credito(double monto){
        this.balance+=monto;
        return this.balance;
    }
    public double debito(double monto){
        if(this.balance<monto) System.out.println("Error, saldo insuficiente");
        else this.balance-=monto;
        return this.balance;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }

    //G&S

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
