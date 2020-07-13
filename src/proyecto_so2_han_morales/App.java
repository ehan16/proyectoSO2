package proyecto_so2_han_morales;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {

    public static ArrayList<String> sucursales = new ArrayList<>();
    public static ArrayList<String> categoriasEmpleados = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        App.llenarListas();
        TamanoMatriz inicio = new TamanoMatriz();
        inicio.setVisible(true);
    }
    
    public static void llenarListas() {
        
        // Se llenan los nombres de las sucursales
        App.sucursales.add("Macaracuay");
        App.sucursales.add("Vizcaya");
        App.sucursales.add("Las Mercedes");
        App.sucursales.add("Santa Paula");
        App.sucursales.add("Chuao");
        App.sucursales.add("Caurimare");
        
        // Se llenan los nombres de las categorias de empleados
        App.categoriasEmpleados.add("Cajeros");
        App.categoriasEmpleados.add("Seguridad");
        App.categoriasEmpleados.add("Empaquetamiento");
        App.categoriasEmpleados.add("Limpieza");
        App.categoriasEmpleados.add("Gerencia");
        App.categoriasEmpleados.add("Abastecimiento");
        
    }
    
}
