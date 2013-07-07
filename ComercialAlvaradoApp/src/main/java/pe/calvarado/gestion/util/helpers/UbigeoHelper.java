package pe.calvarado.gestion.util.helpers;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.entities.Ubigeo;

/**
 * Clase helper para cargar combos de Ubigeo en una UI
 * @author DIEGOALV
 * @version 1.0
 * 
 */
public class UbigeoHelper {
    
       
    /**
     * Este método sirve para cargar los departamentos en un JComboBox. Crea un modelo en base al List de Ubigeo que recibe y lo retorna.
     * @param ubigeoList , el listado con todo los ubigeo.
     * @param comboDepto , el combo de departamentos donde debe cargar los departamentos .
     * @return Retorna un objeto DefaultComboBoxModel para setearle a un JComboBox
     */
    
    public static DefaultComboBoxModel cargarComboDepto(List<Ubigeo> ubigeoList,JComboBox comboDepto,Ubigeo selectedUbigeo){
        DefaultComboBoxModel modelCombo = (DefaultComboBoxModel)comboDepto.getModel();
       
        for(Ubigeo ubigeo : ubigeoList){
            /* Si es departamento*/ 
            if(ubigeo.getProvinciaId() == 0){
                modelCombo.addElement(ubigeo);
                
                if(selectedUbigeo != null){
                    if(ubigeo.getDeptoId().intValue() == selectedUbigeo.getDeptoId().intValue()){
                        modelCombo.setSelectedItem(ubigeo);
                    }
                }
            }
        }
        return modelCombo;
    }
    
    /**
     * Este método sirve para cargar las provincias en un JComboBox.
     * Carga las provincias de acuerdo al departamento seleccionado
     * @param ubigeoList , el listado con todo los ubigeo.
     * @param comboProvincia , el combo de provincias donde se van a cargar las provincias 
     * @param comboDepto , el combo padre, departamentos de donde se obtiene el departamento seleccionado.
     * @return Retorna un objeto DefaultComboBoxModel para setearle a un JComboBox
     */
    
    public static DefaultComboBoxModel cargarComboProv(List<Ubigeo> ubigeoList,JComboBox comboProvincia,JComboBox comboDepto,Ubigeo selectedUbigeo){
        DefaultComboBoxModel modelCombo = (DefaultComboBoxModel)comboProvincia.getModel();
        
        Ubigeo depto = (Ubigeo)comboDepto.getSelectedItem();
        
        for(Ubigeo ubigeo : ubigeoList){
           if(ubigeo.getDistritoId() == 0 && ubigeo.getProvinciaId() != 0 && depto.getDeptoId() == ubigeo.getDeptoId()){
               modelCombo.addElement(ubigeo);
                   if(selectedUbigeo != null){ 
                        if(ubigeo.getProvinciaId().intValue() == selectedUbigeo.getProvinciaId().intValue()){
                            modelCombo.setSelectedItem(ubigeo);
                        }
                   }
                
            }
        }
        return modelCombo;
    }
    
    /**
     * Este método sirve para cargar los distritos en un JComboBox.
     * Carga los distritos de acuerdo a la provincia y al deparamento seleccionado
     * @param ubigeoList , el listado con todo los ubigeo . 
     * @param comboDistrito , el combo de Distrito donde van a cargar los distritos .
     * @param comboProvincia , el combo padre provincia, de donde se obtiene la provincia seleccionada.
     * @param comboDepto , el combo padre de provincia, de donde se obtiene el departamento seleccionado
     * @return Retorna un objeto DefaultComboBoxModel para setearle a un JComboBox
     */
    
    
    public static DefaultComboBoxModel cargarComboDistrito(List<Ubigeo> ubigeoList,JComboBox comboDistrito,JComboBox comboProvincia,JComboBox comboDepto,Ubigeo selectedUbigeo){
        DefaultComboBoxModel modelCombo = (DefaultComboBoxModel)comboDistrito.getModel();
        Ubigeo provincia = (Ubigeo)comboProvincia.getSelectedItem();
        Ubigeo depto     = (Ubigeo)comboDepto.getSelectedItem();
        
        
        for(Ubigeo ubigeo : ubigeoList){
           if((ubigeo.getDistritoId() != 0) && (provincia.getProvinciaId() == ubigeo.getProvinciaId()) && (depto.getDeptoId() == ubigeo.getDeptoId())){
               modelCombo.addElement(ubigeo);
               if(selectedUbigeo != null){
                   modelCombo.setSelectedItem(selectedUbigeo);
               }
               
           }
        }   
        return modelCombo;
    }
    
    
    
}
