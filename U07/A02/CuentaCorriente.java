//PUEDO USAR METODO CONSTRUCTOR SOBRECARGADO
package U07_A01;

public class CuentaCorriente {
    
    private String dni , nombre;
    private double saldo;
    
    CuentaCorriente (String dni ,  String nombre ){        
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0 ;    
        
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
