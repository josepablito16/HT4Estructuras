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
    
    /**
     * Constructor de la clase StackVector
     * post: constructs a new, empty stack
     */
    public StackVector()
    // 
    {
        data= new Vector<E>();
    }
    
    /**
    * Metodo para agregar un elemento
    * @param item elemento a ingresar
    * pre: nada.
    * post: item es agregado al stack
    */
    public void push(E item)
    {
        data.addElement(item);
    }
   
   /**
    * Metodo que regresa el ultimo elemento y lo elimina.
    * pre: el stack tiene mas de un elemento
    * post: el ultimo item es eliminado y retornado
    */
   public E pop()
   {
       return data.remove(data.size()-1);
       
   }
  
   /**
    * Metodo que regresa el item que ingreso de ultimo  
    * pre: el stack tiene mas de un elemento 
    * post: regresa el item que ingreso de ultimo
    */
   public E peek()
   {
       return data.get(data.size()-1);
   }
   
   /**
    * Metodo para saber si contiene algo el stack
    * post: regresa true si no tiene ningun item
    */
   public boolean empty()
   {
       return data.size()== 0;
   }
   
   /**
    * Metodo para saber cuantos elementos hay en el stack
    * post: retorna el numero de elementos en el stack
    */
   public int size()
   {
       return data.size();
   }
    
}
