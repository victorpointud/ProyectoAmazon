
package proyectoamazon;

/**
 *
 * @author luisarismendi
 */

public class SimpleListWithArray {
    //Métodos
    private int first;
    private int last;
    private int size;
    public NodeSimpleListWithArray[] array;

    public SimpleListWithArray(int max) {
        this.first = this.last = -1;
        this.size = 0;
        this.array = new NodeSimpleListWithArray[max];
    }
    //Getters and setters
    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }
    //Si está vacío
    public boolean isEmpty() {
        return first == -1;
    }
    //Sí tiene un objeto
    public boolean isFull() {
        return size == this.array.length;
    }
    //Vacío
    public void empty() {
        this.first = this.last = -1;
        this.size = 0;
        this.array = new NodeSimpleListWithArray[this.array.length];
    }
    //Obtener el valor
    public String getValue(int x){
        String p = null;
        if (this.isEmpty()){
            return null;
        }
        if (x > this.array.length){
            System.out.println("El indice es mayor que la longitud de la lista");
        }
        else{
        for (int i = 0; i < this.array.length; i++) {
            if(i == x){
                p = (String) this.array[i].getData();
            }  
        }
        return p;
    }
    return p;
    }
    //Obtener el indice
    public int getIndex(String x){
        for (int i = 0; i < this.getLength(); i++) {
            if (x.equals(this.array[i].getData())){
                return i;
            }
        }
        return -1;
    }
    //Buscar la casilla vacía
    public int searchEmptySlot() {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == null) {
                return i;
            }
        }
        return -1;
    }
    //Añadir al inicio
    public void addAtTheStart(String x) {
        if (!this.isFull()) {
            NodeSimpleListWithArray node = new NodeSimpleListWithArray(x);
            int position = this.searchEmptySlot();
            this.array[position] = node;
            if (this.isEmpty()) {
                this.first = this.last = position;
            } else {
                this.array[position].setNext(this.first);
                this.first = position;
            }
            this.size++;
        }
    }
    //añadir al final
    public void addAtTheEnd(String x) {
        if (!this.isFull()) {
            NodeSimpleListWithArray node = new NodeSimpleListWithArray(x);
            int position = this.searchEmptySlot();
            this.array[position] = node;
            if (this.isEmpty()) {
                this.first = this.last = position;
            } else {
                this.array[this.last].setNext(position);
                this.last = position;
            }
            this.size++;
        }
    }
    
    
    public int getLength(){
        return size;
    }
}
