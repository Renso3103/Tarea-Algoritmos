/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;
/**
 *
 * @author eduardo
 */
public class CircularDoubly implements List {

    NodeList inicio, fin;

    public CircularDoubly() {
        inicio = fin = null;
    }

    @Override
    public int size() throws ListException {
        if (isEmpty()) {
            return 0;
        }
        NodeList aux = inicio;
        int cont = 0;
        while (aux != fin) {
            cont++;
            aux = aux.next;
        }
        return cont + 1;
    }

    @Override
    public void clear() {
        inicio = fin = null;
    }

    @Override
    public boolean isEmpty() {
        return inicio == null;
    }

    @Override
    public boolean contains(Object element) throws ListException {
        if (isEmpty()) {
            throw new ListException("La lista esta vacia");
        }
        NodeList aux = inicio;
        while (aux != fin) {
            if (aux != null) {
                if (aux.data.equals(element)) {
                    return true;
                }
                aux = aux.next;
            }
        }
        return false;
    }

    @Override
    public void add(Object element) {
        NodeList aux = inicio;//permite movernos por la lista
        NodeList nuevoNodo = new NodeList(element);
        if (isEmpty()) {
            inicio = fin = nuevoNodo;
        } else {
            while (aux != fin) {
                aux = aux.next;// mueve aux al sgte nodo
            }//se sale al llegar al final
            aux.next = nuevoNodo;
            nuevoNodo.prev = aux;//realizamos el doble enlace
            fin = nuevoNodo;//se pone fin a apuntar al nuevo nodo
        }//fin del else
        //realizamos el doble enlace circular
        fin.next = inicio;
        inicio.prev = fin;
    }

    @Override
    public void addFirst(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addLast(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addInSortedList(Object element) {
        NodeList aux = inicio;//permite movernos por la lista
        NodeList nuevoNodo = new NodeList(element);
        int ordenado = 0;
        if (isEmpty()) {
            inicio = fin = nuevoNodo;
        } else if ((int) element <= (int) inicio.data) {
            nuevoNodo.next = inicio;
            inicio = nuevoNodo;
            nuevoNodo.next.prev = inicio;
            nuevoNodo.prev = fin;
        } else {
            while (aux != fin) {
                if ((int) aux.data <= (int) element
                        && (int) aux.next.data >= (int) element)//ya lo encontro
                {
                    nuevoNodo.next = aux.next;
                    aux.next.prev = nuevoNodo;
                    aux.prev.next = nuevoNodo;
                    nuevoNodo.prev = aux;
                    ordenado = 1;
                    break;
                }
                aux = aux.next;
            }//fin del while
            if (ordenado == 0 && (int) aux.data < (int) nuevoNodo.data) {
                aux.next = nuevoNodo;
                nuevoNodo.prev = aux;//realizamos el doble enlace
                fin = nuevoNodo;//se pone fin a apuntar al nuevo nodo
            }
        }//else

        //realizamos el doble enlace circular
        fin.next = inicio;
        inicio.prev = fin;

        System.out.println("Se agrego el elemento: " + element);
    }

    @Override
    public void remove(Object element) throws ListException {
        if (isEmpty()) {
            throw new ListException("La lista esta vacia");
        }
        //caso1. El elemento a suprimir es el primero
        if (inicio.data.equals(element)) {
            inicio = inicio.next;
        } //caso2. Elemento puede estar en medio o al final
        else {
            NodeList auxAnt = inicio;
            NodeList aux = inicio.next;
            while (aux != fin && !aux.data.equals(element)) {
                auxAnt = aux;
                aux = aux.next;
            }
            //se sale cuando aux==fin
            //o cuando encuentra el elemento a suprimir
            if (aux.data.equals(element)) {
                //desenlanza el nodo
                auxAnt.next = aux.next;
                //mantengo el doble enlace
                if (aux.next != null) {
                    aux.next.prev = auxAnt;
                }
            }
            //debo asegurarme q fin apunte al ultimo nodo
            if (aux == fin) { //estamos en el ultimo nodo
                fin = auxAnt;
            }
        }
        //mantengo el enlace circular
        fin.next = inicio;
        //q pasa si solo queda un nodo
        //y es el q quiero eliminar
        if (inicio == fin && inicio.data.equals(element)) {
            clear(); //anulo la lista
        }
    }

    @Override
    public Object removeFirst() throws ListException {
        if (isEmpty()) {
            throw new ListException("Está vacía");
        }
        Object element = this.inicio.data;
        this.inicio = this.inicio.next; //muevo el apuntador al sgte nodo
        //rompo el doble enlace
        this.inicio.prev = null;
        return element;
    }

    @Override
    public Object removeLast() throws ListException {
        if (this.isEmpty()) {
            throw new ListException("Singly Linked List is Empty");
        }
        NodeList aux = this.inicio;
        while (aux.next != null) {
            aux = aux.next; //lo movemos al sgte nodo
        }
        //se sale del while cuando aux esta en el ult nodo
        Object element = aux.data;
        aux.prev.next = null; //elimino el ultimo nodo
        return element;
    }

    @Override
    public void sort() throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object element) throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getFirst() throws ListException {
        if (isEmpty()) {
            throw new ListException("La lista esta vacia");
        }
        return inicio.data;
    }

    @Override
    public Object getLast() throws ListException {
        if (isEmpty()) {
            throw new ListException("La lista esta vacia");
        }
        return fin.data;
    }

    @Override
    public Object getPrev(Object element) throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getNext(Object element) throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NodeList getNode(int index) throws ListException {
        NodeList aux = null;
        if (index == 1) {
            aux = inicio;
            return aux;
        } else {
            aux = inicio;
            for (int i = 2; i <= index; i++) {
                aux = aux.next;
            }
            return aux;
        }
    }

    @Override
    public String toString() {
        String result = "";
        NodeList aux = inicio;
        while (aux != fin) {
            result += aux.data + ", ";
            aux = aux.next;
        }
        return result + aux.data;
    }
}
