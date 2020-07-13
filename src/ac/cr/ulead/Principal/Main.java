package ac.cr.ulead.Principal;

import ac.cr.ulead.Interface.InterfazProducto;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        InterfazProducto.Interfaz I =new InterfazProducto.Interfaz();
        I.menuPrincipal();
    }
}
