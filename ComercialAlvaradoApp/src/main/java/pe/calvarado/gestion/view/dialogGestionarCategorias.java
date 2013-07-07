/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.entities.Categoria;
import pe.calvarado.gestion.services.CategoriaServices;
import pe.calvarado.gestion.util.JComboBoxModel;
import pe.calvarado.gestion.util.SpringUtils;
import pe.calvarado.gestion.util.StandardViewMethods;
import pe.calvarado.gestion.util.TableColumnAdjuster;
import pe.calvarado.gestion.util.messages.UIMessages;

/**
 *
 * @author TIGABYTES 005
 */
public class dialogGestionarCategorias extends javax.swing.JDialog implements StandardViewMethods {

    CategoriaServices categoriaServices = (CategoriaServices) SpringUtils.getBean("categoriaServices");

    Logger log = Logger.getLogger(dialogGestionarCategorias.class);
    
    List<Categoria> categoriaList;
    
    /* Constantes */
    static final int MAX_NIVEL = 3;
    int nivel_inicial = 1;
    
    
    
    public dialogGestionarCategorias(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadData();
    }
 
    @Override
    public final void loadData() {
         cargarCombos();
         categoriaList = categoriaServices.listar();
         cargarTablaCategoria(categoriaList);
    }
    
    private void cargarTablaCategoria(List<Categoria> listado) {
        DefaultTableModel model = (DefaultTableModel) tblCategoria.getModel();
        model.getDataVector().clear();
        for (Categoria categoria : listado) {
            if(categoria.getCategoriaPadreId() != null){
                model.addRow(new Object[]{categoria,categoria.getCategoriaPadreId().getNombre(),categoria.getDescripcion(),categoria.getNivel()});
            }else{
                model.addRow(new Object[]{categoria,"Principal",categoria.getDescripcion(),categoria.getNivel()});
            }
            
        }
        TableColumnAdjuster tca = new TableColumnAdjuster(tblCategoria);
        tca.adjustColumns();
        tblCategoria.setAutoCreateRowSorter(false);
        tblCategoria.setModel(model);
        tblCategoria.repaint();
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroupSubcategoria = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbnSubcategoriaSi = new javax.swing.JRadioButton();
        rbnSubcategoriaNo = new javax.swing.JRadioButton();
        lblCategoriaPrincipal = new javax.swing.JLabel();
        comboCategoriaPrincipal = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCategoria = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        comboNivel = new javax.swing.JComboBox();
        lblNivel = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestionar Categorias"));

        jLabel1.setText("Nombre");

        jLabel2.setText("Descripción");

        jLabel4.setText("Registrar como subcategoria ?");

        btngroupSubcategoria.add(rbnSubcategoriaSi);
        rbnSubcategoriaSi.setText("Si");
        rbnSubcategoriaSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbnSubcategoriaSiMouseClicked(evt);
            }
        });

        btngroupSubcategoria.add(rbnSubcategoriaNo);
        rbnSubcategoriaNo.setSelected(true);
        rbnSubcategoriaNo.setText("No");
        rbnSubcategoriaNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbnSubcategoriaNoMouseClicked(evt);
            }
        });

        lblCategoriaPrincipal.setText("Categoria Principal");
        lblCategoriaPrincipal.setEnabled(false);

        comboCategoriaPrincipal.setEnabled(false);
        comboCategoriaPrincipal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCategoriaPrincipalItemStateChanged(evt);
            }
        });

        jButton1.setText("Buscar");

        tblCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoría", "Padre", "Descripción", "Nivel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCategoria);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        comboNivel.setEnabled(false);

        lblNivel.setText("Nivel");
        lblNivel.setEnabled(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/calvarado/gestion/view/images/edit.png"))); // NOI18N
        jButton2.setText("Editar");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/calvarado/gestion/view/images/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                    .addComponent(txtDescripcion))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(lblCategoriaPrincipal)
                                            .addComponent(lblNivel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rbnSubcategoriaSi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rbnSubcategoriaNo))
                                            .addComponent(comboCategoriaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, 0, 172, Short.MAX_VALUE)
                                            .addComponent(comboNivel, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rbnSubcategoriaSi)
                    .addComponent(rbnSubcategoriaNo))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoriaPrincipal)
                            .addComponent(comboCategoriaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboNivel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNivel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String mensaje;
        Categoria categoria = new Categoria();
        categoria.setNombre(txtNombre.getText());
        categoria.setDescripcion(txtDescripcion.getText());
        
        
        if(comboCategoriaPrincipal.getSelectedIndex()>0){
            Categoria catPadre = (Categoria)comboCategoriaPrincipal.getSelectedItem();
            categoria.setCategoriaPadreId(catPadre);
            JComboBoxModel model = (JComboBoxModel)comboNivel.getSelectedItem();
            categoria.setNivel(Integer.valueOf(model.getValue()));
        }
        
        mensaje = categoriaServices.insert(categoria);
        
        
        if (mensaje != null) {
            JOptionPane.showMessageDialog(this, UIMessages.getInfoMessage("onCompleteInsert"));
            limpiarFormularioCategoria();
        } else {
            JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("onInsertError"), UIMessages.getErrorMessage("onInsertError_title"), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void rbnSubcategoriaSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbnSubcategoriaSiMouseClicked
        habilitarSubcategoria(true);
    }//GEN-LAST:event_rbnSubcategoriaSiMouseClicked

    private void rbnSubcategoriaNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbnSubcategoriaNoMouseClicked
        habilitarSubcategoria(false);
    }//GEN-LAST:event_rbnSubcategoriaNoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarCategoria();    
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void comboCategoriaPrincipalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCategoriaPrincipalItemStateChanged
        if(comboCategoriaPrincipal.getSelectedIndex() > 0){
           Categoria categoria = (Categoria)comboCategoriaPrincipal.getSelectedItem();
           crearComboDeNivel(categoria.getNivel());
        }
    }//GEN-LAST:event_comboCategoriaPrincipalItemStateChanged

    private void cargarCombos(){
       comboCategoriaPrincipal.setModel(categoriaServices.combo());
       crearComboDeNivel(nivel_inicial);
    }
    
    private void habilitarSubcategoria(Boolean b){
        lblCategoriaPrincipal.setEnabled(b);
        lblNivel.setEnabled(b);
        comboCategoriaPrincipal.setEnabled(b);
        comboNivel.setEnabled(b); 
    }
    
    private void limpiarFormularioCategoria() {
        txtDescripcion.setText("");
        txtNombre.setText("");
    }

    public void crearComboDeNivel(int nivel_inicial){
        
        comboNivel.removeAllItems();
        comboNivel.addItem(new JComboBoxModel("0","Seleccione"));
        for( int nivel = nivel_inicial+1 ;nivel <= MAX_NIVEL ; nivel++){
            JComboBoxModel fila = new JComboBoxModel(String.valueOf(nivel), "NIVEL "+nivel);
            comboNivel.addItem(fila);
        }
        
        
    }
    
    
    public void eliminarCategoria(){
        if(tblCategoria.getSelectedRow() != -1){
            int respuesta = JOptionPane.showConfirmDialog(this, UIMessages.getQuestionMessage("confirmDelete"), UIMessages.getQuestionMessage("defaultQuestionTitle"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if (respuesta == 0){
                Categoria categoria = (Categoria)tblCategoria.getValueAt(tblCategoria.getSelectedRow(), 0);
                categoria.setMarkfordelete(true);
                String mensaje = categoriaServices.update(categoria);
            
                if(mensaje != null){
                    JOptionPane.showMessageDialog(this, UIMessages.getInfoMessage("onCompleteDelete"), UIMessages.getInfoMessage("onCompleteDelete_tile"), JOptionPane.INFORMATION_MESSAGE);
                    loadData();
                } else{
                    JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("onDeleteError"), UIMessages.getErrorMessage("defaultErrorTitle"), JOptionPane.ERROR_MESSAGE);
                }
            }
      } else {
          JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredSelectedCategoria"), UIMessages.getErrorMessage("defaultErrorTitle"), JOptionPane.ERROR_MESSAGE);
       }
    }
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogGestionarCategorias dialog = new dialogGestionarCategorias(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup btngroupSubcategoria;
    private javax.swing.JComboBox comboCategoriaPrincipal;
    private javax.swing.JComboBox comboNivel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblCategoriaPrincipal;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JRadioButton rbnSubcategoriaNo;
    private javax.swing.JRadioButton rbnSubcategoriaSi;
    private javax.swing.JTable tblCategoria;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    
}
