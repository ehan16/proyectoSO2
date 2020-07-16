package proyecto_so2_han_morales;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BankerAlgorithm {

    // ATRIBUTOS
    private int cantSucursales;       // Cantidad de sucursales a cubrir (procesos)
    private int cantEmpleados;        // Cantidad de tipos de empleados (recursos)
    private int[] disponibles;        // Empleados actualmente disponibles
    private int[][] asignados;        // Llenada mediante un random
    private int[][] necesarios;       // Lo indica el usuario
    private int[][] faltantes;        // Calculada (C-A)

    // CONSTRUCTOR
    public BankerAlgorithm(int sucursales, int empleados, int[] disponibles, int[][] necesarios) {
        this.cantEmpleados = empleados;
        this.cantSucursales = sucursales;
        this.disponibles = disponibles;
        this.necesarios = necesarios;
//        this.esSeguro();
    }

    // METODOS
    public void calcular() {

        // Se inicializan las matrices de asignados
        this.asignados = new int[this.cantSucursales][this.cantEmpleados];

        // Se llena la matriz de inicializacion con recursos de manera aleatoria
        for (int i = 0; i < this.cantSucursales; i++) {

            for (int j = 0; j < this.cantEmpleados; j++) {

                // El limite superior son los requerimientos de cada sucursal con respecto al tipo de empleado
                int aux = (int) (Math.random() * (this.necesarios[i][j] + 1));

                if (aux <= this.disponibles[j]) {
                    // Si es menor a la disponibilidad, se coloca y se actualiza la disponibilidad
                    this.asignados[i][j] = aux;
                    this.disponibles[j] = this.disponibles[j] - aux;
                } else {
                    // De lo contrario se asigna 0
                    this.asignados[i][j] = 0;
                }

            }

        }

        // Se inicializa la matriz de faltantes
        this.faltantes = new int[this.cantSucursales][this.cantEmpleados];

        for (int i = 0; i < this.cantSucursales; i++) {

            for (int j = 0; j < this.cantEmpleados; j++) {

                // Se realiza la resta (C-A) para conocer cuantos recursos aun necesita cada proceso
                this.faltantes[i][j] = this.necesarios[i][j] - this.asignados[i][j];

            }

        }

        // Se procede a mostrar la siguiente vista con las matrices en estado inicial
        FaltantesAsignados faltantesAsignadosVista = new FaltantesAsignados(this);
        faltantesAsignadosVista.crearTablas();
        faltantesAsignadosVista.setVisible(true);

    }

    // Metodo para calcular el estado seguro
    public void esSeguro() {

        ArrayList<Integer> ordenSucursales = new ArrayList<>();    // Contiene el orden que se tienen que llenar las sucursales
        boolean verificado[] = new boolean[this.cantSucursales];   // Llevar control de las sucursales verificadas ya
        boolean completado = false;                                // Indica si el algoritmo ya ha verificado todas las sucursales
        int sucursalesAsignados = 0;                               // Contador de sucursales verificadas
        int recorrido = 0;
        int j = 0;
        
        while ((j < this.cantSucursales) && (recorrido < this.cantSucursales)) {
            
            for (int i = 0; i < this.cantSucursales; i++) {
                
                if (i == 0) {
                    recorrido = 0;
                }
                
                if (!verificado[i] && this.chequear(i)) {
                    for (int k = 0; k < this.cantEmpleados; k++) {
                        this.disponibles[k] = this.asignados[i][k] + this.disponibles[k];
                        this.faltantes[i][k] = 0;
                    }
                    System.out.println("El proceso " + (i + 1) + " termino");
                    verificado[i] = true;
                    sucursalesAsignados++;
                    ordenSucursales.add(i);
                    recorrido = 0;
                }
                
                if (sucursalesAsignados == this.cantSucursales) {
                    completado = true;
                    break;
                }
                
                recorrido++;
                
            }
            
            j++;
            
            if (sucursalesAsignados == this.cantSucursales) {
                completado = true;
                break;
            }
            
        }

        Resultado resultadoView = new Resultado();
        
        if (completado) {
//            JOptionPane.showMessageDialog(null, "Se alcanzo el estado seguro");
            resultadoView.result(ordenSucursales);
        } else {
//            JOptionPane.showMessageDialog(null, "Se presento un interbloqueo con los valores ingresados");
            resultadoView.deadlock();
        }
        
        resultadoView.setVisible(true);

    }

    // Metodo para indicar si se pueden asignar los recursos a un proceso
    public boolean chequear(int i) {

        for (int j = 0; j < this.cantEmpleados; j++) {
            // Si no se puede cumplir uno de los requerimientos del proceso, se retorna falso
            if (this.disponibles[j] < this.faltantes[i][j]) {
                return false;
            }
        }

        // De lo contrario, se retorna verdadero
        return true;
    }

//    //Metodos para realizar pruebas con los vectores y matrices
//    public void imprimirMatriz(int[][] matriz) {
//        System.out.println("Imprimiendo matriz");
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println("");
//        }
//    }
//
//    public void imprimirVector(int[] vec) {
//        System.out.println("Imprimiendo vector");
//        for (int i = 0; i < vec.length; i++) {
//            System.out.println(vec[i]);
//        }
//        System.out.println("");
//    }
//
//    public void verificacionDeMatrices() {
//        System.out.println("---------------------");
//        System.out.println("Matriz de necesarios");
//        this.imprimirMatriz(this.necesarios);
//        System.out.println("");
//        System.out.println("Matriz de Asignados");
//        this.imprimirMatriz(this.asignados);
//        System.out.println("");
//        System.out.println("Matriz de faltantes");
//        this.imprimirMatriz(faltantes);
//        System.out.println("Vector de recursos");
//        imprimirVector(this.disponibles);
//    }

    // GETTERS Y SETTERS 
    public int getCantSucursales() {
        return cantSucursales;
    }

    public void setCantSucursales(int cantSucursales) {
        this.cantSucursales = cantSucursales;
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }

    public int[] getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int[] disponibles) {
        this.disponibles = disponibles;
    }

    public int[][] getAsignados() {
        return asignados;
    }

    public void setAsignados(int[][] asignados) {
        this.asignados = asignados;
    }

    public int[][] getNecesarios() {
        return necesarios;
    }

    public void setNecesarios(int[][] necesarios) {
        this.necesarios = necesarios;
    }

    public int[][] getFaltantes() {
        return faltantes;
    }

    public void setFaltantes(int[][] faltantes) {
        this.faltantes = faltantes;
    }
    
}
