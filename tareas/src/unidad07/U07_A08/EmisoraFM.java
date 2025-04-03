/*
Definir una clase que permita controlar un sintonizador digital de emisoras FM:

• Concretamente, se desea dotar al controlador de una interfaz que permita subir (up) o bajar
(down) la frecuencia (en saltos de 0,5 MHz) y mostrar la frecuencia sintonizada en un momento
dado (display).
• Supondremos que el rango de frecuencias para manejar oscila entre los 80 MHz y los 108 MHz y
que, al inicio, el controlador sintonice la frecuencia indicada en el constructor o 80 MHz por
defecto.
• Si durante una operación de subida o bajada se sobrepasa uno de los dos límites, la frecuencia
sintonizada debe pasar a ser la del extremo contrario (comprobarRango).
• Escribir un pequeño programa principal para probar su funcionamiento (Main.java).
 */
package U07_A08;
public class EmisoraFM {
    private double frecuencia;
    private final double frecuenciaMax = 108;
    private final double frecuenciaMin = 80;
    private final double frecuenciaStep =0.5;
    
    
    public EmisoraFM (double frecuencia){
        if (frecuencia <= frecuenciaMax && frecuencia >= frecuenciaMin)
            this.frecuencia = frecuencia;
        else
            this.frecuencia = 80;                
    }
    
    public EmisoraFM(){
        this.frecuencia = 80;        
    }
    
    public void subirFrecuencia(int saltos){
        
        double frecuenciaSaltos = saltos * frecuenciaStep;
        double frecuenciaResultante = frecuencia + frecuenciaSaltos;
        this.frecuencia = comprobarRango(frecuenciaResultante);    
}
    
     public void bajarFrecuencia(int saltos){
         
        double frecuenciaSaltos = saltos * frecuenciaStep;
        double frecuenciaResultante = frecuencia + frecuenciaSaltos;
        this.frecuencia = comprobarRango(frecuenciaResultante);   
}
     
     public double comprobarRango(double frecuenciaResultante){
         if (frecuenciaResultante > frecuenciaMax)
             frecuenciaResultante = frecuenciaMin;
         else if (frecuenciaResultante < frecuenciaMin)
             frecuenciaResultante = frecuenciaMax;      
         
         return frecuenciaResultante;
     }
     
     public void display(){
         System.out.println("Sintonizando = "+frecuencia+" MHz");
     }
    
    
}
