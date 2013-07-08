/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.entities.Atributo;
import pe.calvarado.gestion.entities.Categoria;
import pe.calvarado.gestion.entities.Fabricante;
import pe.calvarado.gestion.entities.Producto;
import pe.calvarado.gestion.entities.Proveedor;
import pe.calvarado.gestion.services.AtributoServices;
import pe.calvarado.gestion.services.CategoriaServices;
import pe.calvarado.gestion.services.FabricanteServices;
import pe.calvarado.gestion.services.ProductoServices;
import pe.calvarado.gestion.services.ProveedorServices;
import pe.calvarado.gestion.util.SpringUtils;
import pe.calvarado.gestion.util.StandardViewMethods;
import pe.calvarado.gestion.util.TableColumnAdjuster;
import pe.calvarado.gestion.util.Validar;
import pe.calvarado.gestion.util.messages.UIMessages;

/**
 *
 * @author TIGABYTES 005
 */
public class dialogRegistrarProducto extends javax.swing.JDialog implements StandardViewMethods{

    
    CategoriaServices categoriaServices =  (CategoriaServices)SpringUtils.getBean("categoriaServices");
    ProveedorServices proveedorServices =  (ProveedorServices)SpringUtils.getBean("proveedorServices");
    FabricanteServices fabricanteServices = (FabricanteServices)SpringUtils.getBean("fabricanteServices");
    ProductoServices   productoServices   = (ProductoServices)SpringUtils.getBean("productoServices");  
    AtributoServices   atributoServices = (AtributoServices)SpringUtils.getBean("atributoServices");
    
    List<Atributo> atributoList = new ArrayList<>();
    int filaSeleccionada = -1;
    
    Logger log = Logger.getLogger(dialogRegistrarProducto.class);
    
    public dialogRegistrarProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadData();
    }
    
    @Override 
    public void loadData() {
        comboCategoria.setModel(categoriaServices.combo()); 
        comboProveedor.setModel(proveedorServices.combo());
        comboFabricante.setModel(fabricanteServices.combo());
        comboAtributos.setModel(atributoServices.combo()); 
    } 
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        comboFabricante = new javax.swing.JComboBox();
        comboCategoria = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        checkEnVenta = new javax.swing.JCheckBox();
        comboProveedor = new javax.swing.JComboBox();
        txtDescripcion = new javax.swing.JTextField();
        checkDescuento = new javax.swing.JCheckBox();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        comboAtributos = new javax.swing.JComboBox();
        btnAsignarAtributo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAtributo = new javax.swing.JTable();
        btnQuitarAtributo = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtStockInicial = new javax.swing.JTextField();
        txtAlertaStock = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar Producto"));

        comboFabricante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));

        jLabel3.setText("Categoría");

        jLabel1.setText("Fabricante");

        jLabel2.setText("Proveedor");

        jLabel7.setText("Stock inicial");

        jLabel5.setText("Descripción");

        jLabel4.setText("Nombre");

        checkEnVenta.setText("En Venta");

        comboProveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));

        checkDescuento.setText("Descuento por cantidad");

        jLabel9.setText("Precio Venta");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("(*)");

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("(*)");

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("(*)");

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("(*)");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Atributos"));

        comboAtributos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));

        btnAsignarAtributo.setText("Asignar Atributo");
        btnAsignarAtributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarAtributoActionPerformed(evt);
            }
        });

        tblAtributo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Atributo", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tblAtributo);

        btnQuitarAtributo.setText("Quitar Atributo");
        btnQuitarAtributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarAtributoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(comboAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(btnAsignarAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnQuitarAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAsignarAtributo))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQuitarAtributo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setText("Alerta Stock");

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("(*)");

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("(*)");

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("(*) Campos Obligatorios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(checkEnVenta)
                        .addGap(18, 18, 18)
                        .addComponent(checkDescuento))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAlertaStock, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStockInicial, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 188, Short.MAX_VALUE)
                            .addComponent(comboProveedor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboFabricante, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecioVenta))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)))
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(txtStockInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAlertaStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkDescuento)
                            .addComponent(checkEnVenta))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(jLabel15)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(esValidoElFormulario()){
        Producto producto =  new Producto();
        Fabricante fabricante = new Fabricante();
        Proveedor proveedor = new Proveedor();
        Categoria categoria = new Categoria();
        Atributo a = new Atributo();
        Date fecha = new Date();         
        
        fabricante = (Fabricante)comboFabricante.getSelectedItem();
        proveedor  = (Proveedor)comboProveedor.getSelectedItem();
        categoria = (Categoria)comboCategoria.getSelectedItem();
        
        producto.setFabricanteId(fabricante);
        producto.setProveedorId(proveedor);
        producto.setCategoriaDefaultId(categoria);
        producto.setNombre(txtNombre.getText());
        producto.setDescripcion(txtDescripcion.getText());
        producto.setPrecioVenta(BigDecimal.valueOf(Float.parseFloat(txtPrecioVenta.getText())));
        producto.setCantidad(Integer.parseInt(txtStockInicial.getText()));
        producto.setAlertaDeStock(Integer.parseInt(txtAlertaStock.getText()));
        producto.setFechaAlta(fecha);
        producto.setAtributoList(atributoList);
 
      
        if(checkEnVenta.isSelected()){
            producto.setEnVenta(true);
        }
        if(checkDescuento.isSelected()){
            producto.setDescuentoPorCantidad(true);
        }

        productoServices.insert(producto);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAsignarAtributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarAtributoActionPerformed
        Atributo atributoSelected = new Atributo();
        atributoSelected  = (Atributo)comboAtributos.getSelectedItem();
        if(!atributoList.contains(atributoSelected)){
           atributoList.add(atributoSelected); 
           cargarAtributo(atributoList);        
        }else{
           JOptionPane.showMessageDialog(this, "Ya se asigno atributo");
        }
    }//GEN-LAST:event_btnAsignarAtributoActionPerformed

    private void btnQuitarAtributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarAtributoActionPerformed
         Atributo atributo =  new Atributo();
         filaSeleccionada = tblAtributo.getSelectedRow();
         if(filaSeleccionada!=-1){
         atributo = (Atributo)tblAtributo.getValueAt(filaSeleccionada, 0);
         atributoList.remove(atributo); 
         cargarAtributo(atributoList);
         }else{
           JOptionPane.showMessageDialog(this, "Selecione un atributo");
         }
    }//GEN-LAST:event_btnQuitarAtributoActionPerformed

    private boolean esValidoElFormulario(){
         if(comboCategoria.getSelectedIndex()==0){
          JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredField"), UIMessages.getErrorMessage("requiredField_title"), JOptionPane.ERROR_MESSAGE);
          comboCategoria.requestFocus();
          return false;
        }
        if(Validar.esVacio(txtNombre.getText()) || Validar.validarVacio(txtNombre.getText())){
           JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredField"), UIMessages.getErrorMessage("requiredField_title"), JOptionPane.ERROR_MESSAGE);
           txtNombre.requestFocus();
           return false;
        }
        if(Validar.esVacio(txtDescripcion.getText()) || Validar.validarVacio(txtDescripcion.getText())){
           JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredField"), UIMessages.getErrorMessage("requiredField_title"), JOptionPane.ERROR_MESSAGE);
           txtDescripcion.requestFocus();
           return false;
        }
        if(Validar.esVacio(txtStockInicial.getText()) || Validar.validarVacio(txtStockInicial.getText())){
           JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredField"), UIMessages.getErrorMessage("requiredField_title"), JOptionPane.ERROR_MESSAGE);
           txtStockInicial.requestFocus();
           return false;
        } 
        if(Validar.esVacio(txtAlertaStock.getText()) || Validar.validarVacio(txtAlertaStock.getText())){
           JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredField"), UIMessages.getErrorMessage("requiredField_title"), JOptionPane.ERROR_MESSAGE);
           txtAlertaStock.requestFocus();
           return false;
        } 
         if(Validar.esVacio(txtPrecioVenta.getText()) || Validar.validarVacio(txtPrecioVenta.getText()) || Validar.siEsSoloNro(txtPrecioVenta.getText())){
           JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredField"), UIMessages.getErrorMessage("requiredField_title"), JOptionPane.ERROR_MESSAGE);
           txtPrecioVenta.requestFocus();
           return false; 
        } 
    
      return true;
    }
    
    
    private void cargarAtributo(List<Atributo> atributoList){ 
              
        DefaultTableModel model = (DefaultTableModel) tblAtributo.getModel();
        model.getDataVector().clear();
        for(Atributo atributo: atributoList){ 
            model.addRow(new Object[]{atributo,atributo.getDescripcion()});
        }

        TableColumnAdjuster tca = new TableColumnAdjuster(tblAtributo);
        tca.adjustColumns();

        tblAtributo.setAutoCreateRowSorter(false);
        tblAtributo.setModel(model);
        tblAtributo.repaint(); 
     
    }
    
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
            java.util.logging.Logger.getLogger(dialogRegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogRegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogRegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogRegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogRegistrarProducto dialog = new dialogRegistrarProducto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarAtributo;
    private javax.swing.JButton btnQuitarAtributo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox checkDescuento;
    private javax.swing.JCheckBox checkEnVenta;
    private javax.swing.JComboBox comboAtributos;
    private javax.swing.JComboBox comboCategoria;
    private javax.swing.JComboBox comboFabricante;
    private javax.swing.JComboBox comboProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAtributo;
    private javax.swing.JTextField txtAlertaStock;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtStockInicial;
    // End of variables declaration//GEN-END:variables

   
}
