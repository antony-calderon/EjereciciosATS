
package ejercicios_Bucles;

import javax.swing.JOptionPane;

/* Dadas las edades y alturas de 5 alumnos, mostrar la edad y
la estatura media, la cantidad de alumnos mayores de 18 años,
y la cantidad de alumnos que miden mas de 1.75
*/
public class Datos_alumnos {
    public static void main(String[] args) {
        int edad, suma_edad=0, mayores_18=0, mayores_altura=0;
        float altura, suma_altura=0, edad_media, altura_media;
        
        for(int i=1; i<=5; i++){
            edad=Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+"\ningresa la edad"));
            altura=Float.parseFloat(JOptionPane.showInputDialog("Alumno "+i+"\ndigita la estatura"));
            
            suma_edad+=edad;
            suma_altura+=altura;
            
            if(edad>18){
                mayores_18++;
            }
            if(altura>1.75){
                mayores_altura++;
            }
        }
        JOptionPane.showMessageDialog(null, "Edad media: "+suma_edad/5+"\n"
                                        + "Estatura media: "+suma_altura/5+"\n"
                                        + "Alumnos mayores de 18 años: "+mayores_18+"\n"
                                        + "Alumnos que miden mas de 1.75: "+mayores_altura);
    }
}
