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

   /**
    * Constructor para la clase lista simple
    * post: generates an empty list
    */
   public SinglyLinkedList()
   {
      head = null;
      count = 0;
   }
   
   /**
     * esto devuelve el valor del tamaño de la lista
     * @return cantidad de datos en la lista
     * post: returns number of elements in list
     */
   public int size()
  {
    return count;
  }
   
   /**
     * Agrega un valor al final de la lista circular
     * @param value valor a agregar
     * pre: value non-null
     * post: adds element to tail of list 
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
     * Limpia la lista de los nodos y datos en el
     *  post: empties list
     */
   public void clear()
   {
       head=null;
       count=0;
   }
   
    /**
     * Devuelve el valor ultimo de la lista
     * @return el ultimo elemento de la lista
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
     * Remueve el ultimo valor agregado
     * @return devuelve el valor a su nodo
     * pre: !isEmpty()
     * post: returns and removes value from tail of list
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
