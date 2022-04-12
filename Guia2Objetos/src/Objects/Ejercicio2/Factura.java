package Objects.Ejercicio2;
import org.apache.commons.lang3.RandomStringUtils;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Factura {

    private String id = RandomStringUtils.randomAlphanumeric(15);
    private LocalDateTime fecha = LocalDateTime.now();
    private String formatFechaHora = fecha.format(DateTimeFormatter.ofPattern("HH:mm:ss // dd-MM-yyyy"));
    private double monto;
    private ItemDeVenta[] itemsVenta;
    private Cliente cliente;

    public Factura(){};

    /* Constructor para puntos a-d (no valido con punto e)
    public Factura(double monto, Cliente cliente){
        this.monto=monto;
        this.cliente=cliente;
    }
    */
    public Factura(double monto, Cliente cliente, ItemDeVenta[] itemsVenta){
        this.monto=monto;
        this.cliente=cliente;
        this.itemsVenta=itemsVenta;
    }


    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    /* Punto c (es incompatible con punto e)
    public double facturaConDescuento(){
        return monto-((double)cliente.getDescuento()/100*monto);
    }
    */

    //Inciso e ; suma el monto base que se mando al constructor cuando se creó la factura mas los montos totales de los items de venta del arreglo de items de venta
    //Se calcula con y sin descuento
    public double montoTotalSinDescuento(){
        double montoItems=0;
        for(ItemDeVenta itemLoop: itemsVenta){
            if(itemLoop!=null) montoItems+=itemLoop.precioTotal();
        }
        return montoItems+monto;
    }
    public double montoTotalConDescuento(){
        double montoSinDesc = montoTotalSinDescuento();
        return montoSinDesc-((double)cliente.getDescuento()/100*montoSinDesc);
    }

    /*
    toString para incisos anteriores al e, sin items de venta

    ç@Override
    public String toString() {
        return "Factura{" +
                "id='" + id + '\'' +
                ", fecha=" + formatFechaHora +
                ", monto=" + monto +
                ", cliente=" + cliente +
                '}';
    }
    */

    //To string para punto e
    @Override
    public String toString() {
        return "Factura{" +
                "id='" + id + '\'' +
                ", fecha=" + fecha +
                ", formatFechaHora='" + formatFechaHora + '\'' +
                ", monto=" + monto +
                ", itemsVenta=" + Arrays.toString(itemsVenta) +
                ", cliente=" + cliente +
                '}';
    }
}
