
package tareaarreglos;

import java.util.Scanner;

public class Ejercicio4 {
    
    Scanner ent = new Scanner(System.in);
    private int [][] array;
    private int [] vector;
    private int n,m,mayor,menor,celdas;
    private String pmayor, pmenor;
    
    public Ejercicio4 () {
        System.out.println("Introduce la cantidad de filas de la matriz (m): ");
        n=ent.nextInt();
        System.out.println("Introduce la cantidad de columnas de la matriz (n): ");
        m=ent.nextInt();
        celdas=n*m;
        System.out.println("");
        array = new int[n][m];
        
        System.out.println("Generando numeros aleatorios en la matriz...");
        
        System.out.println("");
       
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                
                System.out.println("Introduce el numero en la posicion (" + (i+1) + "," + (j+1) + ")");
	        array[i][j] = ent.nextInt();	
				
            }
            
        }
        System.out.println("");
        
        
        mayor = array[0][0]; //Arreglo acumulador de numero mayor
        menor = array[0][0]; //Arreglo acumulador de numero menor

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               if(array[i][j] > mayor){
                   mayor = array[i][j];
                   pmayor = "(" + (i+1) + "," + (j+1) + ")"; //Posicion de numero mayor en la matriz
               }
               if(array[i][j] < menor){
                    menor = array[i][j];
                    pmenor = "(" + (i+1) + "," + (j+1) + ")"; //Posicion de numero menor en la matriz
               }
                
            }     
       
        }
        
        //Imprimiendo matriz
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("");    
        }
        
        System.out.println("");
        
        System.out.println("El numero "+ mayor +" en la posicion " + pmayor + " es el mayor");
	System.out.println("El numero "+ menor +" en la posicion " + pmenor + " es el menor");
        
        
    
    }
    
}
