/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

import java.io.Serializable;


public class NodeList implements Serializable{
    public Object data; //objeto almacenado
    public NodeList next; //apuntador al sgte nodo
    public NodeList prev; //apuntador al nodo anterior
    
    //Constructor
    public NodeList(Object data){
        this.data = data;
        this.next = this.prev = null;
    }
    
    //Constructor sobrecargado
    public NodeList(){
        this.prev = this.next = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public NodeList getNext() {
        return next;
    }

    public void setNext(NodeList next) {
        this.next = next;
    }
    
    
}
