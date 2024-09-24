package View.Usuario;

import Config.App;
import Controller.Seguridad.CambiarContraseñaController;
import Controller.Usuario.HistorialAsistenciaController;
import Controller.Usuario.RegistrarAsistenciaController;
import View.Login.Login;
import View.Seguridad.PanelCambiarContraseña;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author Bryan Vera
 * @since 02-09-2024
 */
public class UsuarioView extends javax.swing.JFrame {

    // Ruta de logo de MeowTime
    Image meowTime = new ImageIcon(App.class.getResource("/icons/logo_MeowTime 512x512.png")).getImage();

    // Crear instancias de interfazes para manejar ventanas y pasarselas a sus controladores.
    PanelRegistrarAsistencia panelRegistrarAsistencia = new PanelRegistrarAsistencia();
    RegistrarAsistenciaController registrarAsistenciaController = new RegistrarAsistenciaController(panelRegistrarAsistencia);

    PanelHistorialAsistencia panelHistorialAsistencia = new PanelHistorialAsistencia();
    HistorialAsistenciaController historialAsistenciaController = new HistorialAsistenciaController(panelHistorialAsistencia);
            
    PanelCambiarContraseña panelCambiarContraseña = new PanelCambiarContraseña();
    CambiarContraseñaController cambiarContraseñaController = new CambiarContraseñaController(panelCambiarContraseña);
    
    public UsuarioView() {
        initComponents();
        setIconImage(meowTime);
        ShowPanel(panelRegistrarAsistencia);
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

        jSplitPane1 = new javax.swing.JSplitPane();
        background = new javax.swing.JPanel();
        paneBarraNavegacion = new javax.swing.JPanel();
        jLabelLogoYNombre = new javax.swing.JLabel();
        jLabelBarraSeparacion = new javax.swing.JLabel();
        jLabelOperaciones = new javax.swing.JLabel();
        btnRegistrarAsistencia = new javax.swing.JPanel();
        jLabelPrincipal = new javax.swing.JLabel();
        btnHistorialAsistencia = new javax.swing.JPanel();
        jLabelPrincipal1 = new javax.swing.JLabel();
        jLabelAdministracion = new javax.swing.JLabel();
        btnCambiarContraseña = new javax.swing.JPanel();
        jLabelPrincipal5 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JPanel();
        jLabelPrincipal16 = new javax.swing.JLabel();
        panelChanging = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMaximumSize(new java.awt.Dimension(1200, 700));
        background.setMinimumSize(new java.awt.Dimension(1200, 700));
        background.setName(""); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1200, 700));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneBarraNavegacion.setBackground(new java.awt.Color(13, 71, 160));
        paneBarraNavegacion.setMaximumSize(new java.awt.Dimension(250, 50));
        paneBarraNavegacion.setMinimumSize(new java.awt.Dimension(250, 50));
        paneBarraNavegacion.setPreferredSize(new java.awt.Dimension(250, 50));

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

        btnRegistrarAsistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarAsistencia.setMaximumSize(new java.awt.Dimension(250, 50));
        btnRegistrarAsistencia.setMinimumSize(new java.awt.Dimension(250, 50));
        btnRegistrarAsistencia.setOpaque(false);
        btnRegistrarAsistencia.setPreferredSize(new java.awt.Dimension(250, 50));
        btnRegistrarAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarAsistenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarAsistenciaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistrarAsistenciaMousePressed(evt);
            }
        });

        jLabelPrincipal.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/registrar 24x23.png"))); // NOI18N
        jLabelPrincipal.setText("Registrar Asistencia");

        javax.swing.GroupLayout btnRegistrarAsistenciaLayout = new javax.swing.GroupLayout(btnRegistrarAsistencia);
        btnRegistrarAsistencia.setLayout(btnRegistrarAsistenciaLayout);
        btnRegistrarAsistenciaLayout.setHorizontalGroup(
            btnRegistrarAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarAsistenciaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnRegistrarAsistenciaLayout.setVerticalGroup(
            btnRegistrarAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarAsistenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnHistorialAsistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistorialAsistencia.setMaximumSize(new java.awt.Dimension(250, 50));
        btnHistorialAsistencia.setMinimumSize(new java.awt.Dimension(250, 50));
        btnHistorialAsistencia.setOpaque(false);
        btnHistorialAsistencia.setPreferredSize(new java.awt.Dimension(250, 50));
        btnHistorialAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHistorialAsistenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHistorialAsistenciaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHistorialAsistenciaMousePressed(evt);
            }
        });

        jLabelPrincipal1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabelPrincipal1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrincipal1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPrincipal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/historial 24x24 .png"))); // NOI18N
        jLabelPrincipal1.setText("Historial Asistencia");

        javax.swing.GroupLayout btnHistorialAsistenciaLayout = new javax.swing.GroupLayout(btnHistorialAsistencia);
        btnHistorialAsistencia.setLayout(btnHistorialAsistenciaLayout);
        btnHistorialAsistenciaLayout.setHorizontalGroup(
            btnHistorialAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHistorialAsistenciaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnHistorialAsistenciaLayout.setVerticalGroup(
            btnHistorialAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHistorialAsistenciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPrincipal1)
                .addGap(13, 13, 13))
        );

        jLabelAdministracion.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        jLabelAdministracion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdministracion.setText("Configuraciones");

        btnCambiarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiarContraseña.setMaximumSize(new java.awt.Dimension(250, 50));
        btnCambiarContraseña.setMinimumSize(new java.awt.Dimension(250, 50));
        btnCambiarContraseña.setOpaque(false);
        btnCambiarContraseña.setPreferredSize(new java.awt.Dimension(250, 50));
        btnCambiarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCambiarContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCambiarContraseñaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCambiarContraseñaMousePressed(evt);
            }
        });

        jLabelPrincipal5.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabelPrincipal5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrincipal5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPrincipal5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/candado 24x24.png"))); // NOI18N
        jLabelPrincipal5.setText("Cambiar Contraseña");

        javax.swing.GroupLayout btnCambiarContraseñaLayout = new javax.swing.GroupLayout(btnCambiarContraseña);
        btnCambiarContraseña.setLayout(btnCambiarContraseñaLayout);
        btnCambiarContraseñaLayout.setHorizontalGroup(
            btnCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCambiarContraseñaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelPrincipal5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCambiarContraseñaLayout.setVerticalGroup(
            btnCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCambiarContraseñaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPrincipal5)
                .addGap(13, 13, 13))
        );

        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setMaximumSize(new java.awt.Dimension(250, 50));
        btnCerrarSesion.setMinimumSize(new java.awt.Dimension(250, 50));
        btnCerrarSesion.setOpaque(false);
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(250, 50));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMousePressed(evt);
            }
        });

        jLabelPrincipal16.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabelPrincipal16.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrincipal16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPrincipal16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar_Sesion 24x24.png"))); // NOI18N
        jLabelPrincipal16.setText("Cerrar Sesion");

        javax.swing.GroupLayout btnCerrarSesionLayout = new javax.swing.GroupLayout(btnCerrarSesion);
        btnCerrarSesion.setLayout(btnCerrarSesionLayout);
        btnCerrarSesionLayout.setHorizontalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarSesionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelPrincipal16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCerrarSesionLayout.setVerticalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarSesionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPrincipal16)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout paneBarraNavegacionLayout = new javax.swing.GroupLayout(paneBarraNavegacion);
        paneBarraNavegacion.setLayout(paneBarraNavegacionLayout);
        paneBarraNavegacionLayout.setHorizontalGroup(
            paneBarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHistorialAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRegistrarAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCambiarContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(btnRegistrarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHistorialAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabelAdministracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );

        background.add(paneBarraNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 700));

        panelChanging.setBackground(new java.awt.Color(255, 255, 255));
        panelChanging.setMaximumSize(new java.awt.Dimension(950, 0));
        panelChanging.setMinimumSize(new java.awt.Dimension(950, 0));
        panelChanging.setPreferredSize(new java.awt.Dimension(950, 0));

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

    /**
     * Eventos de paneles para cambiar de ventana en la interfaz principal.
     */
    private void btnRegistrarAsistenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarAsistenciaMousePressed
        ShowPanel(panelRegistrarAsistencia);
    }//GEN-LAST:event_btnRegistrarAsistenciaMousePressed

    private void btnHistorialAsistenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistorialAsistenciaMousePressed
        ShowPanel(panelHistorialAsistencia);
    }//GEN-LAST:event_btnHistorialAsistenciaMousePressed

    private void btnCambiarContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaMousePressed
        ShowPanel(panelCambiarContraseña);
    }//GEN-LAST:event_btnCambiarContraseñaMousePressed

    private void btnCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMousePressed
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionMousePressed

    /**
     * Eventos para crear efecto de hover al pasar el mouse sobre el boton.
     */
    private void btnRegistrarAsistenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarAsistenciaMouseEntered
        btnRegistrarAsistencia.setBackground(Color.decode("#0D5DC1"));
        btnRegistrarAsistencia.setOpaque(true);
    }//GEN-LAST:event_btnRegistrarAsistenciaMouseEntered

    private void btnHistorialAsistenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistorialAsistenciaMouseEntered
        btnHistorialAsistencia.setBackground(Color.decode("#0D5DC1"));
        btnHistorialAsistencia.setOpaque(true);
    }//GEN-LAST:event_btnHistorialAsistenciaMouseEntered

    private void btnCambiarContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaMouseEntered
        btnCambiarContraseña.setBackground(Color.decode("#0D5DC1"));
        btnCambiarContraseña.setOpaque(true);
    }//GEN-LAST:event_btnCambiarContraseñaMouseEntered

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        btnCerrarSesion.setBackground(Color.decode("#0D5DC1"));
        btnCambiarContraseña.setOpaque(true);
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    /**
     * Eventos para regresar el boton a su esatdo normal al salir de mouse de
     * este mismo.
     */
    private void btnRegistrarAsistenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarAsistenciaMouseExited
        btnRegistrarAsistencia.setBackground(Color.decode("#0D47A0"));
        btnRegistrarAsistencia.setOpaque(true);
    }//GEN-LAST:event_btnRegistrarAsistenciaMouseExited

    private void btnHistorialAsistenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistorialAsistenciaMouseExited
        btnHistorialAsistencia.setBackground(Color.decode("#0D47A0"));
        btnHistorialAsistencia.setOpaque(true);
    }//GEN-LAST:event_btnHistorialAsistenciaMouseExited

    private void btnCambiarContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaMouseExited
        btnCambiarContraseña.setBackground(Color.decode("#0D47A0"));
        btnCambiarContraseña.setOpaque(true);
    }//GEN-LAST:event_btnCambiarContraseñaMouseExited

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        btnCerrarSesion.setBackground(Color.decode("#0D47A0"));
        btnCerrarSesion.setOpaque(true);
    }//GEN-LAST:event_btnCerrarSesionMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnCambiarContraseña;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JPanel btnHistorialAsistencia;
    private javax.swing.JPanel btnRegistrarAsistencia;
    private javax.swing.JLabel jLabelAdministracion;
    private javax.swing.JLabel jLabelBarraSeparacion;
    private javax.swing.JLabel jLabelLogoYNombre;
    private javax.swing.JLabel jLabelOperaciones;
    private javax.swing.JLabel jLabelPrincipal;
    private javax.swing.JLabel jLabelPrincipal1;
    private javax.swing.JLabel jLabelPrincipal16;
    private javax.swing.JLabel jLabelPrincipal5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel paneBarraNavegacion;
    private javax.swing.JPanel panelChanging;
    // End of variables declaration//GEN-END:variables
}
