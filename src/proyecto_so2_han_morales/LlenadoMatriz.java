package proyecto_so2_han_morales;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LlenadoMatriz extends javax.swing.JFrame {

    // ATRIBUTOS
    int empleados, sucursales;
    DefaultTableModel resourcesModel;
    DefaultTableModel needsModel;
    int[] disponibles;
    int[][] necesarios;

    // CONSTRUCTOR
    public LlenadoMatriz(int empleados, int sucursales) {

        initComponents();

        // Se ubica la ventana
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        // Se consiguen los modelos de cada tabla
        this.resourcesModel = (DefaultTableModel) this.jTableResources.getModel();
        this.needsModel = (DefaultTableModel) this.jTableNeeds.getModel();

        // Inicializan los valores y matrices
        this.empleados = empleados;
        this.sucursales = sucursales;
        this.disponibles = new int[this.empleados];
        this.necesarios = new int[this.sucursales][this.empleados];
        
        System.out.println("Columnas " + this.necesarios[0].length);
        System.out.println("Filas " + this.necesarios.length);
        
        Object[] recursos = new Object[this.empleados];
        Object[] necesidades = new Object[this.empleados + 1];

        // A la tabla de recursos solo se le agrega una fila
        this.resourcesModel.addRow(recursos);

        // Se agrega un row header a la tabla de necesidades
        this.needsModel.addColumn("Sucursal");

        // Se asignan tantas filas como sucursales exista en la tabla respectiva
        for (int i = 0; i < this.sucursales; i++) {
            this.needsModel.addRow(necesidades);
            this.needsModel.setValueAt(App.sucursales.get(i), i, 0);
        }

        // Se procede con las columnas, tantas como tipos de empleados exista
        for (int i = 0; i < this.empleados; i++) {
            this.resourcesModel.addColumn(App.categoriasEmpleados.get(i));
            this.needsModel.addColumn(App.categoriasEmpleados.get(i));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnContinue = new javax.swing.JButton();
        jScrollBranches = new javax.swing.JScrollPane();
        jTableNeeds = new javax.swing.JTable();
        jScrollEmployees = new javax.swing.JScrollPane();
        jTableResources = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EG_Logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Empleados disponibles por categoria");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Requerimientos por sucursal");

        btnContinue.setBackground(new java.awt.Color(51, 0, 0));
        btnContinue.setForeground(new java.awt.Color(255, 255, 255));
        btnContinue.setText("Continuar");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        jTableNeeds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollBranches.setViewportView(jTableNeeds);

        jTableResources.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollEmployees.setViewportView(jTableResources);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(319, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(323, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(btnContinue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jScrollEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                    .addComponent(jScrollBranches))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollBranches, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnContinue)
                .addGap(36, 36, 36))
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

        boolean correcto = true; // Para conocer si se ha realizado el proceso de manera correcta

        // Se llena el vector de los recursos disponibles
        for (int i = 0; i < this.empleados; i++) {

            // Se consigue el valor de cada columna
            String valor = String.valueOf(this.resourcesModel.getValueAt(0, i));
            int cant;

            try {

                cant = Integer.parseInt(valor);

                // Se evalua si es un numero positivo y se asigna de ser correcto
                if (cant <= 0) {
                    JOptionPane.showMessageDialog(null, "ERROR: Cantidad tiene que ser mayor a cero en columna " + (i + 1), "ERROR", JOptionPane.ERROR_MESSAGE);
                    correcto = false;
                } else {
                    this.disponibles[i] = cant;
                }

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "ERROR: Dato invalido en columna " + (i + 1), "ERROR", JOptionPane.ERROR_MESSAGE);
                correcto = false;

            }

        }

        // Se llena la matriz de recursos necesarios solamente si la primera matriz se lleno correctamente
        if (correcto) {

            for (int i = 0; i < this.sucursales; i++) {

                for (int j = 0; j < this.empleados; j++) {

                    // Se tiene que recordar que la primera columna es el nombre de la sucursal
                    String aux = String.valueOf(this.needsModel.getValueAt(i, j + 1));
                    int req;

                    try {

                        req = Integer.parseInt(aux);

                        // Se evalua si es un numero positivo y se asigna de ser correcto
                        if (req <= 0) {
                            JOptionPane.showMessageDialog(null, "ERROR: Cantidad tiene que ser mayor a cero en fila " + (i + 1) + " columna " + (j + 2), "ERROR", JOptionPane.ERROR_MESSAGE);
                            correcto = false;
                        } else {
                            this.necesarios[i][j] = req;
                        }

                    } catch (NumberFormatException e) {

                        JOptionPane.showMessageDialog(null, "ERROR: Dato invalido en fila " + (i + 1) + " columna " + (j + 2), "ERROR", JOptionPane.ERROR_MESSAGE);
                        correcto = false;

                    }
                    
                }

            }

        }
        
        // Si todo el llenado fue correcto, se procede
        // Sino, no pasa nada y el usuario tiene que corregir los datos
        if (correcto) {
//            Grafica grafica = new Grafica();
            BankerAl banker = new BankerAl(this.sucursales, this.empleados, this.disponibles, this.necesarios);
        } 

    }//GEN-LAST:event_btnContinueActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollBranches;
    private javax.swing.JScrollPane jScrollEmployees;
    private javax.swing.JTable jTableNeeds;
    private javax.swing.JTable jTableResources;
    // End of variables declaration//GEN-END:variables
}
