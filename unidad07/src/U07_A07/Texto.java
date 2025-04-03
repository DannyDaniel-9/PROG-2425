/*
Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:

• La cadena de caracteres tendrá una longitud máxima que se especifica en el constructor.
• Permite añadir un carácter al principio o al final, siempre y cuando no se exceda la longitud
máxima, es decir, exista espacio disponible.
• Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando no se
rebase el tamaño máximo establecido.
• Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.
• Cada objeto de tipo Texto tiene que conocer la fecha en la que se creó, así como la fecha y hora
de la última modificación efectuada.
• Deberá existir un método que muestre la información que gestiona cada texto.

• Posibles métodos: addPrincipio(), addFinal(), esVocal(), numVocales(), mostrar()
*/
package U07_A07;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class Texto {
    private String contenido ="";
    private int longitudMaxima;
    private LocalDate fechaCreacion;
    private LocalDateTime ultimaModificacion;
 
    
    public Texto (int longitudMaxima){
        this.longitudMaxima = longitudMaxima;
        this.fechaCreacion = LocalDate.now(); 
        this.ultimaModificacion = LocalDateTime.now();
    }
    
   public void addPrincipio(String agregacion) {
       
    if (contenido.length() + agregacion.length() <= longitudMaxima) 
        contenido = agregacion + contenido;    
   }
   public void addFinal(String agregacion) {
       
    if (contenido.length() + agregacion.length() <= longitudMaxima) 
        contenido =contenido + agregacion;    
   }
   
   public void addPrincipio(char agregacion) {
    addPrincipio(Character.toString(agregacion));  // Convierte char en String y reutiliza el otro método
   }
   
   public void addFinal(char agregacion) {
    addFinal(Character.toString(agregacion));  // Convierte char en String y reutiliza el otro método
   }
   
   public int conteoVocales(){
       final String VOCALES = "aeiouáéíóú" ;
       int conteoVocales = 0;
       contenido = contenido.toLowerCase();
       
       for (int i = 0 ; i < contenido.length() ; i++){
           char c = contenido.charAt(i);
           if (VOCALES.contains(String.valueOf(c)))
              conteoVocales++; 
       }
       
       return conteoVocales;
                       
   }
    
    public void mostrarContenido(){
        System.out.println("------------------");
        System.out.println("CONTENIDO:"+contenido);
        System.out.println("VOCALES:"+conteoVocales()); 
        System.out.println("FECHA DE CREACION: " + fechaCreacion); 
        System.out.println("ULTIMA MODIFICACION: " + ultimaModificacion);
        System.out.println("------------------");
    }
    
    
    
    
    
    
    
    
    
    
    
}
