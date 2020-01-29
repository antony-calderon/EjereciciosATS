
package basicos_y_Codicionales;

import javax.swing.JOptionPane;

/*UN OBRERO NECESITA CALCULAR SU SALARIO SEMANAL, EL CUAL 
SE OBTIENE DE LA SIGUIENTE MANERA: 
1. SI TRABAJA 40 HORAS  O MENOS SE LE PAGA $16 POR HORA
2. SI TRABAJA MAS DE 40 HORAS SE LE PAGA $16 POR CADA UNA DE LAS 
   PRIMERAS 40 HORAS Y $20 POR CADA HORA EXTRA.
*/
public class SalarioObrero {
    public static void main(String[] args) {
        float salario;
        float valOrdinaria;
        float extra;
        float valExtra;
        float horas_trabajadas;
        
        horas_trabajadas=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas"));
         if(horas_trabajadas>40){
             extra=horas_trabajadas-40;
             valExtra=extra*20;
             valOrdinaria=40*16;
             salario=valExtra+valOrdinaria;
             JOptionPane.showMessageDialog(null, "El salario es: "+salario);
         }else{
             valOrdinaria=horas_trabajadas*16;
             JOptionPane.showMessageDialog(null, "El salario es: "+valOrdinaria);
         }
             
        
        
         
    }
}
