/*
 A partir de la clase Hora implementar la clase HoraExacta, que incluye en la hora los segundos.
Además de los métodos heredados de Hora, dispondrá de:

• HoraExacta(hora, minuto, segundo) -> que construye un objeto con los datos pasados
como parámetros.

• boolean setSegundos(valor) -> que asigna, si está comprendido entre 0 y 59, el valor
indicado a los segundos.

• void inc() -> que incrementa la hora en un segundo (utiliza @Override).

• toString(), que devuelve un String con la representación de la hora exacta (utiliza
@Override).
 */
package unidad08.U08_A02;
public class HoraExacta extends Hora{
    protected int segundo;
    protected int limiteSegundo = 59;
    
    HoraExacta(int hora, int minuto , int segundo) {
        super(hora, minuto);
        this.segundo = segundo;
    }
      
    boolean horaCorrecta(int hora , int minuto , int segundo){
        return hora <= limiteHora && hora >= 0 && minuto <= limiteMinuto && minuto >= 0 && segundo <= limiteSegundo && segundo >= 0;        
    }
    
    boolean setSegundo(int valor){
        if (horaCorrecta(hora, minuto , valor)){
            segundo = valor;
            return true;
        }
        else{        
            System.out.println("!!!SEGUNDO INVALIDO!!!");
            return false;
        }                    
    }
    
    @Override
    void inc(){
        segundo++;
        
        if(segundo > limiteSegundo){
            segundo = 0;
            minuto++;
        }
        
        if (minuto > limiteMinuto ){
            minuto = 0;
            hora++;            
        }
        
        if (hora > limiteHora){           
            hora = 0;
        }
    }
    
    @Override
    public String toString(){
        String hora;
        hora = "Hora exacta ---> "+this.hora+":"+this.minuto+":"+this.segundo;
        return hora;
    }            
}
