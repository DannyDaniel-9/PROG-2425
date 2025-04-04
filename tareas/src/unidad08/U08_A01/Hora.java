/*
 Diseñar la clase Hora, que representa un instante de tiempo compuesto por la hora (de 0 a 23) y
los minutos. Dispone de los métodos:

• Hora(hora, minuto) -> que construye un objeto con los datos pasados como parámetros.

• void inc() -> que incrementa la hora en un minuto.

• boolean setMinutos(valor) -> que asigna un valor, si es válido, a los minutos. Devuelve
true o false según haya sido posible modificar los minutos o no.

• boolean setHora(valor), que asigna un valor, si está comprendido entre 0 y 23, a la hora.
Devuelve true o false según haya sido posible cambiar la hora o no.

• toString(), que devuelve un String con la representación de la hora (utiliza @Override).
 */
package unidad08.U08_A01;
public class Hora {
    protected int hora;
    protected int minuto;
    protected final int limiteMinuto = 59;
    protected final int limiteHora = 23;
    
    Hora(int hora , int minuto){
       if (horaCorrecta(hora , minuto)){
       this.hora = hora;
       this.minuto = minuto;
        }
       else
            System.out.println("!!!PARAMETROS INVALIDOS!!!");
    }
    
    boolean horaCorrecta(int hora , int minuto){
        return hora <= limiteHora && hora >= 0 && minuto <= limiteMinuto && minuto >= 0;        
    }
            
    @Override
    public String toString(){
        String hora;
        hora = "Hora ---> "+this.hora+":"+this.minuto;
        return hora;        
    }
        
    void inc(){
        minuto++;
        
        if (minuto > limiteMinuto ){
            minuto = 0;
            hora++;            
        }
        
        if (hora > limiteHora){           
            hora = 0;
        }            
    }
    
    boolean setMinuto(int valor){
        if (horaCorrecta(hora , valor)){
            minuto = valor;
            return true;
        }
        else{            
            System.out.println("!!!MINUTO INVALIDO!!!");
            return false;
        }          
    }
    
    boolean setHora(int valor){
        if (horaCorrecta(valor , minuto)){
            hora = valor;
            return true;
        }
        else {
            System.out.println("!!!HORA INVALIDA!!!");
            return false;
        }
    }
    
    
}
