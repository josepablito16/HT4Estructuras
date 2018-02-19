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

	public StackArrayList()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<E>();
	}
        /**
    * Metodo para agregar un elemento
    * @param item elemento a ser ingresado
    */
	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}
        /**
    * Metodo que regresa el ultimo elemento y lo elimina.
    */
	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}
        /**
    * Metodo que regresa el item que ingreso de ultimo  
    */
	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
        /**
    * Metodo para saber cuantos elementos hay en el stack
    */
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
        /**
    * Metodo para saber si contiene algo el stack
    */
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
    
    
}
