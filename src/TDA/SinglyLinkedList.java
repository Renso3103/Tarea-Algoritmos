
package TDA;

import java.io.Serializable;



/**
 *
 * @author eduardo
 */
public class SinglyLinkedList implements List, Serializable  {
    private NodeList first; //apuntador al inicio de la lista
    
    //Constructor
    public SinglyLinkedList(){
        this.first = null;
    }

    @Override
    public int size() throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        NodeList aux = first;
        int count = 0;
        //me muevo por la lista hasta el ultimo nodo
        while(aux!=null){
            count++;
            aux = aux.next;
        }
        return count;
    }

    @Override
    public void clear() {
        this.first = null;
    }

    @Override
    public boolean isEmpty() {
        return this.first==null;
    }

    @Override
    public boolean contains(Object element) throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        NodeList aux = first;
        //me muevo por la lista hasta el ultimo nodo
        while(aux!=null){
            if(Util.Utility.equals(aux.data, element)){
                return true;
            }
            aux = aux.next;
        }
        return false; //indica q el elemento no existe en la lista
    }

    @Override
    public void add(Object element) {
        NodeList newNode = new NodeList(element);
        if(this.isEmpty()){
            this.first = newNode;
        }
        else{
            NodeList aux = first;
            //me muevo por la lista hasta el ultimo nodo
            while(aux.next!=null){
                aux = aux.next;
            }
            //se sale cuando estoy en el ult nodo de la lista
            aux.next = newNode;
        }
    }

    @Override
    public void addFirst(Object element) {
        NodeList newNode = new NodeList(element);
        if(this.isEmpty()){
            this.first = newNode;
        }
        else{
            newNode.next = this.first;
            this.first = newNode; //para garantizar q first apunte al primer nodo
        }
    }

    @Override
    public void addLast(Object element) {
        this.add(element);
    }

    @Override
    public void addInSortedList(Object element) {
        NodeList nuevoNodo = new NodeList();
        if(isEmpty()){
            first = nuevoNodo;
            System.out.println("Se agregó el elemento: "+element);
        }else{
            int primer = (int) first.data;
            if(primer > (int) element){
               nuevoNodo.next = first;
               first = nuevoNodo;
            }else{
                NodeList auxAnt = first;
                NodeList aux = first.next;
                boolean insertado=false;
                while(aux!=null&&!insertado){
                    if((int) element < (int)aux.data){
                        auxAnt.next = nuevoNodo;
                        nuevoNodo.next = aux;
                        insertado=true;
                    }
                    auxAnt=aux;
                    aux=aux.next;
                }
                if(!insertado){
                    auxAnt.next = nuevoNodo;
                }
            }
            System.out.println("Se agregó el elemento: "+element);
        }
    }

    @Override
    public void remove(Object element) throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        //Caso 1. El elemento a suprimir es el primero de la lista
        if(Util.Utility.equals(first.data, element)){
            this.first = this.first.next;
        }
        //Caso 2. El elemento a suprimir puede estar en cualquir otra parte
        else{
            NodeList aux = first.next; //apuntador al nodo sgte
            NodeList aux2 = first; //apuntador al nodo anterior
            while(aux!=null&&!Util.Utility.equals(aux.data, element)){
                aux2 = aux; //dejamos un rastro
                aux = aux.next; //lo movemos al sgte nodo
            }
            //se sale del while cuando alcanza nulo o cuando encuentra el elemento
            if(aux!=null&&Util.Utility.equals(aux.data, element)){
                //requerimos desenlazar el nodo con el elemento a suprimir
                aux2.next = aux.next;
            }
        }
    }

    @Override
    public Object removeFirst() throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        Object element = this.first.data;
        this.first = this.first.next; //muevo el apuntador al sgte nodo
        return element;
    }

    @Override
    public Object removeLast() throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        NodeList aux = this.first;
        NodeList aux2 = first; //va a ser un apuntador al nodo anterior
        while(aux.next!=null){
            aux2 = aux; //dejo un rastro al nodo anterior
            aux = aux.next; //lo movemos al sgte nodo
        }
        //se sale del while cuando aux esta en el ult nodo
        Object element = aux.data;
        aux2.next = null; //elimino el ultimo nodo
        return element;
    }

    @Override
    public void sort() throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object element) throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        NodeList aux = first;
        int index=1; //el primer nodo va a estar en el indice 1
        //me muevo por la lista hasta el ultimo nodo
        while(aux!=null){
            if(Util.Utility.equals(aux.data, element)){
                return index;
            }
            index++;
            aux = aux.next;
        }
        return -1; //indica q el elemento no existe
    }

    @Override
    public Object getFirst() throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        return this.first.data;
    }

    @Override
    public Object getLast() throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        NodeList aux = first;
        while(aux.next !=null){
            aux = aux.next; //lo movemos al sgte nodo
        }
        //cuando se sale del while, estamos en el ultimo nodo
        return aux.data; //retorna el elemento almacenado en el ult nodo
    }

    @Override
    public Object getPrev(Object element) throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        //Caso 1. Si es el inicio, no tiene anterior
        if(Util.Utility.equals(first.data, element)){
            return "Es el inicio, no tiene anterior";
        }
        //Caso 2. Todo lo demas
        NodeList aux = first;
        while(aux.next!=null){
            if(Util.Utility.equals(aux.next.data, element)){
                return aux.data;
            }
            aux = aux.next;
        }
        return "El elemento no existe en la lista";
    }

    @Override
    public Object getNext(Object element) throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        NodeList aux = first;
        while(aux!=null){
            if(Util.Utility.equals(aux.data, element)){
                if(aux.next!=null){
                    return aux.next.data;
                }else{
                    return "no tiene";
                }
            }
            aux = aux.next;
        }
        return "El elemento no existe en la lista";
    }

    @Override
    public NodeList getNode(int index) throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        NodeList aux = first;
        int i = 1; //posicion del primer nodo
        while(aux!=null){
            if(Util.Utility.equals(i, index)){
                return aux; //debera retornar todo el nodo
            }
            i++;
            aux = aux.next;
        }
        return null; //si llega aqui, quiere decir q no encontro el nodo
    }

    @Override
    public String toString() {
        String result="Singly Linked List: ";
        NodeList aux = first;
        while(aux!=null){
            result +=aux.data+", ";
            aux = aux.next;
        }
        return result;
    }
    
    public void switchFrom(SinglyLinkedList list2) throws ListException{
    
        if(this.isEmpty()||list2.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        
        NodeList auxList1, auxList2 = new NodeList();
        auxList1= (NodeList) getFirst();
        auxList2= (NodeList) list2.getFirst();
        
        this.addFirst(auxList1);
        list2.addFirst(auxList2);
        
    }//Fin switchFrom
    
    public SinglyLinkedList reLink(NodeList a,NodeList b,NodeList c,NodeList d) throws ListException {
        
        int cont = 0;
        
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        while (cont!=this.size() && getNode(cont) != a.data && 
                getNode(cont) != b.data && 
                getNode(cont) != c.data && 
                getNode(cont) != d.data ) {            
            this.remove(getNode(cont));
            
            cont ++;
        }
        
        return this;
        
    }//Fin reLink
    
}//Fin de la clase
