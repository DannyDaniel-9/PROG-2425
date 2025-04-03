package U07_A07;
public class Main {
    
    public static void main (String[] args){
        
        Texto saludo = new Texto (9);
        
        saludo.addPrincipio("Hola ");
        saludo.addFinal('@');
        saludo.addFinal(" todos");
        
        saludo.mostrarContenido();
        
    }
    
}
