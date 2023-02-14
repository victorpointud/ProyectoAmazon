
package ventana;

// Importaciones.

import javax.swing.JOptionPane;
import proyecto1.*;

/**
 *
 * @author victorpointud
 */
public class OrderWindow extends javax.swing.JFrame {
    /**
     * Creates new form OrderWindow
     */
    public OrderWindow() {
        
    // Inicio.
    
        initComponents();
        this.setLocationRelativeTo(null);
        AddWarehouses(GlobalVariables.getListWarehouse());
        AddProducts(GlobalVariables.getTempListProducts());
    }
    
    
    public void AddWarehouses (ListWarehouse listWarehouse) {
        
    // Acción Botón (Añadir Almacenes).
    
        NodeWarehouse pointer = listWarehouse.getHead();
        int index = 0;
        while (pointer != null) {
            String warehouseLetter = pointer.getElement().getName();
            WarehouseOrder.insertItemAt(warehouseLetter, index);
            index++;
            pointer = pointer.getNext();
        }
        
    // Retorna Items Del Seleccionado Almacén.
    }
    
    public void AddProducts (ListProducts list) {
        
    // Acción Botón (Añadir Productos).
    
        NodeProduct pointer = list.getHead();
        int index = 0;
        while (pointer != null) {
            String ProductName = pointer.getElement().getName();
            String ProductQuantity = String.valueOf(pointer.getElement().getQuantitiy());    
            if (Integer.parseInt(ProductQuantity) >= 0) {
                String result = ProductName;
                ProductOrdered.insertItemAt(result, index);
                index++;
                pointer = pointer.getNext();
            }
        }
        
    // Retorna Item Insertado.
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
        WarehouseOrder = new javax.swing.JComboBox<>();
        ProductOrdered = new javax.swing.JComboBox<>();
        QuantityProduct = new javax.swing.JTextField();
        WarehouseOrderTitle = new javax.swing.JLabel();
        NameProductOrderTitle = new javax.swing.JLabel();
        QuantityProductOrder = new javax.swing.JLabel();
        AddProductOrder = new javax.swing.JButton();
        ListOfProductsTitle = new javax.swing.JLabel();
        NextWindowOrder = new javax.swing.JButton();
        QuantityAvailableTitle = new javax.swing.JLabel();
        QuantityAvailable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListOfProducts = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WarehouseOrder.setToolTipText("");
        WarehouseOrder.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                WarehouseOrderItemStateChanged(evt);
            }
        });
        WarehouseOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarehouseOrderActionPerformed(evt);
            }
        });
        jPanel1.add(WarehouseOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, -1));

        ProductOrdered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductOrderedActionPerformed(evt);
            }
        });
        jPanel1.add(ProductOrdered, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 130, -1));

        QuantityProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        QuantityProduct.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        QuantityProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityProductActionPerformed(evt);
            }
        });
        jPanel1.add(QuantityProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 50, 40));

        WarehouseOrderTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WarehouseOrderTitle.setText("Almacen del pedido");
        jPanel1.add(WarehouseOrderTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 30));

        NameProductOrderTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameProductOrderTitle.setText("Nombre del producto");
        jPanel1.add(NameProductOrderTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 130, 30));

        QuantityProductOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuantityProductOrder.setText("Cantidad");
        jPanel1.add(QuantityProductOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        AddProductOrder.setText("Agregar producto");
        AddProductOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductOrderActionPerformed(evt);
            }
        });
        jPanel1.add(AddProductOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 130, -1));

        ListOfProductsTitle.setText("Lista de productos");
        jPanel1.add(ListOfProductsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 30));

        NextWindowOrder.setText("Finalizar pedido");
        NextWindowOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextWindowOrderActionPerformed(evt);
            }
        });
        jPanel1.add(NextWindowOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 130, 30));

        QuantityAvailableTitle.setText("Disponibles: ");
        jPanel1.add(QuantityAvailableTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 90, -1));

        QuantityAvailable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuantityAvailable.setText("0");
        jPanel1.add(QuantityAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 10, -1));

        ListOfProducts.setEditable(false);
        ListOfProducts.setColumns(20);
        ListOfProducts.setRows(5);
        jScrollPane1.setViewportView(ListOfProducts);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/amazon.png")));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WarehouseOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WarehouseOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WarehouseOrderActionPerformed

    private void QuantityProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityProductActionPerformed

    private void AddProductOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductOrderActionPerformed
        
    // Acción Botón (Añadir Orden De Productos).
        
        String quantityProduct = QuantityProduct.getText();
        String selectedProduct = String.valueOf(ProductOrdered.getSelectedItem()).split(" - ")[0];
        
        ListProducts list = GlobalVariables.getTempListProducts();
        NodeProduct pointer = list.getHead();
        Cart cart = GlobalVariables.getCart();
        
        String listProductString = "";
        if (!ListOfProducts.getText().equals("")) {
            listProductString = ListOfProducts.getText();
        }
        
        
        while (pointer != null) {
            if (pointer.getElement().getName().equals(selectedProduct)) {
                if (Integer.parseInt(quantityProduct) <= pointer.getElement().getQuantitiy()) {
                    pointer.getElement().setQuantitiy(pointer.getElement().getQuantitiy() - Integer.parseInt(quantityProduct));
                    listProductString += "-" + selectedProduct + ": " + quantityProduct + "\n";
                    ListOfProducts.setText(listProductString);
                    ProductCart resultPro = new ProductCart(selectedProduct, Integer.parseInt(quantityProduct));
                    NodeCart node = new NodeCart(resultPro);
                    cart.AddProduct(node);
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error."
                        + "Verifique que esta ingresando la cantidad adecuada.");
                }
            }
            pointer = pointer.getNext();
        }
        
        GlobalVariables.setCart(cart);
        System.out.println(GlobalVariables.getCart().printList());
        GlobalVariables.setTempListProducts(list);
        
        String ProductSelected = String.valueOf(ProductOrdered.getSelectedItem());
        NodeProduct pointer1 = GlobalVariables.getTempListProducts().getHead();
        while (pointer1 != null) {
            String ProductName = pointer1.getElement().getName();
            String ProductQuantity = String.valueOf(pointer1.getElement().getQuantitiy());    
            if (ProductName.equals(ProductSelected)) {
                QuantityAvailable.setText(ProductQuantity);
            }
            pointer1 = pointer1.getNext();
        }
        
        GlobalVariables.setLetterOfWarehouseBuy(String.valueOf(WarehouseOrder.getSelectedItem()));
        
        WarehouseOrder.setEnabled(false);
        
    // Retorna Orden Pedida.
    }//GEN-LAST:event_AddProductOrderActionPerformed

    private void NextWindowOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextWindowOrderActionPerformed
        
    // Acción Botón (Siguiente Orden).
        
        boolean firstWarehouseAva = true;
        Warehouse WarehouseLetter = GlobalVariables.getListWarehouse().getWarehouse(String.valueOf(WarehouseOrder.getSelectedItem()));
        NodeCart pointerCart = GlobalVariables.getCart().getHead();
        int quantityFirstWarehouse  = 0;
        while (pointerCart != null ) {
            if (WarehouseLetter.getListOfProducts().ProductIsIn(pointerCart.getElement().getName())) {
                if (!WarehouseLetter.getListOfProducts().ProductIsAvailable(pointerCart.getElement().getName(),pointerCart.getElement().getQuantitiy())) {
                    Product pro = WarehouseLetter.getListOfProducts().GetProductByName(pointerCart.getElement().getName());
                    quantityFirstWarehouse  = pro.getQuantitiy();
                    pointerCart.getElement().setQuantityFirstwarehouse(quantityFirstWarehouse);
                    int oldnum = pointerCart.getElement().getQuantitiy();
                    pointerCart.getElement().setQuantitiy(oldnum - quantityFirstWarehouse);
                    firstWarehouseAva = false;
                }
            } else {
                pointerCart.getElement().setQuantityFirstwarehouse(quantityFirstWarehouse);
                firstWarehouseAva = false;
            }
            pointerCart = pointerCart.getNext();
        }  
        
        if (firstWarehouseAva) {
            Warehouse wa = GlobalVariables.getListWarehouse().getWarehouse(GlobalVariables.getLetterOfWarehouseBuy());
            pointerCart = GlobalVariables.getCart().getHead();
            while (pointerCart != null) {
                int oldnum = wa.getListOfProducts().GetProductByName(pointerCart.getElement().getName()).getQuantitiy();
                wa.getListOfProducts().GetProductByName(pointerCart.getElement().getName()).setQuantitiy(oldnum - pointerCart.getElement().getQuantityFirstwarehouse());
                pointerCart = pointerCart.getNext();
            }
            JOptionPane.showMessageDialog(null, "Se pudo abastecer el pedido en el mismo almacen");
        } else {
            String WarehouseName = GlobalVariables.getLetterOfWarehouseBuy();
            int IndexDijkstra = GlobalVariables.getListWarehouse().getIndexWarehouse(WarehouseName);
            AdjacencyMatrix am = new AdjacencyMatrix(GlobalVariables.getListWarehouse().getLength());
            am.createMatrix(GlobalVariables.getListWarehouse());
            ListOfArrays listInDijkstraOrder = am.dijkStra(IndexDijkstra);
            NodeOfArrays pointer = listInDijkstraOrder.getHead();
            boolean stop = false;
            while (pointer != null && !stop) {
                boolean IsWarehouse = true;
                Warehouse SecondWa = GlobalVariables.getListWarehouse().getWarehouse(pointer.getElement()[0]);
                pointerCart = GlobalVariables.getCart().getHead();
                while (pointerCart != null && IsWarehouse) {
                    if (SecondWa.getListOfProducts().ProductIsIn(pointerCart.getElement().getName())) {
                        if (SecondWa.getListOfProducts().ProductIsAvailable(pointerCart.getElement().getName(), pointerCart.getElement().getQuantitiy())) {
                            int oldQuan = SecondWa.getListOfProducts().GetProductByName(pointerCart.getElement().getName()).getQuantitiy();
                            SecondWa.getListOfProducts().GetProductByName(pointerCart.getElement().getName()).setQuantitiy(oldQuan - pointerCart.getElement().getQuantitiy());
                            stop = true;
                            pointerCart.getElement().setWasAvaInSecondWa(IsWarehouse = true);
                            GlobalVariables.getCart().setFoundWarehouse(SecondWa.getName());
                        } else {
                            IsWarehouse = false;
                        }
                    } else {
                        IsWarehouse = false;
                    }
                    pointerCart = pointerCart.getNext();
                }
                pointer = pointer.getNext();
            }
            String result = "";
            if (stop) {
                result += "Todos los productos se pudieron abastecer. Se pidió/pidieron los productos al almacen: ";
                result += GlobalVariables.getCart().getFoundWarehouse() + "  ";
                JOptionPane.showMessageDialog(null, result);
            } else {
                result += "Los siguientes productos no estaban disponibles en otro almacen: ";
                pointerCart = GlobalVariables.getCart().getHead();
                while (pointerCart != null) {
                    result += pointerCart.getElement().getName()+ " ";
                    pointerCart = pointerCart.getNext();
                }
                JOptionPane.showMessageDialog(null, result);
            }
 
        }
    MenuWindow mw = new MenuWindow();
    this.setVisible(false);
    mw.setVisible(true);
    
    // Retorna Ventana Menú.
    }//GEN-LAST:event_NextWindowOrderActionPerformed

    private void WarehouseOrderItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_WarehouseOrderItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_WarehouseOrderItemStateChanged

    private void ProductOrderedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductOrderedActionPerformed
        
    // Acción Botón (Producto Pedido).
    
        String ProductSelected = String.valueOf(ProductOrdered.getSelectedItem());
        NodeProduct pointer = GlobalVariables.getTempListProducts().getHead();
        while (pointer != null) {
            String ProductName = pointer.getElement().getName();
            String ProductQuantity = String.valueOf(pointer.getElement().getQuantitiy());    
            if (ProductName.equals(ProductSelected)) {
                QuantityAvailable.setText(ProductQuantity);
            }
            pointer = pointer.getNext();
        }
    
    // Retorna Cantidad Y Productos Pedidos.
    }//GEN-LAST:event_ProductOrderedActionPerformed

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
            java.util.logging.Logger.getLogger(OrderWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProductOrder;
    private javax.swing.JTextArea ListOfProducts;
    private javax.swing.JLabel ListOfProductsTitle;
    private javax.swing.JLabel NameProductOrderTitle;
    private javax.swing.JButton NextWindowOrder;
    private javax.swing.JComboBox<String> ProductOrdered;
    private javax.swing.JLabel QuantityAvailable;
    private javax.swing.JLabel QuantityAvailableTitle;
    private javax.swing.JTextField QuantityProduct;
    private javax.swing.JLabel QuantityProductOrder;
    private javax.swing.JComboBox<String> WarehouseOrder;
    private javax.swing.JLabel WarehouseOrderTitle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
