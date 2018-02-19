/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */

package ht4estructuras;

public interface Stack<E> 
{
    /**
    * Metodo para agregar un elemento
    * @param item 
    */
    public void push(E item);
   
   /**
    * Metodo que regresa el ultimo elemento y lo elimina.
    */
   public E pop();
  
   /**
    * Metodo que regresa el item que ingreso de ultimo  
    */
   public E peek();
   
   /**
    * Metodo para saber si contiene algo el stack
    */
   public boolean empty();
   
   /**
    * Metodo para saber cuantos elementos hay en el stack
    */
   public int size();
   
    
}
