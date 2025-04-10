
package unidad07.U07_A10.personal;

public class Mecanico {
    private String nombre;
    private int telefono;
    enum Especialidad {FRENOS, HIDRAULICA, ELECTRICIDAD , MOTOR};
    Especialidad especialidad;
 
    public Mecanico(String nombre, int telefono , String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = Especialidad.valueOf(especialidad);
    }                                      
}
