

package unidad07.U07_A10.personal;
import java.time.LocalDate;
public class JefeDeEstacion {
    public String nombre;
    public String dni;
    public LocalDate fechaNombramiento;

    public JefeDeEstacion(String nombre, String dni, LocalDate fechaNombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombramiento = fechaNombramiento;
    }           
}
