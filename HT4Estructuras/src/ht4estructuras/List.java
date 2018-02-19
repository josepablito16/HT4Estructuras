/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */
package ht4estructuras;


public interface List<E> extends Stack<E>
{
    /**
     * esto devuelve el valor del tamaño de la lista
     * @return cantidad de datos en la lista
     */
    public int size();
    /**
     * limpia la lsita de los nodos y datos en el
     */
   public void clear();
   // post: empties list
  
   /**
     * agrega un valor al final de la lista
     */
   public void addLast(E value);
   // post: value is added to end of list
   
   /**
     * devuelve el valor ultimo de la lista
     */
   public E getLast();
   /**
     * remueve el ultimo valor agregado
     * @return devuelve el valor a su nodo
     */
   public E removeLast();
   // pre: list is not empty
   // post: removes last value from list
   
    
}
