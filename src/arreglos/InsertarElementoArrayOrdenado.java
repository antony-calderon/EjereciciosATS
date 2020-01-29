
package arreglos;

import java.util.Scanner;

/* Read 5 numerical elements that are introduced in increasing order.
We will keep these in a size 10 chart. Read a number N,
insert it in the right place for the table to continue orderly
*/
public class InsertarElementoArrayOrdenado {
    public static void main(String[] args) {
        
        int tabla[]=new int[10];
        int num;
        int sitio=0;
        boolean creciente=true;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Llenar el array con 5 elementos\n");
        
        //filling the array of 5 elements
        do{
            for(int i=0;i<5;i++){
            System.out.print((i+1)+". Introduce un número: ");
            tabla[i]=entrada.nextInt();
            }
            
            //comprobando si esta creciente o no
            for(int i=0;i<4;i++){
                if(tabla[i]<tabla[i+1]){
                    creciente=true;
                }
                if(tabla[i]>tabla[i+1]){
                    creciente=false;
                    break;
                }
            }
            if(creciente==false){
                System.out.println("El arreglo no esta en forma ordenada, digite de nuevo:\n");
            }
        }while(creciente==false);
        
        //ask the user for a number to enter into the array
        System.out.println("Introduzca el numero para añadirlo al arreglo");
        num=entrada.nextInt();
        
        //realize in which position the number goes
        while(tabla[sitio]<num && sitio<5){
            sitio++;
            
        }
        
        //we move a position the numbers that go after number
        for(int i=4; i>=sitio; i--){
            tabla[i+1]=tabla[i];
        }
        
        //we insert the number that the user put
        tabla[sitio]=num;
        
        //print the new array
        for(int elemento:tabla){
            System.out.print(elemento+"-");
        }
    }
}
