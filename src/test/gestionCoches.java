
package test;

import dominio.vehiculo;
import java.util.ArrayList;
/*clase principal que va a instanciar 2 objetos y los va a mostrasr por pantalla*(*/


public class gestionCoches {
    /*gestion coches, cada vehiculo va a tener las siguientes propiedades:
      matricula String, marca String, modelo String , color String, tarifa double, disponible boolean. getter y setter*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio de coches");
               
        /*
        ArrayList<vehiculo> coches= new ArrayList<>();      
        vehiculo v1= new vehiculo("1234","c1","todoterreno","negro",1.5, true);
        coches.add(v1);
        System.out.println("El coche es: "+ v1);
        */
        
        
        //Instanciamos un primer coche usando el constructor de matricula
        vehiculo coche1 = new vehiculo("1234");
        //imprimo el objeto
        System.out.println(coche1);
        
        //Instanciamos un segundo coche ahora con todas las propiedades
         vehiculo coche2 = new vehiculo("1688GKG","Opel","Astra","Azul",20.00, true);
         System.out.println(coche2);
         
    }    
    
}
