
package basicos_y_Codicionales;

import javax.swing.JOptionPane;

/* PEDIR EL DIA, MES Y AÑO DE UNA FECHA  E INDICAR  SI LA FECHA ES CORRECTA. 
   SUPONIENDO QUE TODOS LOS MESES SON DE 30 DIAS
*/
public class diaMesAnoCorrecto {
    public static void main(String[] args) {
        int dia, mes, año;
        
        dia=Integer.parseInt(JOptionPane.showInputDialog("Digita el dia")); 
        
        if(dia>=1 && dia<=30){
            
            mes=Integer.parseInt(JOptionPane.showInputDialog("Digita el mes"));
            
            if(mes>=1 && mes<=12){
                
                año=Integer.parseInt(JOptionPane.showInputDialog("Digita el año"));
                
                if(año>0){
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                }else{
                    JOptionPane.showMessageDialog(null, "Año incorrecto");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Mes incorrecto");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Dia incorrecto");
        }
    }
}
