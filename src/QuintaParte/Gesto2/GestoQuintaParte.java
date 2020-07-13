package QuintaParte.Gesto2;

import QuintaParte.Lista2.SegundaLista;
import ac.cr.ulead.Objetos.Producto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GestoQuintaParte {
    public boolean datosCargados = false;
    SegundaLista L;
    HashTable[] nuevalista = new HashTable[4096];
    Scanner input = new Scanner(System.in);

    public void CargarDatos() throws FileNotFoundException {

        Scanner lector = new Scanner(new File("C:\\Users\\usuario\\IdeaProjects\\SegundaTareaProgramadaCorta\\src\\ac\\cr\\ulead\\DataFinal.csv"));
        int contador = 0;
        while (lector.hasNextLine()) {
            String[] datos = lector.nextLine().split(",");

            if (contador != 0) {
                int posicion = Integer.parseInt(datos[0].substring(datos[0].length() - 3, datos[0].length()), 16);


                if (nuevalista[posicion] != null) {
                     L = new SegundaLista();
                    L.setInicio(nuevalista[posicion]);
                    Producto nuevoProducto = new Producto();
                    nuevoProducto.setCodigo_alfanumerico(datos[0]);
                    nuevoProducto.setNombre(datos[3]);
                    nuevoProducto.setCategoria(datos[4]);
                    nuevalista[posicion] = L.agregar(nuevoProducto);
                } else {
                    L = new SegundaLista();
                    Producto nuevoProducto = new Producto();
                    nuevoProducto.setCodigo_alfanumerico(datos[0]);
                    nuevoProducto.setNombre(datos[3]);
                    nuevoProducto.setCategoria(datos[4]);
                    nuevalista[posicion] = L.agregar(nuevoProducto);
                }
            }
            contador++;
        }
        lector.close();
        datosCargados = true;
        if (datosCargados = true) {

            System.out.println("** Los datos han sido cargados con exito **");
            System.out.println("Total de datos cargados: " + contador);
        }
    }
    public void buscarUnaPosicion() {
        System.out.println("Ingrese la opcion que desea realizar");
        HashTable temp = nuevalista[input.nextInt()];
        if (temp != null) {
            while (temp != null) {
                System.out.println(temp.getValue().toString());
                temp = temp.getKey();
            }
        } else {
            System.out.println("No hay productos para mostrar");


        }
    }
    public void VerSiHayDatos() {
        int contador = 0, posicion = 0;
        while (posicion<4096) {
            HashTable  temp = nuevalista [posicion];
            while (temp!= null) {
                contador++;
                temp =temp.getKey();

            }if(contador==0) {
                System.out.println("* En la posicion: "+ (posicion+1) +" No se encuetra ningun producto * ");
            }else {
                System.out.println("* En la posicion: "+ (posicion+1) +"existen "+contador+ "productos * ");
            }
            posicion++;
            contador=0;

        }

    }

}