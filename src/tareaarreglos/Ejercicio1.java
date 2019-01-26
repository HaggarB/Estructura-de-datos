
package tareaarreglos;
import java.util.Scanner; //Sirve para leer valores con el teclado


public class Ejercicio1 {
    
    Scanner ent = new Scanner(System.in); //Objeto para introducir valores con el teclado
    private int [][] array;
    private int n, m;
    
    public Ejercicio1 () {
        System.out.println("Introduce la cantidad de filas para la matriz: ");
        n=ent.nextInt();
        System.out.println("Introduce la cantidad de columnas para la matriz");
        m=ent.nextInt();
        System.out.println("");
        array = new int[n][m];
        
        
        //Generando la matriz
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i==j){
                    array[i][j]=1; //Si el valor de la fila es igual al de la columna, agrega un 1
                }else{
                    array[i][j]=0; //Si el valor de la fila es diferente al de la columna, agrega un 0
                }
            }
            
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
