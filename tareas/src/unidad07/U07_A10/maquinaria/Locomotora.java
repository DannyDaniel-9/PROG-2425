
package unidad07.U07_A10.maquinaria;
import unidad07.U07_A10.personal.Mecanico;

public class Locomotora {
    
    private final String MATRICULA;
    private double potencia;
    private int añoFabricacion;
    private Mecanico asignado;

    public Locomotora(String MATRICULA, double potencia, int añoFabricacion , Mecanico asignado) {
        this.MATRICULA = MATRICULA;
        this.potencia = potencia;
        this.añoFabricacion = añoFabricacion;        
        this.asignado = asignado;
    }
                   
}
