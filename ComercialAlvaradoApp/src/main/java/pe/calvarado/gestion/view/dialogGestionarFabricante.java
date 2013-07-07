/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.entities.Fabricante;
import pe.calvarado.gestion.services.FabricanteServices;
import pe.calvarado.gestion.util.SpringUtils;
import pe.calvarado.gestion.util.StandardViewMethods;
import pe.calvarado.gestion.util.TableColumnAdjuster;
import pe.calvarado.gestion.util.messages.UIMessages;

/**
 *
 * @author Bruno
 */
public class dialogGestionarFabricante extends javax.swing.JDialog implements StandardViewMethods {

    FabricanteServices fabricanteServices = (FabricanteServices) SpringUtils.getBean("fabricanteServices");
    Logger log = Logger.getLogger(dialogGestionarFabricante.class);
    
    public dialogGestionarFabricante(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFabricante = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestionar Fabricante"));

        jLabel1.setText("Nombre");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblFabricante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFabricante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tblFabricante);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/calvarado/gestion/view/images/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/calvarado/gestion/view/images/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("Gestinoar Fabricante");

        pack();
    }// </editor-fold>//GEN-END:initComponents

     @Override
    public void loadData() {
        String buscar = txtBuscar.getText(); 
        List<Fabricante> lista = new ArrayList<>();
        lista = fabricanteServices.getFabricantesByParams(buscar);
        cargarTablaProveedor(lista);
    }
    
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String buscar = txtBuscar.getText();
        List<Fabricante> lista = new ArrayList<>();
        lista = fabricanteServices.getFabricantesByParams(buscar);
        cargarTablaProveedor(lista);

        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("noFabricanteResults"), UIMessages.getErrorMessage("defaultErrorTitle"), JOptionPane.ERROR_MESSAGE);
            txtBuscar.requestFocus();
            txtBuscar.selectAll();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
      if(tblFabricante.getSelectedRow() != -1){
        Fabricante fabricante = (Fabricante)tblFabricante.getValueAt(tblFabricante.getSelectedRow(), 0); 
        dialogRegistrarFabricante dialog = new dialogRegistrarFabricante(null, true);
        dialog.setTitle("Actualizar");
        dialog.cambiarFormularioParaUpdate();
        dialog.setFabricanteId(fabricante.getFabricanteId().intValue());
        dialog.setNombreFabricante(fabricante.getNombre());
        dialog.setDescripcion(fabricante.getDescripcion());
        dialog.setVisible(true);  
      } else {
          JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredSelectedFabricante"), UIMessages.getErrorMessage("defaultErrorTitle"), JOptionPane.ERROR_MESSAGE);
       }
       
       
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(tblFabricante.getSelectedRow() != -1){
            int respuesta = JOptionPane.showConfirmDialog(this, UIMessages.getQuestionMessage("confirmDelete"), UIMessages.getQuestionMessage("defaultQuestionTitle"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if (respuesta == 0){
                Fabricante fabricante = (Fabricante)tblFabricante.getValueAt(tblFabricante.getSelectedRow(), 0);
                fabricante.setMarkfordelete(true);
                String mensaje = fabricanteServices.update(fabricante);
            
                if(mensaje != null){
                    JOptionPane.showMessageDialog(this, UIMessages.getInfoMessage("onCompleteDelete"), UIMessages.getInfoMessage("onCompleteDelete_tile"), JOptionPane.INFORMATION_MESSAGE);
                    loadData();
                } else{
                    JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("onDeleteError"), UIMessages.getErrorMessage("defaultErrorTitle"), JOptionPane.ERROR_MESSAGE);
                }
            }
      } else {
          JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredSelectedFabricante"), UIMessages.getErrorMessage("defaultErrorTitle"), JOptionPane.ERROR_MESSAGE);
       }
        
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed
        public void cargarTablaProveedor(List<Fabricante> listado) {

        DefaultTableModel model = (DefaultTableModel) tblFabricante.getModel();
        model.getDataVector().clear();
        for (Fabricante fabricante : listado) {
            log.info(fabricante.getMarkfordelete());
            model.addRow(new Object[]{fabricante, fabricante.getDescripcion()});
        }

        TableColumnAdjuster tca = new TableColumnAdjuster(tblFabricante);
        tca.adjustColumns();

        tblFabricante.setAutoCreateRowSorter(false);
        tblFabricante.setModel(model);
        tblFabricante.repaint();

    }
    
        
       
        
        
        
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogGestionarFabricante dialog = new dialogGestionarFabricante(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFabricante;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

   
}
