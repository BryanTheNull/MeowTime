package View.PanelesAdministrador;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author bv587
 */

public class AdministrarAsistencia extends javax.swing.JFrame {
    

    public AdministrarAsistencia() {
        initComponents();
        ShowPanel(background);
    }

      public void ShowPanel(JPanel p) {
        p.setSize(950, 700);
        p.setLocation(0, 0);

        panelChanging.removeAll();
        panelChanging.add(p, BorderLayout.CENTER);
        panelChanging.revalidate();
        panelChanging.repaint();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        paneBarraNavegacion = new javax.swing.JPanel();
        jLabelLogoYNombre = new javax.swing.JLabel();
        jLabelBarraSeparacion = new javax.swing.JLabel();
        jLabelOperaciones = new javax.swing.JLabel();
        btnRegistrarAsistencia1 = new javax.swing.JPanel();
        jLabelPrincipal1 = new javax.swing.JLabel();
        btnRegistrarAsistencia2 = new javax.swing.JPanel();
        jLabelPrincipal2 = new javax.swing.JLabel();
        jLabelAdministracion = new javax.swing.JLabel();
        btnRegistrarAsistencia5 = new javax.swing.JPanel();
        jLabelPrincipal5 = new javax.swing.JLabel();
        btnRegistrarAsistencia16 = new javax.swing.JPanel();
        jLabelPrincipal16 = new javax.swing.JLabel();
        btnRegistrarAsistencia3 = new javax.swing.JPanel();
        jLabelPrincipal3 = new javax.swing.JLabel();
        panelChanging = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMaximumSize(new java.awt.Dimension(1200, 700));
        background.setMinimumSize(new java.awt.Dimension(1200, 700));
        background.setName(""); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1200, 700));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneBarraNavegacion.setBackground(new java.awt.Color(0, 0, 153));
        paneBarraNavegacion.setMaximumSize(new java.awt.Dimension(250, 700));
        paneBarraNavegacion.setMinimumSize(new java.awt.Dimension(250, 700));

        jLabelLogoYNombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelLogoYNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogoYNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoYNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gato_reloj 24x24.png"))); // NOI18N
        jLabelLogoYNombre.setText("MeowTime");

        jLabelBarraSeparacion.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabelBarraSeparacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBarraSeparacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBarraSeparacion.setText("_________");
        jLabelBarraSeparacion.setToolTipText("");
        jLabelBarraSeparacion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabelOperaciones.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        jLabelOperaciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOperaciones.setText("Operaciones");

        btnRegistrarAsistencia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistrarAsistencia1MousePressed(evt);
            }
        });

        jLabelPrincipal1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabelPrincipal1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrincipal1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPrincipal1.setText("Asistencia Diaria");

        javax.swing.GroupLayout btnRegistrarAsistencia1Layout = new javax.swing.GroupLayout(btnRegistrarAsistencia1);
        btnRegistrarAsistencia1.setLayout(btnRegistrarAsistencia1Layout);
        btnRegistrarAsistencia1Layout.setHorizontalGroup(
            btnRegistrarAsistencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarAsistencia1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnRegistrarAsistencia1Layout.setVerticalGroup(
            btnRegistrarAsistencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarAsistencia1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelPrincipal2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabelPrincipal2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrincipal2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPrincipal2.setText("Usuarios");

        javax.swing.GroupLayout btnRegistrarAsistencia2Layout = new javax.swing.GroupLayout(btnRegistrarAsistencia2);
        btnRegistrarAsistencia2.setLayout(btnRegistrarAsistencia2Layout);
        btnRegistrarAsistencia2Layout.setHorizontalGroup(
            btnRegistrarAsistencia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarAsistencia2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnRegistrarAsistencia2Layout.setVerticalGroup(
            btnRegistrarAsistencia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarAsistencia2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPrincipal2)
                .addGap(13, 13, 13))
        );

        jLabelAdministracion.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        jLabelAdministracion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdministracion.setText("Configuraciones");

        jLabelPrincipal5.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabelPrincipal5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrincipal5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPrincipal5.setText("Cambiar Contraseña");

        javax.swing.GroupLayout btnRegistrarAsistencia5Layout = new javax.swing.GroupLayout(btnRegistrarAsistencia5);
        btnRegistrarAsistencia5.setLayout(btnRegistrarAsistencia5Layout);
        btnRegistrarAsistencia5Layout.setHorizontalGroup(
            btnRegistrarAsistencia5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarAsistencia5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelPrincipal5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnRegistrarAsistencia5Layout.setVerticalGroup(
            btnRegistrarAsistencia5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarAsistencia5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPrincipal5)
                .addGap(13, 13, 13))
        );

        jLabelPrincipal16.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabelPrincipal16.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrincipal16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPrincipal16.setText("Cerrar Sesion");

        javax.swing.GroupLayout btnRegistrarAsistencia16Layout = new javax.swing.GroupLayout(btnRegistrarAsistencia16);
        btnRegistrarAsistencia16.setLayout(btnRegistrarAsistencia16Layout);
        btnRegistrarAsistencia16Layout.setHorizontalGroup(
            btnRegistrarAsistencia16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarAsistencia16Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelPrincipal16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnRegistrarAsistencia16Layout.setVerticalGroup(
            btnRegistrarAsistencia16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarAsistencia16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPrincipal16)
                .addGap(13, 13, 13))
        );

        jLabelPrincipal3.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabelPrincipal3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrincipal3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPrincipal3.setText("Cargos");

        javax.swing.GroupLayout btnRegistrarAsistencia3Layout = new javax.swing.GroupLayout(btnRegistrarAsistencia3);
        btnRegistrarAsistencia3.setLayout(btnRegistrarAsistencia3Layout);
        btnRegistrarAsistencia3Layout.setHorizontalGroup(
            btnRegistrarAsistencia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarAsistencia3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelPrincipal3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnRegistrarAsistencia3Layout.setVerticalGroup(
            btnRegistrarAsistencia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarAsistencia3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPrincipal3)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout paneBarraNavegacionLayout = new javax.swing.GroupLayout(paneBarraNavegacion);
        paneBarraNavegacion.setLayout(paneBarraNavegacionLayout);
        paneBarraNavegacionLayout.setHorizontalGroup(
            paneBarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarAsistencia1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRegistrarAsistencia2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRegistrarAsistencia5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRegistrarAsistencia16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(paneBarraNavegacionLayout.createSequentialGroup()
                .addGroup(paneBarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneBarraNavegacionLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(paneBarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBarraSeparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLogoYNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paneBarraNavegacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelOperaciones))
                    .addGroup(paneBarraNavegacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelAdministracion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnRegistrarAsistencia3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paneBarraNavegacionLayout.setVerticalGroup(
            paneBarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneBarraNavegacionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelLogoYNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBarraSeparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelOperaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarAsistencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarAsistencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarAsistencia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabelAdministracion)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarAsistencia5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarAsistencia16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        background.add(paneBarraNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 700));

        panelChanging.setBackground(new java.awt.Color(255, 255, 255));
        panelChanging.setMaximumSize(new java.awt.Dimension(950, 0));
        panelChanging.setMinimumSize(new java.awt.Dimension(950, 0));

        javax.swing.GroupLayout panelChangingLayout = new javax.swing.GroupLayout(panelChanging);
        panelChanging.setLayout(panelChangingLayout);
        panelChangingLayout.setHorizontalGroup(
            panelChangingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        panelChangingLayout.setVerticalGroup(
            panelChangingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        background.add(panelChanging, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 960, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarAsistencia1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarAsistencia1MousePressed

    }//GEN-LAST:event_btnRegistrarAsistencia1MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnRegistrarAsistencia1;
    private javax.swing.JPanel btnRegistrarAsistencia16;
    private javax.swing.JPanel btnRegistrarAsistencia2;
    private javax.swing.JPanel btnRegistrarAsistencia3;
    private javax.swing.JPanel btnRegistrarAsistencia5;
    private javax.swing.JLabel jLabelAdministracion;
    private javax.swing.JLabel jLabelBarraSeparacion;
    private javax.swing.JLabel jLabelLogoYNombre;
    private javax.swing.JLabel jLabelOperaciones;
    private javax.swing.JLabel jLabelPrincipal1;
    private javax.swing.JLabel jLabelPrincipal16;
    private javax.swing.JLabel jLabelPrincipal2;
    private javax.swing.JLabel jLabelPrincipal3;
    private javax.swing.JLabel jLabelPrincipal5;
    private javax.swing.JPanel paneBarraNavegacion;
    private javax.swing.JPanel panelChanging;
    // End of variables declaration//GEN-END:variables
}
