package pe.calvarado.gestion.view;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.entities.Proveedor;
import pe.calvarado.gestion.entities.Ubigeo;
import pe.calvarado.gestion.services.ProveedorServices;
import pe.calvarado.gestion.services.UbigeoServices;
import pe.calvarado.gestion.util.SpringUtils;
import pe.calvarado.gestion.util.StandardViewMethods;
import pe.calvarado.gestion.util.TableColumnAdjuster;
import pe.calvarado.gestion.util.helpers.UbigeoHelper;
import pe.calvarado.gestion.util.messages.UIMessages;

public class dialogGestionarProveedor extends javax.swing.JDialog implements StandardViewMethods {

    ProveedorServices proveedorServices = (ProveedorServices) SpringUtils.getBean("proveedorServices");
    UbigeoServices ubigeoServices       = (UbigeoServices)SpringUtils.getBean("ubigeoServices");
    Logger log = Logger.getLogger(dialogGestionarProveedor.class);
    Proveedor proveedorSelected;
    int filaSeleccionada = -1; 
    List<Ubigeo> ubigeoList = new ArrayList<>();

    public dialogGestionarProveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comboBuscar = new javax.swing.JComboBox();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoProveedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFax = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNextel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboDepto = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        comboProvincia = new javax.swing.JComboBox();
        comboDistrito = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtReferencia = new javax.swing.JTextArea();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtWeb = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestionar Proveedor"));

        comboBuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Por Nombre", "Por Razon Social", "Por RUC" }));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Razón Social", "RUC", "Teléfono", "Fax", "Email", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedor);

        jLabel1.setText("Código de Proveedor");

        txtCodigoProveedor.setEditable(false);

        jLabel2.setText("Nombre");

        txtNombre.setEditable(false);

        jLabel3.setText("Razón Social");

        txtRazonSocial.setEditable(false);

        jLabel4.setText("Teléfono");

        txtTelefono.setEditable(false);

        jLabel5.setText("Fax");

        txtFax.setEditable(false);

        jLabel6.setText("Celular");

        txtCelular.setEditable(false);

        jLabel7.setText("Nextel");

        txtNextel.setEditable(false);

        jLabel8.setText("Email");

        jLabel9.setText("Web");

        jLabel10.setText("Departamento");

        comboDepto.setEnabled(false);
        comboDepto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboDeptoItemStateChanged(evt);
            }
        });

        jLabel11.setText("Provincia");

        jLabel12.setText("Distrito");

        comboProvincia.setEnabled(false);
        comboProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProvinciaItemStateChanged(evt);
            }
        });

        comboDistrito.setEnabled(false);

        jLabel13.setText("Dirección");

        txtDireccion.setEditable(false);

        jLabel14.setText("Referencia");

        txtReferencia.setEditable(false);
        txtReferencia.setColumns(20);
        txtReferencia.setRows(5);
        jScrollPane2.setViewportView(txtReferencia);

        btnEliminar.setText("Eliminar Proveedor");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar Datos");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        txtWeb.setEditable(false);

        txtEmail.setEditable(false);

        jLabel15.setText("RUC");

        txtRUC.setEditable(false);

        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(txtRazonSocial)
                    .addComponent(txtTelefono)
                    .addComponent(txtFax)
                    .addComponent(txtCelular)
                    .addComponent(txtNextel))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(comboDepto, 0, 187, Short.MAX_VALUE)
                        .addComponent(comboProvincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboDistrito, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtWeb)
                        .addComponent(txtEmail)
                        .addComponent(txtRUC))
                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(txtWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(comboDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(comboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(comboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNextel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos de Proveedor", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Contactos", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public final void loadData() {
        ubigeoList = ubigeoServices.listarUbigeo();
    }
    
    
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String buscar = txtBuscar.getText();
        List<Proveedor> lista = new ArrayList<>();
        switch (comboBuscar.getSelectedIndex()) {
            case 0:
                lista = proveedorServices.getProveedoresByParams(buscar, null, null);
                break;
            case 1:
                lista = proveedorServices.getProveedoresByParams(null, buscar, null);
                break;
            case 2:
                lista = proveedorServices.getProveedoresByParams(null, null, buscar);
                break;
        }
        cargarTablaProveedor(lista);

        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("noProveedorResults"), UIMessages.getErrorMessage("defaultErrorTitle"), JOptionPane.ERROR_MESSAGE);
            txtBuscar.requestFocus();
            txtBuscar.selectAll();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedorMouseClicked
               
        filaSeleccionada = tblProveedor.getSelectedRow();
        if(filaSeleccionada != -1){
        proveedorSelected = (Proveedor) tblProveedor.getModel().getValueAt(filaSeleccionada, 0);
        txtCodigoProveedor.setText(proveedorSelected.getProveedorId().toString());
        txtNombre.setText(proveedorSelected.getNombre());
        txtRazonSocial.setText(proveedorSelected.getRazonSocial());
        txtTelefono.setText(proveedorSelected.getTelefono());
        txtFax.setText(proveedorSelected.getFax());
        txtCelular.setText(proveedorSelected.getCelular());
        txtNextel.setText(proveedorSelected.getNextel());
        txtEmail.setText(proveedorSelected.getEmail());
        txtWeb.setText(proveedorSelected.getWeb());
        txtReferencia.setText(proveedorSelected.getReferencia());
        txtRUC.setText(proveedorSelected.getRuc());
        txtDireccion.setText(proveedorSelected.getDireccion());
        
        
        comboDepto.setModel(UbigeoHelper.cargarComboDepto(ubigeoList,comboDepto,proveedorSelected.getUbigeoId()));
        comboProvincia.setModel(UbigeoHelper.cargarComboProv(ubigeoList, comboProvincia, comboDepto, proveedorSelected.getUbigeoId()));
        comboDistrito.setModel(UbigeoHelper.cargarComboDistrito(ubigeoList, comboDistrito, comboProvincia, comboDepto, proveedorSelected.getUbigeoId()));
        
        
        }
               
    }//GEN-LAST:event_tblProveedorMouseClicked

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscar.doClick();
            }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(filaSeleccionada != -1){
        habilitarCampos(true);
        }else{
          JOptionPane.showMessageDialog(this, UIMessages.getInfoMessage("noItemSelected"));
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String mensaje;
        proveedorSelected.setProveedorId(Integer.parseInt(txtCodigoProveedor.getText()));
        proveedorSelected.setCelular(txtCelular.getText());
        proveedorSelected.setDireccion(txtDireccion.getText());
        proveedorSelected.setEmail(txtEmail.getText());
        proveedorSelected.setFax(txtFax.getText());
        proveedorSelected.setNextel(txtNextel.getText());
        proveedorSelected.setNombre(txtNombre.getText());
        proveedorSelected.setRazonSocial(txtRazonSocial.getText());
        proveedorSelected.setReferencia(txtReferencia.getText());
        proveedorSelected.setRuc(txtRUC.getText());
        proveedorSelected.setTelefono(txtTelefono.getText());
        proveedorSelected.setWeb(txtWeb.getText());
        proveedorSelected.setUbigeoId((Ubigeo)comboDistrito.getSelectedItem());
        mensaje = proveedorServices.update(proveedorSelected);
         if(mensaje != null){
            JOptionPane.showMessageDialog(this, UIMessages.getInfoMessage("onCompleteUpdate"));
            limpiarDatos();
            habilitarCampos(false);   
            filaSeleccionada = -1;
        }else{
          JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("onInsertError"), UIMessages.getErrorMessage("onInsertError_title"), JOptionPane.ERROR_MESSAGE);
        }               
               
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String mensaje;
        proveedorSelected.setMarkfordelete(true);
        
        mensaje = proveedorServices.update(proveedorSelected);
      
        if(mensaje != null){
            JOptionPane.showMessageDialog(this, UIMessages.getInfoMessage("onCompleteDelete"));
            limpiarDatos();
            habilitarCampos(false);   
            filaSeleccionada = -1;
        }else{
          JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("onDeleteError"), UIMessages.getErrorMessage("defaultErrorTitle"), JOptionPane.ERROR_MESSAGE);
        }    
      
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void comboDeptoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboDeptoItemStateChanged
       if(comboDepto.getSelectedIndex() > 0){ 
            limpiarCombo(comboProvincia);
            limpiarCombo(comboDistrito);
            comboProvincia.setModel(UbigeoHelper.cargarComboProv(ubigeoList, comboProvincia, comboDepto,null));
        } else {
            limpiarCombo(comboProvincia);
            limpiarCombo(comboDistrito);
        }
    }//GEN-LAST:event_comboDeptoItemStateChanged

    private void comboProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProvinciaItemStateChanged
        if(comboProvincia.getSelectedIndex() > 0){ 
            limpiarCombo(comboDistrito);
            comboDistrito.setModel(UbigeoHelper.cargarComboDistrito(ubigeoList, comboDistrito, comboProvincia, comboDepto,null));
        } 
      
        if(comboProvincia.getSelectedIndex() == 0){
          limpiarCombo(comboDistrito);
        }
    }//GEN-LAST:event_comboProvinciaItemStateChanged

    public void limpiarCombo(JComboBox combo){
        combo.removeAllItems();
        combo.addItem("Seleccione");
    }
    
    
    
    private void limpiarDatos(){
        txtCodigoProveedor.setText("");
        txtNombre.setText("");
        txtRazonSocial.setText("");
        txtTelefono.setText("");
        txtFax.setText("");
        txtCelular.setText("");
        txtNextel.setText("");
        txtEmail.setText("");
        txtWeb.setText("");
        txtRUC.setText("");
        comboDepto.setSelectedIndex(0);
        comboProvincia.setSelectedIndex(0);
        comboDistrito.setSelectedIndex(0);
        txtReferencia.setText("");
        txtDireccion.setText("");
        btnActualizar.setEnabled(false);    
        DefaultTableModel model = (DefaultTableModel) tblProveedor.getModel();
        model.getDataVector().clear();
        tblProveedor.setModel(model);
        tblProveedor.repaint();
    }
    
    
    private void habilitarCampos(Boolean b){
        txtNombre.setEditable(b);
        txtRazonSocial.setEditable(b);
        txtTelefono.setEditable(b);
        txtFax.setEditable(b);
        txtCelular.setEditable(b);
        txtNextel.setEditable(b);
        txtEmail.setEditable(b);
        txtWeb.setEditable(b);
        txtRUC.setEditable(b);
        comboDepto.setEnabled(b);
        comboProvincia.setEnabled(b);
        comboDistrito.setEnabled(b);
        txtReferencia.setEditable(b);
        txtDireccion.setEditable(b);
        btnActualizar.setEnabled(b);
    }   
    
    
    public void cargarTablaProveedor(List<Proveedor> listado) {

        DefaultTableModel model = (DefaultTableModel) tblProveedor.getModel();
        model.getDataVector().clear();
        for (Proveedor proveedor : listado) {
            log.info(proveedor.getMarkfordelete());
            model.addRow(new Object[]{proveedor, proveedor.getNombre(), proveedor.getRazonSocial(), proveedor.getRuc(),
                        proveedor.getTelefono(), proveedor.getFax(), proveedor.getEmail(), proveedor.getDireccion()});
        }

        TableColumnAdjuster tca = new TableColumnAdjuster(tblProveedor);
        tca.adjustColumns();

        tblProveedor.setAutoCreateRowSorter(false);
        tblProveedor.setModel(model);
        tblProveedor.repaint();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogGestionarProveedor dialog = new dialogGestionarProveedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox comboBuscar;
    private javax.swing.JComboBox comboDepto;
    private javax.swing.JComboBox comboDistrito;
    private javax.swing.JComboBox comboProvincia;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodigoProveedor;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtNextel;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextArea txtReferencia;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtWeb;
    // End of variables declaration//GEN-END:variables

    
}
