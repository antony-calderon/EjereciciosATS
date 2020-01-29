
package basicos_y_Codicionales;

import java.util.Scanner;

/* CONSTRUIR UN PROGRAMA QUE, DADO UN NUMERO TOTAL DE HORAS,
DEVUELVE EL NUMERO DE SEMANAS, DIAS Y HORAS EQUIVALENTES. 
POR EJEMPLO, DADO UN TOTAL DE 1000 HORAS DEBE MOSTRAR 5 SEMANAS,
6 DIAS Y 16 HORAS.
*/
public class CalcularSemanasDiasHoras {
    public static void main(String[] args) {
        //////definimos las varibles que becesitamos///////////
        int total_horas;
        int semanas;
        int dias;
        int horas;
        
        ////pedimos el numero de horas////////
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa el numero de horas");
        total_horas=entrada.nextInt();
        
        ///calculamos el numero de semanas, dias y horas///////////
        semanas=total_horas/168;
        dias=total_horas%168/24;
        horas=total_horas%24;
        
        //////////mostramos en pantalal el resultado//////////
        System.out.println("El numero de semanas es: "+semanas
                + " \n El nmero de dias es: "+dias
                + "\n El numero de horas es: "+horas);
    }
}
