package reloj;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase se encarga de generar el reloj
 *
 * @author Arturo
 */
public class Hora{

    private static int h, m, s;
    private static Date d;

    /**
     * Este metodo obtiene la fecha del sistema y muestra la hora minuto y
     * segundo para formar el reloj
     */
    public static void tiempo(){
        Alarma al=new Alarma();
        do{
            try{
                d=new Date();
                h=d.getHours();
                m=d.getMinutes();
                s=d.getSeconds();
                Display.mostrarHora(h, m, s, al.isEstado());
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                Logger.getLogger(Hora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }while(1==1);

    }
}
