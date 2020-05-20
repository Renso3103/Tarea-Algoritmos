package TDA;


public class Doubly implements List {

    NodeList inicio;

    public Doubly() {
        inicio = null;
    }//Fin

    @Override
    public int size() throws ListException {
        if (isEmpty()) {
            throw new ListException("La lista no tiene elementos");
        }
        NodeList aux = inicio;
        int cont = 0;
        while (aux != null) {
            cont++;
            aux = aux.next;
        }
        return cont;
    }//Fin

    @Override
    public void clear() {
        inicio = null;
    }//Fin

    @Override
    public boolean isEmpty() {
        return inicio == null;
    }//Fin

    @Override
    public boolean contains(Object element) throws ListException {
        if (isEmpty()) {
            throw new ListException("La lista esta vacia");
        }
        NodeList aux = inicio;
        while (aux != null) {
            if (aux.data.equals(element)) {
                return true;
            }
            aux = aux.next;
        }
        return false;
    }//Fin

    @Override
    public void add(Object element) {
        NodeList aux = inicio;
        NodeList nuevoNodo = new NodeList(element);
        if (isEmpty()) {
            inicio = new NodeList(element);
            System.out.println("Se agregó el elemento: " + element);
        } else {
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = nuevoNodo;
            nuevoNodo.prev = aux;
        }
        System.out.println("Se agregó el elemento: " + element);
    }//Fin

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
        NodeList nuevoNodo = new NodeList(element);
        //La lista esta vacia
        if (isEmpty()) {
            inicio = nuevoNodo;
        } else {
            if ((int) inicio.data > (int) element) {
                nuevoNodo.next = inicio;
                //doble enlace
                inicio.prev = nuevoNodo;
                inicio = nuevoNodo;
            } //para todos los otros casos
            else {
                NodeList auxAnt = inicio;
                NodeList aux = inicio.next;
                boolean insertado = false;
                while (aux != null && !insertado) {
                    if ((int) element < (int) aux.data) {
                        auxAnt.next = nuevoNodo;
                        //doble enlace
                        nuevoNodo.prev = auxAnt;
                        nuevoNodo.next = aux;
                        //doble enlace
                        aux.prev = nuevoNodo;
                        insertado = true;
                    }
                    auxAnt = aux;
                    aux = aux.next;
                }
                //se enlaza al final
                if (!insertado) {
                    auxAnt.next = nuevoNodo;
                    //oble enlace
                    nuevoNodo.prev = auxAnt;
                }//if
            }//else
            System.out.println("Se agregó el elemento: " + element);
        }
    }//Fin

    @Override
    public void remove(Object element) throws ListException {
        if (isEmpty()) {
            throw new ListException("Está vacía");
        }
        NodeList aux = inicio;
        NodeList nodoAnterior = null;
        if (inicio.data.equals(element)) {
            inicio = inicio.next;
            inicio.prev = null;
        } else {
            while (aux.next != null && !aux.data.equals(element)) {
                nodoAnterior = aux;
                aux = aux.next;
            }
            if (aux.data.equals(element)) {
                NodeList nodoSgte = aux.next;
                nodoAnterior.next = nodoSgte;
                if (nodoSgte != null) {
                    nodoSgte.prev = nodoAnterior;
                }
            }
        }
        System.out.println("Se elimino el elemento: " + element);
    }//Fin

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
    }//Fin

    @Override
    public Object removeLast() throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        NodeList aux = this.inicio;
        while(aux.next!=null){
            aux = aux.next; //lo movemos al sgte nodo
        }
        //se sale del while cuando aux esta en el ult nodo
        Object element = aux.data;
        aux.prev.next = null; //elimino el ultimo nodo
        return element;
    }//Fin

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
    }//Fin

    @Override
    public Object getFirst() throws ListException {
        if (isEmpty()) {
            throw new ListException("La lista esta vacia");
        }
        return inicio.data;
    }//Fin

    @Override
    public Object getLast() throws ListException {
        if (isEmpty()) {
            throw new ListException("La lista esta vacia");
        }
        NodeList aux = inicio;
        while (aux.next == null) {
            aux = aux.next;
        }
        return aux.data;
    }//Fin

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
        if(index == 1){
            aux = inicio;
            return aux;
        }else{
            aux = inicio;
            for (int i = 2; i <= index; i++) {
                 aux = aux.next;
            }
            return aux;
        }
    }

    public String toString() {
        String result="Doubly Linked List: ";
        NodeList aux = inicio;
        while(aux!=null){
            result +=aux.data+", ";
            aux = aux.next;
        }
        return result;
    }
}
