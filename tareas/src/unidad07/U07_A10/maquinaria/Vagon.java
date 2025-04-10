
package unidad07.U07_A10.maquinaria;

class Vagon {
    private int NUMERO_VAGON;
    private String mercancia;
    private double cargaMaxima ;
    private double cargaActual;

    public Vagon(int NUMERO_VAGON, String mercancia, double cargaMaxima, double cargaActual) {
        
        while(cargaActual <= cargaMaxima){
        this.NUMERO_VAGON = NUMERO_VAGON;
        this.mercancia = mercancia;
        this.cargaMaxima = cargaMaxima;                
        this.cargaActual = cargaActual;
        }
    }     
}
