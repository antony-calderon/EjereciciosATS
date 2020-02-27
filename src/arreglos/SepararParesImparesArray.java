
package arreglos;

import java.util.Scanner;


public class SepararParesImparesArray {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int tabla[]=new int[10];
        int cont_par=0,cont_impar=0;
        
        /////filling the array with 10 elements
        System.out.println("Llenando el array con 10 elementos\n");
        
        for(int i=0; i<10; i++){
            System.out.print((i+1)+". por favor digita un numero entero:");
            tabla[i]=entrada.nextInt();
            
            if(tabla[i]%2==0){  //if the number is even
                cont_par++;
            }else{              //if the number is odd
                cont_impar++;
            }      
        }
        //define the arrays for the evens and odds
        int par[]=new int[cont_par];
        int impar[]=new int[cont_impar];
        
        cont_par=0;
        cont_impar=0;
        
        for(int i=0; i<10; i++){
            if(tabla[i]%2==0){
                par[cont_par]=tabla[i];
                cont_par++;
            }else{
                impar[cont_impar]=tabla[i];
                cont_impar++;
            }
        }
        
        //print the arrays
        System.out.println("Array de pares:");
        for(int obj:par){
            System.out.print(obj+"-");
        } 
        System.out.println("");
        System.out.println("Array de impares");
        for(int obj:impar){
            System.out.print(obj+"-");
        }
        
    }
}
