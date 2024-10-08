/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import java.text.SimpleDateFormat;
import java.util.Date;
import static presentacion.Inicial.contar;


/**
 *
 * @author Natal
 */
public class Carrito extends javax.swing.JFrame {

    /**
     * Creates new form Carrito
     */
    public Carrito() {
        initComponents();
    }
    
    Juego1 j1= new Juego1();
    Juego2 j2= new Juego2();
    Juego3 j3= new Juego3();
    Juego4 j4= new Juego4();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl0 = new javax.swing.JLabel();
        txtnomjueg0 = new javax.swing.JTextField();
        txtnomjueg1 = new javax.swing.JTextField();
        txtnomjueg2 = new javax.swing.JTextField();
        txtnomjueg3 = new javax.swing.JTextField();
        btnImagen0 = new javax.swing.JButton();
        btnImagen1 = new javax.swing.JButton();
        btnImagen2 = new javax.swing.JButton();
        btnImagen3 = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPrecio0 = new javax.swing.JTextField();
        txtPrecio1 = new javax.swing.JTextField();
        txtPrecio2 = new javax.swing.JTextField();
        txtPrecio3 = new javax.swing.JTextField();
        btnRegresarc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1072, 826));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(56, 72, 123));
        jPanel1.setForeground(new java.awt.Color(255, 204, 255));

        lbl0.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        lbl0.setForeground(new java.awt.Color(204, 204, 204));

        txtnomjueg0.setBackground(new java.awt.Color(56, 72, 123));
        txtnomjueg0.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        txtnomjueg0.setForeground(new java.awt.Color(255, 255, 255));
        txtnomjueg0.setBorder(null);
        txtnomjueg0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomjueg0ActionPerformed(evt);
            }
        });

        txtnomjueg1.setBackground(new java.awt.Color(56, 72, 123));
        txtnomjueg1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        txtnomjueg1.setForeground(new java.awt.Color(255, 255, 255));
        txtnomjueg1.setBorder(null);

        txtnomjueg2.setBackground(new java.awt.Color(56, 72, 123));
        txtnomjueg2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        txtnomjueg2.setForeground(new java.awt.Color(255, 255, 255));
        txtnomjueg2.setBorder(null);

        txtnomjueg3.setBackground(new java.awt.Color(56, 72, 123));
        txtnomjueg3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        txtnomjueg3.setForeground(new java.awt.Color(255, 255, 255));
        txtnomjueg3.setBorder(null);

        btnImagen0.setBackground(new java.awt.Color(56, 72, 123));
        btnImagen0.setBorder(null);
        btnImagen0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagen0ActionPerformed(evt);
            }
        });

        btnImagen1.setBackground(new java.awt.Color(56, 72, 123));
        btnImagen1.setBorder(null);
        btnImagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagen1ActionPerformed(evt);
            }
        });

        btnImagen2.setBackground(new java.awt.Color(56, 72, 123));
        btnImagen2.setBorder(null);
        btnImagen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagen2ActionPerformed(evt);
            }
        });

        btnImagen3.setBackground(new java.awt.Color(56, 72, 123));
        btnImagen3.setBorder(null);
        btnImagen3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagen3ActionPerformed(evt);
            }
        });

        btnFactura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFactura.setText("Factura");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        lbl1.setForeground(new java.awt.Color(204, 204, 204));

        lbl2.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        lbl2.setForeground(new java.awt.Color(204, 204, 204));

        lbl3.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        lbl3.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Carrito");

        txtPrecio0.setBackground(new java.awt.Color(56, 72, 123));
        txtPrecio0.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        txtPrecio0.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio0.setBorder(null);
        txtPrecio0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio0ActionPerformed(evt);
            }
        });

        txtPrecio1.setBackground(new java.awt.Color(56, 72, 123));
        txtPrecio1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        txtPrecio1.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio1.setBorder(null);

        txtPrecio2.setBackground(new java.awt.Color(56, 72, 123));
        txtPrecio2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        txtPrecio2.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio2.setBorder(null);
        txtPrecio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio2ActionPerformed(evt);
            }
        });

        txtPrecio3.setBackground(new java.awt.Color(56, 72, 123));
        txtPrecio3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        txtPrecio3.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio3.setBorder(null);

        btnRegresarc.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnRegresarc.setText("Regresar");
        btnRegresarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnomjueg2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnImagen0, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(btnImagen3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtnomjueg3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtnomjueg0, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPrecio0, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtnomjueg1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl0, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(186, 186, 186)
                                            .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(223, 223, 223)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresarc)
                .addGap(224, 224, 224))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnImagen0, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnomjueg0, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl0, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnomjueg1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnomjueg2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnRegresarc)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnomjueg3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomjueg0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomjueg0ActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_txtnomjueg0ActionPerformed

    private void btnImagen0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagen0ActionPerformed
        // TODO add your handling code here:
    
        
        if("Phasmophobia".equals(txtnomjueg0.getText())){
            j1.setVisible(true);
        }
        if("Dead by Daylight".equals(txtnomjueg0.getText())){
            j2.setVisible(true);
        }
        if("Identity V".equals(txtnomjueg0.getText())){
            j3.setVisible(true);
        }
        if("Outlast".equals(txtnomjueg0.getText())){
            j4.setVisible(true);
        }
       
    }//GEN-LAST:event_btnImagen0ActionPerformed

    private void btnImagen3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagen3ActionPerformed
        // TODO add your handling code here:
        if("Phasmophobia".equals(txtnomjueg3.getText())){
            j1.setVisible(true);
        }
        if("Dead by Daylight".equals(txtnomjueg3.getText())){
            j2.setVisible(true);
        }
        if("Identity V".equals(txtnomjueg3.getText())){
            j3.setVisible(true);
        }
        if("Outlast".equals(txtnomjueg3.getText())){
            j4.setVisible(true);
        }
    }//GEN-LAST:event_btnImagen3ActionPerformed

    private void btnImagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagen1ActionPerformed
        // TODO add your handling code here:
        if("Phasmophobia".equals(txtnomjueg1.getText())){
            j1.setVisible(true);
        }
        if("Dead by Daylight".equals(txtnomjueg1.getText())){
            j2.setVisible(true);
        }
        if("Identity V".equals(txtnomjueg1.getText())){
            j3.setVisible(true);
        }
        if("Outlast".equals(txtnomjueg1.getText())){
            j4.setVisible(true);
        }
    }//GEN-LAST:event_btnImagen1ActionPerformed

    private void btnImagen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagen2ActionPerformed
        // TODO add your handling code here:
        if("Phasmophobia".equals(txtnomjueg2.getText())){
            j1.setVisible(true);
        }
        if("Dead by Daylight".equals(txtnomjueg2.getText())){
            j2.setVisible(true);
        }
        if("Identity V".equals(txtnomjueg2.getText())){
            j3.setVisible(true);
        }
        if("Outlast".equals(txtnomjueg2.getText())){
            j4.setVisible(true);
        }
    }//GEN-LAST:event_btnImagen2ActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        // TODO add your handling code here:
        
        
        
        Factura fac= new Factura(this,true);

        SimpleDateFormat date= new SimpleDateFormat("dd/MMM/yyyy hh:mm ");
        Date f=new Date();
        fac.txtFecha.setText(date.format(f));
        
        int total=contar[0]+contar[1]+contar[2]+contar[3];
        int iva=(int) (total*0.16);
        int fin=iva+total;
        
        String total1= Integer.toString(total);
        String iva1= Integer.toString(iva);
        String fin1= Integer.toString(fin);
        
        fac.txtFac0.setText(txtnomjueg0.getText());
        fac.txtFac1.setText(txtnomjueg1.getText());
        fac.txtFac2.setText(txtnomjueg2.getText());
        fac.txtFac3.setText(txtnomjueg3.getText());
        
        fac.txtD0.setText(txtPrecio0.getText());
        fac.txtD1.setText(txtPrecio1.getText());
        fac.txtD2.setText(txtPrecio2.getText());
        fac.txtD3.setText(txtPrecio3.getText());
        
        fac.txtSub.setText(total1);
        if(total==1000){
            fac.txtDesc.setText("$50.00");
            fac.txtIva.setText("$152.00");
            fac.txtTotal.setText("$1,102.00");
        }
        else{
            fac.txtDesc.setText("No aplica");
            fac.txtIva.setText(iva1);
            fac.txtTotal.setText(fin1);
        }
        
        fac.setVisible(true);
        
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void txtPrecio0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio0ActionPerformed

    private void btnRegresarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarcActionPerformed
        // TODO add your handling code here:
        Inicial inicial=new Inicial();
        inicial.setVisible(true);
    }//GEN-LAST:event_btnRegresarcActionPerformed

    private void txtPrecio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio2ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFactura;
    public static javax.swing.JButton btnImagen0;
    public static javax.swing.JButton btnImagen1;
    public static javax.swing.JButton btnImagen2;
    public static javax.swing.JButton btnImagen3;
    private javax.swing.JButton btnRegresarc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lbl0;
    public static javax.swing.JLabel lbl1;
    public static javax.swing.JLabel lbl2;
    public static javax.swing.JLabel lbl3;
    public static javax.swing.JTextField txtPrecio0;
    public static javax.swing.JTextField txtPrecio1;
    public static javax.swing.JTextField txtPrecio2;
    public static javax.swing.JTextField txtPrecio3;
    public static javax.swing.JTextField txtnomjueg0;
    public static javax.swing.JTextField txtnomjueg1;
    public static javax.swing.JTextField txtnomjueg2;
    public static javax.swing.JTextField txtnomjueg3;
    // End of variables declaration//GEN-END:variables
}
