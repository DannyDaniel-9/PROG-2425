/*
4. Crear la clase abstracta Instrumento, que almacena en una tabla las notas musicales de una
melodía (dentro de una misma octava).

• EI método add() añade nuevas notas musicales.
• La clase también dispone del método abstracto interpretar() que, en cada subclase que
herede de Instrumento, mostrará por consola las notas musicales según las interprete.
• Utilizar enumerados para definir las notas musicales.
 */
package unidad08.U08_A04;
import java.util.Arrays;
abstract class Instrumento {   
   
   protected Notas[] melodia = new Notas[0];
   
   void add(String notaAñadida){
       
       notaAñadida = notaAñadida.toUpperCase();
       melodia = Arrays.copyOf(melodia,melodia.length + 1);
       melodia[melodia.length-1] = Notas.valueOf(notaAñadida);  

   }   
   abstract void interpretar(); 
 
}
