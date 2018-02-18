/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */
package ht4estructuras;


public class Factory 
{
    Factory(){}
    
    public static Stack getStack(String opcion) 
    {
        
        if (opcion.equals("1")) 
        {
            return new StackArrayList();
            
        }
        else if(opcion.equals("2"))
        {
            return new StackVector();
        }
        else if (opcion.equals("3.1"))
        {
            return new SinglyLinkedList();
        }
        else if (opcion.equals("3.2"))
        {
            return new Circular();
        }
        else if (opcion.equals("3.3"))
        {
            return new DoubleLinkedList();
        }
        else
        {
            return new StackArrayList();
        }
        
        
    }
    
    
}
