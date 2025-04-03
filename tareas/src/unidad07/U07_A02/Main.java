package U07_A02;
public class Main {
    public static void main(String[] args){
    CuentaCorriente cuentaNueva = new CuentaCorriente("87654321B", "Camila Flores"); // llama al constructor sobrecargado de 2 parametros .   
        cuentaNueva.ingresaDinero(200);
        cuentaNueva.sacaDinero(50);
        cuentaNueva.mostrarInformacion();
    }
}
