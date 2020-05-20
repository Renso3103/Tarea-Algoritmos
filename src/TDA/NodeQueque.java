/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;


public class NodeQueque {
    public Object data; //objeto almacenado
    public NodeQueque next; //apuntador al sgte nodo
    
    //Constructor
    public NodeQueque(Object data){
        this.data = data;
        this.next = null;
    }
    
    //Constructor sobrecargado
    public NodeQueque(){
        this.next = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public NodeQueque getNext() {
        return next;
    }

    public void setNext(NodeQueque next) {
        this.next = next;
    }
    
    
}
