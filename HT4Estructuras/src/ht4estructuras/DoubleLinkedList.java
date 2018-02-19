/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */
package ht4estructuras;


public class DoubleLinkedList<E> extends AbstactList<E>
{
    
    
protected int count;
protected DoublyLinkedNode<E> head;
protected DoublyLinkedNode<E> tail;

public DoubleLinkedList()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}

    /**
     * este metodo se encarga de agregar en la lista cirular el valor como
     * primero
     * @param value valor a guardar 
     */
public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new DoublyLinkedNode<E>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}

/**
     * agrega un valor al final de la lista
     */
public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
{
   // construct new element
   tail = new DoublyLinkedNode<E>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}

// lo dificil es quitar el elemento de la cola
    /**
     * remueve el ultimo valor agregado
     * @return devuelve el valor a su nodo
     */
public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
{
   DoublyLinkedNode<E> temp = tail;
   tail = tail.previous();
   if (tail == null) {
       head = null;
   } else {
       tail.setNext(null);
   }
   count--;
   return temp.value();
}
/**
     * esto devuelve el valor del tamaño de la lista
     * @return cantidad de datos en la lista
     */
public int size() 
{
    return count;
}
/**
* limpia la lsita de los nodos y datos en el
*/
   
public void clear() 
{
   head = null;
   tail = null;
   count = 0;
    
}
/**
     * devuelve el valor ultimo de la lista
     */
public E getLast() 
{
    return tail.value();
}

    
    
}
