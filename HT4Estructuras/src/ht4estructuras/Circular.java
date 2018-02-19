/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */
package ht4estructuras;


public class Circular<E> extends AbstactList<E> 
{
    protected Node<E> tail; 
    protected int count;

    public Circular()
    // pre: constructs a new circular list
    {
       tail = null;
       count = 0;
    }
    /**
     * este metodo se encarga de agregar en la lista cirular el valor como
     * primero
     * @param value valor a guardar 
     */
    public void addFirst(E value)
    // pre: value non-null
    // post: adds element to head of list
    {
        Node<E> temp = new Node<E>(value);
        if (tail == null) { // first value added
            tail = temp;
            tail.setNext(tail);
        } else { // element exists in list
            temp.setNext(tail.next());
            tail.setNext(temp);
        }
        count++;
     }
    
    @Override
    /**
     * agrega un valor al final de la lista
     */
    public void addLast(E value)
    // pre: value non-null
    // post: adds element to tail of list
    {
       // new entry:
       addFirst(value);
       tail = tail.next();  
    }
    
    // lo dificil es quitar el elemento de la cola
    /**
     * remueve el ultimo valor agregado
     * @return devuelve el valor a su nodo
     */
    public E removeLast()
    // pre: !isEmpty()
    // post: returns and removes value from tail of list
    {
       Node<E> finger = tail;
       while (finger.next() != tail) {
           finger = finger.next();
       }
       // finger now points to second-to-last value
       Node<E> temp = tail;
       if (finger == tail)
       {
           tail = null;
       } else {
           finger.setNext(tail.next());
           tail = finger;
       }
       count--;
       return temp.value();
    }

    @Override
    /**
     * limpia la lsita de los nodos y datos en el
     */
    public void clear() 
    {
        tail = null;
        count = 0;
    }

    @Override
    /**
     * devuelve el valor ultimo de la lista
     */
    public E getLast() 
    {
        return tail.value();
    }
    /**
     * esto devuelve el valor del tamaño de la lista
     * @return cantidad de datos en la lista
     */
    public int size()
   {
       return count;
   }



    
    
    
    
}
