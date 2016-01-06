/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Model.Time;
import java.awt.Color;
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
public class Pri extends javax.swing.JFrame {

    private TrayIcon trayIcon;
    private SystemTray systemtray;
    private ImageIcon imagenIcon;

    /**
     * Creates new form Pri
     */
    public Pri() {
        ///para poner icono a la aplicacion (this.getClass().getRe... busca en el proyecto y pone la imagen)
        imagenIcon = new ImageIcon(this.getClass().getResource("/Imagenes/Alarma2.png"));
        //con this.set ...  se ubica la imagen en el frame.
        this.setIconImage(imagenIcon.getImage());
        //instanciarTray();
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Popup = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTareaPendiente = new javax.swing.JTextArea();
        txtTiempoenMinutos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTiempoenHoras = new javax.swing.JTextField();
        txtTiempoenSegundos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        Popup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PopupMouseClicked(evt);
            }
        });

        jMenuItem1.setText("Primer Pano");
        jMenuItem1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenuItem1ItemStateChanged(evt);
            }
        });
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Popup.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recordatorios");
        setBackground(new java.awt.Color(0, 204, 51));
        setResizable(false);

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Tiempo para avisar");

        txtTareaPendiente.setColumns(20);
        txtTareaPendiente.setRows(5);
        jScrollPane1.setViewportView(txtTareaPendiente);

        txtTiempoenMinutos.setText("0");
        txtTiempoenMinutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTiempoenMinutosKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Ingrese Tarea Pendiente");

        jLabel3.setText("En Minutos, Ejemplo :15 = 15 minutos");

        txtTiempoenHoras.setText("0");
        txtTiempoenHoras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTiempoenHorasKeyTyped(evt);
            }
        });

        txtTiempoenSegundos.setText("0");
        txtTiempoenSegundos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTiempoenSegundosKeyTyped(evt);
            }
        });

        jLabel4.setText("HORA:");

        jLabel5.setText("MINUTOS:");

        jLabel6.setText("SEGUNDOS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTiempoenHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTiempoenMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTiempoenSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTiempoenSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtTiempoenHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtTiempoenMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            if ("".equals(txtTiempoenHoras.getText()) || "".equals(txtTiempoenMinutos.getText()) || "".equals(txtTiempoenSegundos.getText())) {

            JOptionPane.showMessageDialog(null, "¡ HA DEJADO CAMPOS EN BLANCO !");

        } 
            
            else 
        {
            // /se crea instancia del objeto de la pantalla notificacion y se le da un color tamaño y posicion, 
            //y se le envia el dato de tarea pendiente
            Vista.Notificacion run = new Notificacion();
            run.getContentPane().setBackground(Color.LIGHT_GRAY);
            run.DatoAMostar(txtTareaPendiente.getText());
            run.setLocation(980, 580);
            run.setAlwaysOnTop(true);
            dispose();

            ///instancia del tiempo para que espere el tiempo ingresado por el usuario
            Model.Time tiempo = new Time();
            try {   //se envian los datos de hora, minutos y tiempo
                tiempo.Tiempo(txtTiempoenHoras.getText(), txtTiempoenMinutos.getText(), txtTiempoenSegundos.getText());
                
            } catch (Exception ex) 
            {
                JOptionPane.showMessageDialog(null, "Error al validar datos ingresados(POR FAVOR VERIFIQUE DATOS INGRESADOS): " + ex.getMessage());
            }
            run.setVisible(true);
        }

        
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "EError al validar datos ingresados(POR FAVOR VERIFIQUE DATOS INGRESADOS): " + e.getMessage());
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenuItem1ItemStateChanged
        
    }//GEN-LAST:event_jMenuItem1ItemStateChanged

    //para validar que el txt solo reciba numeros y no letras
    private void txtTiempoenHorasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTiempoenHorasKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresa Solo Numeros");

        }

    }//GEN-LAST:event_txtTiempoenHorasKeyTyped

    private void txtTiempoenMinutosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTiempoenMinutosKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresa Solo Numeros");

        }
    }//GEN-LAST:event_txtTiempoenMinutosKeyTyped

    private void txtTiempoenSegundosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTiempoenSegundosKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresa Solo Numeros");

        }
    }//GEN-LAST:event_txtTiempoenSegundosKeyTyped

    private void PopupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PopupMouseClicked
        systemtray.remove(trayIcon);
       this.setVisible(true);
    }//GEN-LAST:event_PopupMouseClicked

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
            java.util.logging.Logger.getLogger(Pri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pri().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu Popup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtTareaPendiente;
    private javax.swing.JTextField txtTiempoenHoras;
    private javax.swing.JTextField txtTiempoenMinutos;
    private javax.swing.JTextField txtTiempoenSegundos;
    // End of variables declaration//GEN-END:variables
}
