
package basicos_y_Codicionales;

import java.util.Scanner;

/*HACER UN PROGRAMA QUE CALCULE EL CUADRADO DE UNA SUMA
(a+b)^2=a^2+b^2+2ab */

public class CuadradoDeSuma {
    public static void main(String[] args) {
        ////declaro las variables para mi ejercicio///////////
        float a;
        float b;
        float resultado;
        
        /////pedimos los datos/////////////////
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el valor de a");
        a=entrada.nextFloat();
        System.out.println("Digite el valor de b");
        b=entrada.nextFloat();
        
        /////hacemos el calculo////////////////
        resultado=(a*a)+(b*b)+(2*a*b);
        
        //////imprimimos el resultado/////////////
        System.out.println("El resultado es: "+resultado);
    }
}

