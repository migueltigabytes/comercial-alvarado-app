package pe.calvarado.gestion.view;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.entities.Contacto;
import pe.calvarado.gestion.entities.Proveedor;
import pe.calvarado.gestion.entities.Ubigeo;
import pe.calvarado.gestion.services.ContactoServices;
import pe.calvarado.gestion.services.ProveedorServices;
import pe.calvarado.gestion.services.UbigeoServices;
import pe.calvarado.gestion.util.SpringUtils;
import pe.calvarado.gestion.util.StandardViewMethods;
import pe.calvarado.gestion.util.TableColumnAdjuster;
import pe.calvarado.gestion.util.helpers.UbigeoHelper;
import pe.calvarado.gestion.util.messages.UIMessages;

public class dialogGestionarProveedor extends javax.swing.JDialog implements StandardViewMethods {

    ProveedorServices proveedorServices = (ProveedorServices) SpringUtils.getBean("proveedorServices");
    ContactoServices contactoServices = (ContactoServices)SpringUtils.getBean("contactoServices");
    UbigeoServices ubigeoServices       = (UbigeoServices)SpringUtils.getBean("ubigeoServices");
    Logger log = Logger.getLogger(dialogGestionarProveedor.class);
    Proveedor proveedorSelected;
    Contacto contactoSelected;
    int filaSeleccionada = -1;
    int filaSeleccionadaContacto =-1;
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
        panelDatosProveedor = new javax.swing.JPanel();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        tblContacto = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        txtBuscarContacto = new javax.swing.JTextField();
        btnBuscarContacto = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtNombreContacto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTelefContacto = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCelContacto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtRefContacto = new javax.swing.JTextField();
        btnRegistrarContacto = new javax.swing.JButton();
        txtEmailContacto = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtUpdateTelef = new javax.swing.JTextField();
        txtUpdateEmail = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtUpdateCel = new javax.swing.JTextField();
        txtUpdateRef = new javax.swing.JTextField();
        btnDeleteContacto = new javax.swing.JButton();
        txtUpdateNombre = new javax.swing.JTextField();
        btnModificarContacto = new javax.swing.JButton();
        btnActualizarContacto = new javax.swing.JButton();

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

        javax.swing.GroupLayout panelDatosProveedorLayout = new javax.swing.GroupLayout(panelDatosProveedor);
        panelDatosProveedor.setLayout(panelDatosProveedorLayout);
        panelDatosProveedorLayout.setHorizontalGroup(
            panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(txtRazonSocial)
                    .addComponent(txtTelefono)
                    .addComponent(txtFax)
                    .addComponent(txtCelular)
                    .addComponent(txtNextel))
                .addGap(43, 43, 43)
                .addGroup(panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(25, 25, 25)
                .addGroup(panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosProveedorLayout.createSequentialGroup()
                        .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel14))
                    .addGroup(panelDatosProveedorLayout.createSequentialGroup()
                        .addGroup(panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panelDatosProveedorLayout.setVerticalGroup(
            panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosProveedorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosProveedorLayout.createSequentialGroup()
                        .addGroup(panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(txtWeb))
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(comboDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDatosProveedorLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(comboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(comboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar))
                .addGap(18, 18, 18)
                .addGroup(panelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNextel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos de Proveedor", panelDatosProveedor);

        tblContacto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Teléfono", "Celular", "Email", "Referencia"
            }
        ));
        tblContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContactoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblContacto);

        jLabel20.setText("Buscar por Nombre");

        btnBuscarContacto.setText("Bucar");
        btnBuscarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarContactoActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar Contacto"));

        jLabel16.setText("Nombre");

        jLabel17.setText("Teléfono");

        jLabel18.setText("Celular");

        jLabel19.setText("Email");

        jLabel22.setText("Referencia");

        btnRegistrarContacto.setText("Registrar");
        btnRegistrarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarContactoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCelContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmailContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(txtRefContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtTelefContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtCelContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtEmailContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRefContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnRegistrarContacto)
                .addGap(36, 36, 36))
        );

        jLabel23.setText("Nombre");

        jLabel24.setText("Teléfono");

        jLabel25.setText("Celular");

        txtUpdateTelef.setEditable(false);

        txtUpdateEmail.setEditable(false);

        jLabel26.setText("Email");

        jLabel27.setText("Referencia");

        txtUpdateCel.setEditable(false);

        txtUpdateRef.setEditable(false);

        btnDeleteContacto.setText("Eliminar Contacto");

        txtUpdateNombre.setEditable(false);

        btnModificarContacto.setText("Modificar");

        btnActualizarContacto.setText("Actualizar");
        btnActualizarContacto.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel24))
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUpdateTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUpdateNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel26))
                                        .addGap(46, 46, 46)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUpdateEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUpdateCel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtUpdateRef, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnDeleteContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModificarContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnActualizarContacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 56, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel20))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtBuscarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscarContacto))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtUpdateRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(txtUpdateNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeleteContacto)
                            .addComponent(jLabel24)
                            .addComponent(txtUpdateTelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificarContacto)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel25)
                                .addComponent(txtUpdateCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizarContacto)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUpdateEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Contactos", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jTabbedPane1))
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
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

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(filaSeleccionada != -1){
            habilitarCampos(true);
        }else{
            JOptionPane.showMessageDialog(this, UIMessages.getInfoMessage("noItemSelected"));
        }
    }//GEN-LAST:event_btnModificarActionPerformed

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

    private void btnRegistrarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarContactoActionPerformed
         String inserto;
         Contacto  contacto = new Contacto();
         contacto.setProveedorId(proveedorSelected);         
         contacto.setNombre(txtNombreContacto.getText());
         contacto.setTelefono(txtTelefContacto.getText());
         contacto.setCelular(txtCelContacto.getText());
         contacto.setEmail(txtEmailContacto.getText());
         contacto.setReferencia(txtRefContacto.getText());
         inserto = contactoServices.insert(contacto);
         if(inserto != null){
          JOptionPane.showMessageDialog(this, UIMessages.getInfoMessage("onCompleteInsert"));
          int resp = JOptionPane.showConfirmDialog(this, UIMessages.getQuestionMessage("register_another_contacto"), 
                     UIMessages.getQuestionMessage("register_another_title"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);  
          if (resp == 0) {                
               limpiarFormularioContacto();
            } else {
               limpiarFormularioContacto();              
            }
        }else{
          JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("onInsertError"), UIMessages.getErrorMessage("onInsertError_title"), JOptionPane.ERROR_MESSAGE);
        }               
        
         
    }//GEN-LAST:event_btnRegistrarContactoActionPerformed

    private void btnBuscarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarContactoActionPerformed
        String buscar = txtBuscarContacto.getText();           
        List<Contacto> lista = new ArrayList<>();        
         
        lista = contactoServices.listarporNombre(buscar, proveedorSelected);    
       
        cargarTablaContacto(lista);
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("noProveedorResults"), UIMessages.getErrorMessage("defaultErrorTitle"), JOptionPane.ERROR_MESSAGE);
            txtBuscar.requestFocus();
            txtBuscar.selectAll();
        }
    }//GEN-LAST:event_btnBuscarContactoActionPerformed

    private void tblContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContactoMouseClicked
        filaSeleccionadaContacto = tblContacto.getSelectedRow();
        if(filaSeleccionadaContacto != -1){
        contactoSelected= (Contacto) tblContacto.getModel().getValueAt(filaSeleccionadaContacto, 0);        
        txtUpdateNombre.setText(contactoSelected.getNombre());
        txtUpdateCel.setText(contactoSelected.getCelular());
        txtUpdateTelef.setText(contactoSelected.getTelefono());
        txtUpdateEmail.setText(contactoSelected.getEmail());
        txtUpdateRef.setText(contactoSelected.getReferencia());
        }        
    }//GEN-LAST:event_tblContactoMouseClicked

    private void cargarTablaContacto(List<Contacto> listado){     
        DefaultTableModel model = (DefaultTableModel) tblContacto.getModel();
        model.getDataVector().clear();
        for (Contacto contacto : listado) {           
            model.addRow(new Object[]{contacto, contacto.getNombre(),contacto.getTelefono(), contacto.getCelular(), contacto.getEmail(), contacto.getReferencia()});
        }
        TableColumnAdjuster tca = new TableColumnAdjuster(tblContacto);
        tca.adjustColumns();
        tblContacto.setAutoCreateRowSorter(false);
        tblContacto.setModel(model);
        tblContacto.repaint();   
    }
    
    
    private void  limpiarFormularioContacto(){
       txtNombreContacto.setText("");
       txtCelContacto.setText("");
       txtTelefContacto.setText("");
       txtEmailContacto.setText("");
       txtRefContacto.setText("");         
    }
    
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
    private javax.swing.JButton btnActualizarContacto;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarContacto;
    private javax.swing.JButton btnDeleteContacto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarContacto;
    private javax.swing.JButton btnRegistrarContacto;
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelDatosProveedor;
    private javax.swing.JTable tblContacto;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarContacto;
    private javax.swing.JTextField txtCelContacto;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodigoProveedor;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailContacto;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtNextel;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreContacto;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRefContacto;
    private javax.swing.JTextArea txtReferencia;
    private javax.swing.JTextField txtTelefContacto;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUpdateCel;
    private javax.swing.JTextField txtUpdateEmail;
    private javax.swing.JTextField txtUpdateNombre;
    private javax.swing.JTextField txtUpdateRef;
    private javax.swing.JTextField txtUpdateTelef;
    private javax.swing.JTextField txtWeb;
    // End of variables declaration//GEN-END:variables

    
}
