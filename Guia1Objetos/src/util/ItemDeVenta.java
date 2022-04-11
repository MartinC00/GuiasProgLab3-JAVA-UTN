package util;

public class ItemDeVenta {
    private int id;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public ItemDeVenta(){};
    public ItemDeVenta(int id, String descripcion, int cantidad, double precioUnitario){
        this.id=id;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        this.precioUnitario=precioUnitario;
    }

    //Methods
    public double precioTotal(){
        return this.precioUnitario*this.cantidad;
    }

    @Override
    public String toString() {
        return "ItemDeVenta[" +
                "Id=" + id +
                ", Descripcion='" + descripcion + '\'' +
                ", Cantidad=" + cantidad +
                ", Precio Unitario=" + precioUnitario +
                ", Precio total="+this.precioTotal()+
                ']';
    }

    //G&S
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
