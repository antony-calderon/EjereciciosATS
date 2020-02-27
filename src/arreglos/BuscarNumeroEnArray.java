
package arreglos;
/* Leer 10 enteros ordenados crecientemente. Leer N y buscarlo
en la tabla. Se debe mostrar la posición en que se encuentra.
Si no está, indicarlo con un mensaje.
*/
import java.util.Scanner;


public class BuscarNumeroEnArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabla[]=new int[10];
        int n;
        boolean creciente=true;
        
        //llenamos el arreglo
        do{
            for(int i=0; i<10; i++){
                System.out.print((i+1)+". Digite un numero: ");
                tabla[i]=entrada.nextInt();
            }
            //verificamos que el arreglo este creciente
            for(int i=0; i<9; i++){
                if(tabla[i]<tabla[i+1]){//creciente
                    creciente=true;
                }
                if(tabla[i]>tabla[i+1]){//decreciente
                    creciente=false;
                    System.out.println("El arreglo no esta en forma creciente, digite de nuevo");
                    break;
                }
            }
        }while(creciente==false);
            
        //pedimos el numero a buscar en el arreglo
        System.out.print("\n Digite el número a buscar en el arreglo: ");
        n=entrada.nextInt();
        
        //buscamos el numero en el array
        int i=0;
        
        while(i<10 && tabla[i]<n){
            i++;
        }
        
        if(i==10){
            System.out.println("No se ha encontrado el numero");
        }else{
            if(tabla[i]==n){
                System.out.println("\nNúmero encontrado en la posicion "+(i+1));
            }
        }
        
    }
}
