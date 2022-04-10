package util;

public class Hora {

    private int horas;
    private int minutos;
    private int segundos;


    public Hora(int horas, int minutos, int segundos){

        this.horas = (horas<25 && horas>-1)? horas : 0;
        this.minutos = (minutos<61 && minutos>-1)? minutos : 0;
        this.segundos = (segundos<61 && segundos>-1)? segundos : 0;
    }

    //Methods

    @Override
    public String toString() {
        String horaStr = String.format("%02d", horas);
        String minutoStr = String.format("%02d", minutos);
        String segundoStr = String.format("%02d", segundos);
        return "La hora es: "+horaStr+":"+minutoStr+":"+segundoStr;
    }

    public void avanzaHora(){
        if(this.horas==23) {
            this.horas=0;
        }
        else this.horas++;
    }
    public void retrocedeHora(){
        if(this.horas==0) {
            this.horas=23;
        }
        else this.horas--;
    }

    public void avanzaMinuto(){
        if(this.minutos==59) {
            this.minutos=0;
            avanzaHora();
        }
        else this.minutos++;
    }
    public void retrocedeMinuto(){
        if(this.minutos==0) {
            this.minutos=59;
            retrocedeHora();
        }
        else this.minutos--;
    }

    public void avanzaSegundo(){
        if(this.segundos==59) {
            this.segundos=0;
            avanzaMinuto();
        }
        else this.segundos++;
    }
    public void retrocedeSegundo(){
        if(this.segundos==0) {
            this.segundos=59;
            retrocedeMinuto();
        }
        else this.segundos--;
    }

    //G&S

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
}
