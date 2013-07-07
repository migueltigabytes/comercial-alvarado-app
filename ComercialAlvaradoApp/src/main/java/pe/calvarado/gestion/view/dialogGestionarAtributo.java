
package pe.calvarado.gestion.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.entities.Atributo;
import pe.calvarado.gestion.entities.AtributoTipo;
import pe.calvarado.gestion.services.AtributoServices;
import pe.calvarado.gestion.services.AtributoTipoServices;
import pe.calvarado.gestion.util.SpringUtils;
import pe.calvarado.gestion.util.StandardViewMethods;
import pe.calvarado.gestion.util.TableColumnAdjuster;
import pe.calvarado.gestion.util.Validar;
import pe.calvarado.gestion.util.messages.UIMessages;

public class dialogGestionarAtributo extends javax.swing.JDialog implements StandardViewMethods {

    AtributoServices atributoServices =  (AtributoServices)SpringUtils.getBean("atributoServices");
    AtributoTipoServices atributoTipoServices = (AtributoTipoServices)SpringUtils.getBean("atributoTipoServices");
    Logger log = Logger.getLogger(dialogGestionarAtributo.class);
    List<Atributo> atributoList = new ArrayList();
    int filaSeleccionada = -1;
    Atributo atributoSelected;
    public dialogGestionarAtributo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadData();
    }

    @Override
    public void loadData() {
        comboAtributoTipo.setModel(atributoTipoServices.combo());
        comboUpdateTipo.setModel(atributoTipoServices.combo());
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        comboAtributoTipo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        checkComparable = new javax.swing.JCheckBox();
        checkSearchable = new javax.swing.JCheckBox();
        txtNombre = new javax.swing.JTextField();
        txtIdentificador = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAtributos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboUpdateTipo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtUpdateNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtUpdateIde = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtUpdateDescripcion = new javax.swing.JTextArea();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtUpdateValor = new javax.swing.JTextField();
        checkUpdateComparable = new javax.swing.JCheckBox();
        checkUpdateSearchable = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestionar Atributos"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar"));

        comboAtributoTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));

        jLabel4.setText("Tipo");

        jLabel1.setText("Nombre");

        jLabel2.setText("Identificador");

        jLabel3.setText("Descripción");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtDescripcion);

        jLabel11.setText("Valor");

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorKeyPressed(evt);
            }
        });

        checkComparable.setText("Comparable");

        checkSearchable.setText("Searchable");

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("(*)");

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("(*)");

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("(*)");

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("(*)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(checkComparable)
                        .addGap(18, 18, 18)
                        .addComponent(checkSearchable)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValor)
                                    .addComponent(txtIdentificador, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(comboAtributoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAtributoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkComparable)
                    .addComponent(checkSearchable))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Buscar por nombre");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblAtributos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Nombre", "Identificador"
            }
        ));
        tblAtributos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAtributosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAtributos);

        jLabel6.setText("Codigo");

        txtCodigo.setEnabled(false);

        jLabel7.setText("Tipo");

        comboUpdateTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));
        comboUpdateTipo.setEnabled(false);

        jLabel8.setText("Nombre");

        txtUpdateNombre.setEnabled(false);

        jLabel9.setText("Identificador");

        txtUpdateIde.setEnabled(false);

        jLabel10.setText("Descripción");

        txtUpdateDescripcion.setColumns(20);
        txtUpdateDescripcion.setRows(5);
        txtUpdateDescripcion.setEnabled(false);
        jScrollPane3.setViewportView(txtUpdateDescripcion);

        btnEliminar.setText("Eliminar");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel12.setText("Valor");

        txtUpdateValor.setEnabled(false);

        checkUpdateComparable.setText("Comparable");
        checkUpdateComparable.setEnabled(false);

        checkUpdateSearchable.setText("Searchable");
        checkUpdateSearchable.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkUpdateComparable)
                        .addGap(18, 18, 18)
                        .addComponent(checkUpdateSearchable))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(22, 22, 22)))
                                .addComponent(jLabel9)
                                .addComponent(jLabel12))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUpdateNombre)
                                .addComponent(txtUpdateIde, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUpdateValor))
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboUpdateTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(35, 35, 35)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(comboUpdateTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtUpdateNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtUpdateIde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtUpdateValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkUpdateComparable)
                            .addComponent(checkUpdateSearchable))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnModificar)
                            .addComponent(btnActualizar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(esValidoElFormulario()){
        String mensaje;    
        Atributo atributo =  new Atributo();        
        AtributoTipo atributoTipo = (AtributoTipo)comboAtributoTipo.getSelectedItem();
        atributo.setAtributoTipoId(atributoTipo);
        atributo.setNombre(txtNombre.getText());
        atributo.setIdentificador(txtIdentificador.getText());
        atributo.setDescripcion(txtDescripcion.getText());
        switch(atributoTipo.getAtributoTipoId()){
            case 1: atributo.setIntegerValue(Integer.parseInt(txtValor.getText())); break;
            case 2: atributo.setFloatValue(Float.parseFloat(txtValor.getText()));   break;
            case 4: atributo.setStringValue(txtValor.getText()); break;        
        }         
        if(checkComparable.isSelected()){
           atributo.setComparable(true);
        }        
        if(checkSearchable.isSelected()){
        atributo.setSearchable(true);
        }        
        mensaje = atributoServices.insert(atributo);
        if (mensaje != null) {
            JOptionPane.showMessageDialog(this, UIMessages.getInfoMessage("onCompleteInsert"));
            int resp = JOptionPane.showConfirmDialog(this, UIMessages.getQuestionMessage("register_another_atributo"),
                    UIMessages.getQuestionMessage("register_another_title"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == 0) {
                limpiarFormularioAtributo();
            } else {
                limpiarFormularioAtributo();
            }
        } else {
            JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("onInsertError"), UIMessages.getErrorMessage("onInsertError_title"), JOptionPane.ERROR_MESSAGE);
        }
        
        
        }        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String buscar = txtBuscar.getText();
        atributoList =  atributoServices.listarPorNombre(buscar);
        cargarTablaAtributo(atributoList);
        
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblAtributosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAtributosMouseClicked
       filaSeleccionada = tblAtributos.getSelectedRow();
       limpiarUpdateFormulario();
       if (filaSeleccionada != -1) {           
            atributoSelected = (Atributo) tblAtributos.getModel().getValueAt(filaSeleccionada, 0);
            txtCodigo.setText(atributoSelected.getAtributo().toString());          
            txtUpdateNombre.setText(atributoSelected.getNombre());
            txtUpdateIde.setText(atributoSelected.getIdentificador());
            txtUpdateDescripcion.setText(atributoSelected.getDescripcion());
            comboUpdateTipo.setSelectedItem(atributoSelected.getAtributoTipoId());
            if(atributoSelected.getIntegerValue()!= null){
               txtUpdateValor.setText(atributoSelected.getIntegerValue().toString());
            }else if(atributoSelected.getFloatValue()!=null){
               txtUpdateValor.setText(atributoSelected.getFloatValue().toString()); 
            }else if(atributoSelected.getStringValue()!=null){
               txtUpdateValor.setText(atributoSelected.getStringValue()); 
            }       
            if(atributoSelected.getComparable()){
               checkUpdateComparable.setSelected(true);
            }
            if(atributoSelected.getSearchable()){
               checkUpdateSearchable.setSelected(true);
            }
            habilitarCampos(false); 
        }
    }//GEN-LAST:event_tblAtributosMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (filaSeleccionada != -1 ) {
            habilitarCampos(true);
        } else {
            JOptionPane.showMessageDialog(this, UIMessages.getInfoMessage("noItemSelected"));
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(esValidoFormularioActualizar()){
        String mensaje;               
        atributoSelected.setNombre(txtUpdateNombre.getText());
        atributoSelected.setIdentificador(txtUpdateIde.getText());
        atributoSelected.setDescripcion(txtUpdateDescripcion.getText());
        atributoSelected.setAtributoTipoId((AtributoTipo)comboUpdateTipo.getSelectedItem());
        atributoSelected.setComparable(checkUpdateComparable.isSelected());
        atributoSelected.setSearchable(checkUpdateSearchable.isSelected()); 
        switch(atributoSelected.getAtributoTipoId().getAtributoTipoId()){
            case 1: atributoSelected.setIntegerValue(Integer.parseInt(txtUpdateValor.getText())); break;
            case 2: atributoSelected.setFloatValue(Float.parseFloat(txtUpdateValor.getText())); break;  
            case 4: atributoSelected.setStringValue(txtUpdateValor.getText()); break;    
        }
        mensaje = atributoServices.update(atributoSelected);
        if (mensaje != null) {
            JOptionPane.showMessageDialog(this, UIMessages.getInfoMessage("onCompleteUpdate"));           
            habilitarCampos(false);  
            
        } else {
            JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("onInsertError"), UIMessages.getErrorMessage("onInsertError_title"), JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyPressed
       if(evt.getKeyCode()== evt.VK_ENTER){
           txtValor.requestFocus();
        }
    }//GEN-LAST:event_txtDescripcionKeyPressed

    private void txtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyPressed
       if(evt.getKeyCode()== evt.VK_ENTER){
           checkComparable.requestFocus();
        }
    }//GEN-LAST:event_txtValorKeyPressed

    private void limpiarUpdateFormulario(){
      txtCodigo.setText("");
      txtUpdateNombre.setText("");
      txtUpdateIde.setText("");
      txtUpdateDescripcion.setText("");
      comboUpdateTipo.setSelectedIndex(0);
      txtUpdateValor.setText("");
      checkUpdateComparable.setSelected(false);
      checkUpdateSearchable.setSelected(false);
    }
    
    private void limpiarFormularioAtributo(){
       txtNombre.setText("");
       txtDescripcion.setText("");
       txtValor.setText("");
       txtIdentificador.setText("");
       comboAtributoTipo.setSelectedIndex(0);
       checkComparable.setSelected(false);
       checkSearchable.setSelected(false);
    }
    
    
    private void habilitarCampos(Boolean b){
        txtUpdateNombre.setEnabled(b);
        txtUpdateIde.setEnabled(b);
        txtUpdateDescripcion.setEnabled(b);
        comboUpdateTipo.setEnabled(b);   
        txtUpdateValor.setEnabled(b); 
        btnActualizar.setEnabled(b);   
        checkUpdateComparable.setEnabled(b);
        checkUpdateSearchable.setEnabled(b);         
     }
        
     private void cargarTablaAtributo(List<Atributo> listado) {

        DefaultTableModel model = (DefaultTableModel) tblAtributos.getModel();
        model.getDataVector().clear();
        for (Atributo atributo : listado) {            
            model.addRow(new Object[]{atributo, atributo.getAtributoTipoId(), atributo.getNombre(), atributo.getIdentificador(), atributo.getDescripcion() });
        }
        TableColumnAdjuster tca = new TableColumnAdjuster(tblAtributos);
        tca.adjustColumns();
        tblAtributos.setAutoCreateRowSorter(false);
        tblAtributos.setModel(model);
        tblAtributos.repaint();
    }
    
    
    private boolean esValidoElFormulario(){
        if(comboAtributoTipo.getSelectedIndex()==0){
          JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredField"), UIMessages.getErrorMessage("requiredField_title"), JOptionPane.ERROR_MESSAGE);
          return false;
        }
        if(Validar.esVacio(txtNombre.getText()) || Validar.validarVacio(txtNombre.getText())){
           JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredField"), UIMessages.getErrorMessage("requiredField_title"), JOptionPane.ERROR_MESSAGE);
           return false;
        }
        if(Validar.esVacio(txtIdentificador.getText()) || Validar.validarVacio(txtIdentificador.getText())){
           JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredField"), UIMessages.getErrorMessage("requiredField_title"), JOptionPane.ERROR_MESSAGE);
           return false;
        }
        if(Validar.esVacio(txtValor.getText()) || Validar.validarVacio(txtValor.getText())){
           JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredField"), UIMessages.getErrorMessage("requiredField_title"), JOptionPane.ERROR_MESSAGE);
           return false;
        } 
        
        switch(comboAtributoTipo.getSelectedIndex()){
            case 1: if(!Validar.esUnDatoInteger(txtValor.getText())){
                       JOptionPane.showMessageDialog(this, "No es entero");
                       return false;
                    }break;                    
            case 2: if(!Validar.esUnDatoFloat(txtValor.getText())){
                       JOptionPane.showMessageDialog(this, "No es Float");
                       return false;
                    }break;             
        }
               
                   
    return true;
    }
    
    private boolean esValidoFormularioActualizar(){
        if(comboUpdateTipo.getSelectedIndex()==0){
          JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredField"), UIMessages.getErrorMessage("requiredField_title"), JOptionPane.ERROR_MESSAGE);
           return false;
        }
        if(Validar.esVacio(txtUpdateNombre.getText()) || Validar.validarVacio(txtUpdateNombre.getText())){
            JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredField"), UIMessages.getErrorMessage("requiredField_title"), JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(Validar.esVacio(txtUpdateIde.getText()) || Validar.validarVacio(txtUpdateIde.getText())){
            JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredField"), UIMessages.getErrorMessage("requiredField_title"), JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        if(Validar.esVacio(txtUpdateValor.getText()) || Validar.validarVacio(txtUpdateValor.getText())){
            JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredField"), UIMessages.getErrorMessage("requiredField_title"), JOptionPane.ERROR_MESSAGE);
            return false;
        } 
         switch(comboUpdateTipo.getSelectedIndex()){
            case 1: if(!Validar.esUnDatoInteger(txtUpdateValor.getText())){
                       JOptionPane.showMessageDialog(this, "No es entero");
                       return false;
                    }break;                    
            case 2: if(!Validar.esUnDatoFloat(txtUpdateValor.getText())){
                       JOptionPane.showMessageDialog(this, "No es Float");
                       return false;
                    }break;             
        }
       
       return true;
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
            java.util.logging.Logger.getLogger(dialogGestionarAtributo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogGestionarAtributo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogGestionarAtributo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogGestionarAtributo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogGestionarAtributo dialog = new dialogGestionarAtributo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox checkComparable;
    private javax.swing.JCheckBox checkSearchable;
    private javax.swing.JCheckBox checkUpdateComparable;
    private javax.swing.JCheckBox checkUpdateSearchable;
    private javax.swing.JComboBox comboAtributoTipo;
    private javax.swing.JComboBox comboUpdateTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAtributos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtUpdateDescripcion;
    private javax.swing.JTextField txtUpdateIde;
    private javax.swing.JTextField txtUpdateNombre;
    private javax.swing.JTextField txtUpdateValor;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    
}
