package View.Administrador;

import Config.App;
import Controller.Administrador.AsistenciaDiariaController;
import Controller.Administrador.CargosController;
import Controller.Administrador.ReportesController;
import Controller.Administrador.UsuariosController;
import Controller.Seguridad.CambiarContraseñaController;
import View.Login.Login;
import View.Seguridad.PanelCambiarContraseña;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author bv587
 */
public class AdministradorView extends javax.swing.JFrame {

    // Ruta de logo de MeowTime
    Image meowTime = new ImageIcon(App.class.getResource("/icons/logo_MeowTime 512x512.png")).getImage();

    // Crear instancias de interfazes para manejar ventanas y pasarselas a sus controladores.
    PanelAsistenciaDiaria panelAsistenciaDiaria = new PanelAsistenciaDiaria();
    AsistenciaDiariaController asistenciaDiariaController = new AsistenciaDiariaController(panelAsistenciaDiaria);

    PanelUsuarios panelUsuarios = new PanelUsuarios();
    UsuariosController usuariosController = new UsuariosController(panelUsuarios);

    PanelCargos panelCargos = new PanelCargos();
    CargosController cargosController = new CargosController(panelCargos);

    PanelReportes panelReportes = new PanelReportes();
    ReportesController reportesController = new ReportesController(panelReportes);

    PanelCambiarContraseña panelCambiarContraseña = new PanelCambiarContraseña();
    CambiarContraseñaController cambiarContraseñaController = new CambiarContraseñaController(panelCambiarContraseña);

    public AdministradorView() {
        initComponents();
        ShowPanel(panelAsistenciaDiaria);
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
        btnAsistenciaDiaria = new javax.swing.JPanel();
        lbAsistenciaDiaria = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JPanel();
        lbUsuarios = new javax.swing.JLabel();
        jLabelAdministracion = new javax.swing.JLabel();
        btnCambiarContraseña = new javax.swing.JPanel();
        lbCambiarContraseña = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JPanel();
        lbCerrarSesion = new javax.swing.JLabel();
        btnCargos = new javax.swing.JPanel();
        lbCargos = new javax.swing.JLabel();
        btnReportes = new javax.swing.JPanel();
        lbReportes = new javax.swing.JLabel();
        panelChanging = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMaximumSize(new java.awt.Dimension(1200, 700));
        background.setMinimumSize(new java.awt.Dimension(1200, 700));
        background.setName(""); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1200, 700));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneBarraNavegacion.setBackground(new java.awt.Color(13, 71, 160));
        paneBarraNavegacion.setMaximumSize(new java.awt.Dimension(250, 50));
        paneBarraNavegacion.setMinimumSize(new java.awt.Dimension(250, 50));

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

        btnAsistenciaDiaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsistenciaDiaria.setMaximumSize(new java.awt.Dimension(250, 50));
        btnAsistenciaDiaria.setMinimumSize(new java.awt.Dimension(250, 50));
        btnAsistenciaDiaria.setOpaque(false);
        btnAsistenciaDiaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAsistenciaDiariaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAsistenciaDiariaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAsistenciaDiariaMousePressed(evt);
            }
        });

        lbAsistenciaDiaria.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        lbAsistenciaDiaria.setForeground(new java.awt.Color(255, 255, 255));
        lbAsistenciaDiaria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbAsistenciaDiaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reporte_diario 24x24.png"))); // NOI18N
        lbAsistenciaDiaria.setText("Asistencia Diaria");

        javax.swing.GroupLayout btnAsistenciaDiariaLayout = new javax.swing.GroupLayout(btnAsistenciaDiaria);
        btnAsistenciaDiaria.setLayout(btnAsistenciaDiariaLayout);
        btnAsistenciaDiariaLayout.setHorizontalGroup(
            btnAsistenciaDiariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAsistenciaDiariaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbAsistenciaDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAsistenciaDiariaLayout.setVerticalGroup(
            btnAsistenciaDiariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAsistenciaDiariaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAsistenciaDiaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setMaximumSize(new java.awt.Dimension(250, 50));
        btnUsuarios.setMinimumSize(new java.awt.Dimension(250, 50));
        btnUsuarios.setOpaque(false);
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUsuariosMousePressed(evt);
            }
        });

        lbUsuarios.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        lbUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usuarios 24x24.png"))); // NOI18N
        lbUsuarios.setText("Usuarios");

        javax.swing.GroupLayout btnUsuariosLayout = new javax.swing.GroupLayout(btnUsuarios);
        btnUsuarios.setLayout(btnUsuariosLayout);
        btnUsuariosLayout.setHorizontalGroup(
            btnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnUsuariosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnUsuariosLayout.setVerticalGroup(
            btnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbUsuarios)
                .addGap(13, 13, 13))
        );

        jLabelAdministracion.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        jLabelAdministracion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdministracion.setText("Configuraciones");

        btnCambiarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiarContraseña.setMaximumSize(new java.awt.Dimension(250, 50));
        btnCambiarContraseña.setMinimumSize(new java.awt.Dimension(250, 50));
        btnCambiarContraseña.setOpaque(false);
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

        lbCambiarContraseña.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        lbCambiarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lbCambiarContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCambiarContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/candado 24x24.png"))); // NOI18N
        lbCambiarContraseña.setText("Cambiar Contraseña");

        javax.swing.GroupLayout btnCambiarContraseñaLayout = new javax.swing.GroupLayout(btnCambiarContraseña);
        btnCambiarContraseña.setLayout(btnCambiarContraseñaLayout);
        btnCambiarContraseñaLayout.setHorizontalGroup(
            btnCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCambiarContraseñaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCambiarContraseñaLayout.setVerticalGroup(
            btnCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCambiarContraseñaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCambiarContraseña)
                .addGap(13, 13, 13))
        );

        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setMaximumSize(new java.awt.Dimension(250, 50));
        btnCerrarSesion.setMinimumSize(new java.awt.Dimension(250, 50));
        btnCerrarSesion.setOpaque(false);
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

        lbCerrarSesion.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        lbCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lbCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar_Sesion 24x24.png"))); // NOI18N
        lbCerrarSesion.setText("Cerrar Sesion");

        javax.swing.GroupLayout btnCerrarSesionLayout = new javax.swing.GroupLayout(btnCerrarSesion);
        btnCerrarSesion.setLayout(btnCerrarSesionLayout);
        btnCerrarSesionLayout.setHorizontalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarSesionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCerrarSesionLayout.setVerticalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarSesionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCerrarSesion)
                .addGap(13, 13, 13))
        );

        btnCargos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargos.setMaximumSize(new java.awt.Dimension(250, 50));
        btnCargos.setMinimumSize(new java.awt.Dimension(250, 50));
        btnCargos.setOpaque(false);
        btnCargos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCargosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCargosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCargosMousePressed(evt);
            }
        });

        lbCargos.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        lbCargos.setForeground(new java.awt.Color(255, 255, 255));
        lbCargos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCargos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cargos 24x24.png"))); // NOI18N
        lbCargos.setText("Cargos");

        javax.swing.GroupLayout btnCargosLayout = new javax.swing.GroupLayout(btnCargos);
        btnCargos.setLayout(btnCargosLayout);
        btnCargosLayout.setHorizontalGroup(
            btnCargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCargosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnCargosLayout.setVerticalGroup(
            btnCargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCargosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCargos)
                .addGap(13, 13, 13))
        );

        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setMaximumSize(new java.awt.Dimension(250, 50));
        btnReportes.setMinimumSize(new java.awt.Dimension(250, 50));
        btnReportes.setOpaque(false);
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReportesMousePressed(evt);
            }
        });

        lbReportes.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        lbReportes.setForeground(new java.awt.Color(255, 255, 255));
        lbReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reporte.png"))); // NOI18N
        lbReportes.setText("Reportes");

        javax.swing.GroupLayout btnReportesLayout = new javax.swing.GroupLayout(btnReportes);
        btnReportes.setLayout(btnReportesLayout);
        btnReportesLayout.setHorizontalGroup(
            btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReportesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnReportesLayout.setVerticalGroup(
            btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReportesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbReportes)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout paneBarraNavegacionLayout = new javax.swing.GroupLayout(paneBarraNavegacion);
        paneBarraNavegacion.setLayout(paneBarraNavegacionLayout);
        paneBarraNavegacionLayout.setHorizontalGroup(
            paneBarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCambiarContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAsistenciaDiaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(btnCargos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnAsistenciaDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCargos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabelAdministracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
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

    /**
     * Eventos de paneles para cambiar de ventanas en la interfaz Administrador.
     */
    private void btnAsistenciaDiariaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsistenciaDiariaMousePressed
        ShowPanel(panelAsistenciaDiaria);
    }//GEN-LAST:event_btnAsistenciaDiariaMousePressed

    private void btnUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMousePressed
        ShowPanel(panelUsuarios);
    }//GEN-LAST:event_btnUsuariosMousePressed

    private void btnCargosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargosMousePressed
        ShowPanel(panelCargos);
    }//GEN-LAST:event_btnCargosMousePressed

    private void btnReportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMousePressed
        ShowPanel(panelReportes);
    }//GEN-LAST:event_btnReportesMousePressed

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
    private void btnAsistenciaDiariaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsistenciaDiariaMouseEntered
        btnAsistenciaDiaria.setBackground(Color.decode("#0D5DC1"));
        btnAsistenciaDiaria.setOpaque(true);
    }//GEN-LAST:event_btnAsistenciaDiariaMouseEntered

    private void btnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseEntered
        btnUsuarios.setBackground(Color.decode("#0D5DC1"));
        btnUsuarios.setOpaque(true);
    }//GEN-LAST:event_btnUsuariosMouseEntered

    private void btnCargosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargosMouseEntered
        btnCargos.setBackground(Color.decode("#0D5DC1"));
        btnCargos.setOpaque(true);
    }//GEN-LAST:event_btnCargosMouseEntered

    private void btnReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseEntered
        btnReportes.setBackground(Color.decode("#0D5DC1"));
        btnReportes.setOpaque(true);
    }//GEN-LAST:event_btnReportesMouseEntered

    private void btnCambiarContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaMouseEntered
        btnCambiarContraseña.setBackground(Color.decode("#0D5DC1"));
        btnCambiarContraseña.setOpaque(true);
    }//GEN-LAST:event_btnCambiarContraseñaMouseEntered

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        btnCerrarSesion.setBackground(Color.decode("#0D5DC1"));
        btnCerrarSesion.setOpaque(true);
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    /**
     * Eventos para regresar el boton a su esatdo normal al salir de mouse de
     * este mismo.
     */
    private void btnAsistenciaDiariaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsistenciaDiariaMouseExited
        btnAsistenciaDiaria.setBackground(Color.decode("#0D47A0"));
        btnAsistenciaDiaria.setOpaque(true);
    }//GEN-LAST:event_btnAsistenciaDiariaMouseExited

    private void btnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseExited
        btnUsuarios.setBackground(Color.decode("#0D47A0"));
        btnUsuarios.setOpaque(true);
    }//GEN-LAST:event_btnUsuariosMouseExited

    private void btnCargosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargosMouseExited
        btnCargos.setBackground(Color.decode("#0D47A0"));
        btnCargos.setOpaque(true);
    }//GEN-LAST:event_btnCargosMouseExited

    private void btnReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseExited
        btnReportes.setBackground(Color.decode("#0D47A0"));
        btnReportes.setOpaque(true);
    }//GEN-LAST:event_btnReportesMouseExited

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
    private javax.swing.JPanel btnAsistenciaDiaria;
    private javax.swing.JPanel btnCambiarContraseña;
    private javax.swing.JPanel btnCargos;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JPanel btnReportes;
    private javax.swing.JPanel btnUsuarios;
    private javax.swing.JLabel jLabelAdministracion;
    private javax.swing.JLabel jLabelBarraSeparacion;
    private javax.swing.JLabel jLabelLogoYNombre;
    private javax.swing.JLabel jLabelOperaciones;
    private javax.swing.JLabel lbAsistenciaDiaria;
    private javax.swing.JLabel lbCambiarContraseña;
    private javax.swing.JLabel lbCargos;
    private javax.swing.JLabel lbCerrarSesion;
    private javax.swing.JLabel lbReportes;
    private javax.swing.JLabel lbUsuarios;
    private javax.swing.JPanel paneBarraNavegacion;
    private javax.swing.JPanel panelChanging;
    // End of variables declaration//GEN-END:variables
}
