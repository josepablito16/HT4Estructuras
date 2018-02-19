/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */
package ht4estructuras;

import java.util.ArrayList;


public class StackArrayList<E> implements Stack<E>
{
    
    protected ArrayList<E> data;
    
    /**
     * Constructor para la clase StackArrayList
     * post: constructs a new, empty stack
     */
	public StackArrayList()
	// 
	{
		data = new ArrayList<E>();
	}
        
   /**
    * Metodo para agregar un elemento
    * @param item elemento a ingresar
    * pre: nada.
    * post: item es agregado al stack
    */
	public void push(E item)
	{
		data.add(item);
	}
        
   /**
    * Metodo que regresa el ultimo elemento y lo elimina.
    * pre: el stack tiene mas de un elemento
    * post: el ultimo item es eliminado y retornado
    */
	public E pop()
	
	{
		return data.remove(size()-1);
	}
        
        /**
    * Metodo que regresa el item que ingreso de ultimo  
    * pre: el stack tiene mas de un elemento 
    * post: regresa el item que ingreso de ultimo
    */
	public E peek()
	{
		return data.get(size() - 1);
	}
	
        
   /**
    * Metodo para saber cuantos elementos hay en el stack
    * post: retorna el numero de elementos en el stack
    */
	public int size()
	{
		return data.size();
	}
        
    /**
    * Metodo para saber si contiene algo el stack
    * post: regresa true si no tiene ningun item
    */
	public boolean empty()
	{
		return size() == 0;
	}
    
    
}
