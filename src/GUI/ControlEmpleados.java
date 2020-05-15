package GUI;

/**
 *
 * @author Renso Obregón Hdz
 */
public class ControlEmpleados extends javax.swing.JFrame {

    int clicks;
    boolean administrador = false;

    public ControlEmpleados() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jLabelOpciones = new javax.swing.JLabel();
        jPanelHerramientas = new javax.swing.JPanel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jTFSalarioCrear = new javax.swing.JTextField();
        jLSalarioCrear = new javax.swing.JLabel();
        jTFEdadCrear = new javax.swing.JTextField();
        jLEdadCrear = new javax.swing.JLabel();
        jTFCedulaCrear = new javax.swing.JTextField();
        jLCedulaCrear = new javax.swing.JLabel();
        jTFCrearNombre = new javax.swing.JTextField();
        jLNombreCrear = new javax.swing.JLabel();
        jBCrearEmpleado = new javax.swing.JButton();
        jLabelSalir = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jBEditarEmpleado = new javax.swing.JButton();
        jBBorrarEmpleado = new javax.swing.JButton();
        jBBuscarEmpleado = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control de empleados");
        setUndecorated(true);
        setResizable(false);
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
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 60, -1));

        jLabelOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/opciones.png"))); // NOI18N
        jLabelOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelOpcionesMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanelHerramientas.setBackground(new java.awt.Color(40, 40, 40));

        jButtonBuscar.setText("Buscar");

        jButtonEditar.setText("Editar");
        jButtonEditar.setVisible(false);
        jButtonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditarMouseClicked(evt);
            }
        });
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonCrear.setVisible(false);
        jButtonCrear.setText("Crear");
        jButtonCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCrearMouseClicked(evt);
            }
        });
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });

        jButtonBorrar.setVisible(false);
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBorrarMouseClicked(evt);
            }
        });
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHerramientasLayout = new javax.swing.GroupLayout(jPanelHerramientas);
        jPanelHerramientas.setLayout(jPanelHerramientasLayout);
        jPanelHerramientasLayout.setHorizontalGroup(
            jPanelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHerramientasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonBorrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHerramientasLayout.setVerticalGroup(
            jPanelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHerramientasLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButtonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBorrar)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanelHerramientas.setVisible(false);

        getContentPane().add(jPanelHerramientas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 190));

        Volver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Volver.setForeground(new java.awt.Color(255, 255, 255));
        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jTFSalarioCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSalarioCrearActionPerformed(evt);
            }
        });
        getContentPane().add(jTFSalarioCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 110, -1));

        jLSalarioCrear.setText("Salario:");
        getContentPane().add(jLSalarioCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, 20));
        getContentPane().add(jTFEdadCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 40, -1));

        jLEdadCrear.setText("Edad:");
        getContentPane().add(jLEdadCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jTFCedulaCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCedulaCrearActionPerformed(evt);
            }
        });
        getContentPane().add(jTFCedulaCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 140, -1));

        jLCedulaCrear.setText("Cédula:");
        getContentPane().add(jLCedulaCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jTFCrearNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCrearNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTFCrearNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, -1));

        jLNombreCrear.setText("Nombre:");
        getContentPane().add(jLNombreCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jBCrearEmpleado.setVisible(false);
        jBCrearEmpleado.setText("Crear Empleado");
        jBCrearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(jBCrearEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        jLabelSalir.setVisible(true);
        jLabelSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jLabelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Aquí se muestra la información \ndel empleado");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 350, 180));

        jBEditarEmpleado.setVisible(false);
        jBEditarEmpleado.setText("Editar Empleado");
        jBEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(jBEditarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jBBorrarEmpleado.setVisible(false);
        jBBorrarEmpleado.setText("Borrar Empleado");
        getContentPane().add(jBBorrarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        jBBuscarEmpleado.setText("Buscar Empleado");
        getContentPane().add(jBBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed

        //Boton salir
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // Boton Volver

        InterfazInicio v1 = new InterfazInicio();
        v1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VolverActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTFCrearNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCrearNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCrearNombreActionPerformed

    private void jTFCedulaCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCedulaCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCedulaCrearActionPerformed

    private void jLabelOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelOpcionesMouseClicked
        clicks++;
        if (clicks % 2 != 0) {
            jPanelHerramientas.setVisible(true);//Muestra el panel
        } else {
            jPanelHerramientas.setVisible(false);
        }
        administrador = InterfazInicio.getAdmin();
        System.out.println("numero de clicks = " + clicks);
        System.out.println("administrador? " + this.administrador);
        if (administrador == true) {
            //Muestra los botones
            jButtonCrear.setVisible(true);
            jButtonEditar.setVisible(true);
            jButtonBorrar.setVisible(true);

        }
    }//GEN-LAST:event_jLabelOpcionesMouseClicked

    private void jTFSalarioCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSalarioCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSalarioCrearActionPerformed

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jButtonCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCrearMouseClicked
        //Muestra el boton
        jBCrearEmpleado.setVisible(true);
    }//GEN-LAST:event_jButtonCrearMouseClicked

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked
        //Esconde el boton
        jBCrearEmpleado.setVisible(false);
        jBEditarEmpleado.setVisible(false);
        //jBBuscarEmpleado.setVisible(false);
        jBBorrarEmpleado.setVisible(false);
    }//GEN-LAST:event_jLabelSalirMouseClicked

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jBCrearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCrearEmpleadoActionPerformed

    private void jBEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEditarEmpleadoActionPerformed

    private void jButtonBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBorrarMouseClicked
        // Muestra el boton
        jBBorrarEmpleado.setVisible(true);
        
    }//GEN-LAST:event_jButtonBorrarMouseClicked

    private void jButtonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseClicked
        // Muestra el boton 
        jBEditarEmpleado.setVisible(true);
    }//GEN-LAST:event_jButtonEditarMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JButton jBBorrarEmpleado;
    private javax.swing.JButton jBBuscarEmpleado;
    private javax.swing.JButton jBCrearEmpleado;
    private javax.swing.JButton jBEditarEmpleado;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLCedulaCrear;
    private javax.swing.JLabel jLEdadCrear;
    private javax.swing.JLabel jLNombreCrear;
    private javax.swing.JLabel jLSalarioCrear;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelOpciones;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JPanel jPanelHerramientas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCedulaCrear;
    private javax.swing.JTextField jTFCrearNombre;
    private javax.swing.JTextField jTFEdadCrear;
    private javax.swing.JTextField jTFSalarioCrear;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
