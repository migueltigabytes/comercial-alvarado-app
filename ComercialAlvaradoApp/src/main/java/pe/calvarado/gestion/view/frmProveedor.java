package pe.calvarado.gestion.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.entities.Proveedor;
import pe.calvarado.gestion.services.ProveedorServices;
import pe.calvarado.gestion.util.SpringUtils;
import pe.calvarado.gestion.util.StandardViewMethods;
import pe.calvarado.gestion.util.TableColumnAdjuster;

/**
 *
 * @author DIEGOALV
 */
public class frmProveedor extends javax.swing.JFrame implements StandardViewMethods {
    /*Acceso a Services*/
    ProveedorServices proveedorServices = (ProveedorServices)SpringUtils.getBean("proveedorServices");
    /* Logger */
    Logger log = Logger.getLogger(frmProveedor.class);
    
    /* List */
    List<Proveedor> proveedoresList = new ArrayList<>();
    
    public frmProveedor() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/calvarado/gestion/view/images/add.png"))); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Proveedor", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProveedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton1)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        log.info("GENERANDO UNA TRAZA...");
        proveedoresList = proveedorServices.listar();
        loadTable(crearDefaultTableModel(proveedoresList, tblProveedor), tblProveedor);
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProveedor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProveedor;
    // End of variables declaration//GEN-END:variables

    @Override
    public void loadData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void loadTable(DefaultTableModel data,JTable table) {

        
        TableColumnAdjuster tca = new TableColumnAdjuster(table);
        tca.adjustColumns();
        table.setAutoCreateRowSorter(true);
        table.setModel(data);
        table.repaint();
    }

    
    
    public DefaultTableModel crearDefaultTableModel(List<?> generico,JTable table){
        
        List<Proveedor> temporalList = (List<Proveedor>)generico;
        List<Object[]> listadoGenerado = new ArrayList();
        DefaultTableModel modelo = (DefaultTableModel)table.getModel();
        modelo.getDataVector().clear();
        
        for(Proveedor proveedor:temporalList){
            modelo.addRow(new Object[]{proveedor.getNombre(),proveedor.getDireccion()});
        }
        
        return modelo;
    
    }
    
}
