/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;


public class NodeStack {
    public Object data; //objeto almacenado
    public NodeStack next; //apuntador al sgte nodo
    
    //Constructor
    public NodeStack(Object data){
        this.data = data;
        this.next = null;
    }
    
    //Constructor sobrecargado
    public NodeStack(){
        this.next = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public NodeStack getNext() {
        return next;
    }

    public void setNext(NodeStack next) {
        this.next = next;
    }
    
    
}
