package GUI;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author Renso Obregón Hdz
 */
public class InterfazAdmin extends javax.swing.JFrame {

    String Usuario = "admin";
    String Contrasenna = "1234";
    //private  String admin = "";
    public static boolean admin = false;
    public InterfazAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logo.png"));
        return retValue;

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIcon = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        JLabelUsuario = new javax.swing.JLabel();
        JLabelContrasenna = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jButtonSesion = new javax.swing.JButton();
        jButtonVolverUser = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/google.png"))); // NOI18N
        getContentPane().add(jLabelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 140, 220));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        JLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        JLabelUsuario.setText("Usuario");
        getContentPane().add(JLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 80, 30));

        JLabelContrasenna.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLabelContrasenna.setForeground(new java.awt.Color(255, 255, 255));
        JLabelContrasenna.setText("Contraseña");
        getContentPane().add(JLabelContrasenna, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 110, 30));

        txtUser.setBackground(new java.awt.Color(0, 51, 102));
        txtUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 210, 30));

        Password.setBackground(new java.awt.Color(0, 51, 102));
        Password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 210, 30));

        jButtonSesion.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSesion.setForeground(new java.awt.Color(0, 0, 102));
        jButtonSesion.setText("Iniciar Sesión");
        jButtonSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSesionMouseClicked(evt);
            }
        });
        jButtonSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        jButtonVolverUser.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVolverUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonVolverUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        jButtonVolverUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverUserActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolverUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 40, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoAzul.png"))); // NOI18N
        jLabelFondo.setText("f");
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 428, 568));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Boton salir

        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void jButtonSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSesionActionPerformed

    private void jButtonVolverUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverUserActionPerformed
        //Boton de ir al usuario/cosulta

        InterfazInicio v1 = new InterfazInicio();
        v1.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonVolverUserActionPerformed

    private void jButtonSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSesionMouseClicked
        // Validacion de Usuario/contraseña 

        // String Usuario = "admin";
        //String Contraseña = "1234";
        String pass = new String(Password.getPassword());

        if (txtUser.getText().equalsIgnoreCase(Usuario) && pass.equalsIgnoreCase(Contrasenna)) {

            ControlEmpleados v3 = new ControlEmpleados();
            v3.setVisible(true);
            dispose();
            this.admin = true;
        } else {

            JOptionPane.showMessageDialog(this, "Usuario / Conatraseña incorrecta");
            
        }
        System.out.println("admin " + this.admin);
    }//GEN-LAST:event_jButtonSesionMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAdmin().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelContrasenna;
    private javax.swing.JLabel JLabelUsuario;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSesion;
    private javax.swing.JButton jButtonVolverUser;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    

}//Fin de la clase
