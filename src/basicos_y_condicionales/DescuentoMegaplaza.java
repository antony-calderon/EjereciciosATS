
package basicos_y_Codicionales;

import javax.swing.JOptionPane;

/*EN MEGAPLAZA SE HACE UN 20% DE DESCUENTO A LOS CLIENTES CUYA COMPRA SUPERE
LOS $300 ¿CUAL SERA LA CANTIDAD QUE PAGARA UNA PERSONA POR SU COMPRA?
*/
public class DescuentoMegaplaza {
    public static void main(String[] args) {
        double compra;
        double descuento=0.20;
        double total;
        
        compra=Double.parseDouble(JOptionPane.showInputDialog("digite el valor de la compra"));
        
        if(compra<300){
            JOptionPane.showMessageDialog(null, "El valor de la compra es: "+compra);
        }else{
            descuento=compra*descuento;
            total=compra-descuento;
            JOptionPane.showMessageDialog(null, "El valor de la compra es: "+total);
        }
        
    
    }
}
