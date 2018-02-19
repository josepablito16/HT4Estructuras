/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */

package ht4estructuras;

import java.util.Vector;


public class StackVector<E> implements Stack<E>
{
    protected Vector<E> data;
    
    public StackVector()
    // post: constructs a new, empty stack
    {
        data= new Vector<E>();
    }
    
    /**
    * Metodo para agregar un elemento
    * @param item elemento a ingresar a la lista
    */
    public void push(E item)
    {
        data.addElement(item);
    }
   
   /**
    * Metodo que regresa el ultimo elemento y lo elimina.
    */
   public E pop()
   {
       return data.remove(data.size()-1);
       
   }
  
   /**
    * Metodo que regresa el item que ingreso de ultimo  
    */
   public E peek()
   {
       return data.get(data.size()-1);
   }
   
   /**
    * Metodo para saber si contiene algo el stack
    */
   public boolean empty()
   {
       return data.size()== 0;
   }
   
   /**
    * Metodo para saber cuantos elementos hay en el stack
    */
   public int size()
   {
       return data.size();
   }
    
}
