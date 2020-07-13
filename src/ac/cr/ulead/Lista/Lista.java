package ac.cr.ulead.Lista;

import ac.cr.ulead.Objetos.Producto;

public class Lista {
    private Producto inicio = null;

    public boolean estaVacia() {
        return inicio == null ? true : false;
    }

    public void agregar(Producto nuevoProducto) {
        if (inicio == null) {
            inicio = nuevoProducto;
        } else {
            Producto temp = inicio;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nuevoProducto;
        }
    }

    public void imprimirLista() {
        if (estaVacia()) {
            System.out.println("Se encuentra vacia, no hay ningun producto");

        }
        Producto temp = inicio;
        while (temp != null) {
            System.out.println("Codigo del producto: " + temp.getCodigo_alfanumerico() + " " + " Nombre del producto: " + temp.getNombre() + " " + "Categoria: " + temp.getCategoria());
            temp = temp.next;
        }
    }

    public void buscarLista(String s) {
        int contador = 0;
        if (estaVacia()) {
            System.out.println("No a cargado los datos");
        } else {
            Producto temp = inicio;
            while (temp != null) {
                if (temp.getNombre().toLowerCase().contains(s.toLowerCase())) {
                    System.out.println("Codigo del producto: " + temp.getCodigo_alfanumerico() + "   " + " Nombre del producto: " + temp.getNombre() + "   " + "Categoria: " + temp.getCategoria() + "   " + "posicion: " + contador);
                    temp = temp.next;

                } else {
                    temp = temp.next;
                }
                contador++;
            }
        }

    }

    public void BuscarCodigo() {
        if (estaVacia()) {
            System.out.println("Se encuentra vacia, no hay ningun producto");
        }
        Producto temp = inicio;
        while (temp != null) {
            String Codigo_Producto = temp.getCodigo_alfanumerico();
            String ultimos_digitos = Codigo_Producto.substring(29, 32);
            System.out.println("Codigo del producto " + ultimos_digitos);
            temp = temp.next;
        }
    }

    public int transformardecimal() {
        Producto temp = inicio;
        int digitos = 0;
        while (temp != null) {
            String Codigo_Producto = temp.getCodigo_alfanumerico();
            digitos = Integer.parseInt(Codigo_Producto.substring(29, 32), 16);
            temp = temp.next;
            System.out.println(digitos);
        }

        return digitos;
    }

}



