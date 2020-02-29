
package matrices;

import java.util.Scanner;


public class CrearMatrizYTrasponerla {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);
        
        //declaro la matriz
        int matriz[][]=new int[3][3];
        
        //pedimos al usuario que llene la matriz
        System.out.println("llena la matriz");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        
        //imprimimos la matriz original
        System.out.println("La matriz original es: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        //transponiendo la matriz
        int aux;
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
            }
        }
        
        //imprimimos la matriz transpuesta
        System.out.println("la matriz transpuesta es: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
