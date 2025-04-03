package U07_A01;
public class Main {
  
    public static void main(String[] args){
    CuentaCorriente cuentaNueva = new CuentaCorriente("87654321B", "Camila Flores"); // llama al constructor sobrecargado de 2 parametros .   
        cuentaNueva.ingresaDinero(200);
        cuentaNueva.sacaDinero(50);
        cuentaNueva.mostrarInformacion();
        
        //Comprobar visibilidad de saldo , dni y nombre
        
        //System.out.println(cuentaNueva.saldo);//variable privada ,no se puede ver
        System.out.println(cuentaNueva.dni);//por defecto
        System.out.println(cuentaNueva.nombre);//publica
    }
}

