
package U07_A05;
public class Main{
public static void main (String [] args){
    
    Gestor gestor1 = new Gestor ("Priscilla Dextre" ,655338645);
    
    CuentaCorriente cuenta1 = new CuentaCorriente ("123456789" , "Fiorella Arce" , gestor1 );
    
    cuenta1.mostrarInformacion();    
}
}
