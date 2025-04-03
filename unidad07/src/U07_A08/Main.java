
package U07_A08;
public class Main {
    public static void main(String[] args){
        EmisoraFM panasonic = new EmisoraFM();
        panasonic.subirFrecuencia(56); //son 56 saltos desde 80 para llegar exacto a 108
        panasonic.display();
        
        EmisoraFM sony = new EmisoraFM();
        sony.bajarFrecuencia(-9);
        sony.display();
        
        EmisoraFM logitech = new EmisoraFM(109);
        logitech.display();
        
        
    }
    
}
