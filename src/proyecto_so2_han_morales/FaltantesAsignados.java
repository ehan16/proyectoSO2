
package proyecto_so2_han_morales;

import javax.swing.table.DefaultTableModel;


public class FaltantesAsignados extends javax.swing.JFrame {

    // ATRIBUTOS
    
    int empleados, sucursales;                      // Limite
    BankerAlgorithm banker;                         // Banquero para llamar sus metodos
    DefaultTableModel disponiblesModel;             // Manejo de las tablas
    DefaultTableModel asignadosModel;               // Manejo de las tablas
    DefaultTableModel faltantesModel;               // Manejo de las tablas
    int[] disponibles;                              // Matrices sobre los recursos
    int[][] asignados;                              // Matrices sobre los recursos
    int[][] faltantes;                              // Matrices sobre los recursos
    
    // CONSTRUCTOR
    
    public FaltantesAsignados(BankerAlgorithm banker) {
        
        // Inicializan los componentes
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        this.banker = banker;
        
        // Se obtienen los tamanos
        this.empleados = banker.getCantEmpleados();
        this.sucursales = banker.getCantSucursales();
        
        // Se obtienen las matrices en su estado actual
        this.disponibles = banker.getDisponibles();
        this.asignados = banker.getAsignados();
        this.faltantes = banker.getFaltantes();
        
        // Se obtienen los models para manejar las tablas
        this.disponiblesModel = (DefaultTableModel) this.jTableAvailable.getModel();
        this.asignadosModel = (DefaultTableModel) this.jTableAllocated.getModel();
        this.faltantesModel = (DefaultTableModel) this.jTableRequired.getModel();
                
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnContinue = new javax.swing.JButton();
        jScrollAllocated = new javax.swing.JScrollPane();
        jTableAllocated = new javax.swing.JTable();
        jScrollEmployees = new javax.swing.JScrollPane();
        jTableAvailable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollRequired = new javax.swing.JScrollPane();
        jTableRequired = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EG_Logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Empleados disponibles por categoria");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Empleados asignados a cada sucursal");

        btnContinue.setBackground(new java.awt.Color(51, 0, 0));
        btnContinue.setForeground(new java.awt.Color(255, 255, 255));
        btnContinue.setText("Continuar");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        jTableAllocated.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollAllocated.setViewportView(jTableAllocated);

        jTableAvailable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollEmployees.setViewportView(jTableAvailable);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Empleados faltantes por sucursal");

        jTableRequired.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollRequired.setViewportView(jTableRequired);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(btnContinue)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jScrollEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(jScrollAllocated)
                                .addComponent(jScrollRequired))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel1)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollAllocated, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollRequired, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnContinue)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed

        // Se llama al algoritmo para que ejecute
        this.banker.esSeguro();
        this.setVisible(false);
        
    }//GEN-LAST:event_btnContinueActionPerformed
    
    // Funcion para llenar los valores de las matrices y vectores
    public void crearTablas() {
        
        // Utilizados para el tamano de la tabla
        Object[] recursos = new Object[this.empleados];
        Object[] necesidades = new Object[this.empleados + 1];
        
        // A la tabla de recursos solo se le agrega una fila
        this.disponiblesModel.addRow(recursos);

        // Se agrega un row header a la tabla de asignados y faltantes
        this.asignadosModel.addColumn("Sucursal");
        this.faltantesModel.addColumn("Sucursal");

        // Se asignan tantas filas como sucursales exista en la tabla respectiva
        // Con el nombre de la sucursal
        for (int i = 0; i < this.sucursales; i++) {
            
            // Con la tabla de asignados
            this.asignadosModel.addRow(necesidades);
            this.asignadosModel.setValueAt(App.sucursales.get(i), i, 0);
            
            // Con la tabla de faltantes
            this.faltantesModel.addRow(necesidades);
            this.faltantesModel.setValueAt(App.sucursales.get(i), i, 0);
            
        }

        //Se procede con las columnas, tantas como tipos de empleados exista
        for (int i = 0; i < this.empleados; i++) {
            this.disponiblesModel.addColumn(App.categoriasEmpleados.get(i));
            this.asignadosModel.addColumn(App.categoriasEmpleados.get(i));
            this.faltantesModel.addColumn(App.categoriasEmpleados.get(i));
        }
        
        
        // Se llena la tabla de disponibles
        for (int i = 0; i < this.empleados; i++) {
            int valorRecurso = this.disponibles[i];
            this.disponiblesModel.setValueAt(valorRecurso, 0, i);
        }
        
        // Se llena la tabla de asignados y faltantes
        for (int i = 0; i < this.sucursales; i++) {
            for (int j = 0; j < this.empleados; j++) {
                
                // Asignados
                int valorAsignado = this.asignados[i][j];
                this.asignadosModel.setValueAt(valorAsignado, i, j + 1);
                
                // Faltantes
                int valorFaltante = this.faltantes[i][j];
                this.faltantesModel.setValueAt(valorFaltante, i, j + 1);
                
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollAllocated;
    private javax.swing.JScrollPane jScrollEmployees;
    private javax.swing.JScrollPane jScrollRequired;
    private javax.swing.JTable jTableAllocated;
    private javax.swing.JTable jTableAvailable;
    private javax.swing.JTable jTableRequired;
    // End of variables declaration//GEN-END:variables
}
