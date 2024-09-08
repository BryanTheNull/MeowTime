package View.Seguridad;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import javax.swing.Timer;

/**
 * @author Bryan Vera
 * @since 02-09-2024
 */
public class PanelCambiarContraseña extends javax.swing.JPanel {

    private Timer timer;

    public PanelCambiarContraseña() {
        initComponents();

        // Iniciar temporizador para fecha y hora
        setFecha();
        timer = new Timer(1000, e -> setFecha());
        timer.start();
    }

    private void setFecha() {
        LocalDateTime now = LocalDateTime.now();
        int dia = now.getDayOfMonth();
        int mes = now.getMonthValue();
        int año = now.getYear();
        DayOfWeek diaSemana = now.getDayOfWeek();
        int hora = now.getHour();
        int minutos = now.getMinute();

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octuble", "Noviembre", "Diciembre"};
        String nombreMes = meses[mes - 1];

        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String nombreDiaSemana = diasSemana[diaSemana.getValue() - 1];

        String fechaFormateada = "Hoy es " + nombreDiaSemana + " " + dia + " de " + nombreMes + " de " + año + " - " + hora + ":" + minutos;

        txtFecha.setText(fechaFormateada);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background2 = new javax.swing.JPanel();
        panelBarraSuperior = new javax.swing.JPanel();
        txtInformacion = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbNuevaClave = new javax.swing.JLabel();
        lbRepetirClave = new javax.swing.JLabel();
        lbClaveAnterior1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        txtNuevaContraseña = new javax.swing.JPasswordField();
        txtRepetirContraseña = new javax.swing.JPasswordField();

        setMaximumSize(new java.awt.Dimension(950, 700));
        setMinimumSize(new java.awt.Dimension(950, 700));

        background2.setBackground(new java.awt.Color(255, 255, 255));
        background2.setMaximumSize(new java.awt.Dimension(950, 700));
        background2.setMinimumSize(new java.awt.Dimension(950, 700));

        panelBarraSuperior.setBackground(new java.awt.Color(24, 118, 210));
        panelBarraSuperior.setMaximumSize(new java.awt.Dimension(950, 100));
        panelBarraSuperior.setMinimumSize(new java.awt.Dimension(950, 100));

        txtInformacion.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        txtInformacion.setForeground(new java.awt.Color(255, 255, 255));
        txtInformacion.setText("MeowTime/ Registro de Asistencia");

        txtFecha.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFecha.setText("Hoy es {diaSemana} {dia} de {mes} de {año} y son las {hora} con {minutos} minutos");

        javax.swing.GroupLayout panelBarraSuperiorLayout = new javax.swing.GroupLayout(panelBarraSuperior);
        panelBarraSuperior.setLayout(panelBarraSuperiorLayout);
        panelBarraSuperiorLayout.setHorizontalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFecha)
                    .addComponent(txtInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBarraSuperiorLayout.setVerticalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(txtFecha)
                .addContainerGap())
        );

        txtMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMensaje.setText("Bienvenido a tu sistema favorito ♥");

        lbTitulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("CAMBIO DE CLAVE DE ACCESO ");
        lbTitulo.setToolTipText("");

        lbNuevaClave.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbNuevaClave.setText("Nueva clave de acceso: ");

        lbRepetirClave.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbRepetirClave.setText("Repetir la nueva clave: ");

        lbClaveAnterior1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lbClaveAnterior1.setText("La nueva clave debe contener un minimo de 8 caracteres");

        btnCancelar.setText("Cancelar ");

        btnGuardarCambios.setText("Guardar Cambios");

        txtNuevaContraseña.setText("jPasswordField1");

        txtRepetirContraseña.setText("jPasswordField1");

        javax.swing.GroupLayout background2Layout = new javax.swing.GroupLayout(background2);
        background2.setLayout(background2Layout);
        background2Layout.setHorizontalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBarraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(background2Layout.createSequentialGroup()
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(background2Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(background2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbClaveAnterior1)
                            .addGroup(background2Layout.createSequentialGroup()
                                .addComponent(lbRepetirClave, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRepetirContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(background2Layout.createSequentialGroup()
                                .addComponent(lbNuevaClave, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNuevaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(background2Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        background2Layout.setVerticalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(txtMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lbClaveAnterior1)
                .addGap(33, 33, 33)
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNuevaClave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNuevaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRepetirClave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepetirContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background2;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnGuardarCambios;
    private javax.swing.JLabel lbClaveAnterior1;
    private javax.swing.JLabel lbNuevaClave;
    private javax.swing.JLabel lbRepetirClave;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel panelBarraSuperior;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtInformacion;
    private javax.swing.JLabel txtMensaje;
    public javax.swing.JPasswordField txtNuevaContraseña;
    public javax.swing.JPasswordField txtRepetirContraseña;
    // End of variables declaration//GEN-END:variables
}
