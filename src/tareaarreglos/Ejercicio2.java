
package tareaarreglos;
import java.util.Scanner; //Sirve para leer valores con el teclado


public class Ejercicio2 {
    
    Scanner ent = new Scanner(System.in);
    private int [][] array;
    private int n, m, cont=0; //cont = contador desde cero
    
    public Ejercicio2 () {
        System.out.println("Introduce la cantidad de filas para la matriz: ");
        n=ent.nextInt();
        System.out.println("Introduce la cantidad de columnas para la matriz");
        m=ent.nextInt();
        System.out.println("");
        array = new int[n][m];
        
        //Generando la matriz
        for (int i = (array.length - 1); i >= 0; i--) {
            for (int j = 0; j < array[i].length; j++) {
                if(cont==j){ 
                    array[i][j]=0;
                }else{
                    array[i][j]=1;
                }
            }
            cont++;    
        }
        
        //Imprimiendo la matriz
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("");
            
        }
        
        
    
    }
    
}

