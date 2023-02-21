
package ventana;

// Importaciones.

import java.io.File;
import javax.swing.JFileChooser;
import proyectoamazon.Functions;
import proyectoamazon.GlobalVariables;
import proyectoamazon.ListWarehouse;

/**
 *
 * @author victorpointud
 */
public class FileChooserWindow extends javax.swing.JFrame {

    /**
     * Creates new form FileChooserWindow
     */
    public FileChooserWindow() {
        
    // Inicio.
    
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PathDisplay = new javax.swing.JTextField();
        InfoFileChooserWindow = new javax.swing.JLabel();
        FileChooserButton = new javax.swing.JButton();
        NextWindow = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PathDisplay.setEditable(false);
        PathDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PathDisplayActionPerformed(evt);
            }
        });
        jPanel1.add(PathDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 330, -1));

        InfoFileChooserWindow.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InfoFileChooserWindow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InfoFileChooserWindow.setText("Debes elegir un archivo para cargar el programa. ");
        jPanel1.add(InfoFileChooserWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 370, 80));

        FileChooserButton.setText("...");
        FileChooserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileChooserButtonActionPerformed(evt);
            }
        });
        jPanel1.add(FileChooserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 40, -1));

        NextWindow.setText("Ir al menu");
        NextWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextWindowActionPerformed(evt);
            }
        });
        jPanel1.add(NextWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 120, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/filechooser.jpg")));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PathDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PathDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PathDisplayActionPerformed

    private void FileChooserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileChooserButtonActionPerformed
        
    // Acción Botón (...).
    
        JFileChooser fc = new JFileChooser();
        int selection = fc.showOpenDialog(this);
        
        if (selection == JFileChooser.APPROVE_OPTION) {
            File path = fc.getSelectedFile();
            PathDisplay.setText(path.getAbsolutePath());
        }
    
    // Retorna Vista De Todos Los Archivos Del Sistema Del Usuario Y Lee Un Arvhivo En Caso De Ser Seleccionado.
    }//GEN-LAST:event_FileChooserButtonActionPerformed

    private void NextWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextWindowActionPerformed
        
    // Acción Botón (Siguiente).
        
        MenuWindow mw = new MenuWindow();
        GlobalVariables.setPath(PathDisplay.getText());
        Functions functions = new Functions();
        String w = functions.readText();
        ListWarehouse list = functions.createObjects(w);
        GlobalVariables.setListWarehouse(list);
        GlobalVariables.setTempListProducts(list.getListOfProducts());
        
        this.setVisible(false);
        mw.setVisible(true);
    
    // Retorna Siguiente Ventana.
    }//GEN-LAST:event_NextWindowActionPerformed

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
            java.util.logging.Logger.getLogger(FileChooserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileChooserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileChooserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileChooserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileChooserWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FileChooserButton;
    private javax.swing.JLabel InfoFileChooserWindow;
    private javax.swing.JButton NextWindow;
    private javax.swing.JTextField PathDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
