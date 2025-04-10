/*
 Hemos recibido el encargo de un cliente para definir los paquetes y las clases necesarias (solo
implementar los atributos y los constructores) para gestionar una empresa ferroviaria, en la que se
distinguen dos grandes grupos: el personal y la maquinaria.

• El personal de la empresa se clasifica en tres grupos: los maquinistas, los mecánicos y los jefes de
estación. De cada uno de ellos es necesario guardar:

o Maquinistas: su nombre, DNI, sueldo y el rango que tienen adquirido. (NO HACE FALTA RANGO)
o Mecánicos: su nombre, teléfono (para contactar en caso de urgencia) y en qué especialidad
desarrollan su trabajo (esta puede ser: frenos, hidráulica, electricidad o motor).
o Jefes de estación: su nombre, DNI y la fecha en la que fue nombrado jefe de estación.

➢ Todas las clases correspondientes al personal (Maquinista, Mecanico y JefeEstacion) serán
de uso público.


• En la parte de maquinaria podemos encontrar trenes, locomotoras y vagones. De cada uno de
ellos hay que considerar:

o Vagones: tienen un número que los identifica, una carga máxima (en kilos), la carga actual y
el tipo de mercancía con el que están cargados.
o Locomotoras: disponen de una matrícula (que las identifica), la potencia de sus motores y
una antigüedad (año de fabricación). Además, cada locomotora tiene asignado un mecánico
que se encarga de su mantenimiento.
o Trenes: están formados por una locomotora y un máximo de 5 vagones. Cada tren tiene
asignado un maquinista que es responsable de él.

➢ Entre las clases relativas a la maquinaria solo será posible construir, desde clases externas,
objetos de tipo Tren y de tipo Locomotora. La clase Vagon será solo visible por sus clases
vecinas.
 */
package unidad07.U07_A10;
import unidad07.U07_A10.maquinaria.Locomotora;
import unidad07.U07_A10.maquinaria.Tren;
import unidad07.U07_A10.personal.Maquinista;
import unidad07.U07_A10.personal.Mecanico;

public class Main {
    
    public static void main(String[] args){
                
        Mecanico giancarlo = new Mecanico ("Giancarlo" , 8383838 , "FRENOS");       
        
        Locomotora thomas = new Locomotora ("0210" , 30 , 2020 , giancarlo);
        
        Maquinista renzo = new Maquinista("Renzo" , 232333 ,2000);
        
        Tren dinotren = new Tren (thomas , renzo);      
        
        dinotren.asignarVagon( 01 , "Pokeballs" , 30 , 90 );
        dinotren.asignarVagon( 02 , "Pociones" , 30 , 20 );
        dinotren.asignarVagon( 03 , "Revivir" ,30 , 20 );
        dinotren.asignarVagon( 04 , "Caramelos" , 30 , 20 );
                                    
    }    
}
