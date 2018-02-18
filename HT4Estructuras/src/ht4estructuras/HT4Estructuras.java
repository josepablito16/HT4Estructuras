/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */

package ht4estructuras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HT4Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        
        String linea;
        Calculadora calcu = new Calculadora();    
        Scanner teclado= new Scanner(System.in);
        
        //File archivo = new File ("./Fuente.txt");   
        File archivo = new File ("C:\\Users\\jose\\Desktop\\DISEÑO\\TRABAJOS\\"
                + "UVG\\3er Semestre\\Estructura de Datos\\HT4\\HT4Estructuras\\"
                + "HT4Estructuras\\src\\ht4estructuras\\Fuente.txt");
        
        
        
        while(true)
        {
        
        System.out.println("Ingrese la opcion dependiendo de la implementacio que quiera");
        System.out.println("1. Hacer operacion con StackArrayList");
        System.out.println("2. Hacer operacion con StackVector");
        System.out.println("3.1. Hacer operacion con StackSinglyLinkedList");
        System.out.println("10. Salir");
        System.out.println("\n");
        
        System.out.print("\n  Ingrese la Opcion: ");
        String tipo=teclado.nextLine();
        
        
            if (tipo.equals("10")) 
            {
                break;
                
            }
            
            FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
            
            
                
        while ( (linea = br.readLine()) != null)
        {      
            calcu.operar(linea,tipo);
            if(Double.isNaN(calcu.operar(linea,tipo)))
            {
                System.out.println("No se pudo realizar la operación");
                
            } else {
                System.out.println("\n El resultado es: ");
                System.out.println(calcu.operar(linea,tipo));
                System.out.println("\n");
            }
            
         
        }
        tipo="";
        }
        
        
        
        
        
    }
    
}
