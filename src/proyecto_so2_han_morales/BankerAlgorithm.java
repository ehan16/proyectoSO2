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
    private int[] secuencia;          // La secuencia en la que se tiene que llenar las sucursales
    
    // CONSTRUCTOR

    public BankerAlgorithm(int sucursales, int empleados, int[] disponibles, int[][] necesarios) {
        this.cantEmpleados = empleados;
        this.cantSucursales = sucursales;
        this.disponibles = disponibles;
        this.necesarios = necesarios;
        this.secuencia = new int[sucursales];   // La cantidad de sucursales a evaluar
        this.calcular(); //Se ejecutan los ajustes preliminares
        this.esSeguro();
    }
    
    // METODOS
    
    public void calcular() {
        
        // Se inicializan las matrices de asignados
        this.asignados = new int[this.cantSucursales][this.cantEmpleados];
        
        // Se llena la matriz de inicializacion con recursos de manera aleatoria
        for (int i = 0; i < this.cantSucursales; i++) {
            
            for (int j = 0; j < this.cantEmpleados; j++) {
                
                // El limite superior son los requerimientos de cada sucursal con respecto al tipo de empleado
                int aux = (int) (Math.random() * this.necesarios[i][j]);
                
                if (aux <= this.disponibles[j]) {
                    // Si es menor a la disponibilidad, se coloca y se actualiza la disponibilidad
                    this.asignados[i][j] = aux;
                    this.disponibles[j] = this.disponibles[j] - aux;    
                    System.out.println("Se agarraron " + aux + " quedan disponibles " + this.disponibles[j] + " columna " + (j + 1));
                } else {
                    // De lo contrario se asigna 0
                    this.asignados[i][j] = 0;
                }
                
            }
            
        }
        
        for(int i = 0; i < this.asignados.length; i++) {
            for (int j = 0; j < this.asignados[0].length; j++) {
                System.out.print(this.asignados[i][j] + " ");
            } 
            System.out.println("");
        }
        
        // Se inicializa la matriz de faltantes
        this.faltantes = new int[this.cantSucursales][this.cantEmpleados];
        
        for (int i = 0; i < this.cantSucursales; i++) {
            
            for (int j = 0; j < this.cantEmpleados; j++) {
            
                // Se realiza la resta (C-A) para conocer cuantos recursos aun necesita cada proceso
                this.faltantes[i][j] = this.necesarios[i][j] - this.asignados[i][j];
                
            }
            
        }
        
        
        
    }
    
    // Metodo para calcular el estado seguro
    public void esSeguro() {
        
        this.verificacionDeMatrices();
        ArrayList<Integer> ordenSucursales = new ArrayList<>();
        boolean verificado[] = new boolean[this.cantSucursales];
        boolean completado = false;
        int asignados = 0;
        int recorrido = 0;
        int j = 0;
        while ((j < this.cantSucursales) && (recorrido < this.cantSucursales)) {
            for (int i = 0; i < this.cantSucursales; i++) {
                if(i == 0){
                    recorrido = 0;
                }
                if (!verificado[i] && this.chequear(i)) {
                    for (int k = 0; k < this.cantEmpleados; k++) {
                        this.disponibles[k] = this.asignados[i][k] + this.disponibles[k];
                        this.faltantes[i][k] = 0;
                        this.verificacionDeMatrices();
                    }
                    System.out.println("El proceso " + (i+1) +" termino");
                    verificado[i] = true;
                    asignados++;
                    ordenSucursales.add(i);
                    recorrido = 0;
                }
                if (asignados == this.cantSucursales) {
                    completado = true;
                    break;
                }
                recorrido++;
            }
            j++;
            if (asignados == this.cantSucursales) {
                completado = true;
                break;
            }
        }
        
        if(completado){
            JOptionPane.showMessageDialog(null, "Se alcanzo el estado seguro");
        }else{
            JOptionPane.showMessageDialog(null, "Se presento un interbloqueo con los valores ingresados");
        }
        
        for(int i = 0; i<ordenSucursales.size(); i++){
            System.out.println(ordenSucursales.get(i));
        }
        
    }
    
    // Metodo para indicar si se pueden asignar los recursos a un proceso
    public boolean chequear(int i) {
        
        for (int j = 0; j < this.cantEmpleados; j++) {
            // Si no se puede cumplir uno de los requerimientos del proceso, se retorna falso
            if(this.disponibles[j] < this.faltantes[i][j]){
                return false;
            }
        }
        
        // De lo contrario, se retorna verdadero
        return true;
    }
    
    
    //Metodos para realizar pruebas con los vectores y matrices
    
    public void imprimirMatriz(int[][] matriz){
        System.out.println("Imprimiendo matriz");
        for(int i = 0; i<matriz.length; i++){
            for(int j= 0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public void imprimirVector(int[] vec){
        System.out.println("Imprimiendo vector");
        for(int i = 0; i<vec.length; i++){
            System.out.println(vec[i]);
        }
        System.out.println("");
    }
    
    public void verificacionDeMatrices(){
        System.out.println("---------------------");
        System.out.println("Matriz de necesarios");
        this.imprimirMatriz(this.necesarios);
        System.out.println("");
        System.out.println("Matriz de Asignados");
        this.imprimirMatriz(this.asignados);
        System.out.println("");
        System.out.println("Matriz de faltantes");
        this.imprimirMatriz(faltantes);
        System.out.println("Vector de recursos");
        imprimirVector(this.disponibles);        
    }
    
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

    public int[] getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(int[] secuencia) {
        this.secuencia = secuencia;
    }
    
}
