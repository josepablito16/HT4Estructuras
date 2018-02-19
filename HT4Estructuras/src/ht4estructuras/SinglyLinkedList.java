/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */
package ht4estructuras;


public class SinglyLinkedList<E> extends AbstactList<E>
{
    
   protected int count; // list size
   protected Node<E> head; // ref. to first element

   public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }
   /**
     * esto devuelve el valor del tamaño de la lista
     * @return cantidad de datos en la lista
     */
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }
  /**
     * agrega un valor al final de la lista
     */
  public void addLast(E value)
  // post: adds value to end of list
  {
      // location for new value
      Node<E> c = new Node<E>(value,null);
      if (head != null)
     {
         // pointer to possible tail
         Node<E> o = head;
         while ((o.next()) != (null))
         {
                o = o.next();
         }
		 
         o.setNext(c);
      } else head = c;
	  
	  count+=1;
	  
   }
   /**
     * limpia la lsita de los nodos y datos en el
     */
   public void clear()
   {
       head=null;
       count=0;
   }
   /**
     * devuelve el valor ultimo de la lista
     */
   public E getLast()
   {
       Node node=head;
       while((node.next()!=(null)))
       {
           node=node.next();
       }
       
       return (E)node.data;
   }
   /**
     * remueve el ultimo valor agregado
     * @return devuelve el valor a su nodo
     */
   public E removeLast()
   {
       Node node1 = head;
        Node node2 = node1;
        while (node1.next() != null){
            node2 = node1;
            node1 = node1.next();
        }
        node2.nextElement = null;
        count--;
        return (E)node1.data;
           
   }
   
   
    
    
    
}
