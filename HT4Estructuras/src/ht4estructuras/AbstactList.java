/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */
package ht4estructuras;


public abstract class AbstactList<E> implements List<E>
{
    
    /**
     * Constructor de la clase abstracta
     * post: does nothing
     */
    public AbstactList()        
    {}
    
    /**
    * Metodo que regresa el ultimo elemento y lo elimina.
    * pre: el stack tiene mas de un elemento
    * post: el ultimo item es eliminado y retornado
    * @param item elemento a ingresar 
    */
    public void push(E item)
    {
        addLast(item);
    
    }
   
   /**
    * Metodo que regresa el ultimo elemento y lo elimina.
    * pre: el stack tiene mas de un elemento
    * post: el ultimo item es eliminado y retornado
    */
   public E pop()
   {
       
       return removeLast();
   }
  
   /**
    * Metodo que regresa el item que ingreso de ultimo  
    * pre: el stack tiene mas de un elemento 
    * post: regresa el item que ingreso de ultimo
    */
   public E peek()
   {
       return getLast();
       
   }
   
   /**
    * Metodo para saber si contiene algo el stack
    * post: regresa true si no tiene ningun item
    */
   public boolean empty()
   {
       return size()==0;
   }
   
   /**
    * Metodo para saber cuantos elementos hay en el stack
    * post: retorna el numero de elementos en el stack
    */
   public int size()
   {
       return 0;
   }
   
 
   
    
    
    
    
    
    
}
