/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht4estructuras;

import java.util.Vector;

/**
 *
 * @author jose
 */
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
    * @param item 
    * @pre nada.
    * @post item es agregado al stack
    */
    public void push(E item)
    {
        data.addElement(item);
    }
   
   /**
    * Metodo que regresa el ultimo elemento y lo elimina.
    * @pre el stack tiene mas de un elemento
    * @post el ultimo item es eliminado y retornado
    */
   public E pop()
   {
       return data.remove(data.size()-1);
       
   }
  
   /**
    * Metodo que regresa el item que ingreso de ultimo  
    * @pre el stack tiene mas de un elemento 
    * @post regresa el item que ingreso de ultimo
    */
   public E peek()
   {
       return data.get(data.size()-1);
   }
   
   /**
    * Metodo para saber si contiene algo el stack
    * @post regresa true si no tiene ningun item
    */
   public boolean empty()
   {
       return data.size()== 0;
   }
   
   /**
    * Metodo para saber cuantos elementos hay en el stack
    * @post retorna el numero de elementos en el stack
    */
   public int size()
   {
       return data.size();
   }
    
}
