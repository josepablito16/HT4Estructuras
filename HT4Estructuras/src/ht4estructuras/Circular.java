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

    /**
     * Constructor de la lista circular
     * pre: constructs a new circular list
     */
    public Circular()
    {
       tail = null;
       count = 0;
    }
    /**
     * Este metodo se encarga de agregar en la lista cirular el valor al inicio
     * @param value valor a guardar 
     * pre: value non-null
     * post: adds element to head of list
     */
    public void addFirst(E value)
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
     * Agrega un valor al final de la lista circular
     * @param value valor a agregar
     * pre: value non-null
     * post: adds element to tail of list 
     */
    public void addLast(E value)
    {
       addFirst(value);
       tail = tail.next();  
    }
    
    
    /**
     * Remueve el ultimo valor agregado
     * @return devuelve el valor a su nodo
     * pre: !isEmpty()
     * post: returns and removes value from tail of list
     */
    public E removeLast()
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
     * Limpia la lista de los nodos y datos en el
     */
    public void clear() 
    {
        tail = null;
        count = 0;
    }

    @Override
    /**
     * Devuelve el valor ultimo de la lista
     * @return el ultimo elemento de la lista
     */
    public E getLast() 
    {
        return tail.value();
    }
    
    /**
     * Esto devuelve el valor del tamano de la lista
     * @return cantidad de datos en la lista
     */
    public int size()
   {
       return count;
   }



    
    
    
    
}
