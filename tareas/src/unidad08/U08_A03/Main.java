/*
3. Añadir a la clase HoraExacta un método que compare si dos horas (la invocante y otra pasada
como parámetro de entrada al método) son iguales o distintas.

NOTA: utiliza equals() con @Override.
*/
package unidad08.U08_A03;
public class Main {
    
    public static void main (String[] args) {
        
        HoraExacta horaComida = new HoraExacta(14 , 30 , 0);
        HoraExacta horaCena = new HoraExacta (20 , 30 , 0);
        
        boolean iguales = horaComida.equals(horaCena);
        
        System.out.println(iguales? "Las horas son iguales" : "Las horas no son iguales");
        
        HoraExacta horaDesayuno = new HoraExacta(14 , 30 , 0);
                
        boolean iguales2 = horaComida.equals(horaDesayuno);
        
        System.out.println(iguales2? "Las horas son iguales" : "Las horas no son iguales");
        
    }
    
}
