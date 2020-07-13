package proyecto_so2_han_morales;

public class Matriz {
    
    // ATRIBUTOS
    private int cantSucursales;       // Cantidad de sucursales a cubrir (procesos)
    private int cantEmpleados;        // Cantidad de tipos de empleados (recursos)
    private int [] disponibles;       // Empleados actualmente disponibles
    private int [][] asignados;       // Llenada mediante un random
    private int [][] necesarios;      // Lo indica el usuario
    private int [][] faltantes;       // Calculada (C-A)
    
    // CONSTRUCTOR

    public Matriz(int[] disponibles, int[][] necesarios) {
        this.disponibles = disponibles;
        this.necesarios = necesarios;
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
    
}
