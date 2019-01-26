
package tareaarreglos;

import java.util.Scanner; 
import java.util.Random; //Utilizado para generar numeros aleatorios en la matriz

public class Ejercicio3 {
    
    Scanner ent = new Scanner(System.in);
    private int [][] array;
    private int [] vector;
    private int m, celdas; //Valor de fila y columna "m" y cantidad de celdas
    
    public Ejercicio3 () {
        System.out.println("Introduce las dimensiones de la matriz cuadrada (m*m): ");
        m=ent.nextInt();
        celdas=m*m; //El valor de celda sera equivalente a la 
        System.out.println("");
        array = new int[m][m];
        vector = new int [m];
        
        Random ran = new Random ();//Constructor generado para los numeros aleatorios
        
        System.out.println("Generando numeros aleatorios en la matriz...");
        System.out.println("");
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               
                array[i][j] = ran.nextInt(celdas)+1; //Utilizando el objeto Random multiplicado por la cantidad de celdas 
                                                     //mas 1 nos genera un numero aleatorio
                
                if(array[i][j] % 2 == 0){  //Si el numero ubicado en la celda del arreglo [i][j] es divisible entre 2 
                                           //se sumara al arreglo de vectores en la posicion [i]
                    vector[i] = vector[i] + array[i][j];
                
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
        System.out.println("");
        
        System.out.println("La suma de los numeros pares en filas es: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Fila "+(i+1)+": "+vector[i]+"\t");
        }
        System.out.println("");
        
        
    
    }
    
}
