
package proyectoamazon;

import javax.swing.JOptionPane;

/**
 *
 * @author luisarismendi
 */

// Métodos
public class Cart {
    private NodeCart head;
    private int length;
    String firstWarehouse = null;
    String foundWarehouse = null;

    //Getters and Setters
    public String getFoundWarehouse() {
        return foundWarehouse;
    }

    public void setFoundWarehouse(String foundWarehouse) {
        this.foundWarehouse = foundWarehouse;
    }

    public String getFirstWarehouse() {
        return firstWarehouse;
    }

    public void setFirstWarehouse(String firstWarehouse) {
        this.firstWarehouse = firstWarehouse;
    }

    public Cart (NodeCart head) {
        this.head = head;
        if (head != null) {
            this.length = 1;
        } else {
            this.length = 0;
        }       
    }

    public void setHead(NodeCart head) {
        this.head = head;
    }

    public NodeCart getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }
    
    // Insertar al inicio
    public void insertStart(ProductCart element){
        NodeCart node = new NodeCart(element);
        if (isEmpty()) {
            setHead(node);
        } else {
            node.setNext(getHead());
            setHead(node);
        }
        length++;
    }
    
    //Insertar al final
    public void insertEnd(ProductCart element) {
        NodeCart node = new NodeCart(element);
        if (isEmpty()) {
            setHead(node);
        } else {
            NodeCart pointer = getHead();
            while (pointer.getNext() != null) {
               pointer = pointer.getNext();
            }
        pointer.setNext(node);
        }
        length++;
        }
    
    //Saber si está vacio
    public boolean isEmpty() {
        return getHead() == null;
    }
    //Imprimir
        public String printList() {
        NodeCart pointer = getHead();
        String result = "";
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
            return result;
        } else {
        while (pointer != null) {
            result += pointer.getElement().name + ", " + pointer.getElement().quantitiy + "\n";
            pointer = pointer.getNext();
        }
        result += "\n";
        }
        return result;
    }
    //Eliminar primero
    public void deleteFirst() {
        NodeCart pointer = getHead();
        if (!isEmpty()) {
            setHead(pointer.getNext());
            pointer.setNext(null);
        }
    length--;
    }
    //Eliminar final
    public void deleteLast() {
        NodeCart pointer = getHead();
        if (!isEmpty()) {
            while (pointer.getNext().getNext() != null) {
                pointer = pointer.getNext();
            }
        pointer.setNext(null);
        }
    length--;
    }
    //Agregar producto
    public void AddProduct (NodeCart pointerResult) {
        NodeCart pointer = getHead();
        boolean isInList = false;
        while (pointer != null) {
            if (pointer.getElement().getName().equals(pointerResult.getElement().getName())) {
                isInList = true;
            }
            pointer = pointer.getNext();
        }
        pointer = getHead();
        if (isInList) {
            while (pointer != null) {
                if (pointer.getElement().getName().equals(pointerResult.getElement().getName())) {
                   pointer.getElement().setQuantitiy(pointer.getElement().getQuantitiy() + pointerResult.getElement().getQuantitiy());
            }
                pointer = pointer.getNext();
        }
        } else {
            insertEnd(pointerResult.getElement());
        }
    
}
}
