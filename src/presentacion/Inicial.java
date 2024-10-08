/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;


import javax.swing.ImageIcon;
import static presentacion.Juego1.array;


/**
 *
 * @author Natal
 */
public class Inicial extends javax.swing.JFrame {
    
    public static int contar[]= new int[4];

    /**
     * Creates new form Inicial
     */
    public Inicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnJuego1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnJuego2 = new javax.swing.JButton();
        btnJuego3 = new javax.swing.JButton();
        btnJuego4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(69, 88, 147));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/h_1.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ELIGames");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-11-18 095923.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/idv_1.png"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/out_1.png"))); // NOI18N
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnJuego1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnJuego1.setText("Phasmophobia");
        btnJuego1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuego1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel9.setText("Terror / Cooperativo ");

        btnJuego2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnJuego2.setText("Dead By Daylight");
        btnJuego2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuego2ActionPerformed(evt);
            }
        });

        btnJuego3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnJuego3.setText("Identity V");
        btnJuego3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuego3ActionPerformed(evt);
            }
        });

        btnJuego4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnJuego4.setText("Outlast");
        btnJuego4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuego4ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel11.setText("Terror / 4vs1 / Supervivencia");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel12.setText("Terror / 4vs1 / Supervivencia / Rank");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel13.setText("Terror psicologico / Un jugador / Historia");

        btnCarrito.setText("Carrito");
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnJuego4, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJuego3, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJuego2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel9))))
                        .addContainerGap(279, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnJuego1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCarrito)
                        .addGap(96, 96, 96))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(417, 417, 417))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnJuego2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnJuego3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnJuego4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnJuego1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJuego1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuego1ActionPerformed
        // TODO add your handling code here:
        Juego1 frmJuego1 = new Juego1();
        frmJuego1.setVisible(true);
        this.dispose();
        // Q NO TE DEJE VOLVER A PICARLEEE
    }//GEN-LAST:event_btnJuego1ActionPerformed

    private void btnJuego2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuego2ActionPerformed
        // TODO add your handling code here:
        Juego2 frmJuego2 = new Juego2();
        frmJuego2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJuego2ActionPerformed

    private void btnJuego3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuego3ActionPerformed
        // TODO add your handling code here:
        Juego3 frmJuego3 = new Juego3();
        frmJuego3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJuego3ActionPerformed

    private void btnJuego4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuego4ActionPerformed
        // TODO add your handling code here:
        Juego4 frmJuego4 = new Juego4();
        frmJuego4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJuego4ActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        // TODO add your handling code here:
        Carrito car= new Carrito();
        car.setVisible(true);
        this.dispose();
        
        
        
        //Opciones flag= new Opciones();
        // int flag1= flag.flag;
        
        ImageIcon phasmo = new ImageIcon(Opciones.class.getResource("phasmo.png"));
        ImageIcon dbd = new ImageIcon(Opciones.class.getResource("dbd.png"));
        ImageIcon idv = new ImageIcon(Opciones.class.getResource("idv.png"));
        ImageIcon out = new ImageIcon(Opciones.class.getResource("out.png"));
        
        
        if (array.get(0) == "100"){
            Carrito.txtnomjueg0.setText("Phasmophobia");
            contar[0]=100;
            Carrito.lbl0.setText("Terror / Cooperativo");
            Carrito.txtPrecio0.setText("$100.00"); 
            Carrito.btnImagen0.setIcon(phasmo);
        }
        else if (array.get(0) == "200"){
            Carrito.txtnomjueg0.setText("Dead by Daylight");
            contar[0]=200;
            Carrito.lbl0.setText("Terror / 4vs1 / Supervivencia");
            Carrito.txtPrecio0.setText("$200.00");
            Carrito.btnImagen0.setIcon(dbd);
        }
        else if (array.get(0) == "300"){
            Carrito.txtnomjueg0.setText("Identity V");
            contar[0]=300;
            Carrito.lbl0.setText("Terror / 4vs1 / Supervivencia / Rank");
            Carrito.txtPrecio0.setText("$300.00");
            Carrito.btnImagen0.setIcon(idv);
        }
        else if (array.get(0) == "400"){
            Carrito.txtnomjueg0.setText("Outlast");
            contar[0]=400;
            Carrito.lbl0.setText("Terror psicológico / Un jugador / Historia");
            Carrito.txtPrecio0.setText("$400.00");
            Carrito.btnImagen0.setIcon(out);
        }
        
        
        if (array.get(1) == "200"){
            Carrito.txtnomjueg1.setText("Dead by Daylight");
            contar[1]=200;
            Carrito.lbl1.setText("Terror / 4vs1 / Supervivencia");
            Carrito.txtPrecio1.setText("$200.00");
            Carrito.btnImagen1.setIcon(dbd);
        }
        else if (array.get(1) == "100"){
            Carrito.txtnomjueg1.setText("Phasmophobia");
            contar[1]=100;
            Carrito.lbl1.setText("Terror / Cooperativo ");
            Carrito.txtPrecio1.setText("$100.00");
            Carrito.btnImagen1.setIcon(phasmo);
        }
        else if (array.get(1) == "300"){
            Carrito.txtnomjueg1.setText("Identity V");
            contar[1]=300;
            Carrito.lbl1.setText("Terror / 4vs1 / Supervivencia / Rank");
            Carrito.txtPrecio1.setText("$300.00");
            Carrito.btnImagen1.setIcon(idv);
        }
        else if (array.get(1) == "400"){
            Carrito.txtnomjueg1.setText("Outlast");
            contar[1]=400;
            Carrito.lbl1.setText("Terror psicológico / Un jugador / Historia");
            Carrito.txtPrecio1.setText("$400.00");
            Carrito.btnImagen1.setIcon(out);
        }
        
        
        if (array.get(2) == "300"){
            Carrito.txtnomjueg2.setText("Identity V");
            contar[2]=300;
            Carrito.lbl2.setText("Terror / 4vs1 / Supervivencia / Rank");
            Carrito.txtPrecio2.setText("$300.00");
            Carrito.btnImagen2.setIcon(idv);
        }
        else if (array.get(2) == "100"){
            Carrito.txtnomjueg2.setText("Phasmophobia");
            contar[2]=100;
            Carrito.lbl2.setText("Terror / Cooperativo ");
            Carrito.txtPrecio2.setText("$100.00");
            Carrito.btnImagen2.setIcon(phasmo);
        }
        else if (array.get(2) == "200"){
            Carrito.txtnomjueg2.setText("Dead by Daylight");
            contar[2]=200;
            Carrito.lbl2.setText("Terror / 4vs1 / Supervivencia");
            Carrito.txtPrecio2.setText("$200.00");
            Carrito.btnImagen2.setIcon(dbd);
        }
        else if (array.get(2) == "400"){
            Carrito.txtnomjueg2.setText("Outlast");
            contar[2]=400;
            Carrito.lbl2.setText("Terror psicológico / Un jugador / Historia");
            Carrito.txtPrecio2.setText("$400.00");
            Carrito.btnImagen2.setIcon(out);
        }
        
        
        if (array.get(3) == "400"){
            Carrito.txtnomjueg3.setText("Outlast");
            contar[3]=400;
            Carrito.lbl3.setText("Terror psicológico / Un jugador / Historia");
            Carrito.txtPrecio3.setText("$400.00");
            Carrito.btnImagen3.setIcon(out);
        }
        else if (array.get(3) == "100"){
            Carrito.txtnomjueg3.setText("Phasmophobia");
            contar[3]=100;
            Carrito.lbl3.setText("Terror / Cooperativo ");
            Carrito.txtPrecio3.setText("$100.00");
            Carrito.btnImagen3.setIcon(phasmo);
        }
        else if (array.get(3) == "200"){
            Carrito.txtnomjueg3.setText("Dead by Daylight");
            contar[3]=200;
            Carrito.lbl3.setText("Terror / 4vs1 / Supervivencia");
            Carrito.txtPrecio3.setText("$200.00");
            Carrito.btnImagen3.setIcon(dbd);
        }
        else if (array.get(3) == "300"){
            Carrito.txtnomjueg3.setText("Identity V");
            contar[3]=300;
            Carrito.lbl3.setText("Terror / 4vs1 / Supervivencia / Rank");
            Carrito.txtPrecio3.setText("$300.00");
            Carrito.btnImagen3.setIcon(idv);
            
        }
       
        this.dispose();  
    }//GEN-LAST:event_btnCarritoActionPerformed

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnJuego1;
    private javax.swing.JButton btnJuego2;
    private javax.swing.JButton btnJuego3;
    private javax.swing.JButton btnJuego4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
