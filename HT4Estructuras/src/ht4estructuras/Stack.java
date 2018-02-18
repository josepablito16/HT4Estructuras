
package ht4estructuras;

/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */

public interface Stack<E> 
{
    /**
    * Metodo para agregar un elemento
    * @param item 
    * @pre nada.
    * @post item es agregado al stack
    */
    public void push(E item);
   
   /**
    * Metodo que regresa el ultimo elemento y lo elimina.
    * @pre el stack tiene mas de un elemento
    * @post el ultimo item es eliminado y retornado
    */
   public E pop();
  
   /**
    * Metodo que regresa el item que ingreso de ultimo  
    * @pre el stack tiene mas de un elemento 
    * @post regresa el item que ingreso de ultimo
    */
   public E peek();
   
   /**
    * Metodo para saber si contiene algo el stack
    * @post regresa true si no tiene ningun item
    */
   public boolean empty();
   
   /**
    * Metodo para saber cuantos elementos hay en el stack
    * @post retorna el numero de elementos en el stack
    */
   public int size();
   
    
}
