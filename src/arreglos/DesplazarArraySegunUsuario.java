
import java.util.Scanner;




public class DesplazarArraySegunUsuario {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int tabla[]=new int[10];
        System.out.println("Llenar arreglo");
        
        //filling the array of 10 elements
        for(int i=0; i<10; i++){
            System.out.print((i+1)+". Digita un numero: ");
            tabla[i]=entrada.nextInt();
        }
        
        //ask the user for a number to move the position
        System.out.println("Digite el numero de desplazamientos");
        int des=entrada.nextInt();
        int des2=des;
        System.out.println("");
        
        int aux1=tabla[tabla.length-1];
        int aux2=tabla[tabla.length-2];
        int aux3=tabla[tabla.length-3];
        int aux4=tabla[tabla.length-4];
        int aux5=tabla[tabla.length-5];
        
        //moving the elements to the array
        while(des!=0){
            for(int i=8; i>=0;i--){
                tabla[i+1]=tabla[i];
            }
            des--;
        }
        
        if(des2==1){
            tabla[0]=aux1;
        }else if(des2==2){
            tabla[0]=aux2;
            tabla[1]=aux1;
        }else if(des2==3){
            tabla[0]=aux3;
            tabla[1]=aux2;
            tabla[2]=aux1;
        }else if(des2==4){
            tabla[0]=aux4;
            tabla[1]=aux3;
            tabla[2]=aux2;
            tabla[3]=aux1;
        }else if(des2==5){
            tabla[0]=aux5;
            tabla[1]=aux4;
            tabla[2]=aux3;
            tabla[3]=aux2;
            tabla[4]=aux1;
        }
        
        //print the array
        for(int elemento:tabla){
            System.out.println(elemento);
        }
        
    }
}
