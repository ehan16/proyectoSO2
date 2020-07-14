package proyecto_so2_han_morales;

import javax.swing.JTextArea;


public class Resultado extends javax.swing.JFrame {

    
    public Resultado() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEnd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EG_Logo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Se le recomienda el siguiente orden");

        btnEnd.setBackground(new java.awt.Color(51, 0, 0));
        btnEnd.setForeground(new java.awt.Color(255, 255, 255));
        btnEnd.setText("Finalizar");
        btnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setEnabled(false);

        txtResult.setBackground(new java.awt.Color(225, 225, 225));
        txtResult.setColumns(20);
        txtResult.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtResult.setForeground(new java.awt.Color(51, 51, 51));
        txtResult.setRows(5);
        txtResult.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 0)));
        txtResult.setEnabled(false);
        jScrollPane1.setViewportView(txtResult);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("para el estado seguro:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(btnEnd)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEnd)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndActionPerformed

        //Al hacer click en este boton, se sale del sistema
        System.exit(0); 

    }//GEN-LAST:event_btnEndActionPerformed

    // METODOS
    
    // Metodo para imprimir en la ventana el orden de llenado de las sucursales
    public void result(int[] secuencia) {
        
        // Variable auxiliar de concatenacion
        String res = "";
        
        for (int i = 0; i < secuencia.length; i++) {
            // Se concatena el nombre de la sucursal con su numero de orden
            res += "" + (i + 1) + " - " + App.sucursales.get(secuencia[i]) + " (#"+ secuencia[i] +").\n";
        }
        
        this.txtResult.setText(res);
        
    }
    
    // Metodo para mostrar un resultado negativo
    public void deadlock() {
        this.txtResult.setText("No es posible llegar a un estado seguro. Existe interbloqueo");
    }
    
    // GETTER Y SETTER
    
    public JTextArea getTxtResult() {
        return txtResult;
    }

    public void setTxtResult(JTextArea txtResult) {
        this.txtResult = txtResult;
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResult;
    // End of variables declaration//GEN-END:variables
}
