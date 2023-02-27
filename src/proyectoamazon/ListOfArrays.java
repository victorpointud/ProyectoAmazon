
package proyectoamazon;

/**
 *
 * @author luisarismendi
 */

public class ListOfArrays {
    //Métodos
    private NodeOfArrays head;
    private int length;

    public ListOfArrays(NodeOfArrays head) {
        this.head = head;
        if (head != null) {
            this.length = 1;
        } else {
            this.length = 0;
        }       
    }
    //Getters and Setters
    public void setHead(NodeOfArrays head) {
        this.head = head;
    }

    public NodeOfArrays getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }
    //Insertar al inicio
    public void insertStart(String[] element){
        NodeOfArrays node = new NodeOfArrays(element);
        if (isEmpty()) {
            setHead(node);
        } else {
            node.setNext(getHead());
            setHead(node);
        }
        length++;
    }
    //Insertar al final
    public void insertEnd(String[] element) {
        NodeOfArrays node = new NodeOfArrays(element);
        if (isEmpty()) {
            setHead(node);
        } else {
            NodeOfArrays pointer = getHead();
            while (pointer.getNext() != null) {
               pointer = pointer.getNext();
            }
        pointer.setNext(node);
        }
        length++;
        }
        //Si está vacío
    public boolean isEmpty() {
        return getHead() == null;
    }
    //Imprimir
    public void printList() {
        NodeOfArrays pointer = getHead();
        if (isEmpty()) {
            System.out.println("La lista esta vacia");} else {
        while (pointer.getNext() != null) {
            System.out.println(pointer.getElement()[0]);
            
            
            pointer = pointer.getNext();
        }
        System.out.println(pointer.getElement()[0]);
        
        

        }
    }
    //Eliminar el primero
    public void deleteFirst() {
        NodeOfArrays pointer = getHead();
        if (!isEmpty()) {
            setHead(pointer.getNext());
            pointer.setNext(null);
        }
    length--;
    }
    //Eliminar el final
    public void deleteLast() {
        NodeOfArrays pointer = getHead();
        if (!isEmpty()) {
            while (pointer.getNext().getNext() != null) {
                pointer = pointer.getNext();
            }
        pointer.setNext(null);
        }
    length--;
    }
    //Insertar en orden
    public void InsertInOrder (String[] result) {
        if (isEmpty()) {
            insertEnd(result);
        } else {
            if (Double.parseDouble(getHead().getElement()[1]) > Double.parseDouble(result[1])) {
                insertStart(result);
            }
            boolean NotFound = true;
            NodeOfArrays pointer = getHead();
            while (Double.parseDouble(pointer.getElement()[1]) < Double.parseDouble(result[1]) && NotFound) {
                if (pointer.getNext() == null) {
                    insertEnd(result);
                    NotFound = false;
                } else if (Double.parseDouble(pointer.getNext().getElement()[1]) > Double.parseDouble(result[1])) {
                    NodeOfArrays node = new NodeOfArrays(result);
                    node.setNext(pointer.getNext());
                    pointer.setNext(node);
                    NotFound = false;
                }
                pointer = pointer.getNext();
            }
        }
    }
   
}

