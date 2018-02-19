/**
 * @author Jose Cifuentes
 * @author Jump 
 * @version 17.02.2018
 */

package ht4estructuras;

import static java.lang.Double.NaN;


public class Calculadora 
{
     
    
    double d2;
    double n1,n2;
    Factory f=new Factory();
    private static Calculadora calc;
    /**
     * este es el singleto
     * @return regresa la isntancia de la clase claculadora
     */
    public static Calculadora getInstance()
    {
        if (calc==null) 
        {
            calc =new Calculadora();
            
        }
        return calc;
    }
    
    
    private Calculadora()
    {
    }
    
    /**
     * en esta clase se ejecutan las operaciones que devolveran el resultado
     * del texto leido 
     * @param expresion expresion a operar
     * @param tipo tipo de stack a utilizar
     * @return valor final de la operacion
     */
    public double operar(String expresion, String tipo) 
    {
        Stack<Double> x = f.getStack(tipo);
        
       
        for(int i=0;i<expresion.length();i++)
        {            
            try
            {               
               double d1 =  Double.parseDouble(Character.toString(expresion.charAt(i)));    
               x.push(d1);
                
           }catch(Exception e)
           {
               switch (expresion.charAt(i)) 
               {
                    case '+':
                       n1=x.pop();
                       n2=x.pop();
                       d2 =  n2+n1;
                       x.push(d2);            
                       break;
                       
                   case '-':
                       n1=x.pop();
                       n2=x.pop();
                       d2 =  n2-n1;
                       x.push(d2);            
                       break;    
                       
                    case '*':
                       n1=x.pop();
                       n2=x.pop();
                       d2 =  n2*n1;
                       x.push(d2);            
                       break;   
                    
                       
                    case '/':
                       n1=x.pop();
                       n2=x.pop();
                       
                        if (n1==0) 
                        {
                            d2=NaN;                            
                        }
                        else
                        {
                            d2=n2/n1;
                        }
                      
                      
                       x.push(d2);            
                       break;    
                }
            }
            }
        return x.pop();
       }
    
}
