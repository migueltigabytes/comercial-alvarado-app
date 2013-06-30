package pe.calvarado.gestion.view;

import java.util.ArrayList;
import java.util.List;
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
public class frmProveedor_viejo extends javax.swing.JFrame implements StandardViewMethods {
    /*Acceso a Services*/
    ProveedorServices proveedorServices = (ProveedorServices)SpringUtils.getBean("proveedorServices");
    /* Logger */
    Logger log = Logger.getLogger(frmProveedor_viejo.class);
    
    /* List */
    List<Proveedor> proveedoresList = new ArrayList<>();
    
    public frmProveedor_viejo() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/calvarado/gestion/view/images/add.png"))); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        log.info("GENERANDO UNA TRAZA...");
        proveedoresList = proveedorServices.listar();
        cargarTablaProveedor(proveedoresList);
    }//GEN-LAST:event_jButton1ActionPerformed

    
     public void cargarTablaProveedor(List<Proveedor> listado){
       
        DefaultTableModel model = (DefaultTableModel) tblProveedor.getModel();
        model.getDataVector().clear();
        for(Proveedor proveedor : listado){
            model.addRow(new Object[]{ proveedor.getNombre(),proveedor.getDireccion() });
        }
        
        TableColumnAdjuster tca = new TableColumnAdjuster(tblProveedor);
        tca.adjustColumns();
         
        tblProveedor.setAutoCreateRowSorter(true);
        tblProveedor.setModel(model);
        tblProveedor.repaint();
    
    }
    
    
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProveedor_viejo().setVisible(true);
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

    

    
    
   
    
}
