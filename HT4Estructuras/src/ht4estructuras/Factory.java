/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */
package ht4estructuras;


public class Factory 
{
    Factory(){}
    /**
     * este es el metodo del diseño de patrones el cual nos devuelve la instancia
     * del tipo de lista a usar
     * @param opcion opcion elegida por el usuario
     * @return instancia de lista a usar
     */
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
