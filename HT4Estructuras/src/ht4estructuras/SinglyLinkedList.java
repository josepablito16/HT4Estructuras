/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht4estructuras;

/**
 *
 * @author jose
 */
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
   
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }
  

  
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
   
   public void clear()
   {
       head=null;
       count=0;
   }
   
   public E getLast()
   {
       Node node=head;
       while((node.next()!=(null)))
       {
           node=node.next();
       }
       
       return (E)node.data;
   }
   
   public E removeLast()
   {
        Node node = head;
        Node temp = null;
        while (node.next() != null){
            temp = node;
            node = node.next();
        }
        temp.nextElement = null;
        count--;
        return (E)node.data;
           
   }
   
   
    
    
    
}
