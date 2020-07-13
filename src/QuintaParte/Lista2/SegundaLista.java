package QuintaParte.Lista2;

import QuintaParte.Gesto2.HashTable;
import ac.cr.ulead.Objetos.Producto;

public class SegundaLista {
    private HashTable inicio;

    public HashTable getInicio() {
        return inicio;
    }

    public void setInicio(HashTable inicio) {
        this.inicio = inicio;
    }

    public HashTable agregar(Producto producto) {
        HashTable actual;
        if (estaVacia()) {
            actual = new HashTable(producto, null);
            inicio = actual;

        } else {
            actual = new HashTable(producto, null) ;
            HashTable  temp = inicio;

            while (temp.getKey()!= null) {
                temp = temp.getKey();
            }

            temp.setKey(actual) ;

        }

        return inicio;
    }

    public void imprimirListaHash(HashTable  lista) {
        HashTable  temp = lista;
        while (temp != null) {
            System.out.println(temp.getValue().toString());
            temp = temp.getKey();
        }
    }
    public boolean estaVacia() {
        return inicio == null ? true : false;
    }
}