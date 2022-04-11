package util;
import org.apache.commons.lang3.RandomStringUtils;
import java.time.LocalDateTime;


public class Factura {

    private String id = RandomStringUtils.randomAlphanumeric(15);
    private LocalDateTime fecha = LocalDateTime.now();
    private int monto;
    Cliente cliente;

    public Factura(){};

    public Factura(int monto, Cliente cliente){
        this.monto=monto;
        this.cliente=cliente;
    }


}
