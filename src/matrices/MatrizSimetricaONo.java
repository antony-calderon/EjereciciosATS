
package matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class MatrizSimetricaONo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        int matriz[][],filas,columnas;
        boolean simetrica=true;
        
        filas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        columnas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        
        matriz=new int[filas][columnas];
        
        System.out.println("llena la matriz: ");
        
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print("Digita tu matriz: ["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        
        //imprimimos la matriz
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        //comprobar si es simetrica o no
        if(filas==columnas){ //si el numero de filas es igual al de columnases simetrica
            int i,j;
            i=0;
            while(i<filas && simetrica==true){
                j=0;
                while(j<i && simetrica==true){
                    if(matriz[i][j] != matriz[j][i]){
                        simetrica=false;
                    }
                    j++;
                }
                i++;
            }
            if(simetrica==true){
                JOptionPane.showMessageDialog(null, "La matriz es simetrica");
            }else{
                JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
            }
        }else{
           JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
        }
    }
    
}
