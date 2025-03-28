package U07_A06;
public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora( int hora, int minuto, int segundo) {      
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;            
    }            
  
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
    
    
}
