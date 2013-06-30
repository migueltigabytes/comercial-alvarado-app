package pe.calvarado.gestion.view;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.entities.Proveedor;
import pe.calvarado.gestion.entities.Ubigeo;
import pe.calvarado.gestion.services.ProveedorServices;
import pe.calvarado.gestion.util.SpringUtils;
import pe.calvarado.gestion.util.Validar;
import pe.calvarado.gestion.util.messages.UIMessages;

public class dialogRegistrarProveedor extends javax.swing.JDialog {

    ProveedorServices proveedorServices = (ProveedorServices) SpringUtils.getBean("proveedorServices");
    Logger log = Logger.getLogger(dialogRegistrarProveedor.class);  
    private static final int NO_ULTIMO = 0;
    List<JTextField> textFieldList = new ArrayList<>();    
    
    
    public dialogRegistrarProveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarListaDeJTextFieldObligatorios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        txtFax = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        comboDepto = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        comboProvincia = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        comboDistrito = new javax.swing.JComboBox();
        txtDireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReferencia = new javax.swing.JTextArea();
        btnRegistrar = new javax.swing.JButton();
        txtCelular = new javax.swing.JTextField();
        lblErrorNombre = new javax.swing.JLabel();
        lblErrorRazon = new javax.swing.JLabel();
        lblErrorTelefono = new javax.swing.JLabel();
        lblErrorDireccion = new javax.swing.JLabel();
        txtNextel = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtWeb = new javax.swing.JTextField();
        txtRuc = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar Proveedor"));

        jLabel1.setText("Nombre");

        jLabel2.setText("Razon Social");

        jLabel3.setText("Teléfono");

        jLabel4.setText("Celular");

        jLabel5.setText("Fax");

        jLabel6.setText("Nextel");

        jLabel7.setText("Email");

        jLabel8.setText("Web");

        jLabel10.setText("Referencia");

        jLabel11.setText("Dirección");

        txtNombre.setNextFocusableComponent(txtRazonSocial);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        txtRazonSocial.setNextFocusableComponent(txtTelefono);
        txtRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyPressed(evt);
            }
        });

        txtFax.setNextFocusableComponent(txtCelular);
        txtFax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFaxKeyPressed(evt);
            }
        });

        txtTelefono.setNextFocusableComponent(txtFax);
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
        });

        jLabel13.setText("Departamento");

        comboDepto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboDepto.setNextFocusableComponent(comboProvincia);
        comboDepto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboDeptoKeyPressed(evt);
            }
        });

        jLabel14.setText("Provincia");

        comboProvincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboProvincia.setNextFocusableComponent(comboDistrito);
        comboProvincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboProvinciaKeyPressed(evt);
            }
        });

        jLabel15.setText("Distrito");

        comboDistrito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboDistrito.setNextFocusableComponent(txtDireccion);
        comboDistrito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboDistritoKeyPressed(evt);
            }
        });

        txtDireccion.setNextFocusableComponent(txtReferencia);
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionKeyPressed(evt);
            }
        });

        txtReferencia.setColumns(20);
        txtReferencia.setRows(5);
        jScrollPane1.setViewportView(txtReferencia);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtCelular.setNextFocusableComponent(txtNextel);
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCelularKeyPressed(evt);
            }
        });

        lblErrorNombre.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorNombre.setText("(*)");

        lblErrorRazon.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorRazon.setText("(*)");

        lblErrorTelefono.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorTelefono.setText("(*)");

        lblErrorDireccion.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorDireccion.setText("(*)");

        txtNextel.setNextFocusableComponent(txtEmail);
        txtNextel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNextelKeyPressed(evt);
            }
        });

        txtEmail.setNextFocusableComponent(txtWeb);
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        txtWeb.setNextFocusableComponent(txtRuc);
        txtWeb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWebKeyPressed(evt);
            }
        });

        txtRuc.setNextFocusableComponent(comboDepto);
        txtRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRucKeyPressed(evt);
            }
        });

        jLabel20.setText("RUC");

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("(*) Campos Obligatorios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel20))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFax)
                    .addComponent(txtNombre)
                    .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefono)
                    .addComponent(txtRazonSocial)
                    .addComponent(txtNextel)
                    .addComponent(txtEmail)
                    .addComponent(txtWeb)
                    .addComponent(txtRuc, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErrorRazon)
                    .addComponent(lblErrorNombre)
                    .addComponent(lblErrorTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel15))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(comboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lblErrorDireccion)
                        .addGap(56, 56, 56))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblErrorNombre))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblErrorRazon))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblErrorTelefono))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNextel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(comboDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(comboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrorDireccion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar)
                    .addComponent(jLabel20)
                    .addComponent(jLabel9))
                .addContainerGap(34, Short.MAX_VALUE))
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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        log.info("Traza registrar Proveedor");       
        String inserto;
        if(esValidoElFormulario()){        
        Ubigeo ubigeo = new Ubigeo(1);
        Proveedor p = new Proveedor();
        p.setNombre(txtNombre.getText());
        p.setRazonSocial(txtRazonSocial.getText());
        p.setTelefono(txtTelefono.getText());
        p.setFax(txtFax.getText());
        p.setCelular(txtCelular.getText());
        p.setNextel(txtNextel.getText());
        p.setEmail(txtEmail.getText());
        p.setWeb(txtWeb.getText());
        p.setRuc(txtRuc.getText());
        p.setDireccion(txtDireccion.getText());
        p.setReferencia(txtReferencia.getText());
        p.setUbigeoId(ubigeo);
        inserto = proveedorServices.insert(p); 
        if(inserto != null){
          JOptionPane.showMessageDialog(this, UIMessages.getInfoMessage("onCompleteInsert"));
          int resp = JOptionPane.showConfirmDialog(this, UIMessages.getQuestionMessage("register_another_proveedor"), 
                     UIMessages.getQuestionMessage("register_another_title"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == 0) {                
               limpiarFormulario();
            } else {
               limpiarFormulario();
                dispose();
            }
        }else{
          JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("onInsertError"), UIMessages.getErrorMessage("onInsertError_title"), JOptionPane.ERROR_MESSAGE);
        }               
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
           validarSiCajaDeTextoEsVacia(txtNombre.getText(), txtNombre, lblErrorNombre, txtRazonSocial, NO_ULTIMO);
        }        
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtRazonSocialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
           validarSiCajaDeTextoEsVacia(txtRazonSocial.getText(), txtRazonSocial, lblErrorRazon, txtTelefono, NO_ULTIMO);
        }     
    }//GEN-LAST:event_txtRazonSocialKeyPressed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
         if(evt.getKeyCode()==evt.VK_ENTER){
           validarSiCajaDeTextoEsVacia(txtTelefono.getText(), txtTelefono, lblErrorTelefono, txtFax, NO_ULTIMO);
        }     
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyPressed
         if(evt.getKeyCode()==evt.VK_ENTER){
           validarSiCajaDeTextoEsVacia(txtDireccion.getText(), txtDireccion, lblErrorDireccion, txtReferencia, NO_ULTIMO);
        }     
    }//GEN-LAST:event_txtDireccionKeyPressed

    private void txtFaxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFaxKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
           txtCelular.requestFocus();
        }     
    }//GEN-LAST:event_txtFaxKeyPressed

    private void txtCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
           txtNextel.requestFocus();
        } 
    }//GEN-LAST:event_txtCelularKeyPressed

    private void txtNextelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNextelKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
           txtEmail.requestFocus();
        } 
    }//GEN-LAST:event_txtNextelKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
       if(evt.getKeyCode()==evt.VK_ENTER){
           txtWeb.requestFocus();
        } 
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtWebKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWebKeyPressed
      if(evt.getKeyCode()==evt.VK_ENTER){
           txtRuc.requestFocus();
        } 
    }//GEN-LAST:event_txtWebKeyPressed

    private void txtRucKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyPressed
         if(evt.getKeyCode()==evt.VK_ENTER){
           comboDepto.requestFocus();
        } 
    }//GEN-LAST:event_txtRucKeyPressed

    private void comboDeptoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboDeptoKeyPressed
         if(evt.getKeyCode()==evt.VK_ENTER){
           comboProvincia.requestFocus();
        } 
    }//GEN-LAST:event_comboDeptoKeyPressed

    private void comboProvinciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboProvinciaKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
           comboDistrito.requestFocus();
        } 
    }//GEN-LAST:event_comboProvinciaKeyPressed

    private void comboDistritoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboDistritoKeyPressed
       if(evt.getKeyCode()==evt.VK_ENTER){
           txtDireccion.requestFocus();
        } 
    }//GEN-LAST:event_comboDistritoKeyPressed
   
    
   public boolean esValidoElFormulario(){
        /* VALIDAMOS QUE ESTEN COMPLETADOS TODOS LOS CAMPOS OBLIGATORIOS */
          for(JTextField txtField : textFieldList){  
              if(Validar.esVacio(txtField.getText()) || Validar.validarVacio(txtField.getText())){              
                JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredField"), UIMessages.getErrorMessage("requiredField_title"), JOptionPane.ERROR_MESSAGE);
                txtField.requestFocus();
                return false;
                }
          }     
          return true;       
    }
     
   private void cargarListaDeJTextFieldObligatorios(){
        textFieldList.add(txtNombre);
        textFieldList.add(txtRazonSocial);
        textFieldList.add(txtTelefono);
        textFieldList.add(txtDireccion);
   }  
    
    private void limpiarFormulario(){
      txtNombre.setText("");
      txtRazonSocial.setText("");
      txtEmail.setText("");
      txtCelular.setText("");
      txtDireccion.setText("");
      txtReferencia.setText("");
      txtRuc.setText("");
      txtWeb.setText("");
      txtFax.setText("");
      txtNextel.setText("");
      txtTelefono.setText("");
      comboDepto.setSelectedIndex(0);
      comboProvincia.setSelectedIndex(0);
      comboDistrito.setSelectedIndex(0);   
      lblErrorNombre.setIcon(null);
      lblErrorNombre.setText("(*)");
      lblErrorRazon.setIcon(null);
      lblErrorRazon.setText("(*)");
      lblErrorDireccion.setIcon(null);
      lblErrorDireccion.setText("(*)");
      lblErrorTelefono.setIcon(null);
      lblErrorTelefono.setText("(*)");
      txtNombre.requestFocus();
    }
    
    
    private void validarSiCajaDeTextoEsVacia(String texto, JTextField cajita, JLabel labelDeError, JTextField siguiente_focus, int ultimo) {
        if (!Validar.esVacio(texto) && !Validar.validarVacio(texto)) {
            if (ultimo == NO_ULTIMO) {
                siguiente_focus.requestFocus(); 
            }
            labelDeError.setText("");
            labelDeError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/calvarado/gestion/view/images/check.png")));
        } else {
            cajita.requestFocus();
        }
    }
    
    private void validarSiCajaDeTextoEsVacia(String texto, JTextField cajita, JLabel labelDeError, JTextArea siguiente_focus, int ultimo) {
        if (!Validar.esVacio(texto) && !Validar.validarVacio(texto)) {
            if (ultimo == NO_ULTIMO) {
                siguiente_focus.requestFocus(); 
            }
            labelDeError.setText("");
            labelDeError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/calvarado/gestion/view/images/check.png")));
        } else {
            cajita.requestFocus();     
        }
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
            java.util.logging.Logger.getLogger(dialogRegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogRegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogRegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogRegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogRegistrarProveedor dialog = new dialogRegistrarProveedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox comboDepto;
    private javax.swing.JComboBox comboDistrito;
    private javax.swing.JComboBox comboProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorDireccion;
    private javax.swing.JLabel lblErrorNombre;
    private javax.swing.JLabel lblErrorRazon;
    private javax.swing.JLabel lblErrorTelefono;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtNextel;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextArea txtReferencia;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtWeb;
    // End of variables declaration//GEN-END:variables
}
