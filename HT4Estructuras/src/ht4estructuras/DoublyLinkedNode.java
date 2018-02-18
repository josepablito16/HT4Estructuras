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

        public DoublyLinkedNode(E v)
        // post: constructs a single element
        {
            this(v,null,null);
        }
        
        public DoublyLinkedNode<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }
    public void setNext(DoublyLinkedNode<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

   public E value()
   // post: returns value associated with this element
   {
      return data;
   }

   public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }
   
   public void setPrevious(DoublyLinkedNode<E> next)
   // post: sets reference to new next value
   {
      previousElement = next;
   }
     public DoublyLinkedNode<E> previous()
   // post: returns reference to next value in list
   {
      return previousElement;
   }
    
    
}
