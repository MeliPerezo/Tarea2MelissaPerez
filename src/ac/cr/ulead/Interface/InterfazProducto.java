package ac.cr.ulead.Interface;

import ac.cr.ulead.GestorLogic.Gestor;
import ac.cr.ulead.Lista.Lista;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class InterfazProducto {
    public static class Interfaz {
        Gestor G = new Gestor();
        Lista L= new Lista ();
        private static Scanner input = new Scanner(System.in);
        private static int option = 0;


        public void menuPrincipal() throws FileNotFoundException {

            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("Hola, bienvenida/o");
            System.out.println("Por favor presione el tipo de informacion a la que desea acceder");
            System.out.println("1. Cargar datos.");
            System.out.println("2. Buscar datos por nombre.");
            System.out.println("3. Genere la lista con el código alfanumérico");
            System.out.println("4. Salir");
            System.out.println("----------------------------------------------------------------------------------");


            do {
                option = input.nextInt();
                if (option == 1) {
                    System.out.println("...Cargando informacion...");
                    G.cargarDatos();
                } else {
                    System.out.println("¡Ups, parece que algo a salido mal! Cargue los datos nuevamente");
                }
            } while (option != 1);
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("2. Buscar datos por nombre.");
            System.out.println("3. Genere la lista con el código alfanumérico");
            System.out.println("4. Salir");
            System.out.println("----------------------------------------------------------------------------------");
            option = input.nextInt();

                switch (option) {

                    case 2:
                        G.buscar_por_nombre();
                        menuPrincipal();
                        break;
                    case 3:
                        G.lista_alfanumerica();
                        menuPrincipal();
                        break;
                    case 4:
                        System.out.println("Has salido");
                        break;
                    default:
                        System.out.println("Tienes que introducir una opción valida");

                }
            }
        }
}
