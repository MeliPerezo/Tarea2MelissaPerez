package ac.cr.ulead.GestorLogic;

import ac.cr.ulead.Lista.Lista;
import ac.cr.ulead.Objetos.Producto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Gestor {
    private static Scanner input = new Scanner(System.in);
    public boolean datosCargados = false;
    Lista nuevaLista = new Lista();
    int option = 0;

    public void cargarDatos() throws FileNotFoundException {
        Scanner lector = new Scanner(new File("C:\\Users\\usuario\\IdeaProjects\\SegundaTareaProgramadaCorta\\src\\ac\\cr\\ulead\\DataFinal.csv"));
        int contador = 0;
        String currentLine = "";

        while (lector.hasNextLine()) {
            currentLine = lector.nextLine();

            if (contador != 0) {
                String[] datos = currentLine.split(",");
                Producto nuevoProducto = new Producto();
                nuevoProducto.setCodigo_alfanumerico(datos[0]);
                nuevoProducto.setNombre(datos[3]);
                nuevoProducto.setCategoria(datos[4]);
                nuevaLista.agregar(nuevoProducto);
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

    public void buscar_por_nombre() {
        System.out.println("Ingrese el Nombre del producto que desea buscar: ");
        nuevaLista.buscarLista(input.nextLine());
    }

    public void lista_alfanumerica() {
        System.out.println("Codigo alfanumerico: ");
        nuevaLista.BuscarCodigo();

    }

}






