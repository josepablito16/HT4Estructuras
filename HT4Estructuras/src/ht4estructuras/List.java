/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */
package ht4estructuras;


public interface List<E> extends Stack<E>
{
    /**
     * Esto devuelve el valor del tamano de la lista
     * @return cantidad de datos en la lista
     */
    public int size();
    
    /**
     * Limpia la lista de los nodos y datos en el
     *  post: empties list
     */
   public void clear();
   
  
   /**
     * Agrega un valor al final de la lista circular
     * @param value valor a agregar
     * pre: value non-null
     * post: adds element to tail of list 
     */
   public void addLast(E value);
   
   
   /**
     * Devuelve el valor ultimo de la lista
     * @return el ultimo elemento de la lista
     */
   public E getLast();
   
   /**
     * Remueve el ultimo valor agregado
     * @return devuelve el valor a su nodo
     * pre: !isEmpty()
     * post: returns and removes value from tail of list
     */
   public E removeLast();
   
   
    
}
