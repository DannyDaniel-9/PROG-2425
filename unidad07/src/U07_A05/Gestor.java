
package U07_A05;

public class Gestor {
    public String nombreGestor;
    private final int telefonoGestor;
    double importeMaximo;

    public Gestor(String nombreGestor, int telefonoGestor , double importeMaximo) {
        this.nombreGestor = nombreGestor;
        this.telefonoGestor = telefonoGestor;
        this.importeMaximo = importeMaximo;
    }
    
    public Gestor (String nombreGestor , int telefonoGestor){
        this (nombreGestor , telefonoGestor , 10000);
    }
    
    public int getTelefonoGestor(){
        return telefonoGestor;
    }
    
    public void mostrarInformacion() {
        System.out.println("=======Gestor=======");
        System.out.println(nombreGestor);
        System.out.println(telefonoGestor);
        System.out.println(importeMaximo);
        System.out.println("====================");
    }           
}
