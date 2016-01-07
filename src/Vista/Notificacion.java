/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Model.Time;
import com.sun.xml.internal.ws.policy.sourcemodel.ModelNode;
import java.awt.Color;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Notificacion extends javax.swing.JFrame {

    private TrayIcon trayIcon;
    private SystemTray systemtray;
    private ImageIcon imagenIcon;

    /**
     * Creates new form Notificacion
     */
    public Notificacion() {
        ///para poner icono a la aplicacion (this.getClass().getRe... busca en el proyecto y pone la imagen)
        imagenIcon = new ImageIcon(this.getClass().getResource("/Imagenes/Alarma2.png"));
        //con this.set ...  se ubica la imagen en el frame.
        this.setIconImage(imagenIcon.getImage());
        instanciarTray();
        iniciarIcono();
        initComponents();
    }
    
//metodo que pone la notificacion al iniciar la ventana

    private void instanciarTray() 
    {                
        trayIcon = new TrayIcon(imagenIcon.getImage(),"Tiempo De Espera",  popupMenu1);
        trayIcon.setImageAutoSize(true);
        systemtray = systemtray.getSystemTray();
    }

    ///metodo que iniciara la notificacion, la pone en false, que indica que se pone en la barra de notificacion
    private void iniciarIcono() {
        try {
            if (SystemTray.isSupported()) {
                systemtray.add(trayIcon);
                this.setVisible(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Excepcion: " + e.getMessage());
        }
    }

    //metodo que recibe el dato a mostrar como notificacion
    public void DatoAMostar(String Dato) {

        lblParaMostrarNotificacion.setText(Dato);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        menuItem1 = new java.awt.MenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblParaMostrarNotificacion = new javax.swing.JTextArea();
        btnTerminarNotificacion = new javax.swing.JButton();
        btnCincoMinutosMas = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");
        popupMenu1.setName("");

        menuItem1.setLabel("Menu Desplegable");
        menuItem1.setName("txt");
        popupMenu1.add(menuItem1);
        menuItem1.getAccessibleContext().setAccessibleDescription("1");

        popupMenu1.getAccessibleContext().setAccessibleDescription("");

        jScrollPane2.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setForeground(java.awt.Color.white);
        setName("Notificacion"); // NOI18N
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Notificacion.");

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        lblParaMostrarNotificacion.setEditable(false);
        lblParaMostrarNotificacion.setColumns(20);
        lblParaMostrarNotificacion.setRows(5);
        lblParaMostrarNotificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lblParaMostrarNotificacion.setDoubleBuffered(true);
        jScrollPane1.setViewportView(lblParaMostrarNotificacion);

        btnTerminarNotificacion.setText("Terminar");
        btnTerminarNotificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarNotificacionActionPerformed(evt);
            }
        });

        btnCincoMinutosMas.setText("5 Minutos Mas");
        btnCincoMinutosMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoMinutosMasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTerminarNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCincoMinutosMas)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTerminarNotificacion)
                    .addComponent(btnCincoMinutosMas))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Vista.Pri run = new Pri();
        run.getContentPane().setBackground(Color.LIGHT_GRAY);
        run.setVisible(true);
        dispose();
        systemtray.remove(trayIcon);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTerminarNotificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarNotificacionActionPerformed
            System.exit(0);

//        dispose();
//        Vista.Pri run = new Pri();
//        run.getContentPane().setBackground(Color.LIGHT_GRAY);
//        run.setVisible(true);
//        dispose();
//        systemtray.remove(trayIcon);
//        this.setVisible(false);
    }//GEN-LAST:event_btnTerminarNotificacionActionPerformed

    private void btnCincoMinutosMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoMinutosMasActionPerformed
        dispose();
        Model.Time TiempoExtra = new Model.Time();
        String TiempoEnHoras = "0", TiempoEnMinutos = "5", TiempoEnSegundos = "0";
        
        try 
        {
            TiempoExtra.Tiempo(TiempoEnHoras, TiempoEnMinutos, TiempoEnSegundos);
        } 
        catch (InterruptedException ex) 
        {
            Logger.getLogger(Notificacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
        Notificacion NotificacionExtra = new Notificacion();
        NotificacionExtra.setVisible(true);
        NotificacionExtra.setLocation(980, 580);
        NotificacionExtra.setAlwaysOnTop(true);
        systemtray.remove(trayIcon);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnCincoMinutosMasActionPerformed

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
            java.util.logging.Logger.getLogger(Notificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notificacion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCincoMinutosMas;
    private javax.swing.JButton btnTerminarNotificacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JTextArea lblParaMostrarNotificacion;
    private java.awt.MenuItem menuItem1;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
