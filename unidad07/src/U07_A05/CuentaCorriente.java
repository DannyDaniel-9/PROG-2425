/*
5. Existen gestores que administran las cuentas bancarias y atienden a sus propietarios.

− Cada cuenta, en caso de tenerlo, cuenta con un único gestor.
− Diseñar la clase Gestor de la que interesa guardar su nombre, teléfono y el importe máximo
autorizado con el que pueden operar.
− Con respecto a los gestores, existen las siguientes restricciones:
• Un gestor tendrá siempre un nombre y un teléfono.
• Si no se asigna, el importe máximo autorizado por operación será de 10000 euros.
• Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y todo el mundo
podrá consultarlo.

− EI nombre será público y el importe máximo solo será visible por clases vecinas.

▪ Modificar la clase Cuentacorriente para que pueda disponer de un objeto Gestor. Modifica
también su constructor. Escribir los métodos necesarios y crea la clase Main para interactuar
con Cuentacorriente y Gestor.
*/
package U07_A05;
public class CuentaCorriente {
    
    private Gestor gestorBanco ;
    private String nombreBanco = "Bancocodrilo";
    public String nombre;
    private double saldo;
    String dni;
    
    public CuentaCorriente (String dni ,  String nombre , double saldo ,Gestor gestorBanco){ //constructor principal        
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo ;
        this.gestorBanco = gestorBanco;
    }
    
    public CuentaCorriente(String dni, String nombre) { // constructor sobrecargado
        this(dni, nombre, 0 , null);
    }
    public CuentaCorriente(String dni, String nombre , Gestor gestorBanco) { // constructor sobrecargado
        this(dni, nombre, 0 , gestorBanco);
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
        if(gestorBanco != null){
              gestorBanco.mostrarInformacion();
        }
        System.out.println("Titular: "+this.nombre);
        System.out.println("Dni: "+this.dni);
        System.out.println("Saldo disponible: "+this.saldo);
        System.out.println("==============================");
    }   
     
}
