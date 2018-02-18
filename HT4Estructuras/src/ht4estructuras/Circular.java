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
    public void addLast(E value)
    // pre: value non-null
    // post: adds element to tail of list
    {
       // new entry:
       addFirst(value);
       tail = tail.next();  
    }
    
    // lo dificil es quitar el elemento de la cola

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
    public void clear() 
    {
        tail = null;
        count = 0;
    }

    @Override
    public E getLast() 
    {
        return tail.value();
    }
    
    public int size()
   {
       return count;
   }



    
    
    
    
}
