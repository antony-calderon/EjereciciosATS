/* crear una matriz "marco" de tamaño 5 x 5
todos sus elementos deben ser 0 salvo los de los bordes
que deben ser 1, mostrarla.
*/
package matrices;

import java.util.Scanner;


public class MarcoDeUnosMatriz {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);
        
        int matriz[][]=new int [5][5];
        
        //llenando la matriz
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==0 || i==4){
                    matriz[i][j]=1;
                }else if(j==0 || j==4){
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
        
        //imprimiendo la matriz
        System.out.println("\nLa matriz es: \n");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
