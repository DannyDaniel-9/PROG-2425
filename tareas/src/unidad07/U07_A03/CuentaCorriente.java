package U07_A03;
public class CuentaCorriente {
    
    public String nombre;
    private double saldo;
    String dni;
    
    public CuentaCorriente (String dni ,  String nombre , double saldo ){ //constructor principal        
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo ;            
    }
    
    public CuentaCorriente(String dni, String nombre) { // constructor sobrecargado
        this(dni, nombre, 0);
    }
            
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
        System.out.println("Titular: "+this.nombre);
        System.out.println("Dni: "+this.dni);
        System.out.println("Saldo disponible: "+this.saldo);
        System.out.println("==============================");
    }   
     
}
