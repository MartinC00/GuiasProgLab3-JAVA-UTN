package Objects.Ejercicio3;

import java.util.Arrays;

public class Cuenta {

    private String ID;
    private double balance;
    private ClienteCuenta clienteCuenta;
    private double [] registroOperaciones;


    public Cuenta(){};
    /*
    Constructor incompatible con inciso e) (implementacion registro de operaciones)
    public Cuenta(String ID, double balance, ClienteCuenta clienteCuenta){
        this.ID=ID;
        this.balance=balance;
        this.clienteCuenta=clienteCuenta;
    }
     */
    public Cuenta(String ID, double balance, ClienteCuenta clienteCuenta, double []registroOperaciones){
        this.ID=ID;
        this.balance=balance;
        this.clienteCuenta=clienteCuenta;
        this.registroOperaciones=registroOperaciones;
    }

    public void guardarRegistro(double monto){
        int i=0;
            while(i<registroOperaciones.length && registroOperaciones[i]!=0){
                i++;
            }
            if(i<registroOperaciones.length) registroOperaciones[i]=monto;
        }

    public double Depositar(double deposito){
        setBalance(getBalance()+deposito);
        guardarRegistro(deposito);
        return getBalance();
    }
    public double Extraer(double extraccion){
        if(getBalance()>=extraccion){
            setBalance(getBalance()-extraccion);
            guardarRegistro(-extraccion);
        }
        else{
            System.out.println("El saldo es insuficiente para realizar la extraccion, por favor revise el monto y reintente.");
        }
        return getBalance();
    }
    public double ExtraerDeudor(double extraccion){
        if(getBalance()-extraccion>= -2000){
            setBalance(getBalance()-extraccion);
            guardarRegistro(-extraccion);
        }
        else{
            System.out.println("El saldo es insuficiente para realizar la extraccion, por favor revise el monto y reintente.");
        }
        return getBalance();
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ClienteCuenta getClienteCuenta() {
        return clienteCuenta;
    }

    public void setClienteCuenta(ClienteCuenta clienteCuenta) {
        this.clienteCuenta = clienteCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "ID='" + ID + '\'' +
                ", balance=" + balance +
                ", clienteCuenta=" + clienteCuenta +
                ", registroOperaciones=" + Arrays.toString(registroOperaciones) +
                '}';
    }
}
