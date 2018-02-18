/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */
package ht4estructuras;


public interface List<E> extends Stack<E>
{
    public int size();
   // post: returns number of elements in list

   public void clear();
   // post: empties list

   public void addLast(E value);
   // post: value is added to end of list

   public E getLast();
   // pre: list is not empty
   // post: returns last value in list

   public E removeLast();
   // pre: list is not empty
   // post: removes last value from list
   
    
}
