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

/**
 * Constructor de las listas dobles
 * post: constructs an empty list
 */
public DoubleLinkedList()
{
   head = null;
   tail = null;
   count = 0;
}

    /**
     * este metodo se encarga de agregar en la lista cirular el valor de primero
     * @param value valor a guardar 
     * pre: value is not null
     * post: adds element to head of list
     */
public void addFirst(E value)
{
   // construct a new element, making it head
   head = new DoublyLinkedNode<E>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}


/**
 * Agrega un valor al final de la lista
 * @param value valor a agregar
 * pre: value is not null
 * post: adds new value to tail of list
 */
public void addLast(E value)
{
   // construct new element
   tail = new DoublyLinkedNode<E>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}

 /**
     * Remueve el ultimo valor agregado
     * @return devuelve el valor a su nodo
     * pre: !isEmpty()
     * post: returns and removes value from tail of list
     */
public E removeLast()
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
     * Esto devuelve el valor del tamano de la lista
     * @return cantidad de datos en la lista
     */
public int size() 
{
    return count;
}

    /**
     * Limpia la lista de los nodos y datos en el
     */
public void clear() 
{
   head = null;
   tail = null;
   count = 0;
    
}

    /**
     * Devuelve el valor ultimo de la lista
     * @return el ultimo elemento de la lista
     */
public E getLast() 
{
    return tail.value();
}

    
    
}
