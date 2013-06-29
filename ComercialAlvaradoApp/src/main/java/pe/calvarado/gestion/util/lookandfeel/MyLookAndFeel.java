
package pe.calvarado.gestion.util.lookandfeel;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.log4j.Logger;


/**
 * Es la clase encargada de definir el Look and Feel de la aplicación .
 * @author DIEGOALV
 * @version 1.0
 * @since 1.0
 *
 */

public class MyLookAndFeel {
    
    private static Logger log = Logger.getLogger(MyLookAndFeel.class);
    private static String my_theme;
    private static String my_package_of_theme;
    private static String my_company;

    /**
     * Carga el archivo properties que contiene los parametros de color , package y company del Look & Feel
     * @param file , el nombre del archivo properties que debe cargar, debe estar en el mismo paquete que esta clase.
     */
        
    private static void loadPropertiesFile(String file) {
        Properties prop     = new Properties();
        InputStream in      = MyLookAndFeel.class.getResourceAsStream(file);
        try {
            prop.load(in);
        } catch (IOException ex) {
            log.info(ex.getMessage());
        }
        
        my_theme            = prop.getProperty("color");
        my_package_of_theme = prop.getProperty("package");
        my_company          = prop.getProperty("company");

    }
    
    /**
     * Carga el look and feel por defecto que tendrá la app. Recibe un archivo properties como parámetro que contiene los valores del L&F que debe cargar.
     * Los archivos .properties se guardan en el paquete <b>util.lookandfeel</b>
     * @param file, el nombre del archivo properties que debe cargar, debe estar en el mismo paquete que esta clase.
     * @throws ClassNotFoundException
     * @throws IOException 
     */
    
    
    public static void setCurrentLookAndFeel(String file) throws ClassNotFoundException, IOException{
        try{
                //Cargamos el tema por defecto que está configurado el archivo properties
                loadPropertiesFile(file);
                //Reflection
                Object object = Class.forName(my_package_of_theme.trim()).newInstance();
               
               if(object instanceof com.jtattoo.plaf.acryl.AcrylLookAndFeel){
                    log.info("Seteando LookAndFeel ==> AcrylLookAndFeel");
                    AcrylLookAndFeel.setTheme(my_theme.trim(), "", my_company.trim());
               }
                
               if(object instanceof com.jtattoo.plaf.aluminium.AluminiumLookAndFeel){
                    log.info("Seteando LookAndFeel ==> AluminiumLookAndFeel");
                    AluminiumLookAndFeel.setTheme(my_theme.trim(), "", my_company.trim());                   
               }
                             
                // Select the Look and Feel
                UIManager.setLookAndFeel(my_package_of_theme.trim());
                
                    
                
            }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex){
                log.error(ex.getMessage());
                
            }
    
    }
    
    

    
    
    

    
    
    
    
    
    
    
    
}
