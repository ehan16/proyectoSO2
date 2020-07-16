package proyecto_so2_han_morales;

import javax.swing.JOptionPane;

public class TamanoMatriz extends javax.swing.JFrame {

    public TamanoMatriz() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBranchQty = new javax.swing.JTextField();
        txtEmployeeType = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnContinue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EG_Logo.png"))); // NOI18N

        txtBranchQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBranchQtyActionPerformed(evt);
            }
        });
        txtBranchQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBranchQtyKeyTyped(evt);
            }
        });

        txtEmployeeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeTypeActionPerformed(evt);
            }
        });
        txtEmployeeType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmployeeTypeKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Tipos de empleados");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cant. sucursales");

        btnContinue.setBackground(new java.awt.Color(51, 0, 0));
        btnContinue.setForeground(new java.awt.Color(255, 255, 255));
        btnContinue.setText("Continuar");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBranchQty, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeType, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(btnContinue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmployeeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBranchQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnContinue)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBranchQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBranchQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBranchQtyActionPerformed

    private void txtEmployeeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeTypeActionPerformed

    private void txtEmployeeTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeTypeKeyTyped
        if(evt.getKeyChar() < '0' || evt.getKeyChar() > '9') evt.consume(); //Validacion para que nada mas puedan ser introducidos numeros positivos
        if(txtEmployeeType.getText().length() > 3) evt.consume();           //Se le coloca un limite a la cantidad de digitos
    }//GEN-LAST:event_txtEmployeeTypeKeyTyped

    private void txtBranchQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBranchQtyKeyTyped
        if(evt.getKeyChar() < '0' || evt.getKeyChar() > '9') evt.consume(); //Validacion para que nada mas puedan ser introducidos numeros positivos
        if(txtEmployeeType.getText().length() > 3) evt.consume();           //Se le coloca un limite a la cantidad de digitos
    }//GEN-LAST:event_txtBranchQtyKeyTyped

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        
        // Se valida que ningun campo se encuentre vacio
        if (this.txtBranchQty.getText().equalsIgnoreCase("") || this.txtEmployeeType.getText().equalsIgnoreCase("")) {
            
            JOptionPane.showMessageDialog(null, "ERROR: Campos no pueden estar vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
            
        } else {
            
            // Se realizan las conversiones
            int empleados = Integer.parseInt(this.txtEmployeeType.getText());
            int sucursales = Integer.parseInt(this.txtBranchQty.getText());
            
            // Validacion de no introducir valores igual a cero
            if (empleados == 0 || sucursales == 0) {
                empleados = 6;
                sucursales = 6;
                JOptionPane.showMessageDialog(null, "AVISO: Como uno de los campos era cero, se utilizaron los valores por defecto", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            
            int auxSucursal = sucursales - App.sucursales.size();
            int auxEmpleado = empleados - App.categoriasEmpleados.size();
            
            // Si ingresa mas sucursales que la cantidad inicial, se piden nombres 
            if (sucursales > App.sucursales.size()) {
                for (int i = 0; i < auxSucursal; i++) {
                    TamanoMatriz.agregarSucursal();
                    System.out.println("Sucursal " + (i + 1));
                }
            }
            
            // Si ingresa mas tipos de empleados que la cantidad inicial, se piden nombres 
            if (empleados > App.categoriasEmpleados.size()) {
                for (int i = 0; i < auxEmpleado; i++) {
                    TamanoMatriz.agregarEmpleado();
                    System.out.println("Empleado " + (i + 1));
                }
            }
            
            // Se crea la siguiente ventana
            LlenadoMatriz ventanaLlenado = new LlenadoMatriz(empleados, sucursales);
            // Se cambia de ventana
            ventanaLlenado.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_btnContinueActionPerformed

    // En caso de que se tengan mas sucursales que la planificacion original
    public static void agregarSucursal() {
        
        // Variable auxiliar
        String name = "";
        
        // Valida que el campo no se encuentre vacio
        while(name.equalsIgnoreCase("")) {
            name = JOptionPane.showInputDialog("Nombre de la nueva sucursal:");
        }
        
        App.sucursales.add(name);
        
    }
    
    // En caso de que se tengan mas empleados que la planificacion original
    public static void agregarEmpleado() {
        
        // Variable auxiliar
        String name = "";
        
        // Valida que el campo no se encuentre vacio
        while(name.equalsIgnoreCase("")) {
            name = JOptionPane.showInputDialog("Nombre del nuevo tipo de empleado:");
        }
        
        App.categoriasEmpleados.add(name);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBranchQty;
    private javax.swing.JTextField txtEmployeeType;
    // End of variables declaration//GEN-END:variables
}
