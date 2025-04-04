package unidad08.U08_A01;
public class Main {
    
    public static void main (String[] args) {
        Hora horaExamen = new Hora (23 , 59);
        horaExamen.inc();
        System.out.println(horaExamen.toString());
        
        System.out.println("--------------------------------");
        
        Hora horaDentista = new Hora (9 , 0);
        horaDentista.setHora(24);
        System.out.println(horaDentista.toString());
        horaDentista.setMinuto(60);
        System.out.println(horaDentista.toString());
        
        System.out.println("--------------------------------");
    }
    
}
