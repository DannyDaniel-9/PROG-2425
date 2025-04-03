/*
4. Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo banco.

• Añadir un atributo que almacene el nombre del banco (que es único) en la clase
CuentaCorriente.

• Diseñar un método que permita recuperar y modificar el nombre del banco (al que
pertenecen todas las cuentas corrientes).
*/
package U07_A04;
public class CuentaCorriente {
    
    private String nombreBanco = "Bancocodrilo";
    public String nombre;
    private double saldo;
    String dni;
    
    public CuentaCorriente (String dni ,  String nombre , double saldo ){ //constructor principal        
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;         
    }
    
    public CuentaCorriente(String dni, String nombre) { // constructor sobrecargado
        this(dni, nombre, 0);
    }
    
    //-------------------------------------------------------------------
    public String getNombreBanco() {
        return nombreBanco;    
    }
    
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;               
    }
    //-----------------------------------------------------------------------      
    public boolean sacaDinero (double monto){
        if (monto > 0 && monto <= saldo){
            saldo -= monto;
            System.out.println("Has retirado "+monto);
        
            return true;
        
        }        
        else{
            System.out.println("Saldo insuficiente");
            
            return false;
        }                
    }
    
    public void ingresaDinero (double monto){        
        if (monto > 0){            
            saldo += monto;
            System.out.println("Has ingresado " +monto);
            
        }
        else 
            System.out.println("No es posible ingresar esa cantidad");
        
    }
    
    public void mostrarInformacion (){        
        System.out.println("=========Informacion=========");
        System.out.println("Banco: "+this.nombreBanco);
        System.out.println("Titular: "+this.nombre);
        System.out.println("Dni: "+this.dni);
        System.out.println("Saldo disponible: "+this.saldo);
        System.out.println("==============================");
    }   
     
}
