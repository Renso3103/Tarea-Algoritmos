/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

public class Circular implements List {

    NodeList inicio, fin;

    public Circular() {
        inicio = fin = null;
    }

    @Override
    public int size() throws ListException {
        if (isEmpty()) {
            throw new ListException("La lista esta vacia");
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
        NodeList aux = inicio;
        NodeList nuevoNodo = new NodeList(element);
        if (isEmpty()) {
            inicio = fin = nuevoNodo;
        } else {
            while (aux != fin) {
                aux = aux.next;
            }
            aux.next = nuevoNodo;
            fin = aux.next;
        }
        fin.next = inicio;
        System.out.println("Se agrego el elemento: " + element);
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
                    aux.prev.next.next = nuevoNodo;
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
        } else {
            NodeList aux = inicio;
            NodeList nodoAnterior = null;
            if (inicio.data.equals(element)) {
                inicio = inicio.next;
            } else {
                while (aux != fin && !aux.data.equals(element)) {
                    nodoAnterior = aux;
                    aux = aux.next;
                }
                if (aux.data.equals(element)) {
                    nodoAnterior.next = aux.next;
                }
                if (aux == fin) {
                    fin = nodoAnterior;
                }
            }
        }
        fin.next = inicio;
        if (inicio == fin && inicio.data.equals(element)) {
            clear();
        }
        System.out.println("Se elimino al elemento: " + element);
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
       if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        NodeList aux = inicio;
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
        if (isEmpty()) {
            throw new ListException("La lista esta vacia");
        }
        if (inicio.data.equals(element)) {
            return "Es el inicio, no tiene anterior";
        }
        NodeList ant = inicio;
        NodeList aux = inicio.next;
        while (aux != fin) {
            if (aux.data.equals(element)) {
                return ant.data;
            }
            ant = aux;
            aux = aux.next;
        }
        if (aux.data.equals(element)) {
            return ant.data; //el elemento anterior
        }
        return "El elemento no existe en la lista";
    }

    @Override
    public Object getNext(Object element) throws ListException {
        if (isEmpty()) {
            return "la lista esta vacia";
        }
        NodeList aux = inicio;
        NodeList auxPosterior = inicio.next;
        while (aux != fin) {
            if (aux.data.equals(element)) {
                if (auxPosterior != fin) {
                    return auxPosterior.data;
                } else {
                    return "no tiene ";
                }

            }
            aux = aux.next;
            if (aux.next != null) {
                auxPosterior = aux.next;
            }
        }
        return "el elemento no existe";
    }

    @Override
    public NodeList getNode(int index) throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String toString() {
        String result = "LISTA CIRCULAR\n";
        NodeList aux = inicio;
        int cont = 1;
        while (aux != fin) {
            if (cont++ >= 30) {
                result += "\n";
                cont = 1;
            }
            result += aux.data + ", ";
            aux = aux.next;
        }
        return result += aux.next;
    }

}
