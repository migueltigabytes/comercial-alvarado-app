package ar.republicagroup.gestion.util.helpers;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.apache.log4j.Logger;

/**
 *
 * @author DIEGOALV
 */
public class Formato {
    
    private static Logger log = Logger.getLogger(Formato.class);
    

    /**
     * Método para darle formato decimal a un número tipo double. Usa la ',' como separador de miles y el '.' para los decimales
     * @param numero el número que va a ser formateado a Ej: 123,456.78
     * @return retorna un String con el numero formateado 
     */
    public static String decimalSoloPunto(String numero){
        String numerito = numero.replace(".", "");
        numerito = numerito.replace(",", ".");
        numerito = numerito.replace("$", "");
        log.info("Convirtiendo a double ... "+numerito);
        return numerito;
    } 
    
    
    
    public static String decimalComaMiles(double numero){
        DecimalFormat decimal = new DecimalFormat("###,###.##");
        return decimal.format(numero);
    }
    
    /**
     * Método para darle formato decimal a un número tipo float. Usa la ',' como separador de miles y el '.' para los decimales
     * @param numero el número que va a ser formateado a Ej: 123,456.78
     * @return retorna un String con el numero formateado 
     */
    
    public static String decimalComaMiles(float numero){
        DecimalFormat decimal = new DecimalFormat("###,###.##");
        return decimal.format(numero);
    }
     
    /**
     * Tiene el mismo funcionamiento que formatoDecimalComaMiles , sólo que agrega un $ delante del número .
     * @param numero el número que va a ser formateado a Ej: $123,456.78
     * @return retorna un String con el numero formateado 
     */
    public static String decimalComaMilesConSigno(double numero){
        DecimalFormat decimal = new DecimalFormat("$###,###.##");
        return decimal.format(numero);
    }
    
    
     public static String cambiarFechaAFormatoLocal(Date fecha){
        Locale locale = new Locale("es", "AR"); //Formatea la fecha para AR
        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat("EEEE,dd 'de' MMM 'del' yyyy", locale);
        String output = formatter.format(fecha);
        return output;
    }
         
     
    public static String fechaDDMMYY(Date fecha){
        DateFormat dateFormat = DateFormat.getDateInstance();
        return dateFormat.format(fecha);
    } 
    
     public static String obtenerFechaYHoraDeDate(Date fecha){
            String hora;
            String minutos;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fecha);
         
          if(calendar.get(Calendar.HOUR_OF_DAY)< 10){
            hora = "0"+calendar.get(Calendar.HOUR_OF_DAY);
          }else{
            hora = ""+calendar.get(Calendar.HOUR_OF_DAY);  
            }
                  
          if (calendar.get(Calendar.MINUTE) < 10){
              minutos = "0"+calendar.get(Calendar.MINUTE);
          } else {
              minutos = ""+calendar.get(Calendar.MINUTE);
            }
         
         return hora + ":" +minutos;
     
     }
     
     
    
}
