package unidad08.U08_A02;
public class Main {
    
    public static void main (String[] args) {
        
        HoraExacta horaCirugia = new HoraExacta(9 , 59 , 59);
        horaCirugia.inc();
        
        System.out.println(horaCirugia.toString());
        
        horaCirugia.setSegundo(30);
        
        System.out.println(horaCirugia.toString());
        
        horaCirugia.setMinuto(62);
    }
    
}
