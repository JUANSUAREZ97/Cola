/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola;

import java.util.LinkedList;

/**
 *
 * @author JUAN SUAREZ
 */
public class Cola <T extends Base>{
    
    
    private LinkedList<T> elementos;
    
    public Cola(){
        elementos=new LinkedList<>();
        
    }
    
    public void encolar(T elemento){
        elementos.addLast(elemento);
        
    }
    
    public T desencolar(){
        return elementos.removeFirst();
        
    }
    
    public boolean estaVacia(){
        return elementos.isEmpty();
    }
}
