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
public class Factory 
{
    Factory(){}
    
    public static Stack getStack(String opcion) 
    {
        
        if (opcion.equals("1")) 
        {
            return new StackArrayList();
            
        }
        else if(opcion.equals("2"))
        {
            return new StackVector();
        }
        else if (opcion.equals("3.1"))
        {
            return new SinglyLinkedList();
        }
        else
        {
            return new StackArrayList();
        }
        
        
    }
    
    
}
