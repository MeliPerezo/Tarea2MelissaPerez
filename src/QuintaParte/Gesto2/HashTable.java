package QuintaParte.Gesto2;

import ac.cr.ulead.Objetos.Producto;

public class HashTable {
    private HashTable key;
    private Producto value;

    public HashTable(Producto producto,HashTable key) {
        this.value = producto;
        this.key = key;
    }

    public HashTable getKey() {
        return key;
    }

    public void setKey(HashTable key) {
        this.key = key;
    }

    public Producto getValue() {
        return value;
    }

    public void setValue(Producto value) {
        this.value = value;
    }
}
