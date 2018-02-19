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
        Calculadora calcu = Calculadora.getInstance();    
        Scanner teclado= new Scanner(System.in);
        
        File archivo = new File ("./Fuente.txt");   

        
        while(true)
        {
            System.out.println("***********************************************************");
        System.out.println("Ingrese la opcion dependiendo de la implementacio que quiera \n");
        System.out.println("1. Hacer operacion con StackArrayList");
        System.out.println("2. Hacer operacion con StackVector");
        System.out.println("3.1. Hacer operacion con StackSinglyLinkedList");
        System.out.println("3.2. Hacer operacion con StackCircularList");
        System.out.println("3.3. Hacer operacion con StackDoublyList");
        System.out.println("4. Salir");
        System.out.println("***********************************************************");
        System.out.println("\n");
        
        System.out.print("\n  Ingrese la Opcion: ");
        String tipo=teclado.nextLine();
        
        
            if (tipo.equals("4")) 
            {
                break;
                
            }
            
            FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
            
            if ((tipo.equals("1"))|| (tipo.equals("2"))||(tipo.equals("3.1"))||(tipo.equals("3.2"))||(tipo.equals("3.3"))) 
            {
                
            
                
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
            }else{System.out.println("\n Ingrese una opcion valida por favor! \n");}
        
        }
        
        
        
        
        
    }
    
}
