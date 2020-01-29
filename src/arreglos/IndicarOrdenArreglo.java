
package arreglos;
/* Leer por teclado una serie de numeros enteros. La aplicacion debe indicarnos
si los numeros estan ordenados de forma creciente, decreciente o si estan desordenados
*/
import java.util.Scanner;


public class IndicarOrdenArreglo {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);
        
        int arreglo[]=new int [5];
        boolean creciente=false, decreciente=false;
        
        System.out.println("Llenando el arreglo");
        for(int i=0; i<5; i++){
            System.out.print((i+1)+" Digita un numero entero: ");
            arreglo[i]=entrada.nextInt();
        }
        for(int i=0; i<4; i++){
            if(arreglo[i]<arreglo[i+1]){
                creciente=true;
            }
            if(arreglo[i]>arreglo[i+1]){
                decreciente=true;
            }
        }
        if(creciente==true && decreciente==false){
            System.out.println("El arreglo es creciente");
        }else if(creciente==false && decreciente==true){
            System.out.println("El arreglo es decreciente");
        }else if(creciente==true && decreciente==true){
            System.out.println("El arreglo es desordenado");
        }else if(creciente==false && decreciente==false){
            System.out.println("Los elementos del arreglo son iguales");
        }
        
        
    }
    
}
