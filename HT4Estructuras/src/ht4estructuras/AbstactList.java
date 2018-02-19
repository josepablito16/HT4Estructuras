/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */
package ht4estructuras;


public abstract class AbstactList<E> implements List<E>
{
    public AbstactList()
    // post: does nothing        
    {}
    
    /**
    * Metodo para agregar un elemento
    * @param item elemento a igresar
    */
    public void push(E item)
    {
        addLast(item);
    
    }
   
   /**
    * Metodo que regresa el ultimo elemento y lo elimina.

    */
   public E pop()
   {
       
       return removeLast();
   }
  
   /**
    * Metodo que regresa el item que ingreso de ultimo  
    */
   public E peek()
   {
       return getLast();
       
   }
   
   /**
    * Metodo para saber si contiene algo el stack
    */
   public boolean empty()
   {
       return size()==0;
   }
   
   /**
    * Metodo para saber cuantos elementos hay en el stack
    */
   public int size()
   {
       return 0;
   }
   
 
   
    
    
    
    
    
    
}
