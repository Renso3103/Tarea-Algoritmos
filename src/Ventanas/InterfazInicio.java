package Ventanas;

/**
 *
 * @author Equipo
 */
public class InterfazInicio extends javax.swing.JFrame {

    public InterfazInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jLabelUser = new javax.swing.JLabel();
        jButtonIrAdmin = new javax.swing.JButton();
        jButtonSesión = new javax.swing.JButton();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(255, 102, 102));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 60, -1));

        jLabelUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        getContentPane().add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jButtonIrAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jButtonIrAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonIrAdmin.setForeground(new java.awt.Color(0, 51, 102));
        jButtonIrAdmin.setText("Administrador");
        jButtonIrAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIrAdminActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIrAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jButtonSesión.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSesión.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSesión.setForeground(new java.awt.Color(0, 51, 102));
        jButtonSesión.setText("Iniciar Sesión");
        jButtonSesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSesiónActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSesión, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, 30));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed

        //Boton salir
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonSesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSesiónActionPerformed

        //Boton Inicio de Sesión
        ControlEmpleados v3 = new ControlEmpleados();
        v3.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButtonSesiónActionPerformed

    private void jButtonIrAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIrAdminActionPerformed

        //Boton de ir al ventana de inicio sesion admin
        InterfazAdmin v2 = new InterfazAdmin();
        v2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonIrAdminActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIrAdmin;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSesión;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelfondo;
    // End of variables declaration//GEN-END:variables
}
