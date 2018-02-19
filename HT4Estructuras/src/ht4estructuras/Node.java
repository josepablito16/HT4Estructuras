/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */

package ht4estructuras;


public class Node<E> 
{
    protected E data; // value stored in this element
   protected Node<E> nextElement; // ref to next

   /**
    * Constructor para la clase Node
    * @param v valor
    * @param next  referencia al siguiente node
    * pre: v is a value, next is a reference to remainder of list
    * post: an element is constructed as the new head of list
    */
   public Node(E v, Node<E> next) 
   {
       data = v;
       nextElement = next;
   }

   /**
    * Segundo constructor para un solo elemento
    * @param v valor
    * post: constructs a new tail of a list with value v
    */
   public Node(E v)
   {
      this(v,null);
   }

   /**
    * Metodo que regresa referencia al siguiente elemento
    * post: returns reference to next value in list
    * @return siguiente elemento 
    */
   public Node<E> next()
   {
      return nextElement;
   }

   /**
     * sets reference to new next value
     * @param next valor siguiete al referido
     */    
   public void setNext(Node<E> next)
   {
      nextElement = next;
   }

   /**
     * returns value associated with this element
     * @return devuelve el valor del elemento
     */
   public E value()
   {
      return data;
   }

   /**
    * Agrega un valor al nodo actual
    * @param value valor a ingresar 
    * post: sets value associated with this element
    */
   public void setValue(E value)
   {
      data = value;
   }
    
    
    
}
