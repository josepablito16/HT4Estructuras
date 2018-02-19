/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */
package ht4estructuras;


public class DoublyLinkedNode<E> 
{
        protected E data;
        protected DoublyLinkedNode<E> nextElement;
        protected DoublyLinkedNode<E> previousElement;

        /**
         * Constructor de la nodo doble
         * @param v datos
         * @param next siguiente elemento
         * @param previous elemento previo
         */
        public DoublyLinkedNode(E v,DoublyLinkedNode<E> next,DoublyLinkedNode<E> previous)
        {
            data = v;
            nextElement = next;
            if (nextElement != null)
                nextElement.previousElement = this;
            previousElement = previous;
            if (previousElement != null)
                previousElement.nextElement = this;
        }

        /**
         * Segundo constructor
         * @param v elemento
         * post: constructs a single element
         */
        public DoublyLinkedNode(E v)
        {
            this(v,null,null);
        }
        
        
        /**
         * devuleve el siguiente valor de la lista
         * @return referencia la siguietne valor de la lista
         */
        public DoublyLinkedNode<E> next()  
        {
           return nextElement;
        }
        
    /**
     * sets reference to new next value
     * @param next valor siguiete al referido
     */    
    public void setNext(DoublyLinkedNode<E> next)   
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
   
   /**
    * agregar valor al nodo anterior
    * @param next objeto de tipo nodoDoble
    * post: sets reference to new next value
    */
   public void setPrevious(DoublyLinkedNode<E> next)
   {
      previousElement = next;
   }
   
   /**
    * da referencia al nodo anterior
    * @return elemento anterior
    * post: returns reference to next value in list
    */
     public DoublyLinkedNode<E> previous()

        {
           return previousElement;
        }
    
    
}
