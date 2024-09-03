package View;

import Controller.Login.LoginController;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

/**
 * @author Bryan Vera
 * @since 26-08-2024
 */

public class Login extends javax.swing.JFrame {

    // Inicilizar el controlador de la interfaz
    private LoginController loginController;

    // Variables globales 
    private boolean limpiarEmail = true;
    private boolean limpiarContraseña = true;
    public boolean ocultarContraseña = true;

    // Rutas de imagenes globales
    ImageIcon showIcon = new ImageIcon(Login.class.getResource("/icons/ojo_Abierto 16x16.png"));
    ImageIcon hideIcon = new ImageIcon(Login.class.getResource("/icons/ojo_Cerrado 16x16.png"));

    public Login() {
        initComponents();
        configurarComponentes();
        
    }

    void configurarComponentes() {
        loginController = new LoginController(this);
        IconUser.requestFocus();                // Foco a el icono para evitar errores
        txtContraseña.setEchoChar((char) 0);    // Mostrar mensaje en txtContraseña
        iconOjo.setIcon(hideIcon);         // Mostrar icono de ojo abierto
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        IconUser = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        iconSobre = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        separadorEmail = new javax.swing.JSeparator();
        lbContraseña = new javax.swing.JLabel();
        iconCandado = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        iconOjo = new javax.swing.JLabel();
        separadorContraseña = new javax.swing.JSeparator();
        lbRecuperarContraseña = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMaximumSize(new java.awt.Dimension(1200, 700));
        background.setMinimumSize(new java.awt.Dimension(1200, 700));
        background.setName(""); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1200, 700));

        IconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/perfil 128x128.png"))); // NOI18N

        lbTitulo.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("BIENVENIDO");
        lbTitulo.setToolTipText("");

        lbEmail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbEmail.setText("Email");
        lbEmail.setToolTipText("");
        lbEmail.setMaximumSize(new java.awt.Dimension(17, 300));
        lbEmail.setMinimumSize(new java.awt.Dimension(17, 300));

        iconSobre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iconSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/email 16x16.png"))); // NOI18N

        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setText("Ingrese su correo electrónico");
        txtEmail.setBorder(null);
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEmailMousePressed(evt);
            }
        });

        separadorEmail.setForeground(new java.awt.Color(51, 51, 51));
        separadorEmail.setToolTipText("");
        separadorEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        separadorEmail.setMaximumSize(new java.awt.Dimension(300, 2));
        separadorEmail.setMinimumSize(new java.awt.Dimension(300, 2));
        separadorEmail.setPreferredSize(new java.awt.Dimension(300, 2));

        lbContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbContraseña.setText("Contraseña");
        lbContraseña.setToolTipText("");
        lbContraseña.setMaximumSize(new java.awt.Dimension(17, 300));
        lbContraseña.setMinimumSize(new java.awt.Dimension(17, 300));
        lbContraseña.setPreferredSize(new java.awt.Dimension(300, 17));

        iconCandado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iconCandado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/candado 16x16.png"))); // NOI18N

        txtContraseña.setForeground(new java.awt.Color(153, 153, 153));
        txtContraseña.setText("Ingrese su contraseña");
        txtContraseña.setBorder(null);
        txtContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusLost(evt);
            }
        });
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });

        iconOjo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iconOjo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconOjoMousePressed(evt);
            }
        });

        separadorContraseña.setForeground(new java.awt.Color(0, 0, 0));
        separadorContraseña.setToolTipText("");
        separadorContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        separadorContraseña.setMaximumSize(new java.awt.Dimension(300, 2));
        separadorContraseña.setMinimumSize(new java.awt.Dimension(300, 2));
        separadorContraseña.setPreferredSize(new java.awt.Dimension(300, 2));

        lbRecuperarContraseña.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbRecuperarContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRecuperarContraseña.setText("¿Olvidaste tu contraseña?");
        lbRecuperarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbRecuperarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbRecuperarContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbRecuperarContraseñaMouseExited(evt);
            }
        });

        btnIniciarSesion.setBackground(new java.awt.Color(11, 72, 117));
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("INICIAR SESION");
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separadorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separadorContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(700, 700, 700)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IconUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(backgroundLayout.createSequentialGroup()
                                    .addComponent(iconSobre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtEmail))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(iconCandado)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(iconOjo)))
                            .addComponent(lbEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(200, 200, 200))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(lbRecuperarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(IconUser, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTitulo)
                .addGap(14, 14, 14)
                .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconCandado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconOjo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRecuperarContraseña)
                .addGap(18, 18, 18)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Descripcion: Eventos para controlar los cambios cuando el usuario Clickea
     * un componete o pasa el mouse sobre este.
     */

    private void txtEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMousePressed
        // Evento: Cuando el mouse presiona el componente "txtEmail"
        if (limpiarEmail) {
            txtEmail.setText("");
            txtEmail.setForeground(Color.black);
            limpiarEmail = false;
        }
    }//GEN-LAST:event_txtEmailMousePressed
    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // Evento: Cuando el mouse sale del componente "txtEmail" y este se encuentra vacio
        if (txtEmail.getText().equals("")) {
            txtEmail.setText("Ingrese su correo electrónico");
            txtEmail.setForeground(Color.decode("#999999"));
            limpiarEmail = true;
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        // Evento: Cuando el mouse presiona el componente "txtContraseña"
        if (limpiarContraseña) {
            txtContraseña.setText("");
            txtContraseña.setForeground(Color.black);
            txtContraseña.setEchoChar('*');
            limpiarContraseña = false;
        }
    }//GEN-LAST:event_txtContraseñaMousePressed

    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusLost
        // Evento: Cuando el mouse sale del componente "txtContraseña" y este se encuentra vacio
        if (txtContraseña.getText().equals("")) {
            txtContraseña.setText("Ingrese su contraseña");
            txtContraseña.setForeground(Color.decode("#999999"));
            txtContraseña.setEchoChar((char) 0);
            limpiarContraseña = true;
        }
    }//GEN-LAST:event_txtContraseñaFocusLost

    private void iconOjoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconOjoMousePressed
        // Evento: Cambiar icono de ojo al presionarlo y mostrar o ocultar
        // la contraseña segun el icono visualizado.
        if (iconOjo.getIcon() == showIcon) {
            iconOjo.setIcon(hideIcon);
            txtContraseña.setEchoChar('*');
        } else {
            iconOjo.setIcon(showIcon);
            txtContraseña.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_iconOjoMousePressed

    private void lbRecuperarContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRecuperarContraseñaMouseEntered
        // Evento:
        lbRecuperarContraseña.setFont(new Font("Sugeu UI", Font.BOLD, 11));
        lbRecuperarContraseña.setForeground(Color.decode("#3314C9"));
    }//GEN-LAST:event_lbRecuperarContraseñaMouseEntered

    private void lbRecuperarContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRecuperarContraseñaMouseExited
        // Evento: 
        lbRecuperarContraseña.setFont(new Font("Sugeu UI", Font.PLAIN, 11));
        lbRecuperarContraseña.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbRecuperarContraseñaMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconUser;
    private javax.swing.JPanel background;
    public javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel iconCandado;
    private javax.swing.JLabel iconOjo;
    private javax.swing.JLabel iconSobre;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbRecuperarContraseña;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JSeparator separadorContraseña;
    private javax.swing.JSeparator separadorEmail;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}