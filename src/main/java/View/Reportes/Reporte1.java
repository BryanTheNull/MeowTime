package View.Reportes;

/**
 * @author The Chickens
 */
public class Reporte1 extends javax.swing.JFrame {

    public Reporte1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgraund = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReporte1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgraund.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setToolTipText("");

        jTableReporte1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Primer Nombre", "Segundo Nombre", "Primer Apellido", "Segundo Apellido", "Fecha", "Entrada"
            }
        ));
        jTableReporte1.setToolTipText("");
        jScrollPane1.setViewportView(jTableReporte1);

        javax.swing.GroupLayout backgraundLayout = new javax.swing.GroupLayout(backgraund);
        backgraund.setLayout(backgraundLayout);
        backgraundLayout.setHorizontalGroup(
            backgraundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgraundLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        backgraundLayout.setVerticalGroup(
            backgraundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgraundLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgraund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgraund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgraund;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableReporte1;
    // End of variables declaration//GEN-END:variables
}
