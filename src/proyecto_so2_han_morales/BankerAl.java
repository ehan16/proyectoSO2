package proyecto_so2_han_morales;

public class BankerAl {
    
    // ATRIBUTOS
    private int cantSucursales;       // Cantidad de sucursales a cubrir (procesos)
    private int cantEmpleados;        // Cantidad de tipos de empleados (recursos)
    private int[] disponibles;        // Empleados actualmente disponibles
    private int[][] asignados;        // Llenada mediante un random
    private int[][] necesarios;       // Lo indica el usuario
    private int[][] faltantes;        // Calculada (C-A)
    private int[] secuencia;          // La secuencia en la que se tiene que llenar las sucursales
    
    // CONSTRUCTOR

    public BankerAl(int sucursales, int empleados, int[] disponibles, int[][] necesarios) {
        this.cantEmpleados = empleados;
        this.cantSucursales = sucursales;
        this.disponibles = disponibles;
        this.necesarios = necesarios;
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
