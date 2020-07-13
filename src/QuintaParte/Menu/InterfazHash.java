package QuintaParte.Menu;

import QuintaParte.Gesto2.GestoQuintaParte;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class InterfazHash {
    private static Scanner input = new Scanner(System.in);
    private static int option = 0;
    GestoQuintaParte Gestor2 = new GestoQuintaParte();

    public void menuPrincipal2() throws FileNotFoundException {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Por favor presione el tipo de informacion a la que desea acceder");
        System.out.println("1. Cargar datos. ");
        System.out.println("2. Ingresar posicion que desea ver. ");
        System.out.println("3. Ver productos + posicion. ");
        System.out.println("4. Salir. ");
        System.out.println("----------------------------------------------------------------------------------");



        switch (input.nextInt()) {
            case 1:
                Gestor2.CargarDatos();
                menuPrincipal2();
                break;


            case 2:
                Gestor2.buscarUnaPosicion();
                menuPrincipal2();
                break;
            case 3:
                Gestor2.VerSiHayDatos();
                menuPrincipal2();
                break;
            case 4:
                System.out.println("Has salido");
                break;
            default:
                System.out.println("Tienes que introducir una opción valida");

        }
    }
}
