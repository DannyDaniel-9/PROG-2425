
package unidad07.U07_A10.maquinaria;
import unidad07.U07_A10.personal.Maquinista;

public class Tren {
    private Locomotora locomotora;
    private Maquinista asignado;
    private Vagon[] listaVagones;
    private int numVagones;
    
    public Tren(Locomotora locomotora, Maquinista asignado) {
        this.locomotora = locomotora;
        this.asignado = asignado; 
        
        listaVagones = new Vagon[5];
        numVagones = 0;
    }
    
    public boolean asignarVagon (int NUMERO_VAGON, String mercancia, double cargaMaxima, double cargaActual){
        if (numVagones == 5){
            System.out.println("No se admiten mas vagones");
            return false;
        }
        else{
            listaVagones[numVagones] = new Vagon(NUMERO_VAGON , mercancia , cargaMaxima , cargaActual);
            numVagones++;
            return true;
        }            
    }                        
}
