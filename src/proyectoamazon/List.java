
package proyectoamazon;

/**
 *
 * @author luisarismendi
 */

public class List {
    //Métodos
    private Node head;
    private int length;

    public List(Node head) {
        this.head = head;
        if (head != null) {
            this.length = 1;
        } else {
            this.length = 0;
        }       
    }
    //Getters and Setters
    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }
    //Insertar al inicio
    public void insertStart(Object element){
        Node node = new Node(element);
        if (isEmpty()) {
            setHead(node);
        } else {
            node.setNext(getHead());
            setHead(node);
        }
        length++;
    }
    // Insertar al final
    public void insertEnd(Object element) {
        Node node = new Node(element);
        if (isEmpty()) {
            setHead(node);
        } else {
            Node pointer = getHead();
            while (pointer.getNext() != null) {
               pointer = pointer.getNext();
            }
        pointer.setNext(node);
        }
        length++;
        }
        //Si está vacio
    public boolean isEmpty() {
        return getHead() == null;
    }
        //Imprimir
    public void printList() {
        Node pointer = getHead();
        if (isEmpty()) {
            System.out.println("La lista esta vacia");} else {
        while (pointer.getNext() != null) {
            System.out.println(pointer.getElement());
            pointer = pointer.getNext();
        }
        System.out.println(pointer.getElement());
        }
    }
    //Elminar primero
    public void deleteFirst() {
        Node pointer = getHead();
        if (!isEmpty()) {
            setHead(pointer.getNext());
            pointer.setNext(null);
        }
    length--;
    }
    //eliminar último
    public void deleteLast() {
        Node pointer = getHead();
        if (!isEmpty()) {
            while (pointer.getNext().getNext() != null) {
                pointer = pointer.getNext();
            }
        pointer.setNext(null);
        }
    length--;
    }
   
}

