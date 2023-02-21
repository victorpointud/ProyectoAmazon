
package ventana;

// Importaciones.
import proyectoamazon.ListOfArrays;
import proyectoamazon.ListWarehouse;
import proyectoamazon.Warehouse;
import proyectoamazon.NodeWarehouse;
import proyectoamazon.GlobalVariables;
import javax.swing.JOptionPane;


/**
 *
 * @author victorpointud
 */
public class WarehouseCharacteristics extends javax.swing.JFrame {
    boolean entrada;
    Warehouse newWarehouse = GlobalVariables.getListWarehouse().getLast();
    int cantidadAristas = 0;
    /**
     * Creates new form WarehouseCharacteristics
     */
    public WarehouseCharacteristics() {
        
    // Inicio.
        
        initComponents();
        this.setLocationRelativeTo(null);
        AllWarehouses(GlobalVariables.getListWarehouse());
        GlobalVariables global = new GlobalVariables();
        ListOfArrays listainfo = new ListOfArrays(null);
        
    }
    
    public void AllWarehouses(ListWarehouse listWarehouse) {
        
    // Acción Botón (Almacenes).
        
        NodeWarehouse pointer = listWarehouse.getHead();
        int index = 0;
        while (pointer != null) {
            String warehouseLetter = pointer.getElement().getName();
            Almacenes.insertItemAt(warehouseLetter, index);
            index++;
            pointer = pointer.getNext();
        }
        
    // Retorna Todos Los Almacenes.
    }
    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Distancia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Almacenes = new javax.swing.JComboBox<>();
        Relacion = new javax.swing.JComboBox<>();
        AgregarAlmacen = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Letra del almacen relacionado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Tipo De Relacion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Distancia del Almacen");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, 30));

        Distancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistanciaActionPerformed(evt);
            }
        });
        jPanel1.add(Distancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 60, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Características del almacen");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton1.setText("Finalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        Almacenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlmacenesActionPerformed(evt);
            }
        });
        jPanel1.add(Almacenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        Relacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Salida" }));
        Relacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelacionActionPerformed(evt);
            }
        });
        jPanel1.add(Relacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        AgregarAlmacen.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AgregarAlmacen.setText("Agregar");
        AgregarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAlmacenActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 100, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/warehouse.jpg")));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    // Acción Botón (Finalizar).
    
        if (cantidadAristas >= 2) {
        ManagementWindow mw = new ManagementWindow();
        this.setVisible(false);
        mw.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Error, no se insertaron las aristas suficientes");
        }
        
    // Retorna Error Si No Se Completó Cada Acción y/o Finaliza.
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AlmacenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlmacenesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlmacenesActionPerformed

    private void RelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelacionActionPerformed

    }//GEN-LAST:event_RelacionActionPerformed

    private void DistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DistanciaActionPerformed

    private void AgregarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAlmacenActionPerformed
        
    // Acción Botón (Agregar Almacen).
    
        String option = String.valueOf(Relacion.getSelectedItem());
        entrada = true;
        if (option.equals("Salida")) {
            entrada = false;
        }
        
        if (entrada) {
            Warehouse pointer = GlobalVariables.getListWarehouse().getWarehouse(String.valueOf(Almacenes.getSelectedItem())); 
            
//            while(pointer.getNext()!= null && pointer.getElement().getName().equals(String.valueOf(Almacenes.getSelectedItem()))){
//                pointer = pointer.getNext();  
//                System.out.println(pointer.getElement().getName());
//                System.out.println(newWarehouse.getName());
//                System.out.println("");
//            }
//            GlobalVariables.getListWarehouse().getWarehouse(Almacenes.getSelectedItem());
            cantidadAristas++;
            pointer.addLink(GlobalVariables.getListWarehouse().getLast().getName(), Distancia.getText());
            
            
        }
        else{
            newWarehouse.addLink(String.valueOf(Almacenes.getSelectedItem()), Distancia.getText());
            cantidadAristas++;
        }
    
    // Retorna Almacen Agregado.
    }//GEN-LAST:event_AgregarAlmacenActionPerformed

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
            java.util.logging.Logger.getLogger(WarehouseCharacteristics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WarehouseCharacteristics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WarehouseCharacteristics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WarehouseCharacteristics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WarehouseCharacteristics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarAlmacen;
    private javax.swing.JComboBox<String> Almacenes;
    private javax.swing.JTextField Distancia;
    private javax.swing.JComboBox<String> Relacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
