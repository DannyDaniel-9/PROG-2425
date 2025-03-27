/*
1.- (U07-A01) Diseñar la clase CuentaCorriente, que almacena los datos: 
DNI y nombre del titular, así como el saldo. Las operaciones típicas con una cuenta corriente son:
Crear una cuenta: se necesita el DNI y nombre del titular. EI saldo inicial será 0.
Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación,
si existe saldo suficiente.
Ingresar dinero: se incrementa el saldo.
Mostrar información: muestra la información disponible de la cuenta corriente.
NOTA: Crear una clase Main.java de donde se cree y maneje el objeto de tipo CuentaCorriente.
*/
package U07_A01;
public class Main {
    public static void main(String [] args){
        CuentaCorriente cuentaNueva = new CuentaCorriente ("12345678A" , "Danny Daniel Durand");
                
        cuentaNueva.ingresaDinero(500);        
        cuentaNueva.sacaDinero(300);
        cuentaNueva.mostrarInformacion();
    }
    
}
