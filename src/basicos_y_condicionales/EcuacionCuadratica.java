
package basicos_y_Codicionales;

import java.util.Scanner;

/* CONSTRUIR UN PROGRAMA QUE CALCULE Y MUESTRE POR PANTALLA LAS RAICES
DE LA ECUACION DE SEGUNDO GRADO DE COEFICIENTES REALES
ax^2+bx+c=0
x=(-b+-(raiz b^2-4ac))/2a
*/ 
public class EcuacionCuadratica {
    public static void main(String[] args) {
        ///////declaramos las variables///////////
        double a,b,c, potencia;
        double x1,x2;
        
        ////pedimos los valores/////////////
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita el valor de a");
        a=entrada.nextInt();
        System.out.println("Digita el valor de b");
        b=entrada.nextInt();
        System.out.println("Digita el valor de c");
        c=entrada.nextInt();
        
        potencia=Math.pow(b, 2)-(4*a*c);
        System.out.println(potencia);
        x1=(-b+Math.sqrt((potencia)))/2*a;
        x2=(-b-(Math.sqrt((potencia)))/2*a);
        
        //////imprimimos el resultado//////////////
        if(potencia<0){
            System.out.println("el resultado es indeterminado");
        }else{
        System.out.println("El valor de x1 es: "+x1+
                "\n El valor de x2 es: "+x2);
        }
        
    }
}
